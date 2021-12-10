package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for vacuumCleaner complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="vacuumCleaner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.appliances.by/xml/types}appliance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dustCollectorVolume" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="suctionPower" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="noiseLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ApplianceTypes.VACUUM_CLEANER, propOrder = {
        ApplianceProperties.DUST_COLLECTOR_VOLUME,
        ApplianceProperties.SUCTION_POWER,
        ApplianceProperties.NOISE_LEVEL
})
public class VacuumCleaner extends Appliance {

    protected float dustCollectorVolume;
    @XmlElement(required = true)
    protected int suctionPower;
    @XmlElement(required = true)
    protected int noiseLevel;

    /**
     * Gets the value of the dustCollectorVolume property.
     */
    public float getDustCollectorVolume() {
        return dustCollectorVolume;
    }

    /**
     * Sets the value of the dustCollectorVolume property.
     */
    public void setDustCollectorVolume(float value) {
        this.dustCollectorVolume = value;
    }

    /**
     * Gets the value of the suctionPower property.
     */
    public int getSuctionPower() {
        return suctionPower;
    }

    /**
     * Sets the value of the suctionPower property.
     */
    public void setSuctionPower(int value) {
        this.suctionPower = value;
    }

    /**
     * Gets the value of the noiseLevel property.
     */
    public int getNoiseLevel() {
        return noiseLevel;
    }

    /**
     * Sets the value of the noiseLevel property.
     */
    public void setNoiseLevel(int value) {
        this.noiseLevel = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dustCollectorVolume, suctionPower, noiseLevel);
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
        VacuumCleaner that = (VacuumCleaner) o;
        return Float.compare(that.dustCollectorVolume, dustCollectorVolume) == 0
               && suctionPower == that.suctionPower
               && noiseLevel == that.noiseLevel;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", VacuumCleaner.class.getSimpleName() + "[", "]")
                       .add("dustCollectorVolume=" + dustCollectorVolume)
                       .add("suctionPower=" + suctionPower)
                       .add("noiseLevel=" + noiseLevel)
               + " : " + super.toString();
    }
}
