package com.brizlabs.stock;

import java.util.Scanner;

public class Stockmarket_management {
	
	String name_of_Stock;
	
      int no_of_share;
      
      int share_Price;
      int current_price;
      
      int stock_report;
      
      void show(String actual_name_stock)
      {
    	  System.out.println("This is stock market management system");
    		//System.out.println(actual_name_stock1);
      }
      
      
      void show()
      {
    	  //System.out.println("Indian Indices");
    	  int original_price=70;
    	  Scanner sc = new Scanner(System.in);
  		System.out.println("Enter d current price stock");
  		int name_of_Stock=sc.nextInt();
  		
  		int netGain=(name_of_Stock)-(original_price)/(original_price)*100;
  		
  		System.out.println("Net gain is :"+netGain);
  		
  		if (netGain>=0)
  		{
  			System.out.println("Your stock is in Profit");
  		}
  		else
  		{
  			System.out.println("Your stock is in loss");
  		}
      }
      
      
      public static void main(String[] args) {
		
	
    	  Stockmarket_management m1=new Stockmarket_management();
    	  m1.show("hii");
    	  m1.show();
    	  
	
	
}
}