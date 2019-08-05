package br.com.ginezgit.study.designpattern.creational.builder.model.builder;

import java.math.BigDecimal;

import br.com.ginezgit.study.designpattern.creational.builder.model.Engine;

public class EngineBuilder {

	private Engine engine;

	public EngineBuilder() {
		this.engine = new Engine();
	}
	
	public Engine build() {
		return this.engine;
	}
	
	public EngineBuilder setName(String name) {
		this.engine.setName(name);
		return this;
	}

	public EngineBuilder setHp(int hp) {
		this.engine.setHp(hp);
		return this;
	}

	public EngineBuilder setPrice(BigDecimal price) {
		this.engine.setPrice(price);
		return this;
	}
	
}
