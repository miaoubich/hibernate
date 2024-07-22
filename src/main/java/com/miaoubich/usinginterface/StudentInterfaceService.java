package com.miaoubich.usinginterface;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentInterfaceService {

	private final StudentInterfaceRepository studentRepository;

	public String getStudentFullNameById(Long id) {
		FullName studentFullName = studentRepository.getStudentFullNameById(id);
		
		return studentFullName.getFirstname() + " - " + studentFullName.getLastname();
	} 
	
}
