package task3;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "City")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
    @XmlElement
    private String name;
    @XmlElement
    private int population;
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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
