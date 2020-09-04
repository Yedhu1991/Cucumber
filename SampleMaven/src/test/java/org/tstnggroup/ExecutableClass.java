package org.tstnggroup;

import org.testng.annotations.Test;

public class ExecutableClass {
	
	@Test(groups="Regression")
	public void test1() {
		System.out.println("yedhu");
	}
	@Test(groups="Regression")
	public void test3() {
		System.out.println("yedhu");
	}
	@Test(groups="System")
	public void test2() {
		System.out.println("yedhu");
	}
	@Test(groups="System")
	public void test5() {
		System.out.println("yedhu");
	}
	@Test(groups="Regression")
	public void test6() {
		System.out.println("yedhu");
	}
	@Test(groups="Regression")
	public void test4() {
		System.out.println("yedhu");
	}
	
}
