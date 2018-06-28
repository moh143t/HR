package com.redhu.Util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.redhu.Base.TestBase;

public class TestUtil extends TestBase {

	public TestUtil() throws IOException {
		// super();
		// TODO Auto-generated constructor stub   // No need from working point of view, Just we have added this constructer. 
	}

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICTWAITTIMEOUT = 20;
	
	

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");

		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}

}
