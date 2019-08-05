package br.com.ginezgit.study.designpattern.creational.abstractfactory.factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Color;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Engine;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Interior;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Model;


public class GasVehicleCatalogFactory implements AbstractVehicleCatalogFactory {

	private Engine[] engines = {
		new Engine("Super", 600, new BigDecimal(5000)),
		new Engine("Tourist", 150, new BigDecimal(1000)),
		new Engine("Econo", 85, new BigDecimal(400))
	};
	
	private Model[] models = {
		new Model("Compact", new BigDecimal(5000)),
		new Model("Sedan", new BigDecimal(7500)),
		new Model("Suv", new BigDecimal(15000))
	};
	
	private Interior[] interiors = {
		new Interior("tech", new BigDecimal(3500)),
		new Interior("minimum", new BigDecimal(500)),
		new Interior("executive", new BigDecimal(1500))
	};
	
	private Color[] colors = {
			Color.BLACK,
			Color.BLUE,
			Color.RED,
			Color.WHITE,
			Color.YELLOW
		};
	
	public List<Engine> getEngines() {
		return new ArrayList<Engine>(Arrays.asList(engines)
				.parallelStream()
				.map(Engine::clone)
				.collect(Collectors.toList()));
	}

	public List<Model> getModels() {
		return new ArrayList<Model>(Arrays.asList(models)
				.parallelStream()
				.map(Model::clone)
				.collect(Collectors.toList()));
	}

	public List<Interior> getInteriors() {
		return new ArrayList<Interior>(Arrays.asList(interiors)
				.parallelStream()
				.map(Interior::clone)
				.collect(Collectors.toList()));
	}

	@Override
	public List<Color> getColors() {
		return new ArrayList<Color>(Arrays.asList(colors));
	}

}
