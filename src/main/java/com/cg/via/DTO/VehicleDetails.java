package com.cg.via.DTO;

import java.sql.Date;

public class VehicleDetails {

	private Date date1,date2 ;
	private  int vehicleNo,insurancePeriod;
	private String vehicleType,aadharNo,mobileNo;
	
	
	public VehicleDetails(String vehicleType2, int insurancePeriod2, String aadharNo2, String mobileNo2, Date date,
			Date date22) {

this.date1=date;
this.date2=date22;
this.vehicleType=vehicleType2;
this.insurancePeriod= insurancePeriod2;
this.aadharNo= aadharNo2;
this.mobileNo= mobileNo2;


	}
	public VehicleDetails() {
		 
	}
	public Date getDate() {
		return date1;
	}
	public void setDate(Date date) {
		this.date1 = date;
	}
	public int getVehicleNo() {
		return vehicleNo;
	}
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
