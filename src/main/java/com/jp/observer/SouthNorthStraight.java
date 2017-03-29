package com.jp.observer;

import java.util.Observable;
import java.util.Observer;

public class SouthNorthStraight implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String status=(String)arg;
		if(status.equals("red SN")){
			System.out.println("SN:red ,stop now");
		}

	}

}
