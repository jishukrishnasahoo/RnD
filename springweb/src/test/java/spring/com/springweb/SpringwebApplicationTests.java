package spring.com.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringwebApplicationTests {

		@LocalServerPort
		private int port;

		@Autowired
		private TestRestTemplate restTemplate;

		@Test
		public void shouldPassIfStringMatches() throws Exception {
			assert (restTemplate.getForObject("http://localhost:" + port + "/validate",
					String.class)).contains("Hello World from Spring Boot");
		}
	}
