package com.example.ms1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AdditionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    

    @Test
    void rejectsNonNumericParameter() throws Exception {
        mockMvc.perform(get("/ms1/add").param("a", "abc").param("b", "5"))
                .andExpect(status().isOk());
    }
}
