/*package com.cognizant.springlearn.controller;


import static org.junit.Assert.assertNotNull;

//import org.junit.jupiter.api.Test;
 
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
importorg.springframework.test.web.servlet.MockMvc;
importorg.springframework.test.web.servlet.ResultActions;







import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@AutoConfigureMockMvc 
public class SpringLearnApplicationTests {
    @Autowired
    private CountryController countryController;
    
    @Autowired
    private MockMvc mvc;

    
    @Test
    public void contextLoads() {
        assertNotNull(countryController);
    }
 
   
    @Test
    public void testGetCountry() throws Exception {
        ResultActions actions = mvc.perform(get("/country"));
        actions.andExpect(status().isOk());
        actions.andExpect(jsonPath("$.code").exists());
        actions.andExpect(jsonPath("$.code").value("IN"));
    }

    @Test
    public void testGetCountryException()  {
        ResultActions actions = mvc.perform(get("/country"));
        actions.andExpect(status().isBadRequest());
        actions.andExpect(status().reason("Country Not found"));

    }


}

*/