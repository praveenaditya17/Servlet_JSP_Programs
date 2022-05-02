package sis.com.test;

import java.util.List;

import sis.com.Dao.StudentDao;
import sis.com.bo.Student;
import sis.com.factory.StudentFactory;

public class SearchByIdTest  {

	public static void main(String[] args) {
  StudentDao studentDao=StudentFactory.getStudentDao();
      Object arr=studentDao.searchRecordById(1001);
      Student stu=(Student)arr;       
    	 System.out.println(stu.getId()); 
    	 System.out.println( stu.getName());
    	 System.out.println( stu.getGender());
    	 System.out.println(stu.getContact());
    	 System.out.println(stu.getEmailId());
    	 System.out.println( stu.getCollege());
    	 System.out.println( stu.getBranch());
    	 System.out.println("-----------------------------");
    	 
      
	}

}

