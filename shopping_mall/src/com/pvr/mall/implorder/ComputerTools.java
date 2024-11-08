package com.pvr.mall.implorder;

import com.pvr.mall.interfacesample.Order;

public class ComputerTools implements Order {
	
	//without static we can't able to access the object
	private static ComputerTools computertools = new ComputerTools();
	
	public static ComputerTools getComputertools() {
		return computertools;
	}

	public static void setComputertools(ComputerTools computertools) {
		ComputerTools.computertools = computertools;
	}

	private ComputerTools() {
		
	}
	
	@Override
	public void ordering() {
		System.out.println("I am buying hardisk");
	}

}
