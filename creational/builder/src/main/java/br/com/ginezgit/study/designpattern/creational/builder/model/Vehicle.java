package br.com.ginezgit.study.designpattern.creational.builder.model;

import java.math.BigDecimal;

import br.com.ginezgit.study.designpattern.creational.builder.model.builder.VehicleBuilder;

public class Vehicle {

	private Model model;
	private Interior interior;
	private Engine engine;
	
	public static VehicleBuilder builder() {
		return new VehicleBuilder();
	}
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(Model model, Interior interior, Engine engine) {
		super();
		this.model = model;
		this.interior = interior;
		this.engine = engine;
	}
	
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public Interior getInterior() {
		return interior;
	}
	public void setInterior(Interior interior) {
		this.interior = interior;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public BigDecimal getPrice() {
		return model.getPrice().add(interior.getPrice()).add(engine.getPrice());
	}
	
}
