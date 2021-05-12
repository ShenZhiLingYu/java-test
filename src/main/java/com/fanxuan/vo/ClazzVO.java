package com.fanxuan.vo;

import java.util.List;

import cn.tedu.mybatis.entity.Student;

public class ClazzVO {
	
	private Integer classId;
	private String className;
	private List<Student> students;
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "ClazzVo [classId=" + classId + ", className=" + className + ", students=" + students + "]";
	}

	
}
