package rca.devopsExam.y3B.endToEnd;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.Assert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerEndToEndTest {

    @LocalServerPort
    private int port=8000;

    private final TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testApiEndpoint() {
        String url = "http://localhost:" + port + "/api/calculator/do_math";
        String response = restTemplate.getForObject(url, String.class);

        assertEquals("Expected Response", response);
    }
}


