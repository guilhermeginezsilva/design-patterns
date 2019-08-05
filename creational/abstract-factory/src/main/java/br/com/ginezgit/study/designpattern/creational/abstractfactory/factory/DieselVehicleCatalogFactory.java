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


public class DieselVehicleCatalogFactory implements AbstractVehicleCatalogFactory {

	private Engine[] engines = {
		new Engine("Heavy", 800, new BigDecimal(11500)),
		new Engine("Adapt", 450, new BigDecimal(6000)),
	};
	
	private Model[] models = {
		new Model("Pickup", new BigDecimal(20000)),
		new Model("HeavyLong", new BigDecimal(50000)),
		new Model("HeavyShort", new BigDecimal(30000))
	};
	
	private Interior[] interiors = {
		new Interior("tech", new BigDecimal(5700)),
		new Interior("space", new BigDecimal(3000)),
		new Interior("sport", new BigDecimal(4500))
	};
	
	private Color[] colors = {
		Color.BLACK,
		Color.RED,
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
