package mysite;

import com.login.LoginServlet;

public class TestLoginServlet {
 private LoginServlet ss; 
 public void TestLoginServlet() {
	ss = new LoginServlet();
 }
 
 public void test() {
	 ss.mytest();
 }
}
