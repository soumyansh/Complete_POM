package Rough;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.testng.annotations.Test;

public class Rough2 {
	@Test()
	public void Abcd(Method m,String a) {
		
		System.out.println(m.getName());
		System.out.println(m.getParameters().length);
	}

}
