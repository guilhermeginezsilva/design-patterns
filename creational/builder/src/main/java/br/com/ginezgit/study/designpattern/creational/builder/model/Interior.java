package br.com.ginezgit.study.designpattern.creational.builder.model;

import java.math.BigDecimal;

import br.com.ginezgit.study.designpattern.creational.builder.model.builder.InteriorBuilder;

public class Interior {

	private String name;
	private Color color;
	private BigDecimal price;
	
	public static InteriorBuilder builder() {
		return new InteriorBuilder();
	}
	
	public Interior() {
		super();
	}
	
	public Interior(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Interior(String name, Color color, BigDecimal price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public Interior clone() {
		Interior cloneInterior = new Interior();
		cloneInterior.setName(this.name);
		cloneInterior.setColor(this.color);
		cloneInterior.setPrice(this.price);
		return cloneInterior;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
