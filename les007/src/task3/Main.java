package task3;


import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileOutputStream("les007/src/task3/city.xml"));

        writer.writeStartDocument("1.0");
        writer.writeStartElement("City");
        writer.writeStartElement("city");
        writer.writeAttribute("size","big");
        writer.writeCharacters("Lviv");
        writer.writeEndElement();
        writer.writeStartElement("Streets");
        writer.writeStartElement("street");
        writer.writeCharacters("Ivana Vyhovskoho St");
        writer.writeEndElement();
        writer.writeStartElement("street");
        writer.writeCharacters("Naukova St");
        writer.writeEndElement();
        writer.writeStartElement("street");
        writer.writeCharacters("Zamkova St");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
    }
}
