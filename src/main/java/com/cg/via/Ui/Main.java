package com.cg.via.Ui;

import java.util.Scanner;

import com.cg.via.DTO.VehicleDetails;
import com.cg.via.Service.IVehInsService;
import com.cg.via.Service.VehInsServiceImpl;

public class Main {

	public static void main(String[] args) {
	 
		IVehInsService insService = new VehInsServiceImpl();
		VehicleDetails details = new VehicleDetails();
		VehicleDetails details1 = new VehicleDetails();
		int i;
		Scanner sc = new Scanner(System.in);
		
		do {
			
		
		System.out.println("Enter 1. Vehicle Insurance Registration 2. Insurance Validity Check ");
	     int menu = sc.nextInt();
	     switch(menu) {
	     case 1:
	    	 System.out.println("Enter vehicle no");
	    	 details.setVehicleNo(sc.nextInt());
	    	 System.out.println("Enter vehicle type");
	    	 details.setVehicleType(sc.next());
	    	 System.out.println("Enter Insurance Period");
	    	 details.setInsurancePeriod(sc.nextInt());
	    	 System.out.println("Enter Aadhar no");
	    	 details.setAadharNo(sc.next());
	    	 System.out.println("Enter mobile no");
	    	 details.setMobileNo(sc.next());
	    	 
	    
	    	  i= insService.vehicleRegistration(details);	    	  
	    	  if(i==1) {
	    		  System.out.println("Registration successful");
	    	  }
	        	 
	    	 break;
	     case 2:
	    	 
	    	 System.out.println("Enter vehicle no");
	    	 int vehNo = sc.nextInt();
	    	 details1 = insService.validityCheck(vehNo);
	    	 
	    	 if(details1!= null) {
	    	 
	    		 System.out.println("Insurance expires on : "+ details1.getDate2());
	    		 System.out.println("No of days remaining for renewal : "+ 365*details1.getInsurancePeriod());
	    		 
	    	 }
	    	 
	    	 break;
	     case 3:
	    	       System.exit(0);
	    	         break;
	    	 default : System.out.println("Invalid Choice");
	    	           break;
	    	 
	     }
		}while(true);
	}

}
