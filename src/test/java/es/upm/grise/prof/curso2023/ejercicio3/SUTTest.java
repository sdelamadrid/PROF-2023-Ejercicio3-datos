package es.upm.grise.prof.curso2023.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SUTTest {
	
	SUT sut;
	
	@BeforeEach
	public void setUp() {
		sut = new SUT();
	}
	
	@Test
	public void duplicatedAssertExample() {
		final int CERO = 0;
		final int UNO = 1;
		assertEquals(CERO, sut.doSomething(CERO));
		assertEquals(CERO, sut.doSomething(UNO));
	}
	
	@Test
	public void magicNumberExample() {
		assertEquals(0, sut.doSomething(0));
	}
	
	@Test
	public void ConditionalTestLogicExample() {
		final int CERO = 0;
		double i = Math.random();
		
		if(i < 0) {
			assertEquals(CERO, sut.doSomething(CERO));
		}
	}
	
	@Test
	public void ConstructorInitializationExample() {
		SUT sut = new SUT();
		final int CERO = 0;
		
		assertEquals(CERO, sut.doSomething(CERO));
	}
	
	@Test
	public void EagerTestExample() {
		final int CERO = 0;
		assertEquals(CERO, sut.doSomething(CERO));
		assertEquals(CERO, sut.doSomethingElse(CERO));
	}
	
	
}
