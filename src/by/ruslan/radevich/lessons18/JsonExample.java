//package by.ruslan.radevich.lessons18;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class JsonExample {
//    public static void main(String[] args) throws IOException {
//        Person person = new Person(1,"Anton", Arrays.asList("write", "dance"),false);
//        ObjectMapper mapper = new ObjectMapper();
//        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);//записываем
//        System.out.println(result);
//        //Person currentPerson = mapper.readValue(result, Person.class);//читаем
//        Person currentPerson = mapper.readValue(new File( "test.json"), Person.class);//читаем с фаила
//        System.out.println(currentPerson);
//    }
//}
