package com.picoyplaca.tdd;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

import com.picoyplaca.classes.CanBeOnRoad;
import com.picoyplaca.classes.Vehicle;

public class CanBeOnRoadTest {

	@Test
	public void validateConstructorInVehicle() {
		assertEquals(Vehicle.class, new CanBeOnRoad(new Vehicle("pbc-1234"),"2018/01/15",new GregorianCalendar(0, 0, 0, 17, 30, 0)).getVehicle().getClass());		
	}
	
	@Test
	public void validateConstructorInDate() {
		assertEquals(String.class, new CanBeOnRoad(new Vehicle("pbc-1234"),"2018/01/15",new GregorianCalendar(0, 0, 0, 17, 30, 0)).getDate().getClass());		
	}
	
	@Test
	public void validateConstructorInTime() {
		assertEquals(GregorianCalendar.class, new CanBeOnRoad(new Vehicle("pbc-1234"),"2018/01/15",new GregorianCalendar(0, 0, 0, 17, 30, 0)).getTime().getClass());		
	}
	
	@Test
	public void validatePredictor(){
		assertTrue(new CanBeOnRoad(new Vehicle("pbc-1235"),"2018/01/17",new GregorianCalendar(0, 0, 0, 20, 30, 0)).Predictor());		
	}

}
