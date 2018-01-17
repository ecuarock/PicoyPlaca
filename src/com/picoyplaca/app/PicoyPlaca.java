package com.picoyplaca.app;

import java.util.GregorianCalendar;
import java.util.Scanner;

import com.picoyplaca.classes.CanBeOnRoad;
import com.picoyplaca.classes.Vehicle;

public class PicoyPlaca {

	public static void main(String[] args) {
		System.out.println("Write the plate:");
		Scanner scanner = new Scanner(System.in);
		Scanner inputPlate = scanner;
		Vehicle inputVehicle = new Vehicle(""+inputPlate.nextLine());
		System.out.println("Write the date as yyyy/mm/dd:");
		Scanner inputDate = scanner;
		String inputDateString = ""+inputDate.nextLine();
		System.out.println("Write the hour as from 0 to 23:");
		Scanner inputHour = scanner;
		int inputHourtInt = Integer.parseInt(""+inputHour.nextLine());
		System.out.println("Write the minutes as from 0 to 59:");		
		int inputMinuteInt = Integer.parseInt(""+scanner.nextLine());
		
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
