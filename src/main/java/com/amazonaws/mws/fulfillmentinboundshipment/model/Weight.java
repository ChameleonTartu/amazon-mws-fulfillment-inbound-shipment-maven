/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Weight
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Weight complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Weight"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Weight", propOrder={
    "value",
    "unit"
})
@XmlRootElement(name = "Weight")
public class Weight extends AbstractMwsObject {

    @XmlElement(name="Value",required=true)
    private BigDecimal value;

    @XmlElement(name="Unit",required=true)
    private String unit;

    /**
     * Get the value of Value.
     *
     * @return The value of Value.
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Set the value of Value.
     *
     * @param value
     *            The new value to set.
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Check to see if Value is set.
     *
     * @return true if Value is set.
     */
    public boolean isSetValue() {
        return value != null;
    }

    /**
     * Set the value of Value, return this.
     *
     * @param value
     *             The new value to set.
     * @return This instance.
     */
    public Weight withValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * Get the value of Unit.
     *
     * @return The value of Unit.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Set the value of Unit.
     *
     * @param unit
     *            The new value to set.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Check to see if Unit is set.
     *
     * @return true if Unit is set.
     */
    public boolean isSetUnit() {
        return unit != null;
    }

    /**
     * Set the value of Unit, return this.
     *
     * @param unit
     *             The new value to set.
     * @return This instance.
     */
    public Weight withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        value = r.read("Value", BigDecimal.class);
        unit = r.read("Unit", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Value", value);
        w.write("Unit", unit);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "Weight",this);
    }

    /**
     * Value constructor.
     *
     * @param value a {@link java.math.BigDecimal} object.
     * @param unit a {@link java.lang.String} object.
     */
    public Weight(BigDecimal value,String unit) {
        this.value = value;
        this.unit = unit;
    }    

    /**
     * Default constructor.
     */
    public Weight() {
        super();
    }

}
