package br.com.ginezgit.study.designpattern.creational.abstractfactory.model;

import java.math.BigDecimal;

public class Model {

	private String name;
	private Color color;
	private BigDecimal price;

	public Model() {
		super();
	}

	public Model(String name, Color color, BigDecimal price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public Model(String name, BigDecimal price) {
		super();
		this.name = name;
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
	
	public Model clone() {
		Model cloneModel = new Model();
		cloneModel.setName(this.name);
		cloneModel.setColor(this.color);
		cloneModel.setPrice(this.price);
		return cloneModel;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	
}
