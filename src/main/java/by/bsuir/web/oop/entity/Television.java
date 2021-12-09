package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigInteger;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for television complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="television"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.appliances.by/xml/types}appliance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="screen" type="{https://www.appliances.by/xml/types}screen"/&gt;
 *         &lt;element name="powerConsumption" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hasHdr" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasHdmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasSmartTv" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "television", propOrder = {
        "screen",
        "powerConsumption",
        "hasHdr",
        "hasHdmi",
        "hasSmartTv"
})
public class Television
        extends Appliance {

    @XmlElement(required = true)
    protected Screen screen;
    @XmlElement(required = true)
    protected BigInteger powerConsumption;
    protected boolean hasHdr;
    protected boolean hasHdmi;
    protected boolean hasSmartTv;

    /**
     * Gets the value of the screen property.
     *
     * @return possible object is {@link Screen }
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * Sets the value of the screen property.
     *
     * @param value allowed object is {@link Screen }
     */
    public void setScreen(Screen value) {
        this.screen = value;
    }

    /**
     * Gets the value of the powerConsumption property.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Sets the value of the powerConsumption property.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setPowerConsumption(BigInteger value) {
        this.powerConsumption = value;
    }

    /**
     * Gets the value of the hasHdr property.
     */
    public boolean hasHdr() {
        return hasHdr;
    }

    /**
     * Sets the value of the hasHdr property.
     */
    public void setHasHdr(boolean value) {
        this.hasHdr = value;
    }

    /**
     * Gets the value of the hasHdmi property.
     */
    public boolean hasHdmi() {
        return hasHdmi;
    }

    /**
     * Sets the value of the hasHdmi property.
     */
    public void setHasHdmi(boolean value) {
        this.hasHdmi = value;
    }

    /**
     * Gets the value of the hasSmartTv property.
     */
    public boolean hasSmartTv() {
        return hasSmartTv;
    }

    /**
     * Sets the value of the hasSmartTv property.
     */
    public void setHasSmartTv(boolean value) {
        this.hasSmartTv = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screen, powerConsumption, hasHdr, hasHdmi, hasSmartTv);
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
        Television that = (Television) o;
        return hasHdr == that.hasHdr
               && hasHdmi == that.hasHdmi
               && hasSmartTv == that.hasSmartTv
               && Objects.equals(screen, that.screen)
               && Objects.equals(powerConsumption, that.powerConsumption);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Television.class.getSimpleName() + "[", "]")
                       .add("screen=" + screen)
                       .add("powerConsumption=" + powerConsumption)
                       .add("hasHdr=" + hasHdr)
                       .add("hasHdmi=" + hasHdmi)
                       .add("hasSmartTv=" + hasSmartTv)
               + " : " + super.toString();
    }
}
