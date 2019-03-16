package com.cg.via.Service;

import javax.activity.InvalidActivityException;

import com.cg.via.DTO.VehicleDetails;
import com.cg.via.Dao.IVehInsDao;
import com.cg.via.Dao.VehInsDaoImpl;

public class VehInsServiceImpl implements IVehInsService{
	IVehInsDao insDao = new VehInsDaoImpl();

	public int vehicleRegistration(VehicleDetails details) {
		
		
		if((details.getAadharNo()).length()==12) {
		if(details.getMobileNo().length()==10) {		
			} else
				try {
					throw new InvalidActivityException();
				} catch (InvalidActivityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		} else
			try {
				throw new InvalidActivityException();
			} catch (InvalidActivityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return insDao.vehicleRegistration(details);
		
	}

	public VehicleDetails validityCheck(int vehNo) {
		 
		return insDao.validityCheck(vehNo);
	}

}
