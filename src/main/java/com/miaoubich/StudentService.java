package com.miaoubich;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository; 
	
	public String getStudentFullNameById(Long id){
		StudentFullName studentFullName = studentRepository.findStudentFullNameById(id);
		
		return studentFullName.getFirstName().concat(" " + studentFullName.getLastName());
	}

	public Student addStudent(Student student) {
		Student newStudent = studentRepository.save(student);
		return newStudent;
	}
}
