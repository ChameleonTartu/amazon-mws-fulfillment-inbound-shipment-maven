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
 * Non Partnered Small Parcel Package Input
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * NonPartneredSmallParcelPackageInput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="NonPartneredSmallParcelPackageInput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TrackingId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name="NonPartneredSmallParcelPackageInput", propOrder={
    "trackingId"
})
@XmlRootElement(name = "NonPartneredSmallParcelPackageInput")
public class NonPartneredSmallParcelPackageInput extends AbstractMwsObject {

    @XmlElement(name="TrackingId",required=true)
    private String trackingId;

    /**
     * Get the value of TrackingId.
     *
     * @return The value of TrackingId.
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Set the value of TrackingId.
     *
     * @param trackingId
     *            The new value to set.
     */
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * Check to see if TrackingId is set.
     *
     * @return true if TrackingId is set.
     */
    public boolean isSetTrackingId() {
        return trackingId != null;
    }

    /**
     * Set the value of TrackingId, return this.
     *
     * @param trackingId
     *             The new value to set.
     * @return This instance.
     */
    public NonPartneredSmallParcelPackageInput withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        trackingId = r.read("TrackingId", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TrackingId", trackingId);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "NonPartneredSmallParcelPackageInput",this);
    }

    /**
     * Value constructor.
     *
     * @param trackingId a {@link java.lang.String} object.
     */
    public NonPartneredSmallParcelPackageInput(String trackingId) {
        this.trackingId = trackingId;
    }    

    /**
     * Default constructor.
     */
    public NonPartneredSmallParcelPackageInput() {
        super();
    }

}
