package fr.sofnul.bk.fmk.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Boubker ABERWAG
 */

/*
 * Not used because
 * @RunWith(SpringJUnit4ClassRunner.class) dont work with interface
 */
@RunWith(SpringJUnit4ClassRunner.class)
public interface ITest {

	@Before
	public default void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
}
