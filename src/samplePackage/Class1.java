package samplePackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class1 {
  @Test(dataProvider="colege")
  public void login(String UName, String Pwd) {
	  System.out.println("Username "+UName+" Password "+Pwd);
  }
  @DataProvider(name="colege")
  public String [][] getData(){
	 String details[][]={{"admin","pwd123"},{"user","pwd456"}};
	 return details;
  }
}
