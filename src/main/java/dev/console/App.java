package main.java.dev.console;

import main.java.dev.exception.CalculException;
import main.java.dev.service.CalculService;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
	
	private Scanner scanner;
	private CalculService calculatrice;
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public App(Scanner scanner, CalculService calculatrice) {
		this.setScanner(scanner);
		this.setCalculatrice(calculatrice);
	}
	
	protected void afficherTitre() {
		LOG.debug("**** Application Calculatrice ****");
	}
	
	public void demarrer() throws CalculException {
		afficherTitre();
		while(true){
			System.out.println("Veuillez saisir une expression :");
			String expression = this.getScanner().next();
			if(expression.equals("fin")){
				System.out.println("Aurevoir :-(");
				break;
			}else{
				this.evaluer(expression);			
			}			
		}
	}
	
	protected void evaluer(String expression) throws CalculException {
		int resultat = this.getCalculatrice().additionner(expression);
		LOG.debug(expression + "=" + resultat);
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public CalculService getCalculatrice() {
		return calculatrice;
	}

	public void setCalculatrice(CalculService calculatrice) {
		this.calculatrice = calculatrice;
	}
}