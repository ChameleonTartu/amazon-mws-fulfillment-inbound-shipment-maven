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
 * ASIN Prep Instructions List
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
 * ASINPrepInstructionsList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ASINPrepInstructionsList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASINPrepInstructions" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ASINPrepInstructions" maxOccurs="unbounded"/&gt;
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
@XmlType(name="ASINPrepInstructionsList", propOrder={
    "asinPrepInstructions"
})
@XmlRootElement(name = "ASINPrepInstructionsList")
public class ASINPrepInstructionsList extends AbstractMwsObject {

    @XmlElement(name="ASINPrepInstructions")
    private List<ASINPrepInstructions> asinPrepInstructions;

    /**
     * Get the value of ASINPrepInstructions.
     *
     * @return The value of ASINPrepInstructions.
     */
    public List<ASINPrepInstructions> getASINPrepInstructions() {
        if (asinPrepInstructions==null) {
            asinPrepInstructions = new ArrayList<ASINPrepInstructions>();
        }
        return asinPrepInstructions;
    }

    /**
     * Set the value of ASINPrepInstructions.
     *
     * @param asinPrepInstructions
     *            The new value to set.
     */
    public void setASINPrepInstructions(List<ASINPrepInstructions> asinPrepInstructions) {
        this.asinPrepInstructions = asinPrepInstructions;
    }

    /**
     * Clear ASINPrepInstructions.
     */
    public void unsetASINPrepInstructions() {
        this.asinPrepInstructions = null;
    }

    /**
     * Check to see if ASINPrepInstructions is set.
     *
     * @return true if ASINPrepInstructions is set.
     */
    public boolean isSetASINPrepInstructions() {
        return asinPrepInstructions != null && !asinPrepInstructions.isEmpty();
    }

    /**
     * Add values for ASINPrepInstructions, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.ASINPrepInstructions} object.
     */
    public ASINPrepInstructionsList withASINPrepInstructions(ASINPrepInstructions... values) {
        List<ASINPrepInstructions> list = getASINPrepInstructions();
        for (ASINPrepInstructions value : values) {
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
        asinPrepInstructions = r.readList("ASINPrepInstructions", ASINPrepInstructions.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ASINPrepInstructions", asinPrepInstructions);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ASINPrepInstructionsList",this);
    }


    /**
     * Value constructor.
     *
     * @param asinPrepInstructions a {@link java.util.List} object.
     */
    public ASINPrepInstructionsList(List<ASINPrepInstructions> asinPrepInstructions) {
        this.asinPrepInstructions = asinPrepInstructions;
    }

    /**
     * Default constructor.
     */
    public ASINPrepInstructionsList() {
        super();
    }

}
