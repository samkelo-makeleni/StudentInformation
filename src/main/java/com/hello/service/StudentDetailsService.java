package com.hello.service;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hello.entity.StudentDetails;

@Service

public class StudentDetailsService {
//	@Autowired
//	private StudentDetailsService studentDetailsService;
	List<StudentDetails> students = new ArrayList<StudentDetails>();
	
    public StudentDetailsService() {
    	StudentDetails stud1 = new StudentDetails(213,"Samkelo","Makeleni","Male",24,"informatics");
    	StudentDetails stud2 = new StudentDetails(214,"Lwazi","Jiyane","Male",20,"software engineering");
    	StudentDetails stud3 = new StudentDetails(215,"Veli","Mark","Male",28,"computer systems engineering");
    	
    	students.add(stud1);
    	students.add(stud2);
    	students.add(stud3);  	
}
    public StudentDetails getStudentNo(int stdno) {
		StudentDetails StudentDetails = null;
		
		for (StudentDetails stud : students) {
			if(stud.getStdno() == stdno) {
				StudentDetails = stud;
			}
		}
		return StudentDetails;
	}
	
	public List<StudentDetails> getAllStudentDetails(){
		return students;
	}
	
	public String postStudents(StudentDetails stud) {
		System.out.println("Students"+ stud);
		students.add(stud);
		return "Student added";
	}
	public void deleteById(int studno) throws Exception {
		
        for(StudentDetails stud: students) {
        	if(stud.getStdno() == studno) {
        		System.out.println("what happens here " + stud.getStdno());
        		students.remove(stud);
        	
        	}
        	else
        	{
        		throw new Exception("ID not Found!");
        	}
        
        }
	
	}

	public void findById(int stdno) {
		 for (StudentDetails stud: students) {
			  if(stud.getStdno() == stdno) {
				  students.set(stdno, stud);
		return ;
	}

		 }
	}
}
