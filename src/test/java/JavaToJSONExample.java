
import java.util.Date;
 
import java.io.File;
import java.io.IOException;
import java.util.Date;
 
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
 
public class JavaToJSONExample
{
   public static void main(String[] args)
   {
     
      Employee employee = new Employee(1, "Lokesh", "Gupta", new Date(1981,8,18));
      ObjectMapper mapper = new ObjectMapper();
      try
      {
        // mapper.writeValue(new File("c://temp/employee.json"), employee);
    	// mapper.defaultPrettyPrintingWriter().writeValue(new File("c://temp/employee.json"), employee);
    	  String json = mapper.writeValueAsString(employee);
      
    	
      } catch (JsonGenerationException e)
      {
         e.printStackTrace();
      } catch (JsonMappingException e)
      {
         e.printStackTrace();
      } catch (IOException e)
      {
         e.printStackTrace();
      }
   }
}
 