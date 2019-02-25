package main.java.dev.console;

import main.java.dev.service.CalculService;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AppTest {

	private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	private App app;
	private CalculService calculService;
	
	@Before
	public void setUp() throws Exception {
		this.calculService = mock(CalculService.class);
		this.app = new App(new Scanner(System.in), calculService);
	}
	
	@Test
	public void testAfficherTitre() throws Exception {
		this.app.afficherTitre();
		String logConsole = systemOutRule.getLog();
		assertThat(logConsole).contains("**** Application Calculatrice ****");
	}
	
	@Test
	public void testEvaluer() throws Exception {
		LOG.info("Etant donn�, un service CalculService qui retourne 35 � l'�valuation de l'expression 1+34");
		String expression = "1+34";
		when(calculService.additionner(expression)).thenReturn(35);
		LOG.info("Lorsque la m�thode evaluer est invoqu�e");
		this.app.evaluer(expression);
		LOG.info("Alors le service est invoqu� avec l'expression {}", expression);
		verify(calculService).additionner(expression);
		LOG.info("Alors dans la console, s'affiche 1+34=35");
		assertThat(systemOutRule.getLog()).contains("1+34=35");
	}
	
	@Test
	public void testDemarer1(){
		
	}
	
	// TODO LOGGER
}