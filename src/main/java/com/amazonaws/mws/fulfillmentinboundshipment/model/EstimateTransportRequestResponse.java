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
 * Estimate Transport Request Response
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * EstimateTransportRequestResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="EstimateTransportRequestResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="EstimateTransportRequestResult" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}EstimateTransportRequestResult" minOccurs="0"/&gt;
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
@XmlType(name="EstimateTransportRequestResponse", propOrder={
    "estimateTransportRequestResult",
    "responseMetadata"
})
@XmlRootElement(name = "EstimateTransportRequestResponse")
public class EstimateTransportRequestResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="EstimateTransportRequestResult")
    private EstimateTransportRequestResult estimateTransportRequestResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of EstimateTransportRequestResult.
     *
     * @return The value of EstimateTransportRequestResult.
     */
    public EstimateTransportRequestResult getEstimateTransportRequestResult() {
        return estimateTransportRequestResult;
    }

    /**
     * Set the value of EstimateTransportRequestResult.
     *
     * @param estimateTransportRequestResult
     *            The new value to set.
     */
    public void setEstimateTransportRequestResult(EstimateTransportRequestResult estimateTransportRequestResult) {
        this.estimateTransportRequestResult = estimateTransportRequestResult;
    }

    /**
     * Check to see if EstimateTransportRequestResult is set.
     *
     * @return true if EstimateTransportRequestResult is set.
     */
    public boolean isSetEstimateTransportRequestResult() {
        return estimateTransportRequestResult != null;
    }

    /**
     * Set the value of EstimateTransportRequestResult, return this.
     *
     * @param estimateTransportRequestResult
     *             The new value to set.
     * @return This instance.
     */
    public EstimateTransportRequestResponse withEstimateTransportRequestResult(EstimateTransportRequestResult estimateTransportRequestResult) {
        this.estimateTransportRequestResult = estimateTransportRequestResult;
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
    public EstimateTransportRequestResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public EstimateTransportRequestResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        estimateTransportRequestResult = r.read("EstimateTransportRequestResult", EstimateTransportRequestResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("EstimateTransportRequestResult", estimateTransportRequestResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "EstimateTransportRequestResponse",this);
    }


    /**
     * Value constructor.
     *
     * @param estimateTransportRequestResult a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.EstimateTransportRequestResult} object.
     * @param responseMetadata a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.ResponseMetadata} object.
     */
    public EstimateTransportRequestResponse(EstimateTransportRequestResult estimateTransportRequestResult,ResponseMetadata responseMetadata) {
        this.estimateTransportRequestResult = estimateTransportRequestResult;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Default constructor.
     */
    public EstimateTransportRequestResponse() {
        super();
    }

}
