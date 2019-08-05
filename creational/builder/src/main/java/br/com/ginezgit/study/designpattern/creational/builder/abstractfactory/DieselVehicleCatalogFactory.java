package br.com.ginezgit.study.designpattern.creational.builder.abstractfactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.ginezgit.study.designpattern.creational.builder.model.Color;
import br.com.ginezgit.study.designpattern.creational.builder.model.Engine;
import br.com.ginezgit.study.designpattern.creational.builder.model.Interior;
import br.com.ginezgit.study.designpattern.creational.builder.model.Model;

public class DieselVehicleCatalogFactory implements AbstractVehicleCatalogFactory {

	private Engine[] engines = {
		Engine.builder().setName("Heavy").setHp(800).setPrice(new BigDecimal(11500)).build(),
		Engine.builder().setName("Adapt").setHp(450).setPrice(new BigDecimal(6000)).build()
	};
	
	private Model[] models = {
		Model.builder().setName("Pickup").setPrice(new BigDecimal(20000)).build(),
		Model.builder().setName("HeavyLong").setPrice(new BigDecimal(50000)).build(),
		Model.builder().setName("HeavyShort").setPrice(new BigDecimal(30000)).build()
	};
	
	private Interior[] interiors = {
		Interior.builder().setName("tech").setPrice(new BigDecimal(5700)).build(),
		Interior.builder().setName("space").setPrice(new BigDecimal(3000)).build(),
		Interior.builder().setName("sport").setPrice(new BigDecimal(4500)).build()
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
