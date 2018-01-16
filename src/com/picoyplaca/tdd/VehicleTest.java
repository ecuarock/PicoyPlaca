package com.picoyplaca.tdd;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.picoyplaca.classes.Vehicle;

public class VehicleTest {

	@Test
	public void plateStringTest() {
		assertEquals(String.class, new Vehicle("pcs-1234").getPlate().getClass());		
	}
	
	@Test
	public void plateStringValidTest(){
		String RegEx = "[A-Z][A-Z][A-Z][-][0-9][0-9][0-9][0-9]\\z";
		Pattern pattern = Pattern.compile(RegEx);
		Matcher matcher = pattern.matcher(new Vehicle("PSC-1234").getPlate());
		assertTrue(matcher.matches());		
	}

}
