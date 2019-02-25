package main.java.dev.utils;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Parameterized.class)
public class StringUtilsTest {

	private static final Logger LOG = LoggerFactory.getLogger(StringUtilsTest.class);
	
	@Parameters
	public static Collection<Object[]> datas(){
		List<Object[]> datas = new ArrayList<Object[]>();
		datas.add(new Object[]{"coucou", "salut", 6});
		datas.add(new Object[]{"coucou", "coucoul", 1});
		datas.add(new Object[]{"jojo", "jaja", 2});
		datas.add(new Object[]{"salute", "salut", 1});
		return datas;
	}
	
	@Parameter public String value1;
	@Parameter (value = 1) public String value2;
	@Parameter (value = 2) public int value3;

	@Test
	public void testStringUtils() {
		LOG.info("Test de la methode levenshteinDistance() de la classe StringUtils");
		assertTrue(StringUtils.levenshteinDistance(value1, value2) == value3);
	}
}
