//package by.ruslan.radevich.lessons18;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import java.io.File;
//
//public class XmlWriter {
//    public static void main(String[] args) throws JAXBException {
//        Student student = new Student(1,"Ruslan","male",new Course("first"));
//        JAXBContext jaxbContext = JAXBContext.newInstance((Student.class));
//        Marshaller marshaller = jaxbContext.createMarshaller();//конвертер из джава в XML
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);//форматирует
//        marshaller.marshal(student,new File("student.xml"));//добавляем и создаем XML(записываем)
//    }
//}
