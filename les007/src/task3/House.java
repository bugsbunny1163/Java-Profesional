package task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class House {
    @XmlElement(name = "Number")
    private int id;

    public House() {
    }

    public House(int id) {
        this.id = id;
    }

}
