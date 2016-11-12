package fr.sofnul.bk.fmk.test.component;

import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Boubker ABERWAG
 */
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractComponentTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractComponentTest.class);

	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
}
