package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.CaseConverter;

public class CaseConverterTest {
	
	CaseConverter c1 = new CaseConverter();

	@Test
	public void testConvertCase() {
		assertEquals(c1.convertCase("hello"), "HELLO");
	}
	
	@Test
	public void testConvertCase2() {
		assertEquals(c1.convertCase("hello"), "HELLO");
	}
	
	@Test
	public void testConvertCase7() {
		assertEquals(c1.convertCase("ok"), "OK");
	}
	
	@Test
	public void testConvertCase3() {
		assertEquals(c1.convertCase(""), "");
	}

	
	@Test
	public void testConvertCase5() {
		assertEquals(c1.convertCase(null), "");
	}
	
	@Test
	public void testConvertCase6() {
		assertEquals(c1.convertCase("7"), "7");
	}

}
