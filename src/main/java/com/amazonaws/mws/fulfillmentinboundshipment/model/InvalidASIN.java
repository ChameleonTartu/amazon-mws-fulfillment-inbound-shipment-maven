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
 * Invalid ASIN
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * InvalidASIN complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InvalidASIN"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ErrorReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name="InvalidASIN", propOrder={
    "asin",
    "errorReason"
})
@XmlRootElement(name = "InvalidASIN")
public class InvalidASIN extends AbstractMwsObject {

    @XmlElement(name="ASIN")
    private String asin;

    @XmlElement(name="ErrorReason")
    private String errorReason;

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     * @return This instance.
     */
    public InvalidASIN withASIN(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get the value of ErrorReason.
     *
     * @return The value of ErrorReason.
     */
    public String getErrorReason() {
        return errorReason;
    }

    /**
     * Set the value of ErrorReason.
     *
     * @param errorReason
     *            The new value to set.
     */
    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * Check to see if ErrorReason is set.
     *
     * @return true if ErrorReason is set.
     */
    public boolean isSetErrorReason() {
        return errorReason != null;
    }

    /**
     * Set the value of ErrorReason, return this.
     *
     * @param errorReason
     *             The new value to set.
     * @return This instance.
     */
    public InvalidASIN withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        asin = r.read("ASIN", String.class);
        errorReason = r.read("ErrorReason", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ASIN", asin);
        w.write("ErrorReason", errorReason);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InvalidASIN",this);
    }


    /**
     * Value constructor.
     *
     * @param asin a {@link java.lang.String} object.
     * @param errorReason a {@link java.lang.String} object.
     */
    public InvalidASIN(String asin,String errorReason) {
        this.asin = asin;
        this.errorReason = errorReason;
    }

    /**
     * Default constructor.
     */
    public InvalidASIN() {
        super();
    }

}
