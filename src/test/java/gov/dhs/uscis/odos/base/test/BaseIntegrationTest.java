package gov.dhs.uscis.odos.base.test;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import gov.dhs.uscis.odos.CrrsvcApp;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = CrrsvcApp.class)
@ActiveProfiles("dev, no-liqubase")
@Transactional
public abstract class BaseIntegrationTest {

}
