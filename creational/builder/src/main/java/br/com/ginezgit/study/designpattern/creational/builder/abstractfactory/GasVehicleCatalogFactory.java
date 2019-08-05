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

public class GasVehicleCatalogFactory implements AbstractVehicleCatalogFactory {

	private Engine[] engines = {
			Engine.builder().setName("Super").setHp(600).setPrice(new BigDecimal(5000)).build(),
			Engine.builder().setName("Tourist").setHp(150).setPrice(new BigDecimal(1000)).build(),
			Engine.builder().setName("Econo").setHp(85).setPrice(new BigDecimal(400)).build()
	};
	
	private Model[] models = {
		Model.builder().setName("Compact").setPrice(new BigDecimal(5000)).build(),
		Model.builder().setName("Sedan").setPrice(new BigDecimal(7500)).build(),
		Model.builder().setName("Suv").setPrice(new BigDecimal(15000)).build()
	};
	
	private Interior[] interiors = {
		Interior.builder().setName("tech").setPrice(new BigDecimal(3500)).build(),
		Interior.builder().setName("minimum").setPrice(new BigDecimal(500)).build(),
		Interior.builder().setName("executive").setPrice(new BigDecimal(1500)).build()
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
