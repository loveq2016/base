package com.base.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.base.util.Config;
import com.util.file.FileUtil;

@RequestMapping("file/")
public class FileController extends BaseController {

	@RequestMapping("fileUpload")
	@ResponseBody
	public Object singleFileUpload(@RequestParam("file") MultipartFile file) {
		String suffix = FileUtil.getFileSuffix(file.getOriginalFilename());
		if (!file.isEmpty()) {
			if (validateUpload(file.getSize() ,suffix)) {
				try {
					FileUtil.write(file.getInputStream(),
							"D:/" + file.getOriginalFilename());
					return getSuccessResult();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return getFailureResult();
	}

	/**
	 * 用户上传时，验证系统是否支持用户上传的文件
	 * @param file
	 * @param prefix
	 * @return
	 */
	private boolean validateUpload(long size, String prefix) {
		if (Config.getValue("supportedUploadImageTypes").indexOf(prefix) != -1) {
			// 上传的文件类型是 图片
			// 查看文件的 大小是否超过了 限定的最大值
			if (size > Long.valueOf(Config.getValue("imageUploadMaxSize"))) {
				return false;
			} else {
				return true;
			}
		} else if (Config.getValue("supportedUploadVideoTypes").indexOf(prefix) != -1) {
			// 上传的文件类型是 视频
			// 查看文件的 大小是否超过了 限定的最大值
			if (size > Long.valueOf(Config.getValue("videoUploadMaxSize"))) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	
	@RequestMapping("/download")  
	public ResponseEntity<byte[]> download() throws IOException {  
	    HttpHeaders headers = new HttpHeaders();  
	    headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);  
	    headers.setContentDispositionFormData("attachment", "xx.txt");  
	    return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(new File("D:/暮光之城3.txt")),  
	                                      headers, HttpStatus.CREATED);  
	}
}
