package main.java.dev.console;

import main.java.dev.exception.CalculException;
import main.java.dev.service.CalculService;
import java.util.Scanner;

public class AppLauncher {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			new App(scanner, new CalculService()).demarrer();
		} catch (CalculException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}