package main.java.dev.service;

import main.java.dev.exception.CalculException;

public class CalculService {
	
	public int additionner(String expression) throws CalculException{
		// TODO Ajouter un log en niveau DEBUG affichant "Evaluation de l'expression <expression>";.
		// TODO par exemple "Evaluation de l'expression 1+4";
		
		boolean testExpression = expression.contains("+");
		if(testExpression == false){
			throw new CalculException(expression);
		}
		String[] expressionSeparee = expression.split("\\+");
		int somme = 0;

		for (int i = 0; i < expressionSeparee.length; i++) {
			somme += Integer.parseInt(expressionSeparee[i]);
		}
		
		return somme;
	}
}