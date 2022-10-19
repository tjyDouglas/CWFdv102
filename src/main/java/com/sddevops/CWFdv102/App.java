package com.sddevops.CWFdv102;

public class App 
{
	private double height;
	private double weight;
	private double bmi;
	
		 
		public App(double height) {
			super();
			this.height = height;		
						}
	 
		public double getHeight() {
			return height;
		}
		
		public void setHeight(double height) {
			this.height = height;
		}
		
	 
		public double getWeight() {
			return weight;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public double getBmi() {
			return bmi;
		}
		
		public void setBmi(double bmi) {
			this.bmi = bmi;
		}

		public double calcBmi() {			
			bmi = (weight)/(height*height);
			 
			return bmi;
			
		}
		
		
		
}