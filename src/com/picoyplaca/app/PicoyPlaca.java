package com.picoyplaca.app;

import java.util.GregorianCalendar;
import java.util.Scanner;

import com.picoyplaca.classes.CanBeOnRoad;
import com.picoyplaca.classes.Vehicle;

public class PicoyPlaca {

	public static void main(String[] args) {
		System.out.println("Write the plate:");
		Scanner inputPlate = new Scanner(System.in);
		Vehicle inputVehicle = new Vehicle(""+inputPlate.nextLine());
		System.out.println("Write the date as yyyy/mm/dd:");
		Scanner inputDate = new Scanner(System.in);
		String inputDateString = ""+inputDate.nextLine();
		System.out.println("Write the hour as from 0 to 23:");
		Scanner inputHour = new Scanner(System.in);
		int inputHourtInt = Integer.parseInt(""+inputHour.nextLine());
		System.out.println("Write the minutes as from 0 to 59:");		
		Scanner inputMinute = new Scanner(System.in);
		int inputMinuteInt = Integer.parseInt(""+inputMinute.nextLine());
		
		CanBeOnRoad test = new CanBeOnRoad(inputVehicle, inputDateString, new GregorianCalendar(0, 0, 0, inputHourtInt, inputMinuteInt, 0));
		
		if(test.Predictor())
		{
			System.out.println("The car can be on the Road.");
		}
		else
		{
			System.out.println("The car cannot be on the Road.");
		}
	}

}
