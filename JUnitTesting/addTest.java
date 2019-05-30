package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void testAdd() {
		MyJUnitClass junit = new MyJUnitClass();
		//testing addition of 100 + 200
		//calls and tests add()
		int result = junit.add(100, 200);
		//test case
		assertEquals(300, result);
		
	}

}

//Above  : all we are doing is creating an object called `junit` from the MyJUnitClass that inherits all the properties and methods
// of this class.  We use a JUnit assert method called assertEquals() that compares the expected result of 300 = 100 + 200 and 
// the value of the variable `result`.  Run it and you get a green bar if passes, red bar if it fails 

//to create a JUnit test for this UnitTesting1 project, right click on the project/New/JUNit Test Case to create a new test

//to run the test right click on project/Run As/JUnit Test

//Create a JUnit Test Suite that will run all your JUnit Tests together : right click on project/new/other/java/JUnit/browse and 
//choose suggested package/ next you should see list of tests you want to include / finish / finally, run AllTests.java by right 
//click / debug as JUnit test and voilà! 


