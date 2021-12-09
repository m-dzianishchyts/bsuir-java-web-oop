package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for operatingSystem.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operatingSystem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Windows"/&gt;
 *     &lt;enumeration value="macOS"/&gt;
 *     &lt;enumeration value="Ubuntu"/&gt;
 *     &lt;enumeration value="Chrome OS"/&gt;
 *     &lt;enumeration value="Linux"/&gt;
 *     &lt;enumeration value="Android"/&gt;
 *     &lt;enumeration value="iOS"/&gt;
 *     &lt;enumeration value="DOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "operatingSystem", namespace = "https://www.appliances.by/xml/minor")
@XmlEnum
public enum OperatingSystem {

    @XmlEnumValue("Windows")
    WINDOWS("Windows"),
    @XmlEnumValue("macOS")
    MAC_OS("macOS"),
    @XmlEnumValue("Ubuntu")
    UBUNTU("Ubuntu"),
    @XmlEnumValue("Chrome OS")
    CHROME_OS("Chrome OS"),
    @XmlEnumValue("Linux")
    LINUX("Linux"),
    @XmlEnumValue("Android")
    ANDROID("Android"),
    @XmlEnumValue("iOS")
    I_OS("iOS"),
    DOS("DOS");
    private final String value;

    OperatingSystem(String v) {
        value = v;
    }

    public static OperatingSystem fromValue(String v) {
        for (OperatingSystem c : OperatingSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
