package com.picoyplaca.classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CanBeOnRoad {

	private Vehicle vehicle;
	private String date;
	private GregorianCalendar time;
	private static GregorianCalendar MorningStartHour = new GregorianCalendar(0, 0, 0, 7, 00, 0);
	private static GregorianCalendar MorningStopHour = new GregorianCalendar(0, 0, 0, 9, 30, 0);
	private static GregorianCalendar EveningStartHour = new GregorianCalendar(0, 0, 0, 16, 00, 0);
	private static GregorianCalendar EveningStopHour = new GregorianCalendar(0, 0, 0, 19, 30, 0);

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public GregorianCalendar getTime() {
		return time;
	}

	public void setTime(GregorianCalendar time) {
		this.time = time;
	}

	public CanBeOnRoad(Vehicle vehicle, String date, GregorianCalendar time) {
		this.vehicle = vehicle;		
		this.time = time;

		String RegEx = "[2][0][0-9][0-9][/][0-1][0-9][/][0-3][0-9]\\z";
		Pattern pattern = Pattern.compile(RegEx);
		Matcher matcher = pattern.matcher(date);
		if(matcher.matches())
		{
			this.date = date;
		}
		else
		{
			throw new RuntimeException("Invalid Input Date");
		}		
	}

	public boolean Predictor() {		
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date inputdate = null;
		try {
			inputdate = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputdate);

		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case 2:

			break;

		case 3:

			break;

		case 4:

			break;

		case 5:

			break;

		case 6:

			break;

		default:
			return true;
		}

		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

		return false;
	}
}
