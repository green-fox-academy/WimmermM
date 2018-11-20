package com.greenfox.monday;


import com.greenfox.monday.controllers.MyRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MyRestController.class)

public class MyRestControllerTests {


    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doublingTest() throws Exception{

        mockMvc.perform(get("/doubling?input=15")).andExpect(status().isOk()).andExpect(jsonPath("$.result", is(30)));
    }


    @Test
    public void greeterTest() throws Exception{
        mockMvc.perform(get("/greeter?name=Petike&title=student")).andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));

    }

    @Test
    public void appendaTest() throws Exception{
        mockMvc.perform(get("/appenda/kuty")).andExpect(jsonPath("$.appended", is("kutya")));

    }

    @Test
    public void dountilTest() throws Exception{
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": \"5\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result",is(15)));
    }

}
