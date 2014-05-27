package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Codigo.SumaMundo;

public class TestSuma {

	SumaMundo suma=new SumaMundo();
	
	@Before
	public void setUp() throws Exception {
		suma.setSumando1(10);
		suma.setSumando2(20);
	}

	@Test
	public void test() {
		assertEquals(30,suma.suma());
	}

}
