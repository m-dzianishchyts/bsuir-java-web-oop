package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for laptop complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="laptop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.appliances.by/xml/types}batteryAppliance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="screen" type="{https://www.appliances.by/xml/types}screen"/&gt;
 *         &lt;element name="operatingSystem" type="{https://www.appliances.by/xml/minor}operatingSystem"/&gt;
 *         &lt;element name="cpuFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ramCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="storageCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hasTouchScreen" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ApplianceTypes.LAPTOP, propOrder = {
        "screen",
        ApplianceProperties.OPERATING_SYSTEM,
        ApplianceProperties.CPU_FREQUENCY,
        ApplianceProperties.RAM_CAPACITY,
        ApplianceProperties.STORAGE_CAPACITY,
        ApplianceProperties.HAS_TOUCH_SCREEN
})
public class Laptop extends BatteryAppliance {

    @XmlElement(required = true)
    protected Screen screen;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected OperatingSystem operatingSystem;
    @XmlElement(required = true)
    protected int cpuFrequency;
    @XmlElement(required = true)
    protected int ramCapacity;
    @XmlElement(required = true)
    protected int storageCapacity;
    protected boolean hasTouchScreen;

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
     * Gets the value of the operatingSystem property.
     *
     * @return possible object is {@link OperatingSystem }
     */
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     *
     * @param value allowed object is {@link OperatingSystem }
     */
    public void setOperatingSystem(OperatingSystem value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the cpuFrequency property.
     */
    public int getCpuFrequency() {
        return cpuFrequency;
    }

    /**
     * Sets the value of the cpuFrequency property.
     */
    public void setCpuFrequency(int value) {
        this.cpuFrequency = value;
    }

    /**
     * Gets the value of the ramCapacity property.
     */
    public int getRamCapacity() {
        return ramCapacity;
    }

    /**
     * Sets the value of the ramCapacity property.
     */
    public void setRamCapacity(int value) {
        this.ramCapacity = value;
    }

    /**
     * Gets the value of the storageCapacity property.
     */
    public int getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * Sets the value of the storageCapacity property.
     */
    public void setStorageCapacity(int value) {
        this.storageCapacity = value;
    }

    /**
     * Gets the value of the hasTouchScreen property.
     */
    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    /**
     * Sets the value of the hasTouchScreen property.
     */
    public void setHasTouchScreen(boolean value) {
        this.hasTouchScreen = value;
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
        Laptop laptop = (Laptop) o;
        return cpuFrequency == laptop.cpuFrequency
               && ramCapacity == laptop.ramCapacity
               && storageCapacity == laptop.storageCapacity
               && hasTouchScreen == laptop.hasTouchScreen
               && Objects.equals(screen, laptop.screen)
               && operatingSystem == laptop.operatingSystem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screen, operatingSystem, cpuFrequency, ramCapacity, storageCapacity,
                            hasTouchScreen);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Laptop.class.getSimpleName() + "[", "]")
                       .add("screen=" + screen)
                       .add("operatingSystem=" + operatingSystem)
                       .add("cpuFrequency=" + cpuFrequency)
                       .add("ramCapacity=" + ramCapacity)
                       .add("storageCapacity=" + storageCapacity)
                       .add("hasTouchScreen=" + hasTouchScreen)
               + " : " + super.toString();
    }
}
