package com.picoyplaca.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import com.picoyplaca.classes.CanBeOnRoad;
import com.picoyplaca.classes.Vehicle;

public class CanBeOnRoadTest {

	@Test
	public void test() {
		CanBeOnRoad road = new CanBeOnRoad(new Vehicle("pbc-1234"),"2018/01/15","17:00");
	}

}
