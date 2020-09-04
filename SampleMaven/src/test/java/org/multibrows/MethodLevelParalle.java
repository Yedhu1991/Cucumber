package org.multibrows;

import org.testng.annotations.Test;

public class MethodLevelParalle {

	@Test
	public void test1() {
		System.out.println("test1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		System.out.println("test2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("test4");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("test3");
		System.out.println(Thread.currentThread().getId());
	}
}
