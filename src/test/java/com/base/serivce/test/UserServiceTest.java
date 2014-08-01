package com.base.serivce.test;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.base.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4  
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) //指定Spring的配置文件 /为classpath下  
//@Transactional //对所有的测试方法都使用事务，并在测试完成后回滚事务  
public class UserServiceTest {  
 
     
	@Resource
    private UserService userService; 
      
    @Before //在每个测试用例方法之前都会执行  
    public void init(){  
    }  
      
    @After //在每个测试用例执行完之后执行  
    public void destory(){  
    }  
      
    @Test  
    @Transactional  //使用该注释会使用事务，而且在测试完成之后会回滚事务，也就是说在该方法中做出的一切操作都不会对数据库中的数据产生任何影响  
//  @Rollback(false) //这里设置为false，就让事务不回滚  
    public void testFind(){  
    	userService.selectByExample(null);
    }  
      
}  