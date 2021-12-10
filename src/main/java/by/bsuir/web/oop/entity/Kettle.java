package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for kettle complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="kettle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.appliances.by/xml/types}appliance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="hasTemperatureRegulator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasTimer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ApplianceTypes.KETTLE, propOrder = {
        ApplianceProperties.VOLUME,
        ApplianceProperties.HAS_TEMPERATURE_REGULATOR,
        ApplianceProperties.HAS_TIMER
})
public class Kettle extends Appliance {

    protected float volume;
    protected boolean hasTemperatureRegulator;
    protected boolean hasTimer;

    /**
     * Gets the value of the volume property.
     */
    public float getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     */
    public void setVolume(float value) {
        this.volume = value;
    }

    /**
     * Gets the value of the hasTemperatureRegulator property.
     */
    public boolean hasTemperatureRegulator() {
        return hasTemperatureRegulator;
    }

    /**
     * Sets the value of the hasTemperatureRegulator property.
     */
    public void setHasTemperatureRegulator(boolean value) {
        this.hasTemperatureRegulator = value;
    }

    /**
     * Gets the value of the hasTimer property.
     */
    public boolean hasTimer() {
        return hasTimer;
    }

    /**
     * Sets the value of the hasTimer property.
     */
    public void setHasTimer(boolean value) {
        this.hasTimer = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume, hasTemperatureRegulator, hasTimer);
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
        Kettle kettle = (Kettle) o;
        return Float.compare(kettle.volume, volume) == 0
               && hasTemperatureRegulator == kettle.hasTemperatureRegulator
               && hasTimer == kettle.hasTimer;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Kettle.class.getSimpleName() + "[", "]")
                       .add("volume=" + volume)
                       .add("hasTemperatureRegulator=" + hasTemperatureRegulator)
                       .add("hasTimer=" + hasTimer)
               + " : " + super.toString();
    }
}
