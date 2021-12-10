package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for appliance complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="appliance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurements" type="{https://www.appliances.by/xml/types}measurements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://www.appliances.by/xml/minor}modelInfo"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appliance", propOrder = {
        "measurements"
})
@XmlSeeAlso({
        VacuumCleaner.class,
        Television.class,
        BatteryAppliance.class,
        Kettle.class,
        Fridge.class,
        WashingMachine.class
})
public abstract class Appliance {

    @XmlElement(required = true)
    protected Measurements measurements;
    @XmlAttribute(name = ApplianceProperties.ID, required = true)
    protected int id;
    @XmlAttribute(name = ApplianceProperties.MANUFACTURER, required = true)
    protected String manufacturer;
    @XmlAttribute(name = ApplianceProperties.MODEL, required = true)
    protected String model;
    @XmlAttribute(name = ApplianceProperties.PRICE, required = true)
    protected BigDecimal price;

    /**
     * Gets the value of the measurements property.
     *
     * @return possible object is {@link Measurements }
     */
    public Measurements getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     *
     * @param value allowed object is {@link Measurements }
     */
    public void setMeasurements(Measurements value) {
        this.measurements = value;
    }

    /**
     * Gets the value of the id property.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the manufacturer property.
     *
     * @return possible object is {@link String }
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     *
     * @param value allowed object is {@link String }
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     *
     * @return possible object is {@link String }
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     *
     * @param value allowed object is {@link String }
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurements, manufacturer, model, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Appliance appliance = (Appliance) o;
        return id == appliance.id
               && Objects.equals(measurements, appliance.measurements)
               && Objects.equals(manufacturer, appliance.manufacturer)
               && Objects.equals(model, appliance.model)
               && Objects.equals(price, appliance.price);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Appliance.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("measurements=" + measurements)
                .add("manufacturer='" + manufacturer + "'")
                .add("model='" + model + "'")
                .add("price=" + price)
                .toString();
    }
}
