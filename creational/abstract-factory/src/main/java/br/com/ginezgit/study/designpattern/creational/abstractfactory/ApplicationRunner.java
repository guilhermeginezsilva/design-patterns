package br.com.ginezgit.study.designpattern.creational.abstractfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.ginezgit.study.designpattern.creational.abstractfactory.factory.AbstractVehicleCatalogFactory;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.factory.DieselVehicleCatalogFactory;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.factory.ElectricVehicleCatalogFactory;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.factory.GasVehicleCatalogFactory;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Color;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Engine;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Interior;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Model;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.Vehicle;
import br.com.ginezgit.study.designpattern.creational.abstractfactory.model.VehicleType;

public class ApplicationRunner {

	private boolean shouldStop = false;
	
	public void run() throws InterruptedException {
		while(!shouldStop) {
			System.out.println("### Welcome to car building application ###");
			
			List<VehicleType> availableVehiclesType = new ArrayList<VehicleType>(Arrays.asList(VehicleType.values()));
			VehicleType selectedVehicleType = (VehicleType) getUserInputOption(availableVehiclesType, "Select the vehicle type:");
			
			AbstractVehicleCatalogFactory catalogFactory = getVehicleTypeCatalogFactory(selectedVehicleType);
			
			Model selectedModel = (Model) getUserInputOption(catalogFactory.getModels(), "\nSelect the vehicle model:");
			Color selectedModelColor = (Color) getUserInputOption(catalogFactory.getColors(), "\nSelect the vehicle model color:");
			Interior selectedInterior = (Interior) getUserInputOption(catalogFactory.getInteriors(), "\nSelect the vehicle interior design:");
			Color selectedInteriorColor = (Color) getUserInputOption(catalogFactory.getColors(), "\nSelect the vehicle model color:");
			Engine selectedEngine = (Engine) getUserInputOption(catalogFactory.getEngines(), "\nSelect the vehicle engine:");

			selectedModel.setColor(selectedModelColor);
			selectedInterior.setColor(selectedInteriorColor);
			
			Vehicle builtVehicle = new Vehicle(selectedModel, selectedInterior, selectedEngine);
			
			printFinalReport(builtVehicle);
			Thread.sleep(2000);
		}
	}
	

	private AbstractVehicleCatalogFactory getVehicleTypeCatalogFactory(VehicleType selectedVehicleType) {
		switch(selectedVehicleType) {
			case DIESEL:
				return new DieselVehicleCatalogFactory();
			case GAS:
				return new GasVehicleCatalogFactory();
			case ELECTRIC:
				return new ElectricVehicleCatalogFactory();
		}
		return null;
	}


	private void printFinalReport(Vehicle buildedVehicle) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("### This is your vehicle:");
		System.out.println(String.format("### Model: %s %s - $ %s.00", buildedVehicle.getModel().getColor(), buildedVehicle.getModel().getName(), buildedVehicle.getModel().getPrice().toString()));
		System.out.println(String.format("### Interior: %s %s - $ %s.00", buildedVehicle.getInterior().getColor(), buildedVehicle.getInterior().getName(), buildedVehicle.getInterior().getPrice().toString()));
		System.out.println(String.format("### Engine: %s (%s HP) - $ %s.00", buildedVehicle.getEngine().getName(), buildedVehicle.getEngine().getHp(), buildedVehicle.getEngine().getPrice().toString()));
		System.out.println(String.format("### Final cost: $ %s.00", buildedVehicle.getPrice()));
		System.out.println("--------------------------------------------------------------\n\n");
	}


	public Object getUserInputOption(List<?> inputObjects, String message) {
		System.out.println(message);
		
		for(int index=0; index< inputObjects.size(); index++) {
			System.out.println(String.format("[%d] - %s", index, inputObjects.get(index).toString()));
		}
		
		boolean validInput=false;
		
		Scanner keyboardScanner = null; 
		keyboardScanner = new Scanner(System.in);
		String input = null;
		while(!validInput) {
			System.out.print("Option: ");
			
	        input = keyboardScanner.nextLine();
	        validInput = isValidInputNumber(input, inputObjects.size());
	        if(!validInput) {
	        	System.out.println("Invalid input, try again...");
	        }
		}
		return inputObjects.get(Integer.parseInt(input));
	}
	
	private boolean isValidInputNumber(String input, int maxValue) {
		if(isNumber(input) ) {
        	int option = Integer.parseInt(input);
        	if(option < maxValue) {
        		return true;
        	}
        }
		return false;
	}

	public boolean isNumber(String value) {
		return value.matches("^[0-9]+$");
	}
	
}
