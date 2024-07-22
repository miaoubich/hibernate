package com.miaoubich.usinginterface;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miaoubich.usingdtoclass.Student;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students/interface")
public class StudentInterfaceController {

	private final StudentInterfaceService studentService;
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getStudentsFullNames(@PathVariable("id") Long id){
		String studentFullName = studentService.getStudentFullNameById(id);
		return new ResponseEntity<>(studentFullName, HttpStatus.FOUND);
	}
	
}
