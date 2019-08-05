package br.com.ginezgit.study.designpattern.creational.builder.model.builder;

import br.com.ginezgit.study.designpattern.creational.builder.model.Engine;
import br.com.ginezgit.study.designpattern.creational.builder.model.Interior;
import br.com.ginezgit.study.designpattern.creational.builder.model.Model;
import br.com.ginezgit.study.designpattern.creational.builder.model.Vehicle;

public class VehicleBuilder {

	private Vehicle vehicle;
	
	public VehicleBuilder() {
		this.vehicle = new Vehicle();
	}
	
	public VehicleBuilder setModel(Model model) {
		this.vehicle.setModel(model);
		return this;
	}
	public VehicleBuilder setInterior(Interior interior) {
		this.vehicle.setInterior(interior);
		return this;
	}
	public VehicleBuilder setEngine(Engine engine) {
		this.vehicle.setEngine(engine);
		return this;
	}
	
	public Vehicle build() {
		return this.vehicle;
	}
	
}
