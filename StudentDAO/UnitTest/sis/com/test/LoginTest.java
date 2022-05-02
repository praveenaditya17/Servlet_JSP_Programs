package sis.com.test;

import sis.com.Dao.LoginDao;
import sis.com.bo.UserLogin;
import sis.com.factory.StudentFactory;

public class LoginTest {

	public static void main(String[] args) {
     LoginDao loginDao=StudentFactory.getLoginDao();
     UserLogin user=new UserLogin();
     user.setUserName("sis");
     user.setUserPassword("123");
     UserLogin log=loginDao.getLogin(user);
     if(log!=null){
    	 System.out.println("Id:"+log.getId());
    	 System.out.println("Name:"+log.getName());
    	 System.out.println("Role:"+log.getRole());
     }else{
    	 System.out.println("Wrong userName or UserPassword..");
     }
	}

}
