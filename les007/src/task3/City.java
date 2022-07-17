package task3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "City")
public class City {
    @XmlElement
    private int population;
    @XmlElement
    private String name;
    @XmlElement(name = "Street")
    private List<Street> streets;
    @XmlAttribute
    private Size size;


    public City() {
    }

    public City(String name, List<Street> streets, Size size, int population) {
        this.name = name;
        this.streets = streets;
        this.size = size;
        this.population = population;
    }
    
}
