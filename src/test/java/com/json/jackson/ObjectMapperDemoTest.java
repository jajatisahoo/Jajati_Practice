package com.json.jackson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
public class ObjectMapperDemoTest {
    @Test
    public void testReadJsonWithObjectMapper() throws Exception {
    	
        ObjectMapper mapper = new ObjectMapper();
     Employee emp=mapper.readValue(new File("C:\\Users\\Jajati\\Photon_2018_July\\Practice\\src\\test\\java\\com\\json\\jackson\\employee.json"), Employee.class);
  
     
    // System.out.println(emp.getAddress());
     System.out.println(emp.getPersonalInformation());
     for(int i=0;i<=emp.getPhoneNumbers().length-1;i++)
    	 System.out.println(emp.getPhoneNumbers()[i]);
    	 
   String prettyemployee= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
	System.out.println(prettyemployee);
   
   
    
    }
}