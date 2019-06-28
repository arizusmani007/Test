package com.cg.bean;

public class Invoice {
	private int id;
	private int weight;
	private int distance;
	private double amount;
	private double cgst;
	private double sgst;
	public Invoice() {
		// TODO Auto-generated constructor stub
	}
	public Invoice(int id, int weight, int distance, double amount, double cgst, double sgst) {
		super();
		this.id = id;
		this.weight = weight;
		this.distance = distance;
		this.amount = amount;
		this.cgst = cgst;
		this.sgst = sgst;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", weight=" + weight + ", distance=" + distance + ", amount=" + amount + ", cgst="
				+ cgst + ", sgst=" + sgst + "]";
	}
	
}
