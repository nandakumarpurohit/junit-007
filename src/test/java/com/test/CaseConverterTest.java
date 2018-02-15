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

}
