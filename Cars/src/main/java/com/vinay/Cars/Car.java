package com.vinay.Cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 45)
	private String email;

	@Column(nullable = false, length = 20)
	private String brand;

	@Column(nullable = false, length = 20)
	private String modal;

	@Column(nullable = false, length = 45)
	private String state;

	@Column(nullable = false, length = 20)
	private String city;

	@Column(nullable = false, length = 12)
	private String registernumber;

	@Column(nullable = false, length = 20)
	private String fuel;

	@Column(nullable = false, length = 20)
	private String transmission;

	@Column(nullable = false)
	private int price;

	@Column(nullable = false)
	private float mileage;

	@Column(nullable = false)
	private int years;

	@Column(nullable = false)
	private int seats;

	@Column(nullable = false, length = 20)
	private String bodytype;

	@Column(nullable = false)
	private int kmdriven;

	@Column(nullable = false, length = 20)
	private String ownertype;

	@Column(nullable = false, length = 20)
	private String color;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegisternumber() {
		return registernumber;
	}

	public void setRegisternumber(String registernumber) {
		this.registernumber = registernumber;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getBodytype() {
		return bodytype;
	}

	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	public int getKmdriven() {
		return kmdriven;
	}

	public void setKmdriven(int kmdriven) {
		this.kmdriven = kmdriven;
	}

	public String getOwnertype() {
		return ownertype;
	}

	public void setOwnertype(String ownertype) {
		this.ownertype = ownertype;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", email=" + email + ", brand=" + brand + ", modal=" + modal + ", state=" + state
				+ ", city=" + city + ", registernumber=" + registernumber + ", fuel=" + fuel + ", transmission="
				+ transmission + ", price=" + price + ", mileage=" + mileage + ", years=" + years + ", seats=" + seats
				+ ", bodytype=" + bodytype + ", kmdriven=" + kmdriven + ", ownertype=" + ownertype + ", color=" + color
				+ "]";
	}
}
