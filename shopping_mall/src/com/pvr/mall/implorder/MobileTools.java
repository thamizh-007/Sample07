package com.pvr.mall.implorder;

import com.pvr.mall.interfacesample.Order;

public class MobileTools implements Order {
	
	//creating object for the class
	//the small letter is the object reference
	private static MobileTools mobiletools = new MobileTools();
	//private constructor
	
	private MobileTools() {
		
	}
	
	public static MobileTools getMobiletools() {
		return mobiletools;
	}

	public static void setMobiletools(MobileTools mobiletools) {
		MobileTools.mobiletools = mobiletools;
	}

	@Override 
	public void ordering() {
		System.out.println("I am buying wired mouse");
	}

}
