package com.cg.via.Dao;

import com.cg.via.DTO.VehicleDetails;

public interface IVehInsDao {

	
	 int vehicleRegistration(VehicleDetails details);
	  VehicleDetails validityCheck(int vehNo);
	  
}
