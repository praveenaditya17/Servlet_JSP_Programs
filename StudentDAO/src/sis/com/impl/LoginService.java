package sis.com.impl;

import java.sql.*;

import sis.com.Dao.LoginDao;
import sis.com.bo.UserLogin;
import sis.com.util.SisDbUtil;

public class LoginService implements LoginDao {

	@Override
	public UserLogin getLogin(UserLogin user) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		UserLogin usr=null;
		try {
			con=SisDbUtil.getConnection();
            String sql="select * from user_login where user_name=? and user_password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,user.getUserName());
			pstmt.setString(2,user.getUserPassword());
			rs=pstmt.executeQuery();
			if(rs.next()){
				long id=rs.getLong("ID");
				String name=rs.getString("name");
				String role=rs.getString("role");
				usr=new UserLogin();
				usr.setId(id);
				usr.setName(name);
				usr.setRole(role);
			}
		} catch (SQLException e) {
             System.out.println("SQL errror");
			e.printStackTrace();
		}
		
		return usr;
	}

}
