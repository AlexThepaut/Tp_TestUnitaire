package main.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.StringUtils;

public class StringUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStringUtils() {
		assertTrue(StringUtils.levenshteinDistance("coucou", "Salut") == 6);
	}

}
