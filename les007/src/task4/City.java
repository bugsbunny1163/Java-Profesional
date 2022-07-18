package task4;

import task3.CityDesc;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "City")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
    @XmlElement(name = "city")
    private CityDesc cityDesc;
    @XmlElement
    private int population;
    @XmlElement(name = "Street")
    private List<Street> streets;

    public City() {
    }

    public City(String name, List<Street> streets, String size, int population) {
        cityDesc = new CityDesc(name, size);
        this.streets = streets;
        this.population = population;
    }

    public CityDesc getCityDesc() {
        return cityDesc;
    }

    public void setCityDesc(CityDesc cityDesc) {
        this.cityDesc = cityDesc;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}
