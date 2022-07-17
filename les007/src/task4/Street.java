package task4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Street")
@XmlAccessorType(XmlAccessType.FIELD)
public class Street {
    @XmlElement(name = "Street_name")
    private String streetName;
    @XmlElement(name = "House")
    private List<House> houseList;

    public Street() {
    }

    public Street(String streetName, List<House> houseList) {
        this.streetName = streetName;
        this.houseList = houseList;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}
