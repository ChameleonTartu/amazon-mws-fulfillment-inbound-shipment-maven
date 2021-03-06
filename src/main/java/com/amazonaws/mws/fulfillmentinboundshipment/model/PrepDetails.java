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
 * Prep Details
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * PrepDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PrepDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PrepInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PrepOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name="PrepDetails", propOrder={
    "prepInstruction",
    "prepOwner"
})
@XmlRootElement(name = "PrepDetails")
public class PrepDetails extends AbstractMwsObject {

    @XmlElement(name="PrepInstruction")
    private String prepInstruction;

    @XmlElement(name="PrepOwner")
    private String prepOwner;

    /**
     * Get the value of PrepInstruction.
     *
     * @return The value of PrepInstruction.
     */
    public String getPrepInstruction() {
        return prepInstruction;
    }

    /**
     * Set the value of PrepInstruction.
     *
     * @param prepInstruction
     *            The new value to set.
     */
    public void setPrepInstruction(String prepInstruction) {
        this.prepInstruction = prepInstruction;
    }

    /**
     * Check to see if PrepInstruction is set.
     *
     * @return true if PrepInstruction is set.
     */
    public boolean isSetPrepInstruction() {
        return prepInstruction != null;
    }

    /**
     * Set the value of PrepInstruction, return this.
     *
     * @param prepInstruction
     *             The new value to set.
     * @return This instance.
     */
    public PrepDetails withPrepInstruction(String prepInstruction) {
        this.prepInstruction = prepInstruction;
        return this;
    }

    /**
     * Get the value of PrepOwner.
     *
     * @return The value of PrepOwner.
     */
    public String getPrepOwner() {
        return prepOwner;
    }

    /**
     * Set the value of PrepOwner.
     *
     * @param prepOwner
     *            The new value to set.
     */
    public void setPrepOwner(String prepOwner) {
        this.prepOwner = prepOwner;
    }

    /**
     * Check to see if PrepOwner is set.
     *
     * @return true if PrepOwner is set.
     */
    public boolean isSetPrepOwner() {
        return prepOwner != null;
    }

    /**
     * Set the value of PrepOwner, return this.
     *
     * @param prepOwner
     *             The new value to set.
     * @return This instance.
     */
    public PrepDetails withPrepOwner(String prepOwner) {
        this.prepOwner = prepOwner;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        prepInstruction = r.read("PrepInstruction", String.class);
        prepOwner = r.read("PrepOwner", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PrepInstruction", prepInstruction);
        w.write("PrepOwner", prepOwner);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PrepDetails",this);
    }


    /**
     * Value constructor.
     *
     * @param prepInstruction a {@link java.lang.String} object.
     * @param prepOwner a {@link java.lang.String} object.
     */
    public PrepDetails(String prepInstruction,String prepOwner) {
        this.prepInstruction = prepInstruction;
        this.prepOwner = prepOwner;
    }

    /**
     * Default constructor.
     */
    public PrepDetails() {
        super();
    }

}
