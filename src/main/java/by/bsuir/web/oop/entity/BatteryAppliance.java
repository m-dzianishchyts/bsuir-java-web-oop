package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for batteryAppliance complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="batteryAppliance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.appliances.by/xml/types}appliance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="battery" type="{https://www.appliances.by/xml/types}batteryInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batteryAppliance", propOrder = {
        "battery"
})
@XmlSeeAlso({
        Laptop.class,
        Smartphone.class
})
public abstract class BatteryAppliance
        extends Appliance {

    @XmlElement(required = true)
    protected BatteryInfo battery;

    /**
     * Gets the value of the battery property.
     *
     * @return possible object is {@link BatteryInfo }
     */
    public BatteryInfo getBattery() {
        return battery;
    }

    /**
     * Sets the value of the battery property.
     *
     * @param value allowed object is {@link BatteryInfo }
     */
    public void setBattery(BatteryInfo value) {
        this.battery = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        BatteryAppliance that = (BatteryAppliance) o;
        return Objects.equals(battery, that.battery);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BatteryAppliance.class.getSimpleName() + "[", "]")
                       .add("battery=" + battery)
               + " : " + super.toString();
    }
}
