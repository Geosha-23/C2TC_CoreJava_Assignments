package com.geosha.assignment2;

import java.util.Scanner;

public class Commission {
      private String Name;
      private String Address;
      private String Phone;
      private double Sales_amount;
      
      public void acceptDetails() {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter name: ");
    	  Name =sc.nextLine();
    	  System.out.println("Enter address: ");
    	  Address =sc.nextLine();
    	  System.out.println("Enter phone: ");
    	  Phone = sc.nextLine();
    	  System.out.println("Enter sales_amount: ");
    	  Sales_amount =sc.nextDouble();
      }
      
      public void calculateCommission() {
    	  double commission=0;
    	  if(Sales_amount>=100000) {
    		  commission = Sales_amount*0.10;
    	  }
    	  else if( Sales_amount>=50000 ){
    		  commission =Sales_amount*0.05;
    	  }
    	  else if( Sales_amount>=30000 ){
    		  commission =Sales_amount*0.03;
      }
    	  else{
    		  commission=0;
    	  }
    	  System.out.println("Commission for "+ Name +":  $"+commission);
}
}
