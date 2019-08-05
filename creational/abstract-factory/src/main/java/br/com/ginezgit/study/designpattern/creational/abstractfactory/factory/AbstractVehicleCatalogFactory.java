package br.com.ginezgit.study.designpattern.creational.abstractfactory.factory;

import java.util.List;

import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Color;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Engine;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Interior;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Model;

public interface AbstractVehicleCatalogFactory {

	public List<Engine> getEngines();
	public List<Model> getModels();
	public List<Interior> getInteriors();
	public List<Color> getColors();
	
}
