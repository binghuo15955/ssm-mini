package net.dfrz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.dfrz.entity.Student;
import net.dfrz.mapper.StudentMapper;
import net.dfrz.service.StudentServiceI;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> getStudents() {
		List<Student> students=studentMapper.getStudents();
		return students;
	}

}
