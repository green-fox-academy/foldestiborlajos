package com.example.groot;

import com.example.groot.controller.GuardianController;
import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void translateTestCorrect() throws Exception {
    mockMvc.perform(get("/groot?message=hello"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("hello")))
        .andExpect(jsonPath("$.translated", is("I am Groot!") ))
        .andDo(result -> System.out.println(result.getResponse().getStatus()));
  }



  @Test
  public void translateTestBadRequest() throws Exception{
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void getSpeedBadCaseTest() throws Exception{
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Please provide both time and distance")));
  }

  @Test
  public void getSpeedGoodCase() throws Exception{
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.speed", is(10.0)));
  }
}


