package com.bookclub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class AdminControllerWebUnitTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        void testLoginPage() throws Exception {
                mockMvc.perform(MockMvcRequestBuilders.get("/login"))
                                .andExpect(status().isOk())
                                .andExpect(MockMvcResultMatchers.view().name("login"));
        }

        @Test
        void testLoginWithoutUsernameAndPassword() throws Exception {
                mockMvc.perform(MockMvcRequestBuilders.post("/login"))
                                .andExpect(status().is4xxClientError());

        }
}
