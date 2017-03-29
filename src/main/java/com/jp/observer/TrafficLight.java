package com.jp.observer;

import java.util.Observable;

public class TrafficLight extends Observable {
	public void statusChange(String currentLights){
		setChanged();  
        notifyObservers(currentLights);
	}

}
