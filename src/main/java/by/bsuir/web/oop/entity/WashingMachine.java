package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigInteger;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for washingMachine complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="washingMachine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.appliances.by/xml/types}appliance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxLoad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxSpinSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hasDrying" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ApplianceTypes.WASHING_MACHINE, propOrder = {
        ApplianceProperties.MAX_LOAD,
        ApplianceProperties.MAX_SPIN_SPEED,
        ApplianceProperties.HAS_DRYING
})
public class WashingMachine extends Appliance {

    @XmlElement(required = true)
    protected int maxLoad;
    @XmlElement(required = true)
    protected int maxSpinSpeed;
    protected boolean hasDrying;

    /**
     * Gets the value of the maxLoad property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public int getMaxLoad() {
        return maxLoad;
    }

    /**
     * Sets the value of the maxLoad property.
     */
    public void setMaxLoad(int value) {
        this.maxLoad = value;
    }

    /**
     * Gets the value of the maxSpinSpeed property.
     */
    public int getMaxSpinSpeed() {
        return maxSpinSpeed;
    }

    /**
     * Sets the value of the maxSpinSpeed property.
     */
    public void setMaxSpinSpeed(int value) {
        this.maxSpinSpeed = value;
    }

    /**
     * Gets the value of the hasDrying property.
     */
    public boolean hasDrying() {
        return hasDrying;
    }

    /**
     * Sets the value of the hasDrying property.
     */
    public void setHasDrying(boolean value) {
        this.hasDrying = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxLoad, maxSpinSpeed, hasDrying);
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
        WashingMachine that = (WashingMachine) o;
        return maxLoad == that.maxLoad
               && maxSpinSpeed == that.maxSpinSpeed
               && hasDrying == that.hasDrying;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", WashingMachine.class.getSimpleName() + "[", "]")
                       .add("maxLoad=" + maxLoad)
                       .add("maxSpinSpeed=" + maxSpinSpeed)
                       .add("hasDrying=" + hasDrying)
               + " : " + super.toString();
    }
}
