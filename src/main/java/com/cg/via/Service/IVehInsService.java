package com.cg.via.Service;

import com.cg.via.DTO.VehicleDetails;

public interface IVehInsService {
	
  int vehicleRegistration(VehicleDetails details);
 VehicleDetails validityCheck(int vehNo);
  

}
