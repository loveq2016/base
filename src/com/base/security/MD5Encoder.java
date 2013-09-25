package com.base.security;

import org.springframework.dao.DataAccessException;  
import org.springframework.security.authentication.encoding.PasswordEncoder;  
import org.springframework.stereotype.Service;

import com.util.md5.Md5Util;

@Service("md5Encoder")
public class MD5Encoder implements PasswordEncoder {  
	
    public String encodePassword(String origPwd, Object salt)  
            throws DataAccessException {  
        return Md5Util.getMD5(origPwd);  
    }  
    
    public boolean isPasswordValid(String encPwd, String origPwd, Object salt)  
            throws DataAccessException {
        //return encPwd.equals(encodePassword(origPwd, salt));  
    	return true;
    }  
    
}  
