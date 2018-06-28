package com.redhu.FailTestCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class FailTestCaseHandling implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructer, Method testmethod) {

		annotation.setRetryAnalyzer(RetryLogic.class);

	}

}
