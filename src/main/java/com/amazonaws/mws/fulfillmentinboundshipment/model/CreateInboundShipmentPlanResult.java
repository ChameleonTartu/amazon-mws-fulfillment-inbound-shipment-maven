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
 * Create Inbound Shipment Plan Result
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * CreateInboundShipmentPlanResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateInboundShipmentPlanResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="InboundShipmentPlans" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InboundShipmentPlanList" minOccurs="0"/&gt;
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
@XmlType(name="CreateInboundShipmentPlanResult", propOrder={
    "inboundShipmentPlans"
})
@XmlRootElement(name = "CreateInboundShipmentPlanResult")
public class CreateInboundShipmentPlanResult extends AbstractMwsObject {

    @XmlElement(name="InboundShipmentPlans")
    private InboundShipmentPlanList inboundShipmentPlans;

    /**
     * Get the value of InboundShipmentPlans.
     *
     * @return The value of InboundShipmentPlans.
     */
    public InboundShipmentPlanList getInboundShipmentPlans() {
        return inboundShipmentPlans;
    }

    /**
     * Set the value of InboundShipmentPlans.
     *
     * @param inboundShipmentPlans
     *            The new value to set.
     */
    public void setInboundShipmentPlans(InboundShipmentPlanList inboundShipmentPlans) {
        this.inboundShipmentPlans = inboundShipmentPlans;
    }

    /**
     * Check to see if InboundShipmentPlans is set.
     *
     * @return true if InboundShipmentPlans is set.
     */
    public boolean isSetInboundShipmentPlans() {
        return inboundShipmentPlans != null;
    }

    /**
     * Set the value of InboundShipmentPlans, return this.
     *
     * @param inboundShipmentPlans
     *             The new value to set.
     * @return This instance.
     */
    public CreateInboundShipmentPlanResult withInboundShipmentPlans(InboundShipmentPlanList inboundShipmentPlans) {
        this.inboundShipmentPlans = inboundShipmentPlans;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        inboundShipmentPlans = r.read("InboundShipmentPlans", InboundShipmentPlanList.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("InboundShipmentPlans", inboundShipmentPlans);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "CreateInboundShipmentPlanResult",this);
    }


    /**
     * Value constructor.
     *
     * @param inboundShipmentPlans a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.InboundShipmentPlanList} object.
     */
    public CreateInboundShipmentPlanResult(InboundShipmentPlanList inboundShipmentPlans) {
        this.inboundShipmentPlans = inboundShipmentPlans;
    }

    /**
     * Default constructor.
     */
    public CreateInboundShipmentPlanResult() {
        super();
    }

}
