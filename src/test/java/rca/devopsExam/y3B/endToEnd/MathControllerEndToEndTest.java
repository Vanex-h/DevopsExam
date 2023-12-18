package rca.devopsExam.y3B.endToEnd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
@SpringBootTest
@AutoConfigureMockMvc
public class MathControllerEndToEndTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testDoMathAddition() throws Exception {
        mockMvc.perform(post("/api/calculator/do_math")
                        .contentType("application/json")
                        .content("{\"operand1\":4,\"operand2\":10,\"operation\":\"+\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data").value(14.0));
    }
    @Test
    public void testDoMathSubtraction() throws Exception {
        mockMvc.perform(post("/api/calculator/do_math")
                        .contentType("application/json")
                        .content("{\"operand1\":7,\"operand2\":3,\"operation\":\"-\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data").value(4.0));
    }
    @Test
    public void testDoMathMultiplication() throws Exception {
        mockMvc.perform(post("/api/calculator/do_math")
                        .contentType("application/json")
                        .content("{\"operand1\":9,\"operand2\":3,\"operation\":\"*\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data").value(27.0));
    }
    @Test
    public void testDoMathDivision() throws Exception {
        mockMvc.perform(post("/api/calculator/do_math")
                        .contentType("application/json")
                        .content("{\"operand1\":36,\"operand2\":4,\"operation\":\"/\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data").value(9.0));
    }
    @Test
    public void testDoMathDivisionByZero() throws Exception {
        mockMvc.perform(post("/api/calculator/do_math")
                        .contentType("application/json")
                        .content("{\"operand1\":10,\"operand2\":0,\"operation\":\"/\"}"))
                .andExpect(status().isBadRequest());
    }
    @Test
    public void testDoMathUnknownOperation() throws Exception {
        mockMvc.perform(post("/api/calculator/do_math")
                        .contentType("application/json")
                        .content("{\"operand1\":9,\"operand2\":3,\"operation\":\"=\"}"))
                .andExpect(status().isBadRequest());
    }
}
