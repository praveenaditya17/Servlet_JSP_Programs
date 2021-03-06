package sis.com.Dao;

import java.util.List;

import sis.com.bo.Student;

public interface StudentDao {

	boolean addRecord(Student student);
	boolean deleteRecord(long id);
	boolean updateRecord(Student student);
	Student searchRecordById(long id);
	List<Student>searchRecordByName(String name);
	List<Student>showAllRecord();	 
}
