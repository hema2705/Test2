package BasePackage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentBDDReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentTabularReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReporter;

public class Reporter {
	// ExtentBDDReporter bdd;
	ExtentHtmlReporter html;
	ExtentReports extent;
	ExtentTest test;
	public Reporter()
	{

		File fp = new File("Test11.html");
		//bdd = new ExtentBDDReporter(fp);
		html = new ExtentHtmlReporter(fp);

		extent = new ExtentReports();
		//extent.attachReporter(bdd);
		extent.attachReporter(html);

		//		bdd.setAnalysisStrategy(AnalysisStrategy.BDD);
		//		bdd.loadXMLConfig("/Users/hema/Documents/workspace/TestFramework/src/main/java/BasePackage/configbdd.xml");
		html.setAnalysisStrategy(AnalysisStrategy.BDD);
		html.loadXMLConfig("/Users/hema/Documents/workspace/TestFramework/src/main/java/BasePackage/configbdd.xml");
		test = extent.createTest("TestName");

	}


	public void flushAll()
	{

		extent.flush();


	}

	public void testStepResult(String screenshotPath , boolean result) throws IOException
	{
		if(result)
		{
			//	test.addScreenCaptureFromPath(screenshotPath);
			test.log(Status.PASS,"test step pass");
		}
		else
		{
			//	test.addScreenCaptureFromPath(screenshotPath);
			test.log(Status.FAIL,"test step fail");
		}
	}
}
