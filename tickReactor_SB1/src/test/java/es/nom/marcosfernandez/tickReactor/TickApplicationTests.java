package es.nom.marcosfernandez.tickReactor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TickReactorApplication.class})
public class TickApplicationTests {

	@Test
	public void exampleTest() {
		try {
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.getForObject("http://localhost:8080/launchStock/5", String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
