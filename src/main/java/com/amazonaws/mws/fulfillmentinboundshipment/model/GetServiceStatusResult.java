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
 * Get Service Status Result
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetServiceStatusResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetServiceStatusResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name="GetServiceStatusResult", propOrder={
    "status",
    "timestamp"
})
@XmlRootElement(name = "GetServiceStatusResult")
public class GetServiceStatusResult extends AbstractMwsObject {

    @XmlElement(name="Status")
    private String status;

    @XmlElement(name="Timestamp")
    private XMLGregorianCalendar timestamp;

    /**
     * Get the value of Status.
     *
     * @return The value of Status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of Status.
     *
     * @param status
     *            The new value to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Check to see if Status is set.
     *
     * @return true if Status is set.
     */
    public boolean isSetStatus() {
        return status != null;
    }

    /**
     * Set the value of Status, return this.
     *
     * @param status
     *             The new value to set.
     * @return This instance.
     */
    public GetServiceStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the value of Timestamp.
     *
     * @return The value of Timestamp.
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Set the value of Timestamp.
     *
     * @param timestamp
     *            The new value to set.
     */
    public void setTimestamp(XMLGregorianCalendar timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Check to see if Timestamp is set.
     *
     * @return true if Timestamp is set.
     */
    public boolean isSetTimestamp() {
        return timestamp != null;
    }

    /**
     * Set the value of Timestamp, return this.
     *
     * @param timestamp
     *             The new value to set.
     * @return This instance.
     */
    public GetServiceStatusResult withTimestamp(XMLGregorianCalendar timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        status = r.read("Status", String.class);
        timestamp = r.read("Timestamp", XMLGregorianCalendar.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Status", status);
        w.write("Timestamp", timestamp);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetServiceStatusResult",this);
    }


    /**
     * Value constructor.
     *
     * @param status a {@link java.lang.String} object.
     * @param timestamp a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public GetServiceStatusResult(String status,XMLGregorianCalendar timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }

    /**
     * Default constructor.
     */
    public GetServiceStatusResult() {
        super();
    }

}
