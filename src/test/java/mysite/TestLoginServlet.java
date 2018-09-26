package mysite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.login.LoginServlet;

public class TestLoginServlet {
	private LoginServlet ss; 
 
	@BeforeClass
	public void ss() {
		ss = new LoginServlet();
	}
	
	@Test
	public void test() {
		ss.mytest();
	}
}
