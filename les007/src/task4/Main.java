package task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        List<House> houseList1 = new ArrayList<>();
        houseList1.add(new House(1));
        houseList1.add(new House(2));
        houseList1.add(new House(3));
        List<Street> streetList1 = new ArrayList<>();
        streetList1.add(new Street("Ivana Vyhovskoho St", houseList1));
        streetList1.add(new Street("Naukova St", houseList1));
        streetList1.add(new Street("Volodymyra Velykoho St", houseList1));
        streetList1.add(new Street("Zamkova St", houseList1));
        City city1 = new City("Lviv",streetList1,"BIG",800_000);

        JAXBContext contextObj = JAXBContext.newInstance(city1.getClass());
        Marshaller marshaller = contextObj.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(city1, new FileOutputStream("les007/src/task4/city.xml"));
    }
}
