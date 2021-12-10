package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for fridge complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="fridge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.appliances.by/xml/types}appliance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hasFreezer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasNoFrost" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ApplianceTypes.FRIDGE, propOrder = {
        ApplianceProperties.VOLUME,
        ApplianceProperties.HAS_FREEZER,
        ApplianceProperties.HAS_NO_FROST
})
public class Fridge extends Appliance {

    @XmlElement(required = true)
    protected int volume;
    protected boolean hasFreezer;
    protected boolean hasNoFrost;

    /**
     * Gets the value of the volume property.
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     */
    public void setVolume(int value) {
        this.volume = value;
    }

    /**
     * Gets the value of the hasFreezer property.
     */
    public boolean hasFreezer() {
        return hasFreezer;
    }

    /**
     * Sets the value of the hasFreezer property.
     */
    public void setHasFreezer(boolean value) {
        this.hasFreezer = value;
    }

    /**
     * Gets the value of the hasNoFrost property.
     */
    public boolean hasNoFrost() {
        return hasNoFrost;
    }

    /**
     * Sets the value of the hasNoFrost property.
     */
    public void setHasNoFrost(boolean value) {
        this.hasNoFrost = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume, hasFreezer, hasNoFrost);
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
        Fridge fridge = (Fridge) o;
        return volume == fridge.volume
               && hasFreezer == fridge.hasFreezer
               && hasNoFrost == fridge.hasNoFrost;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Fridge.class.getSimpleName() + "[", "]")
                       .add("volume=" + volume)
                       .add("hasFreezer=" + hasFreezer)
                       .add("hasNoFrost=" + hasNoFrost)
               + " : " + super.toString();
    }
}
