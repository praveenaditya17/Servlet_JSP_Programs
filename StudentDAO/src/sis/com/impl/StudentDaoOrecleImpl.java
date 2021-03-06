package sis.com.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import sis.com.Dao.StudentDao;
import sis.com.bo.Student;
import sis.com.util.SisDbUtil;

public class StudentDaoOrecleImpl implements StudentDao  {

	@Override
	public boolean addRecord(Student student) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rs;
		boolean isInserted=false;
		try {
			con=SisDbUtil.getConnection();
String sql="insert into Student6(id,name,gender,email,contact,college,branch)values"+
            "((select  nvl(max(id),1000)+1 from Student6),?,?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,student.getName());
			pstmt.setString(2,student.getGender());
			pstmt.setString(3,student.getEmailId());
			pstmt.setString(4,student.getContact());
			pstmt.setString(5,student.getCollege());
			pstmt.setString(6,student.getBranch());
			rs=pstmt.executeUpdate();
			if(rs==1){
				isInserted=true;
			}
		} catch (SQLException e) {
			System.out.println("SQL error");
			e.printStackTrace();
		}finally{
			try {
				SisDbUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return isInserted;
	}

	@Override
	public boolean deleteRecord(long id) {
		Connection con=null;
		Statement  st=null;
		int rs;
		boolean isDeleted=false;
		 try {
			con=SisDbUtil.getConnection();
			st=con.createStatement();
			String sql="delete from Student6 where id="+id;
			rs=st.executeUpdate(sql);
			if(rs==1){
				isDeleted=true;
			}
		} catch (SQLException e) {
          System.out.println("Sql error");
			e.printStackTrace();
		}finally{
			try {
				SisDbUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return isDeleted;
	}

	@Override
	public boolean updateRecord(Student student) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rs;
		boolean isUpdated=false;
		try {
			con=SisDbUtil.getConnection();
			String sql="update Student6 set name=?,gender=?,contact=?,email=?,college=?,branch=? where id="+student.getId();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,student.getName());
			pstmt.setString(2,student.getGender());
			pstmt.setString(3,student.getContact());
			pstmt.setString(4,student.getEmailId());
			pstmt.setString(5,student.getCollege());
			pstmt.setString(6,student.getBranch());
			rs=pstmt.executeUpdate();
			if(rs==1){
				isUpdated=true;
			}
		} catch (SQLException e) {
          System.out.println("SQL error");
			e.printStackTrace();
		}
		
		return isUpdated;
	}

	@Override
	public Student searchRecordById(long id) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Student stu=null;
		try {
			con=SisDbUtil.getConnection();
			String sql="select * from Student6 where id="+id;
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()){
		    long ids=rs.getLong("id");
		    String name=rs.getString("name");
		    String gender=rs.getString("gender");
		    String contact=rs.getString("contact");
		    String email=rs.getString("email");
		    String college=rs.getString("college");
		    String branch=rs.getString("branch");
		      stu=new Student();
		      stu.setId(ids);
		      stu.setName(name);
		      stu.setBranch(branch);
		      stu.setGender(gender);
		      stu.setCollege(college);
		      stu.setContact(contact);
		      stu.setEmailId(email);
			}
		} catch (SQLException e) {
         System.out.println("SQL Eroor");			
         e.printStackTrace();
		}finally{
			try {
				SisDbUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return stu;
	}

	@Override
	public List<Student> searchRecordByName(String name) {
		
		Connection con=null;
		Statement pstmt=null;
		ResultSet rs=null;
		Student stu=null;
		List<Student> list=new ArrayList<>();
		try {
			con=SisDbUtil.getConnection();
			pstmt=con.createStatement();
    String sql="select * from Student6 where name like('"+name+"%')";
			rs=pstmt.executeQuery(sql);
			while(rs.next()){
		    long ids=rs.getLong("id");
		    String names=rs.getString("name");
		    String gender=rs.getString("gender");
		    String contact=rs.getString("contact");
		    String email=rs.getString("email");
		    String college=rs.getString("college");
		    String branch=rs.getString("branch");
		      stu=new Student();
		      stu.setId(ids);
		      stu.setName(names);
		      stu.setBranch(branch);
		      stu.setGender(gender);
		      stu.setCollege(college);
		      stu.setContact(contact);
		      stu.setEmailId(email);
		      list.add(stu);
			}
		} catch (SQLException e) {
         System.out.println("SQL Eroor");			
         e.printStackTrace();
		}finally{
			try {
				SisDbUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<Student> showAllRecord() {
		
		

		Connection con=null;
		Statement pstmt=null;
		ResultSet rs=null;
		Student stu=null;
		List<Student> list=new ArrayList<>();
		try {
			con=SisDbUtil.getConnection();
			pstmt=con.createStatement();
    String sql="select * from Student6 order by id asc";
			rs=pstmt.executeQuery(sql);
			while(rs.next()){
		    long ids=rs.getLong("id");
		    String names=rs.getString("name");
		    String gender=rs.getString("gender");
		    String contact=rs.getString("contact");
		    String email=rs.getString("email");
		    String college=rs.getString("college");
		    String branch=rs.getString("branch");
		      stu=new Student();
		      stu.setId(ids);
		      stu.setName(names);
		      stu.setBranch(branch);
		      stu.setGender(gender);
		      stu.setCollege(college);
		      stu.setContact(contact);
		      stu.setEmailId(email);
		      list.add(stu);
			}
		} catch (SQLException e) {
         System.out.println("SQL Eroor");			
         e.printStackTrace();
		}finally{
			try {
				SisDbUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;		
	}

}
