package net.dfrz.mapper.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.dfrz.TestCase;
import net.dfrz.entity.Student;
import net.dfrz.mapper.StudentMapper;

public class TestStudentMapper extends TestCase{

	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void testGetStudents() {
		List<Student> students=studentMapper.getStudents();
		System.out.println(students.size());
	}
}
