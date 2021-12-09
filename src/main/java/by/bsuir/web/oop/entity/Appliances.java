package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for appliances complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="appliances"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="fridge" type="{https://www.appliances.by/xml/types}fridge"/&gt;
 *         &lt;element name="washingMachine" type="{https://www.appliances.by/xml/types}washingMachine"/&gt;
 *         &lt;element name="vacuumCleaner" type="{https://www.appliances.by/xml/types}vacuumCleaner"/&gt;
 *         &lt;element name="kettle" type="{https://www.appliances.by/xml/types}kettle"/&gt;
 *         &lt;element name="television" type="{https://www.appliances.by/xml/types}television"/&gt;
 *         &lt;element name="laptop" type="{https://www.appliances.by/xml/types}laptop"/&gt;
 *         &lt;element name="smartphone" type="{https://www.appliances.by/xml/types}smartphone"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appliances", propOrder = {
        "applianceList"
})
@XmlRootElement(namespace = "https://www.appliances.by/xml/schema")
public class Appliances {

    @XmlElements({
            @XmlElement(name = "fridge", type = Fridge.class),
            @XmlElement(name = "washingMachine", type = WashingMachine.class),
            @XmlElement(name = "vacuumCleaner", type = VacuumCleaner.class),
            @XmlElement(name = "kettle", type = Kettle.class),
            @XmlElement(name = "television", type = Television.class),
            @XmlElement(name = "laptop", type = Laptop.class),
            @XmlElement(name = "smartphone", type = Smartphone.class)
    })
    protected List<Appliance> applianceList;

    /**
     * Gets the value of the appliances property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliances property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliances().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list:
     * {@link Fridge },
     * {@link WashingMachine },
     * {@link VacuumCleaner },
     * {@link Kettle },
     * {@link Television },
     * {@link Laptop },
     * {@link Smartphone }
     */
    public List<Appliance> getApplianceList() {
        if (applianceList == null) {
            applianceList = new ArrayList<>();
        }
        return applianceList;
    }
}
