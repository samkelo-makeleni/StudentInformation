package com.hello.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.entity.StudentDetails;
import com.hello.service.StudentDetailsService;

@RestController
@RequestMapping(path="api/")
public class StudentController {
	
@Autowired
 public StudentDetailsService studentDetailsService;
	
	 @GetMapping(path="students/{stdno}",produces="application/json")
	 public @ResponseBody StudentDetails getStudentsByStudNo(@PathVariable(name="stdno") int stdno) {
		 return studentDetailsService.getStudentNo(stdno);
		 
	 }
	 
	 @GetMapping(path="students",produces="application/json")
	 public @ResponseBody List<StudentDetails> getAllStudents() {
		 return studentDetailsService.getAllStudentDetails();	 
	 }


	 @PostMapping(path="students", consumes="application/json")
	 public @ResponseBody String createStudents(@RequestBody StudentDetails stud) {
		 return studentDetailsService.postStudents(stud); 
	 }
	 
	 @DeleteMapping("students/{stdno}")
	
	  public void deleteStudentByStudNo(@PathVariable(name="stdno") int stdno) {

		  try
		  {
			  studentDetailsService.deleteById(stdno);
		  }
		  catch(Exception sam)
		  {
			 System.out.println("Delete Message: " + sam.getMessage());
		  }
	 }
	 @PutMapping(path="students/{stdno}")
     public  StudentDetails putMethod(@PathVariable int stdno,@RequestBody StudentDetails students) {
	     return students;
	 }
}

