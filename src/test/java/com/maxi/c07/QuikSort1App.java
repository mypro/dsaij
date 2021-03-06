package com.maxi.c07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuikSort1App {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test##############################################################");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass test##########################################################");
	}

	@Test
	public void test() throws Exception {
		int maxSize = 16;

		ArrayQuick aq = new ArrayQuick(maxSize);

		for (int j = 0; j < maxSize; j++) {
			long n = (int) (Math.random() * 99);
			aq.insert(n);
		}
		aq.display();

		aq.quickSort();

		aq.display();
	}
}
