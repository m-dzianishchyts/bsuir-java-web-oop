package by.bsuir.web.oop.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * <p>Java class for measurements complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="measurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{https://www.appliances.by/xml/minor}measurements"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measurements")
public class Measurements {

    @XmlAttribute(name = "height", required = true)
    protected float height;
    @XmlAttribute(name = "width", required = true)
    protected float width;
    @XmlAttribute(name = "depth", required = true)
    protected float depth;
    @XmlAttribute(name = "weight", required = true)
    protected float weight;

    /**
     * Gets the value of the height property.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     */
    public void setWidth(float value) {
        this.width = value;
    }

    /**
     * Gets the value of the depth property.
     */
    public float getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     */
    public void setDepth(float value) {
        this.depth = value;
    }

    /**
     * Gets the value of the weight property.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, depth, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Measurements that = (Measurements) o;
        return Float.compare(that.height, height) == 0
               && Float.compare(that.width, width) == 0
               && Float.compare(that.depth, depth) == 0
               && Float.compare(that.weight, weight) == 0;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Measurements.class.getSimpleName() + "[", "]")
                .add("height=" + height)
                .add("width=" + width)
                .add("depth=" + depth)
                .add("weight=" + weight)
                .toString();
    }
}
