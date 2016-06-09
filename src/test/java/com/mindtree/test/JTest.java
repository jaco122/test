package com.mindtree.test;



import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import com.mindtree.controller.WorldController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WorldController.class})
@WebAppConfiguration
public class JTest {

@Autowired
private WorldController worldController;

@Autowired
private WebApplicationContext wac;

@Test
public void test() {
	assertTrue(true);;
}

@Test
public void testHandleLogin() throws Exception {
	MockMvc mockMvc = MockMvcBuilders.standaloneSetup(this.worldController).build();
	mockMvc.perform(get("/showGreeting")).andExpect(status().isOk()).andExpect(forwardedUrl("greeting"));
}

}

