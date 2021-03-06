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
 * Non Partnered Small Parcel Data Output
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * NonPartneredSmallParcelDataOutput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="NonPartneredSmallParcelDataOutput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PackageList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}NonPartneredSmallParcelPackageOutputList"/&gt;
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
@XmlType(name="NonPartneredSmallParcelDataOutput", propOrder={
    "packageList"
})
@XmlRootElement(name = "NonPartneredSmallParcelDataOutput")
public class NonPartneredSmallParcelDataOutput extends AbstractMwsObject {

    @XmlElement(name="PackageList",required=true)
    private NonPartneredSmallParcelPackageOutputList packageList;

    /**
     * Get the value of PackageList.
     *
     * @return The value of PackageList.
     */
    public NonPartneredSmallParcelPackageOutputList getPackageList() {
        return packageList;
    }

    /**
     * Set the value of PackageList.
     *
     * @param packageList
     *            The new value to set.
     */
    public void setPackageList(NonPartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
    }

    /**
     * Check to see if PackageList is set.
     *
     * @return true if PackageList is set.
     */
    public boolean isSetPackageList() {
        return packageList != null;
    }

    /**
     * Set the value of PackageList, return this.
     *
     * @param packageList
     *             The new value to set.
     * @return This instance.
     */
    public NonPartneredSmallParcelDataOutput withPackageList(NonPartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        packageList = r.read("PackageList", NonPartneredSmallParcelPackageOutputList.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PackageList", packageList);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "NonPartneredSmallParcelDataOutput",this);
    }

    /**
     * Value constructor.
     *
     * @param packageList a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.NonPartneredSmallParcelPackageOutputList} object.
     */
    public NonPartneredSmallParcelDataOutput(NonPartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
    }    

    /**
     * Default constructor.
     */
    public NonPartneredSmallParcelDataOutput() {
        super();
    }

}
