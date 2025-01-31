
package org.docx4j.com.microsoft.schemas.office.drawing.x2014.chartex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_GeoParentEntitiesQueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_GeoParentEntitiesQueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoParentEntitiesQuery" type="{http://schemas.microsoft.com/office/drawing/2014/chartex}CT_GeoParentEntitiesQuery"/&gt;
 *         &lt;element name="geoEntity" type="{http://schemas.microsoft.com/office/drawing/2014/chartex}CT_GeoEntity" minOccurs="0"/&gt;
 *         &lt;element name="geoParentEntity" type="{http://schemas.microsoft.com/office/drawing/2014/chartex}CT_GeoParentEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_GeoParentEntitiesQueryResult", propOrder = {
    "geoParentEntitiesQuery",
    "geoEntity",
    "geoParentEntity"
})
public class CTGeoParentEntitiesQueryResult {

    @XmlElement(required = true)
    protected CTGeoParentEntitiesQuery geoParentEntitiesQuery;
    protected CTGeoEntity geoEntity;
    protected CTGeoParentEntity geoParentEntity;

    /**
     * Gets the value of the geoParentEntitiesQuery property.
     * 
     * @return
     *     possible object is
     *     {@link CTGeoParentEntitiesQuery }
     *     
     */
    public CTGeoParentEntitiesQuery getGeoParentEntitiesQuery() {
        return geoParentEntitiesQuery;
    }

    /**
     * Sets the value of the geoParentEntitiesQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGeoParentEntitiesQuery }
     *     
     */
    public void setGeoParentEntitiesQuery(CTGeoParentEntitiesQuery value) {
        this.geoParentEntitiesQuery = value;
    }

    /**
     * Gets the value of the geoEntity property.
     * 
     * @return
     *     possible object is
     *     {@link CTGeoEntity }
     *     
     */
    public CTGeoEntity getGeoEntity() {
        return geoEntity;
    }

    /**
     * Sets the value of the geoEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGeoEntity }
     *     
     */
    public void setGeoEntity(CTGeoEntity value) {
        this.geoEntity = value;
    }

    /**
     * Gets the value of the geoParentEntity property.
     * 
     * @return
     *     possible object is
     *     {@link CTGeoParentEntity }
     *     
     */
    public CTGeoParentEntity getGeoParentEntity() {
        return geoParentEntity;
    }

    /**
     * Sets the value of the geoParentEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGeoParentEntity }
     *     
     */
    public void setGeoParentEntity(CTGeoParentEntity value) {
        this.geoParentEntity = value;
    }

}
