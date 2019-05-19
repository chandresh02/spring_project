package com.xworkz.food.app;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private List<String> foodItems=new ArrayList<>();
	private int price=30;
	public Hotel()
	{
		System.out.println(this.getClass().getSimpleName()+ "object created");
		foodItems.add("puri");
		foodItems.add("idly");
		foodItems.add("dosa");
		foodItems.add("chapati");
		foodItems.add("burger");
	}
	public int order(String item,int qty)
	{
		System.out.println("invoked order with item \t" +item +"\t qty" + qty);
		if(foodItems.contains(item))
		{
			System.out.println("item found");
			int total=qty*price;
			System.out.println("total price \t"  + total);
			return total;
		}
		return 0;
	}
	

}
