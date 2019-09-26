package HelloFeature;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import BasePackage.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.runtime.StepDefinition;
import junit.framework.TestResult;

public class InitiAllHooks {
	Reporter rpt = null;
	@Before
	public void doSomethingBefore() {
		rpt = new Reporter();
		System.out.println("Initialized the rpt");
	}

	@Before
	public void beforeStep(Scenario s)
	{
	
	}


	@AfterStep
	public void doSomethingAfterStep(Scenario s) throws IOException{

		
		if(s.isFailed())
		{
			System.out.println("After step defination scenario failed");
			rpt.testStepResult("path", false);		
			}
		else
		{
			// take screen shot faled at step for the scenario 
			System.out.println("After step defination pass");
			System.out.println("After step defination scenario failed");
			rpt.testStepResult("path", true);	
		}
	}

	@After
	public void doSomethingAfter( ){
		rpt.flushAll();
	}


}
