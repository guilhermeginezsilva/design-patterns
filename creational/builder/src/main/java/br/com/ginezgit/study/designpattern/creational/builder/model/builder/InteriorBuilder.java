package br.com.ginezgit.study.designpattern.creational.builder.model.builder;

import java.math.BigDecimal;

import br.com.ginezgit.study.designpattern.creational.builder.model.Color;
import br.com.ginezgit.study.designpattern.creational.builder.model.Engine;
import br.com.ginezgit.study.designpattern.creational.builder.model.Interior;

public class InteriorBuilder {

	private Interior interior;

	public InteriorBuilder() {
		this.interior = new Interior();
	}
	
	public Interior build() {
		return this.interior;
	}
	
	public InteriorBuilder setName(String name) {
		this.interior.setName(name);
		return this;
	}

	public InteriorBuilder setColor(Color color) {
		this.interior.setColor(color);
		return this;
	}

	public InteriorBuilder setPrice(BigDecimal price) {
		this.interior.setPrice(price);
		return this;
	}
	
}
