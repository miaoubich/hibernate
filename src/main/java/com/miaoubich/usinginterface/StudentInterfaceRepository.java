package com.miaoubich.usinginterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentInterfaceRepository extends JpaRepository<StudentInterface, Long>{

	@Query(value = "SELECT s.first_name AS firstName, s.last_name AS lastName FROM students s WHERE id = :id", nativeQuery = true)
	FullName getStudentFullNameById(Long id);
}
