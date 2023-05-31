package by.ruslan.radevich.homework.lessons18;

import by.ruslan.radevich.lessons12.DockFilter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DOMParserExample {
    public static void main(String[] args) throws IOException {
        try {
            File inputFile = new File("HomeWork.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("sonnet");
            System.out.println(nList.getLength());
            for (int i = 0; i < nList.getLength(); i++) {
                Node current = nList.item(i);
                System.out.println("Element: " + current.getTextContent());
            }
            System.out.println(inputFile.exists());
            System.out.println(inputFile.isFile());
            System.out.println(inputFile.isDirectory());
            System.out.println(inputFile.getTotalSpace());
            NodeList nList2 = doc.getElementsByTagName("line");
            System.out.println(nList2.getLength());
            try (FileWriter writer = new FileWriter("WilliamShakespeareSonnet 130.txt")) {
                for (int i = 0; i < nList2.getLength(); i++) {
                    Node current2 = nList2.item(i);
                    writer.write(current2.getTextContent()+"\n");
                    //                   writer.write(nList2.getLength() + "");
                }
                    writer.close();

//            Author author = new Author("William","Shakespeare","Sonnet 130");
//            JAXBContext jaxbContext = JAXBContext.newInstance((Author.class));
//            Marshaller marshaller = jaxbContext.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
//            marshaller.marshal(author,new File("WilliamShakespeareSonnet 130.xml"));
//            try (FileWriter writer = new FileWriter("WilliamShakespeareSonnet 130.txt",true)){
//                writer.write(doc.getTextContent());
//                writer.write(nList2.getLength() + "");
//                writer.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//       } catch (Exception e) {
//            e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}