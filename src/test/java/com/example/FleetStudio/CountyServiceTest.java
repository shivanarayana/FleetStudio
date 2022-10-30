package com.example.FleetStudio;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(value = County.class)
class CountyServiceTest {

    @Autowired
    CountyController controller;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CountyService countyServ;

    @MockBean
    private CountyRepository countyRepo;

    public void setUp(){
        County countyOne = new County();
        countyOne.setFips("01001");
        countyOne.setName("Autauga");
        countyOne.setState("AL");
        countyRepo.save(countyOne);

        County countyTwo = new County();
        countyTwo.setFips("01003");
        countyTwo.setState("AL");
        countyTwo.setName("Baldwin");
        countyRepo.save(countyTwo);

        County countyThree = new County();
        countyThree.setFips("01005");
        countyThree.setName("Barbour");
        countyThree.setState("AL");
        countyRepo.save(countyThree);

        List<County> countyList = new ArrayList<County>();
        countyList.add(countyOne);
        countyList.add(countyTwo);
        countyList.add(countyThree);
    }

    County countyNull = null;
    String countryString = "{\n" +
            "        \"fips\": \"01001\",\n" +
            "        \"state\": \"AL\",\n" +
            "        \"name\": \"Autauga\"\n" +
            "    }";

    List<County> countyList = new ArrayList<County>();
    String countriesString = "[\n" +
            "    {\n" +
            "        \"fips\": \"01001\",\n" +
            "        \"state\": \"AL\",\n" +
            "        \"name\": \"Autauga\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"fips\": \"01003\",\n" +
            "        \"state\": \"AL\",\n" +
            "        \"name\": \"Baldwin\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"fips\": \"01005\",\n" +
            "        \"state\": \"AL\",\n" +
            "        \"name\": \"Barbour\"\n" +
            "    }\n";

//    @Test
//    public void listTest() {
//        Mockito.when(countyRepo.findAll()).thenReturn(countyList);
//        controller.list();
//        assertEquals(countyList.toString(),countriesString);
//    }

//    @Test
//    void saveAllTest() {
//        Mockito.when(countyRepo.saveAll(countyList)).thenReturn(countyList);
//        controller.saveAll(countyList);
//    }

//    @Test
//    void saveCountyTest() {
//        Mockito.when(countyRepo.save(new County())
//        controller.
//    }
}