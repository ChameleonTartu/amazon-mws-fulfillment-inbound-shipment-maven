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
 * Confirm Transport Request Response
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ConfirmTransportRequestResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ConfirmTransportRequestResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ConfirmTransportRequestResult" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ConfirmTransportRequestResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ResponseMetadata" minOccurs="0"/&gt;
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
@XmlType(name="ConfirmTransportRequestResponse", propOrder={
    "confirmTransportRequestResult",
    "responseMetadata"
})
@XmlRootElement(name = "ConfirmTransportRequestResponse")
public class ConfirmTransportRequestResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="ConfirmTransportRequestResult")
    private ConfirmTransportRequestResult confirmTransportRequestResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ConfirmTransportRequestResult.
     *
     * @return The value of ConfirmTransportRequestResult.
     */
    public ConfirmTransportRequestResult getConfirmTransportRequestResult() {
        return confirmTransportRequestResult;
    }

    /**
     * Set the value of ConfirmTransportRequestResult.
     *
     * @param confirmTransportRequestResult
     *            The new value to set.
     */
    public void setConfirmTransportRequestResult(ConfirmTransportRequestResult confirmTransportRequestResult) {
        this.confirmTransportRequestResult = confirmTransportRequestResult;
    }

    /**
     * Check to see if ConfirmTransportRequestResult is set.
     *
     * @return true if ConfirmTransportRequestResult is set.
     */
    public boolean isSetConfirmTransportRequestResult() {
        return confirmTransportRequestResult != null;
    }

    /**
     * Set the value of ConfirmTransportRequestResult, return this.
     *
     * @param confirmTransportRequestResult
     *             The new value to set.
     * @return This instance.
     */
    public ConfirmTransportRequestResponse withConfirmTransportRequestResult(ConfirmTransportRequestResult confirmTransportRequestResult) {
        this.confirmTransportRequestResult = confirmTransportRequestResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     * @return This instance.
     */
    public ConfirmTransportRequestResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * {@inheritDoc}
     *
     * Set the value of ResponseHeaderMetadata.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     * @return This instance.
     */
    public ConfirmTransportRequestResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        confirmTransportRequestResult = r.read("ConfirmTransportRequestResult", ConfirmTransportRequestResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ConfirmTransportRequestResult", confirmTransportRequestResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ConfirmTransportRequestResponse",this);
    }


    /**
     * Value constructor.
     *
     * @param confirmTransportRequestResult a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.ConfirmTransportRequestResult} object.
     * @param responseMetadata a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.ResponseMetadata} object.
     */
    public ConfirmTransportRequestResponse(ConfirmTransportRequestResult confirmTransportRequestResult,ResponseMetadata responseMetadata) {
        this.confirmTransportRequestResult = confirmTransportRequestResult;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Default constructor.
     */
    public ConfirmTransportRequestResponse() {
        super();
    }

}