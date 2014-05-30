package com.base.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.base.enums.user.Gender;
import com.base.validator.CodeIsExist;
 

public class User extends BaseModel implements UserDetails {
	
	private Integer id; /*主键*/

	@Length(max=50,message="用户名过长,总体不超过50个字符!")
	@NotEmpty(message="用户名不能为空!")
    private String userName; /*用户名*/
	
    private String password; /*密码*/

    private Integer country; /*国家*/

    private Date expiredDate; /*过期日期*/

    private String credentialsExpired; /*过期的凭据*/

    private String fullName; /*用户全名*/

    private Integer org; /*用户所在机构*/

    @CodeIsExist(value=Gender.class, message="性别code不合法!")
    private Integer gender; /*性别(10代表男性，20代表女性)*/
    
    private String genderText; // 性别  text 页面展示用

    private Integer age; /*年龄*/

    private String address; /*地址*/

    private String phone; /*电话*/

    private String mobile; /*移动电话*/

    private String ssn; /*社会安全卡*/

    @Email(message="您填写的邮箱格式有误,请重新输入!")
    private String mail; /*邮箱地址*/

    private Integer userType; /*用户类型 1普通用户 2超级管理员*/

    private Integer notifyMode; /*通知模式 1邮箱通知 2电话通知  3短信通知*/

    @Length(max=200,message="描述过长,总体不超过200个字符!")
    private String description; /*描述*/

    private Integer creator; /*创造者*/

    private Integer status; /*用户状态 1能正常使用  2用户没有激活 3用户帐户锁定 4用户账户没有启用 5帐号已过期*/

    private Date creationTime; /*创建时间*/

    private String retention; /*保留域*/

    private String ext; /*扩展*/
    
    private List<GrantedAuthority> authorities;
    
    private List<Resources> resourcess; //用户能访问那些资源模块

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getCredentialsExpired() {
        return credentialsExpired;
    }

    public void setCredentialsExpired(String credentialsExpired) {
        this.credentialsExpired = credentialsExpired == null ? null : credentialsExpired.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public Integer getOrg() {
        return org;
    }

    public void setOrg(Integer org) {
        this.org = org;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn == null ? null : ssn.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getNotifyMode() {
        return notifyMode;
    }

    public void setNotifyMode(Integer notifyMode) {
        this.notifyMode = notifyMode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getRetention() {
        return retention;
    }

    public void setRetention(String retention) {
        this.retention = retention == null ? null : retention.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		log.info("得到用户的权限");
		return authorities;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public void setAuthorities(List<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public List<Resources> getResourcess() {
		return resourcess;
	}

	public void setResourcess(List<Resources> resourcess) {
		this.resourcess = resourcess;
	}

	public String getGenderText() {
		return genderText;
	}

	public void setGenderText(String genderText) {
		this.genderText = genderText;
	}
	
	private final Log log = LogFactory.getLog(this.getClass());
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 8539541932672303340L;
	
}
