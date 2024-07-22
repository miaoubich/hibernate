package com.miaoubich;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query(nativeQuery = true)
	StudentFullName findStudentFullNameById(Long id);
}
