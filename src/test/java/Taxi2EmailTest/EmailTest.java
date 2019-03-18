package Taxi2EmailTest;

import org.testng.annotations.Test;

import Taxi2EmailUtility.EmailUtility;

public class EmailTest extends EmailUtility{


	@Test(enabled = true, priority = 0)
	public void Taxi2Airport() {
		openBrowser("Chrome");
		emailLoginId();
		processWait();
		
		
	}
	

	

}
