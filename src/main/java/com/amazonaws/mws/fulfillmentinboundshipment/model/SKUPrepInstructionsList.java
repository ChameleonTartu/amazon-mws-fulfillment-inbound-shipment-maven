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
 * SKU Prep Instructions List
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * SKUPrepInstructionsList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SKUPrepInstructionsList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SKUPrepInstructions" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}SKUPrepInstructions" maxOccurs="unbounded"/&gt;
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
@XmlType(name="SKUPrepInstructionsList", propOrder={
    "skuPrepInstructions"
})
@XmlRootElement(name = "SKUPrepInstructionsList")
public class SKUPrepInstructionsList extends AbstractMwsObject {

    @XmlElement(name="SKUPrepInstructions")
    private List<SKUPrepInstructions> skuPrepInstructions;

    /**
     * Get the value of SKUPrepInstructions.
     *
     * @return The value of SKUPrepInstructions.
     */
    public List<SKUPrepInstructions> getSKUPrepInstructions() {
        if (skuPrepInstructions==null) {
            skuPrepInstructions = new ArrayList<SKUPrepInstructions>();
        }
        return skuPrepInstructions;
    }

    /**
     * Set the value of SKUPrepInstructions.
     *
     * @param skuPrepInstructions
     *            The new value to set.
     */
    public void setSKUPrepInstructions(List<SKUPrepInstructions> skuPrepInstructions) {
        this.skuPrepInstructions = skuPrepInstructions;
    }

    /**
     * Clear SKUPrepInstructions.
     */
    public void unsetSKUPrepInstructions() {
        this.skuPrepInstructions = null;
    }

    /**
     * Check to see if SKUPrepInstructions is set.
     *
     * @return true if SKUPrepInstructions is set.
     */
    public boolean isSetSKUPrepInstructions() {
        return skuPrepInstructions != null && !skuPrepInstructions.isEmpty();
    }

    /**
     * Add values for SKUPrepInstructions, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.SKUPrepInstructions} object.
     */
    public SKUPrepInstructionsList withSKUPrepInstructions(SKUPrepInstructions... values) {
        List<SKUPrepInstructions> list = getSKUPrepInstructions();
        for (SKUPrepInstructions value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        skuPrepInstructions = r.readList("SKUPrepInstructions", SKUPrepInstructions.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("SKUPrepInstructions", skuPrepInstructions);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "SKUPrepInstructionsList",this);
    }


    /**
     * Value constructor.
     *
     * @param skuPrepInstructions a {@link java.util.List} object.
     */
    public SKUPrepInstructionsList(List<SKUPrepInstructions> skuPrepInstructions) {
        this.skuPrepInstructions = skuPrepInstructions;
    }

    /**
     * Default constructor.
     */
    public SKUPrepInstructionsList() {
        super();
    }

}
