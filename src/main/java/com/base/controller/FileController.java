package com.base.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.base.util.Config;
import com.util.file.FileUtil;

@Controller
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

	@RequestMapping("aa")
	@ResponseBody
	public Object aa() {  
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
	
	/** http下载 */
	public static boolean httpDownload(String httpUrl, String saveFile) {
		// 下载网络文件
		int bytesum = 0;
		int byteread = 0;

		URL url = null;
		try {
			url = new URL(httpUrl);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}

		try {
			URLConnection conn = url.openConnection();
			InputStream inStream = conn.getInputStream();
			FileOutputStream fs = new FileOutputStream(saveFile);

			byte[] buffer = new byte[1204];
			while ((byteread = inStream.read(buffer)) != -1) {
				bytesum += byteread;
				System.out.println(bytesum);
				fs.write(buffer, 0, byteread);
			}
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
