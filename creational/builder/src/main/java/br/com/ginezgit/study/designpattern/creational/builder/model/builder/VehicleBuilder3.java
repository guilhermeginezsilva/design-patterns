package br.com.ginezgit.study.designpattern.creational.builder.model.builder;

import br.com.ginezgit.study.designpattern.creational.builder.model.Engine;
import br.com.ginezgit.study.designpattern.creational.builder.model.Interior;
import br.com.ginezgit.study.designpattern.creational.builder.model.Model;
import br.com.ginezgit.study.designpattern.creational.builder.model.Vehicle;

public class VehicleBuilder3 {

	private Model model;
	private Interior interior;
	private Engine engine;
	
	public Vehicle build() {
		return new Vehicle(this.model, this.interior, this.engine);
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
