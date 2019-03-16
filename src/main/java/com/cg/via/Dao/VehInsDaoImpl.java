package com.cg.via.Dao;

import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;

import com.cg.via.DTO.VehicleDetails;

public class VehInsDaoImpl implements IVehInsDao{

	
	//VehicleDetails details = new VehicleDetails();
	static HashMap<Integer, VehicleDetails> InsuranceEntry = new HashMap<Integer, VehicleDetails>();
	
	public int vehicleRegistration(VehicleDetails details) {
		
	Date d1 = Date.valueOf(LocalDate.now());
	Date d2 = Date.valueOf(LocalDate.now().plusYears(details.getInsurancePeriod()));
		
		details.setDate(d1) ;
		
		details.setDate2(d2);
		
		
		
		InsuranceEntry.put(details.getVehicleNo(), new VehicleDetails(details.getVehicleType(),details.getInsurancePeriod(),details.getAadharNo(),details.getMobileNo(),details.getDate(),details.getDate2()));
		
		
		 
		return 1;
	}

	public VehicleDetails validityCheck(int vehNo) {
		
		int i=0;
		if(InsuranceEntry.containsKey(vehNo)) {
				i++;	 
		}
		if(i==1)
		return InsuranceEntry.get(vehNo);
		else
			return null;
	}

}
