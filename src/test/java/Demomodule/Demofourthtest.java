package Demomodule;

import org.testng.annotations.Test;

public class Demofourthtest {
	
	@Test
	public void demofourthtest()
	{
		System.out.println("REgres 2");
		System.out.println("REgres 4");
		String BROWSER = System.getProperty("Browser");
		String URL = System.getProperty("Url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}
	}



