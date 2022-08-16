package com.abn.bank;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@WebAppConfiguration
class AbnRecipeManagerIntegrationTest {
	 
    private MockMvc mockMvc;
	
	@Autowired 
	private WebApplicationContext context;
	
	@BeforeEach
	private void setup() throws IOException {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
    void createRecipe () {
		
		String payload = "{\n"
				+ "  \"name\": \"pizaa\",\n"
				+ "  \"vegetarian\": false,\n"
				+ "  \"servings\": 1,\n"
				+ "  \"ingredient\":\"onion\",\n"
				+ "  \"instructions\": \"largejumbo\",\n"
				+ "  \"ingredients\": [\n"
				+ "    {\n"
				+ "      \"name\": \"veg\",\n"
				+ "      \"quantity\": 1\n"
				+ "    }\n"
				+ "  ]\n"
				+ "}";
		
		try {
			mockMvc.perform(post("/abn-api/recipeManagement/v4/recipe").contentType(MediaType.APPLICATION_JSON).content(payload)).andExpect(status().isOk()).andReturn();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	     
    }
	
	@Test
	void fetchRecipe() {
		try {
			mockMvc.perform(get("/abn-api/recipeManagement/v4/recipe/{id}",1L)).andExpectAll(status().isOk()).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    
    @Test
    void updateRecipe() {
    	String payload = "{\n"
				+ "  \"name\": \"pizaa\",\n"
				+ "  \"vegetarian\": false,\n"
				+ "  \"servings\": 1,\n"
				+ "  \"ingredient\":\"panner\",\n"
				+ "  \"instructions\": \"largejumbo\",\n"
				+ "  \"ingredients\": [\n"
				+ "    {\n"
				+ "      \"name\": \"veg\",\n"
				+ "      \"quantity\": 1\n"
				+ "    }\n"
				+ "  ]\n"
				+ "}";
    	
    	try {
			mockMvc.perform(patch("/abn-api/recipeManagement/v4/recipe/{id}",1L).contentType(MediaType.APPLICATION_JSON).content(payload)).andExpect(status().isOk()).andReturn();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    }
    
    @Test
	void fetchRecipeWithPanner() {
		try {
			MvcResult mvcResult=mockMvc.perform(get("/abn-api/recipeManagement/v4/recipe?fields=ingredient:panner")).andExpectAll(status().isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE)).andReturn();
			String responseBody = mvcResult.getResponse().getContentAsString();
			Assertions.assertThat(responseBody.contentEquals("panner"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
    @Test
	void DeleteRecipe() {
		try {
			mockMvc.perform(get("/abn-api/recipeManagement/v4/recipe/{id}",1L)).andExpectAll(status().isOk()).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}