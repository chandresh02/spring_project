package com.xworkz.food.tester;

import com.xworkz.food.app.Hotel;

public class HotelTester {
  public static void main(String[] args) {
	
	  Hotel hotel=new Hotel();
	  int price=hotel.order("idly", 2);
	  System.out.println("total price is ::" + price);
	  
}

}
