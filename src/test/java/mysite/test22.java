package mysite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.login.LoginServlet;
import com.login.longTest2;

public class test22 {
	private longTest2 ss; 
	 
	@BeforeClass
	public void ss() {
		ss = new longTest2();
		
		
	}
	
	@Test
	public void test() {
		int a[] = {2,4,5,6,7,8,9,10};
		boolean result = ss.testSearch(a,2);
		if(result == true) {
			System.out.println("查找到了");
		}else {
			System.out.println("查不到");
		} 
		
	}
}
