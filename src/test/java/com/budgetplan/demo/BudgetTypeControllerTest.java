package com.budgetplan.demo;

import com.budgetplan.demo.entity.BudgetType;
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

import static org.hamcrest.Matchers.containsString;

@RunWith(SpringJUnit4ClassRunner.class)
public class BudgetTypeControllerTest {

    private MockMvc mockMvc;
    @InjectMocks
    private BudgetTypeController budgetTypeController;
    @Mock
    private BudgetTypeService budgetTypeService;

    @Before
    public void setUp() throws Exception{

        // MockMvcBuilders - main class to import in order to access all available MockMvcBuilders.
        // standaloneSetup() - Build a MockMvc instance by registering @Controller instances and configuring Spring MVC infrastructure.
        mockMvc = MockMvcBuilders.standaloneSetup(budgetTypeController)
                .build();
    }

    @Test
    public void BudgetTypeControllerConnectionTest() throws  Exception{
        // perform() - Perform a request and return a type that allows chaining further actions, such as asserting expectations, on the result.
        // MockMvcRequestBuilders - Static factory methods for RequestBuilders.
        // MockMvcResultMatchers - Static factory methods for ResultMatcher-based result actions.
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/budget-types")
                )
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
