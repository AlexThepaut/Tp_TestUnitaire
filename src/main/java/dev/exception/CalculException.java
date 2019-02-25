package main.java.dev.exception;

public class CalculException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5219341716266972292L;

	public CalculException(String expression){
		System.out.println("L'expression "+expression+" est invalide.");
	}
}
