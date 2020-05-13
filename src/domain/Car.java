package domain;

import java.time.LocalDate;

public class Car {			//variables
	
	private Long id;
	private LocalDate year;
	private String make;
	private String model;
	private String color;
	private String type;
	private String position;
	
	public Car() {		// default constructor
	}
	// constructor
	public Car(Long id, LocalDate year, String make, String model, String color, String type, String position) {
		this.id = id;				//all this. are objects of the same class
		this.year = year;			
		this.make = make;
		this.model = model;
		this.color = color;
		this.type = type;
		this.position = position;
	}
	
	//get set
	public Long getId() {				
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getYear() {
		return year;
	}
	public void setYear(LocalDate year) {
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", year=" + year + ", make=" + make + ", model=" + model + ", color=" + color
				+ ", type=" + type + ", position=" + position + "]";
	}	
	
}
