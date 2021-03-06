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
 * Inbound Shipment Plan List
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
 * InboundShipmentPlanList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InboundShipmentPlanList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="member" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InboundShipmentPlan" maxOccurs="unbounded"/&gt;
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
@XmlType(name="InboundShipmentPlanList", propOrder={
    "member"
})
@XmlRootElement(name = "InboundShipmentPlanList")
public class InboundShipmentPlanList extends AbstractMwsObject {

    @XmlElement(name="member")
    private List<InboundShipmentPlan> member;

    /**
     * Get the value of member.
     *
     * @return The value of member.
     */
    public List<InboundShipmentPlan> getMember() {
        if (member==null) {
            member = new ArrayList<InboundShipmentPlan>();
        }
        return member;
    }

    /**
     * Set the value of member.
     *
     * @param member
     *            The new value to set.
     */
    public void setMember(List<InboundShipmentPlan> member) {
        this.member = member;
    }

    /**
     * Clear member.
     */
    public void unsetMember() {
        this.member = null;
    }

    /**
     * Check to see if member is set.
     *
     * @return true if member is set.
     */
    public boolean isSetMember() {
        return member != null && !member.isEmpty();
    }

    /**
     * Add values for member, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.InboundShipmentPlan} object.
     */
    public InboundShipmentPlanList withMember(InboundShipmentPlan... values) {
        List<InboundShipmentPlan> list = getMember();
        for (InboundShipmentPlan value : values) {
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
        member = r.readList("member", InboundShipmentPlan.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("member", member);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InboundShipmentPlanList",this);
    }


    /**
     * Value constructor.
     *
     * @param member a {@link java.util.List} object.
     */
    public InboundShipmentPlanList(List<InboundShipmentPlan> member) {
        this.member = member;
    }

    /**
     * Default constructor.
     */
    public InboundShipmentPlanList() {
        super();
    }

}
