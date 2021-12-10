package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for batteryInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="batteryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{https://www.appliances.by/xml/minor}batteryInfo"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batteryInfo")
public class BatteryInfo {

    @XmlAttribute(name = ApplianceProperties.CAPACITY, required = true)
    protected int capacity;
    @XmlAttribute(name = ApplianceProperties.BATTERY_LIFE, required = true)
    protected float batteryLife;

    /**
     * Gets the value of the capacity property.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the batteryLife property.
     */
    public float getBatteryLife() {
        return batteryLife;
    }

    /**
     * Sets the value of the batteryLife property.
     */
    public void setBatteryLife(float value) {
        this.batteryLife = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, batteryLife);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatteryInfo that = (BatteryInfo) o;
        return capacity == that.capacity && Float.compare(that.batteryLife, batteryLife) == 0;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BatteryInfo.class.getSimpleName() + "[", "]")
                .add("capacity=" + capacity)
                .add("batteryLife=" + batteryLife)
                .toString();
    }
}
