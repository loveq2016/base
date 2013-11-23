package com.base.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.Attachment;
import com.base.model.AttachmentExample;
import com.base.dao.impl.AttachmentMapperImpl;
import com.base.dao.AttachmentMapper;
import com.base.service.AttachmentService;

@Service("attachmentService")
public class AttachmentServiceImpl extends
		BaseServiceImpl<Attachment, AttachmentExample, AttachmentMapperImpl>
		implements AttachmentService {
	private AttachmentMapper attachmentMapper;

	@Resource
	public void setAttachmentMapper(AttachmentMapper attachmentMapper) {
		this.attachmentMapper = attachmentMapper;
		super.setBaseDao((AttachmentMapperImpl) attachmentMapper);
	}
  
	@Override
	public String getName(String name, Integer age) {  
		System.out.println("getName");
		return name + age;  
	}

	@Override
	public String getMy(String name) {
		System.out.println("name");
		return name;
	}
}