package com.pvr.mall;

import com.pvr.mall.entity.Customer;
import com.pvr.mall.implorder.ComputerTools;
import com.pvr.mall.implorder.MobileTools;
import com.pvr.mall.interfacesample.Order;

public class ShoppingDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("Thamizhvijayan");
		c1.setCity("Pondicherry");
		c1.setProduct("mobiletools");
		
		Order order;
		
		String choice = c1.getProduct();
		//to compare the string we use equals() 
		if(choice.equals("mobiletools"))
		{
			order=MobileTools.getMobiletools();
		}
		else {
			order=ComputerTools.getComputertools();
			
		}
		order.ordering();
	}

}
