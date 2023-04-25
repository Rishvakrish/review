package com.example.sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Proj1 {
	 @Id
      private int Sno;
      private String Brand;
      private String Model;
      private int Year_of_manufacturing;
      private int Km_Driven;
      private String Petrol_or_Diesel;
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear_of_manufacturing() {
		return Year_of_manufacturing;
	}
	public void setYear_of_manufacturing(int year_of_manufacturing) {
		Year_of_manufacturing = year_of_manufacturing;
	}
	public int getKm_Driven() {
		return Km_Driven;
	}
	public void setKm_Driven(int km_Driven) {
		Km_Driven = km_Driven;
	}
	public String getPetrol_or_Diesel() {
		return Petrol_or_Diesel;
	}
	public void setPetrol_or_Diesel(String petrol_or_Diesel) {
		Petrol_or_Diesel = petrol_or_Diesel;
	}
	
}
