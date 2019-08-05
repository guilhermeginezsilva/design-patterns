package br.com.ginezgit.study.designpattern.creational.builder.model.builder;

import java.math.BigDecimal;

import br.com.ginezgit.study.designpattern.creational.builder.model.Color;
import br.com.ginezgit.study.designpattern.creational.builder.model.Interior;
import br.com.ginezgit.study.designpattern.creational.builder.model.Model;

public class ModelBuilder {

	private Model model;

	public ModelBuilder() {
		this.model = new Model();
	}
	
	public Model build() {
		return this.model;
	}
	
	public ModelBuilder setName(String name) {
		this.model.setName(name);
		return this;
	}

	public ModelBuilder setColor(Color color) {
		this.model.setColor(color);
		return this;
	}

	public ModelBuilder setPrice(BigDecimal price) {
		this.model.setPrice(price);
		return this;
	}
	
}
