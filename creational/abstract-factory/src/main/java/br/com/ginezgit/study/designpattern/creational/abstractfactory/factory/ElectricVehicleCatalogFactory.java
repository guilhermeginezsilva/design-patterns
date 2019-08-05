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


public class ElectricVehicleCatalogFactory implements AbstractVehicleCatalogFactory {

	private Engine[] engines = {
		new Engine("Travel", 200, new BigDecimal(5000)),
		new Engine("City", 100, new BigDecimal(4000)),
		new Engine("Super", 500, new BigDecimal(9000)),
	};
	
	private Model[] models = {
		new Model("Compact", new BigDecimal(2000)),
		new Model("Sport", new BigDecimal(4000)),
		new Model("Suv", new BigDecimal(5000))
	};
	
	private Interior[] interiors = {
		new Interior("racing", new BigDecimal(5000)),
		new Interior("neon", new BigDecimal(5500)),
		new Interior("vintage", new BigDecimal(7500))
	};
	
	private Color[] colors = {
			Color.BLACK,
			Color.WHITE
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
