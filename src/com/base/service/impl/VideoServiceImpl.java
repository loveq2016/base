package com.base.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.Video;
import com.base.model.VideoExample;
import com.base.dao.impl.VideoMapperImpl;
import com.base.dao.VideoMapper;
import com.base.service.VideoService;

@Service("videoService")
public class VideoServiceImpl extends
		BaseServiceImpl<Video, VideoExample, VideoMapperImpl> implements
		VideoService {
	private VideoMapper videoMapper;

	@Resource
	public void setVideoMapper(VideoMapper videoMapper) {
		this.videoMapper = videoMapper;
		super.setBaseDao((VideoMapperImpl) videoMapper);
	}
}