package JUnit.tests.components.stub;


import JUnit.tests.components.AmpleMemory;
import JUnit.tests.components.CPULimitTest;
import JUnit.tests.components.ExpectedCalls;


//this testcase is for junit
public class TestCasePass {	

	@ExpectedCalls (numOfMethodCalls=1)
	public void testSubtractCalls(){
		int a = 3;
		int b = 5;
		int total = a-b;

	}
	
	@ExpectedCalls (numOfMethodCalls=3)
	public void testIgnorePassedTests(){

	}

	@CPULimitTest (limit=1000)
	public void testRandomNumberPass(){
		int a = 3;
		int b = 5;
		int total = a+b;
	}
	
	@CPULimitTest (limit=100)
	public void testRandomNumberPass1(){
		int a = 3;
		int b = 5;
		int total = a+b;
	}
	
	
	@AmpleMemory
	public void testRandomNumberFail(){
		int a = 3;
		int b = 5;
		int total = a+b;
	}
	
	@CPULimitTest (limit = 60)
	public void testRandomNumberFail1(){
		int a = 3;
		int b = 5;
		int total = a+b;
	}
	
	@AmpleMemory (threshHold = 50)
	public void testRandomNumberFail2(){
		int a = 3;
		int b = 5;
		int total = a+b;
	}
	
}
