package com.budgetplan.demo;

import com.budgetplan.demo.service.BudgetTypeService;
import com.budgetplan.demo.controller.BudgetTypeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class BudgetTypeControllerTest {

    private MockMvc mockMvc;
    @InjectMocks
    private BudgetTypeController budgetTypeController;
    @Mock
    private BudgetTypeService budgetTypeService;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(budgetTypeController)
                .build();
    }

    @Test
    public void BudgetTypeControllerTest() throws  Exception{
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/budget-types")
                )
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
