package fr.sofnul.bk.fmk.test.operation;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseDataSourceConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.sofnul.bk.fmk.test.config.ServiceAppTestConfig;

/**
 * @author Boubker ABERWAG
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceAppTestConfig.class)
public abstract class AbstractOperationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractOperationTest.class);

	protected abstract IDataSet getDataSet() throws Exception;

	@Autowired
	protected DataSource dataSource;

	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
		IDatabaseConnection dbConn = new DatabaseDataSourceConnection(dataSource);
		DatabaseOperation.CLEAN_INSERT.execute(dbConn, getDataSet());
	}

	@After
	public void close() {

	}

}
