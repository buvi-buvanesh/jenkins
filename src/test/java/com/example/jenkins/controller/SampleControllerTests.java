package com.example.jenkins.controller;

import com.example.jenkins.controller.Sample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(Sample.class)
public class SampleControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTestingMethod() throws Exception {
        // Perform a GET rwheeequest to /sample and expect status 200 (OK)
        mockMvc.perform(MockMvcRequestBuilders.get("/sample"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                // Verify that the response body contains the expected text
                .andExpect(MockMvcResultMatchers.content().string("hi buvanesh"));
    }
}