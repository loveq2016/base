package com.base.controller;

import java.util.*;

import org.junit.Test;

import com.base.BaseTest;
import com.base.service.ServiceMapping;

public class TestBaseController extends BaseTest {

	Map<String, String> map = new HashMap<String, String>();
	
	@Test 
	public void testSave() {
		map.put("userName", "222");
		map.put("password", "111212");
		map.put("description", "我来啊");
		map.put("creationTime", "2012-12-12 12:12:12");
	
		try {
			System.out.println("结果" + ServiceMapping.insertMapping(map, "com.base.model.User"));
		} catch (Exception e) {
			System.out.println("一次");
		}
	}

	@Test
	public void testDeleteById() {
		map.put("id", "5");
		map.put("password", "123456");
		map.put("fullName", "符伟");
		try {
			System.out.println("结果" + ServiceMapping.deleteByIdMapping(map, "com.base.model.User"));
		} catch (Exception e) {
			System.out.println("一次");
		}
	}

	@Test
	public void testDelete() {
		map.put("where", "{\"id\":\"9\",\"userName\":\"willen\"}");
		System.out.println("结果" + ServiceMapping.deleteByExampleMapping(map, "com.base.model.User"));
	}

	@Test
	public void testUpdateById() {
		map.put("id", "11");
		map.put("password", "123456");
		map.put("fullName", "符伟");
		System.out.println("结果" + ServiceMapping.updateByIdMapping(map, "com.base.model.User"));
	}

	@Test
	public void testUpdate() {
		//map.put("userName", "fuwei");
		map.put("password", "123456");
		map.put("retention", "retention");
		map.put("where", "{\"id\":\"6\",\"userName\":\"222\"}");
		
		System.out.println("结果" + ServiceMapping.updateByExampleMapping(map, "com.base.model.User"));
	}

	@Test
	public void testFindById() {
		map.put("id", "6");
		ServiceMapping.selectByIdMapping(map, "com.base.model.User");
	}

	@Test
	public void testFindByModel() {
		map.put("fullName", "符伟");
		map.put("userName", "123");
		Object object = ServiceMapping.selectByModelMapping(map, "com.base.model.User");
		System.out.println(object);
	}

	@Test
	public void testFindString() {
		map.put("where", "{\"id\":\"9\",\"userName\":\"willen,like\"}");
		map.put("isCache", "true");
		map.put("ob", "id");
		map.put("gb", "id");
		Object object = ServiceMapping.selectByExampleMapping(map, "com.base.model.User");
		System.out.println(object);
		
	}
	
	@Test
	public void testFind() {
		map.put("where", "{\"id\":\"9\",\"userName\":\"willen,like\"}");
		map.put("isCache", "true");
		map.put("ob", "id desc");
		map.put("gb", "id");
		Object object = ServiceMapping.selectByExampleMapping(map, "com.base.model.User",0, 10);
		System.out.println(object);
		
	}
	
	
   public static void main(String[] args) {
	System.out.println(1000 - 10000);
}

}
