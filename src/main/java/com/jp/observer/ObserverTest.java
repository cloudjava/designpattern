package com.jp.observer;

import java.util.Observer;

public class ObserverTest {

	public static void main(String[] args){
		TrafficLight tl=new TrafficLight();
		Observer southNorthStraight=new SouthNorthStraight();
		Observer eastWestStraight=new EastWestStraight() ;
		tl.addObserver(eastWestStraight);
		tl.addObserver(southNorthStraight);
		tl.statusChange("red SN");
		tl.deleteObserver(southNorthStraight);
		tl.deleteObserver(eastWestStraight);
	}

}
