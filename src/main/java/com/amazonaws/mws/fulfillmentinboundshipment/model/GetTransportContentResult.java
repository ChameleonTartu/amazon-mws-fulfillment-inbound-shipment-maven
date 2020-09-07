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
 * Get Transport Content Result
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetTransportContentResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetTransportContentResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TransportContent" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}TransportContent" minOccurs="0"/&gt;
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
@XmlType(name="GetTransportContentResult", propOrder={
    "transportContent"
})
@XmlRootElement(name = "GetTransportContentResult")
public class GetTransportContentResult extends AbstractMwsObject {

    @XmlElement(name="TransportContent")
    private TransportContent transportContent;

    /**
     * Get the value of TransportContent.
     *
     * @return The value of TransportContent.
     */
    public TransportContent getTransportContent() {
        return transportContent;
    }

    /**
     * Set the value of TransportContent.
     *
     * @param transportContent
     *            The new value to set.
     */
    public void setTransportContent(TransportContent transportContent) {
        this.transportContent = transportContent;
    }

    /**
     * Check to see if TransportContent is set.
     *
     * @return true if TransportContent is set.
     */
    public boolean isSetTransportContent() {
        return transportContent != null;
    }

    /**
     * Set the value of TransportContent, return this.
     *
     * @param transportContent
     *             The new value to set.
     * @return This instance.
     */
    public GetTransportContentResult withTransportContent(TransportContent transportContent) {
        this.transportContent = transportContent;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        transportContent = r.read("TransportContent", TransportContent.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TransportContent", transportContent);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetTransportContentResult",this);
    }


    /**
     * Value constructor.
     *
     * @param transportContent a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.TransportContent} object.
     */
    public GetTransportContentResult(TransportContent transportContent) {
        this.transportContent = transportContent;
    }

    /**
     * Default constructor.
     */
    public GetTransportContentResult() {
        super();
    }

}
