package com.jp.adaptor;

public class MiniSD extends StorageDevice {
	SDAdaptor adaptor=new SDAdaptor();
	@Override
	public void plugin(Device device){
		if(device instanceof CellPhone){
			System.out.println("plug into cellphone");
		}
		else if (device instanceof Computer){
			adaptor.plugin((Computer)device);
		}
		
	}
	public static void main(String[] args){
		MiniSD miniSD=new MiniSD();
		Device device=new Computer();
		miniSD.plugin(device);
		device =new CellPhone();
		miniSD.plugin(device);
	}
}
