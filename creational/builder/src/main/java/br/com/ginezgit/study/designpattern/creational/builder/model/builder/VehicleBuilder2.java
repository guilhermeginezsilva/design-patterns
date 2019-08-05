package br.com.ginezgit.study.designpattern.creational.builder.model.builder;

import br.com.ginezgit.study.designpattern.creational.builder.model.Engine;
import br.com.ginezgit.study.designpattern.creational.builder.model.Interior;
import br.com.ginezgit.study.designpattern.creational.builder.model.Model;
import br.com.ginezgit.study.designpattern.creational.builder.model.Vehicle;

public class VehicleBuilder2 {

	private Vehicle vehicle;
	
	public VehicleBuilder2() {
		this.vehicle = new Vehicle();
	}
	
	public void setModel(Model model) {
		this.vehicle.setModel(model);
	}
	public void setInterior(Interior interior) {
		this.vehicle.setInterior(interior);
	}
	public void setEngine(Engine engine) {
		this.vehicle.setEngine(engine);
	}
	
	public Vehicle build() {
		return this.vehicle;
	}
	
}
