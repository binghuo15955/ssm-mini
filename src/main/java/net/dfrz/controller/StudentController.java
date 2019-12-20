package net.dfrz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.dfrz.service.StudentServiceI;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentServiceI studentService;
	
	@RequestMapping("gets")
	public String getStudents(ModelMap map) {
		map.put("students", studentService.getStudents());
		return "student";
	}

}
