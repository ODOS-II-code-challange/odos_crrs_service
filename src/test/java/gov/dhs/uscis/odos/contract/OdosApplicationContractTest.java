package gov.dhs.uscis.odos.contract;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

import gov.dhs.uscis.odos.CrrsvcApp;
import gov.dhs.uscis.odos.web.rest.BuildingResource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrrsvcApp.class)
@ActiveProfiles("dev, no-liquibase")
@WebAppConfiguration
public abstract class OdosApplicationContractTest {

	@Inject
	private BuildingResource controller;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
		RestAssuredMockMvc.standaloneSetup(controller);
	}
}
