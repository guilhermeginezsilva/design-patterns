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

public class ElectricVehicleCatalogFactory implements AbstractVehicleCatalogFactory {

	private Engine[] engines = {
			Engine.builder().setName("Travel").setHp(200).setPrice(new BigDecimal(5000)).build(),
			Engine.builder().setName("City").setHp(100).setPrice(new BigDecimal(4000)).build(),
			Engine.builder().setName("Super").setHp(500).setPrice(new BigDecimal(9000)).build()
	};
	
	private Model[] models = {
		Model.builder().setName("Compact").setPrice(new BigDecimal(2000)).build(),
		Model.builder().setName("Sport").setPrice(new BigDecimal(4000)).build(),
		Model.builder().setName("Suv").setPrice(new BigDecimal(5000)).build()
	};
	
	private Interior[] interiors = {
		Interior.builder().setName("racing").setPrice(new BigDecimal(5000)).build(),
		Interior.builder().setName("neon").setPrice(new BigDecimal(5500)).build(),
		Interior.builder().setName("vintage").setPrice(new BigDecimal(7500)).build()
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
