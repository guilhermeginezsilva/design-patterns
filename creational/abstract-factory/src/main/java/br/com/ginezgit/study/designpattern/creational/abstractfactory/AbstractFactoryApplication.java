package br.com.ginezgit.study.designpattern.creational.abstractfactory;

public class AbstractFactoryApplication {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting AbstractFactoryApplication");
		
		ApplicationRunner application = new ApplicationRunner();
		application.run();
		
		System.out.println("Ended AbstractFactoryApplication");
	}
	
}
