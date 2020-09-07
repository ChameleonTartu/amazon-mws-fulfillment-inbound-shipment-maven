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
 * Amazon Prep Fees Details List
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
 * AmazonPrepFeesDetailsList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AmazonPrepFeesDetailsList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonPrepFeesDetails" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}AmazonPrepFeesDetails" maxOccurs="unbounded"/&gt;
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
@XmlType(name="AmazonPrepFeesDetailsList", propOrder={
    "amazonPrepFeesDetails"
})
@XmlRootElement(name = "AmazonPrepFeesDetailsList")
public class AmazonPrepFeesDetailsList extends AbstractMwsObject {

    @XmlElement(name="AmazonPrepFeesDetails")
    private List<AmazonPrepFeesDetails> amazonPrepFeesDetails;

    /**
     * Get the value of AmazonPrepFeesDetails.
     *
     * @return The value of AmazonPrepFeesDetails.
     */
    public List<AmazonPrepFeesDetails> getAmazonPrepFeesDetails() {
        if (amazonPrepFeesDetails==null) {
            amazonPrepFeesDetails = new ArrayList<AmazonPrepFeesDetails>();
        }
        return amazonPrepFeesDetails;
    }

    /**
     * Set the value of AmazonPrepFeesDetails.
     *
     * @param amazonPrepFeesDetails
     *            The new value to set.
     */
    public void setAmazonPrepFeesDetails(List<AmazonPrepFeesDetails> amazonPrepFeesDetails) {
        this.amazonPrepFeesDetails = amazonPrepFeesDetails;
    }

    /**
     * Clear AmazonPrepFeesDetails.
     */
    public void unsetAmazonPrepFeesDetails() {
        this.amazonPrepFeesDetails = null;
    }

    /**
     * Check to see if AmazonPrepFeesDetails is set.
     *
     * @return true if AmazonPrepFeesDetails is set.
     */
    public boolean isSetAmazonPrepFeesDetails() {
        return amazonPrepFeesDetails != null && !amazonPrepFeesDetails.isEmpty();
    }

    /**
     * Add values for AmazonPrepFeesDetails, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.AmazonPrepFeesDetails} object.
     */
    public AmazonPrepFeesDetailsList withAmazonPrepFeesDetails(AmazonPrepFeesDetails... values) {
        List<AmazonPrepFeesDetails> list = getAmazonPrepFeesDetails();
        for (AmazonPrepFeesDetails value : values) {
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
        amazonPrepFeesDetails = r.readList("AmazonPrepFeesDetails", AmazonPrepFeesDetails.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("AmazonPrepFeesDetails", amazonPrepFeesDetails);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "AmazonPrepFeesDetailsList",this);
    }


    /**
     * Value constructor.
     *
     * @param amazonPrepFeesDetails a {@link java.util.List} object.
     */
    public AmazonPrepFeesDetailsList(List<AmazonPrepFeesDetails> amazonPrepFeesDetails) {
        this.amazonPrepFeesDetails = amazonPrepFeesDetails;
    }

    /**
     * Default constructor.
     */
    public AmazonPrepFeesDetailsList() {
        super();
    }

}
