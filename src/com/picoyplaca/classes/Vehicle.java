package com.picoyplaca.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehicle {

	private String plate;

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Vehicle(String plate) {
		String RegEx = "[A-Z][A-Z][A-Z][-][0-9][0-9][0-9][0-9]\\z";
		Pattern pattern = Pattern.compile(RegEx);
		Matcher matcher = pattern.matcher(plate.toUpperCase());
		if(matcher.matches())
		{
			this.plate = plate;
		}
		else
		{
			throw new RuntimeException("Invalid Plate");
		}
	}
}
