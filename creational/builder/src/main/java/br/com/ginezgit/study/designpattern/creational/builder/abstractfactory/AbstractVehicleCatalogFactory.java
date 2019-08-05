package br.com.ginezgit.study.designpattern.creational.builder.abstractfactory;

import java.util.List;

import br.com.ginezgit.study.designpattern.creational.builder.model.Color;
import br.com.ginezgit.study.designpattern.creational.builder.model.Engine;
import br.com.ginezgit.study.designpattern.creational.builder.model.Interior;
import br.com.ginezgit.study.designpattern.creational.builder.model.Model;

public interface AbstractVehicleCatalogFactory {

	public List<Engine> getEngines();
	public List<Model> getModels();
	public List<Interior> getInteriors();
	public List<Color> getColors();
	
}
