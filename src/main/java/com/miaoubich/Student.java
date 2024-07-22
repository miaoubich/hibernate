package com.miaoubich;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Students")
@NamedNativeQuery(
		name = "Student.findStudentFullNameById",
		query = "Select First_Name AS firstName, Last_Name AS lastName FROM Students WHERE id = :id",
		resultSetMapping = "StudentFullNameMapping"
		)
@SqlResultSetMapping(
		name = "StudentFullNameMapping",
		classes = @ConstructorResult(
				targetClass = StudentFullName.class,
				columns = {
						@ColumnResult(name = "firstName", type = String.class),
						@ColumnResult(name = "lastName", type = String.class)
				}
		)
	)
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "First_Name")
	private String firstname;
	@Column(name = "Last_Name")
	private String lastname;
}

