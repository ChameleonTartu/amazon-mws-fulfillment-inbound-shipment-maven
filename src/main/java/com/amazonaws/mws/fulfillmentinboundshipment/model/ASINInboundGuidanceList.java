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
 * ASIN Inbound Guidance List
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
 * ASINInboundGuidanceList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ASINInboundGuidanceList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASINInboundGuidance" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ASINInboundGuidance" maxOccurs="unbounded"/&gt;
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
@XmlType(name="ASINInboundGuidanceList", propOrder={
    "asinInboundGuidance"
})
@XmlRootElement(name = "ASINInboundGuidanceList")
public class ASINInboundGuidanceList extends AbstractMwsObject {

    @XmlElement(name="ASINInboundGuidance")
    private List<ASINInboundGuidance> asinInboundGuidance;

    /**
     * Get the value of ASINInboundGuidance.
     *
     * @return The value of ASINInboundGuidance.
     */
    public List<ASINInboundGuidance> getASINInboundGuidance() {
        if (asinInboundGuidance==null) {
            asinInboundGuidance = new ArrayList<ASINInboundGuidance>();
        }
        return asinInboundGuidance;
    }

    /**
     * Set the value of ASINInboundGuidance.
     *
     * @param asinInboundGuidance
     *            The new value to set.
     */
    public void setASINInboundGuidance(List<ASINInboundGuidance> asinInboundGuidance) {
        this.asinInboundGuidance = asinInboundGuidance;
    }

    /**
     * Clear ASINInboundGuidance.
     */
    public void unsetASINInboundGuidance() {
        this.asinInboundGuidance = null;
    }

    /**
     * Check to see if ASINInboundGuidance is set.
     *
     * @return true if ASINInboundGuidance is set.
     */
    public boolean isSetASINInboundGuidance() {
        return asinInboundGuidance != null && !asinInboundGuidance.isEmpty();
    }

    /**
     * Add values for ASINInboundGuidance, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.ASINInboundGuidance} object.
     */
    public ASINInboundGuidanceList withASINInboundGuidance(ASINInboundGuidance... values) {
        List<ASINInboundGuidance> list = getASINInboundGuidance();
        for (ASINInboundGuidance value : values) {
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
        asinInboundGuidance = r.readList("ASINInboundGuidance", ASINInboundGuidance.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ASINInboundGuidance", asinInboundGuidance);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ASINInboundGuidanceList",this);
    }


    /**
     * Default constructor.
     */
    public ASINInboundGuidanceList() {
        super();
    }

}
