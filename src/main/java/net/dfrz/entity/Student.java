package net.dfrz.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable 
{
	/**
	 * 序列化设置for二级缓存
	 */
	private static final long serialVersionUID = 1L;
	private String stuID;
	private String name;
	private Date birthday;
	private String sex;
	
	
	public Student() {
	}
	public Student(String stuID, String name, Date birthday, String sex) {
		this();
		this.stuID = stuID;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
	}
	
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
