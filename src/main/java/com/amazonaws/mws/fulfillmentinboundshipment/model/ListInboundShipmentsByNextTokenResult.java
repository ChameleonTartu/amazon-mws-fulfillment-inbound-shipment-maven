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
 * List Inbound Shipments By Next Token Result
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ListInboundShipmentsByNextTokenResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListInboundShipmentsByNextTokenResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentData" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InboundShipmentList" minOccurs="0"/&gt;
 *             &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name="ListInboundShipmentsByNextTokenResult", propOrder={
    "shipmentData",
    "nextToken"
})
@XmlRootElement(name = "ListInboundShipmentsByNextTokenResult")
public class ListInboundShipmentsByNextTokenResult extends AbstractMwsObject {

    @XmlElement(name="ShipmentData")
    private InboundShipmentList shipmentData;

    @XmlElement(name="NextToken")
    private String nextToken;

    /**
     * Get the value of ShipmentData.
     *
     * @return The value of ShipmentData.
     */
    public InboundShipmentList getShipmentData() {
        return shipmentData;
    }

    /**
     * Set the value of ShipmentData.
     *
     * @param shipmentData
     *            The new value to set.
     */
    public void setShipmentData(InboundShipmentList shipmentData) {
        this.shipmentData = shipmentData;
    }

    /**
     * Check to see if ShipmentData is set.
     *
     * @return true if ShipmentData is set.
     */
    public boolean isSetShipmentData() {
        return shipmentData != null;
    }

    /**
     * Set the value of ShipmentData, return this.
     *
     * @param shipmentData
     *             The new value to set.
     * @return This instance.
     */
    public ListInboundShipmentsByNextTokenResult withShipmentData(InboundShipmentList shipmentData) {
        this.shipmentData = shipmentData;
        return this;
    }

    /**
     * Get the value of NextToken.
     *
     * @return The value of NextToken.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Set the value of NextToken.
     *
     * @param nextToken
     *            The new value to set.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Check to see if NextToken is set.
     *
     * @return true if NextToken is set.
     */
    public boolean isSetNextToken() {
        return nextToken != null;
    }

    /**
     * Set the value of NextToken, return this.
     *
     * @param nextToken
     *             The new value to set.
     * @return This instance.
     */
    public ListInboundShipmentsByNextTokenResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        shipmentData = r.read("ShipmentData", InboundShipmentList.class);
        nextToken = r.read("NextToken", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ShipmentData", shipmentData);
        w.write("NextToken", nextToken);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ListInboundShipmentsByNextTokenResult",this);
    }


    /**
     * Value constructor.
     *
     * @param shipmentData a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.InboundShipmentList} object.
     * @param nextToken a {@link java.lang.String} object.
     */
    public ListInboundShipmentsByNextTokenResult(InboundShipmentList shipmentData,String nextToken) {
        this.shipmentData = shipmentData;
        this.nextToken = nextToken;
    }

    /**
     * Default constructor.
     */
    public ListInboundShipmentsByNextTokenResult() {
        super();
    }

}
