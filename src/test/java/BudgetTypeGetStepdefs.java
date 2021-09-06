import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.mockito.Mockito;
import pl.budgetplan.BudgetType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BudgetTypeGetStepdefs {
    @Given("User perform GET operation for {string}")
    public void userPerformGETOperationFor(String arg0) {
        List<BudgetType> budgetTypeList = new ArrayList<>();

        Mockito.when(bud)
    }

    @Then("User should get all budget types")
    public void userShouldGetAllBudgetTypes() {
    }
}


//    @Test
//    public void getAllRecords_success() throws Exception {
//        List<PatientRecord> records = new ArrayList<>(Arrays.asList(RECORD_1, RECORD_2, RECORD_3));
//
//        Mockito.when(patientRecordRepository.findAll()).thenReturn(records);
//
//        mockMvc.perform(MockMvcRequestBuilders
//                        .get("/patient")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(3)))
//                .andExpect(jsonPath("$[2].name", is("Jane Doe")));
//    }