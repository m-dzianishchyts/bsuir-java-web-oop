package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for screen complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="screen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{https://www.appliances.by/xml/minor}screenInfo"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screen")
public class Screen {

    @XmlAttribute(name = ApplianceProperties.RESOLUTION, required = true)
    protected String resolution;
    @XmlAttribute(name = ApplianceProperties.DIAGONAL, required = true)
    protected float diagonal;

    /**
     * Gets the value of the resolution property.
     *
     * @return possible object is {@link String }
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     *
     * @param value allowed object is {@link String }
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the diagonal property.
     */
    public float getDiagonal() {
        return diagonal;
    }

    /**
     * Sets the value of the diagonal property.
     */
    public void setDiagonal(float value) {
        this.diagonal = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolution, diagonal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Screen screen = (Screen) o;
        return Float.compare(screen.diagonal, diagonal) == 0
               && Objects.equals(resolution, screen.resolution);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Screen.class.getSimpleName() + "[", "]")
                .add("resolution='" + resolution + "'")
                .add("diagonal=" + diagonal)
                .toString();
    }
}
