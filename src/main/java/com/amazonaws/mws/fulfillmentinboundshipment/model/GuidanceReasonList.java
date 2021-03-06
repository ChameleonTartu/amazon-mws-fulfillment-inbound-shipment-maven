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
 * Guidance Reason List
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
 * GuidanceReasonList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GuidanceReasonList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GuidanceReason" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
@XmlType(name="GuidanceReasonList", propOrder={
    "guidanceReason"
})
@XmlRootElement(name = "GuidanceReasonList")
public class GuidanceReasonList extends AbstractMwsObject {

    @XmlElement(name="GuidanceReason")
    private List<String> guidanceReason;

    /**
     * Get the value of GuidanceReason.
     *
     * @return The value of GuidanceReason.
     */
    public List<String> getGuidanceReason() {
        if (guidanceReason==null) {
            guidanceReason = new ArrayList<String>();
        }
        return guidanceReason;
    }

    /**
     * Set the value of GuidanceReason.
     *
     * @param guidanceReason
     *            The new value to set.
     */
    public void setGuidanceReason(List<String> guidanceReason) {
        this.guidanceReason = guidanceReason;
    }

    /**
     * Clear GuidanceReason.
     */
    public void unsetGuidanceReason() {
        this.guidanceReason = null;
    }

    /**
     * Check to see if GuidanceReason is set.
     *
     * @return true if GuidanceReason is set.
     */
    public boolean isSetGuidanceReason() {
        return guidanceReason != null && !guidanceReason.isEmpty();
    }

    /**
     * Add values for GuidanceReason, return this.
     *
     * @return This instance.
     * @param values a {@link java.lang.String} object.
     */
    public GuidanceReasonList withGuidanceReason(String... values) {
        List<String> list = getGuidanceReason();
        for (String value : values) {
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
        guidanceReason = r.readList("GuidanceReason", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("GuidanceReason", guidanceReason);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GuidanceReasonList",this);
    }


    /**
     * Default constructor.
     */
    public GuidanceReasonList() {
        super();
    }

}
