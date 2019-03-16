package com.cg.via.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.via.DTO.VehicleDetails;
import com.cg.via.Dao.IVehInsDao;
import com.cg.via.Dao.VehInsDaoImpl;

 class TestEx {
	

static IVehInsDao insDao ;
static VehicleDetails details;
@BeforeAll
public static void init() { 
      insDao = new VehInsDaoImpl();
      details = new VehicleDetails();
}

@Test

void testVehicleRegistration() {
	details.setVehicleNo(123);
	details.setAadharNo("131415161718");
	details.setInsurancePeriod(1);
	details.setMobileNo("4647484949");
	details.setVehicleType("4-Wheeler");
	
	
	assertEquals(1,insDao.vehicleRegistration(details));
}

@Test
void testValidityCheck() {
	
	
	assertEquals(null, insDao.validityCheck(456));
	
}
}
