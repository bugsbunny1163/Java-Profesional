package task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

//@XmlRootElement(name = "Street")
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


}
