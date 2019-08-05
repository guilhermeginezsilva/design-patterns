package br.com.ginezgit.study.designpattern.creational.builder.model;

public class Color {

	public static final Color BLACK = new Color("black", "#000000");
	public static final Color WHITE = new Color("white", "#ffffff");
	public static final Color YELLOW = new Color("yellow", "#fffb00");
	public static final Color RED = new Color("red", "#ff0000");
	public static final Color BLUE = new Color("blue", "#ff0000");
	
	private final String name;
	private final String hexValue;

	public Color(String name, String hexValue) {
		super();
		this.name = name;
		this.hexValue = hexValue;
	}

	public String getName() {
		return name;
	}
	
	public String getHexValue() {
		return hexValue;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
