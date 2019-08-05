package br.com.ginezgit.study.designpattern.creational.abstractfactory.model;

import java.math.BigDecimal;

public class Engine {

	private String name;
	private int hp;
	private BigDecimal price;
	
	public Engine() {
		super();
	}
	
	public Engine(String name, int hp, BigDecimal price) {
		super();
		this.name = name;
		this.hp = hp;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Engine clone() {
		Engine cloneEngine = new Engine();
		cloneEngine.setName(this.name);
		cloneEngine.setHp(this.hp);
		cloneEngine.setPrice(this.price);
		return cloneEngine;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
}
