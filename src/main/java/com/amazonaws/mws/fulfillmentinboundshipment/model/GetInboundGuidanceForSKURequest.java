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
 * Get Inbound Guidance For SKU Request
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetInboundGuidanceForSKURequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetInboundGuidanceForSKURequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerSKUList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}SellerSKUList"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name="GetInboundGuidanceForSKURequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "sellerSKUList",
    "marketplaceId"
})
@XmlRootElement(name = "GetInboundGuidanceForSKURequest")
public class GetInboundGuidanceForSKURequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="SellerSKUList",required=true)
    private SellerSKUList sellerSKUList;

    @XmlElement(name="MarketplaceId",required=true)
    private String marketplaceId;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     * @return This instance.
     */
    public GetInboundGuidanceForSKURequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     * @return This instance.
     */
    public GetInboundGuidanceForSKURequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of SellerSKUList.
     *
     * @return The value of SellerSKUList.
     */
    public SellerSKUList getSellerSKUList() {
        return sellerSKUList;
    }

    /**
     * Set the value of SellerSKUList.
     *
     * @param sellerSKUList
     *            The new value to set.
     */
    public void setSellerSKUList(SellerSKUList sellerSKUList) {
        this.sellerSKUList = sellerSKUList;
    }

    /**
     * Check to see if SellerSKUList is set.
     *
     * @return true if SellerSKUList is set.
     */
    public boolean isSetSellerSKUList() {
        return sellerSKUList != null;
    }

    /**
     * Set the value of SellerSKUList, return this.
     *
     * @param sellerSKUList
     *             The new value to set.
     * @return This instance.
     */
    public GetInboundGuidanceForSKURequest withSellerSKUList(SellerSKUList sellerSKUList) {
        this.sellerSKUList = sellerSKUList;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     * @return This instance.
     */
    public GetInboundGuidanceForSKURequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        sellerSKUList = r.read("SellerSKUList", SellerSKUList.class);
        marketplaceId = r.read("MarketplaceId", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("SellerSKUList", sellerSKUList);
        w.write("MarketplaceId", marketplaceId);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetInboundGuidanceForSKURequest",this);
    }

    /**
     * Value constructor.
     *
     * @param sellerId a {@link java.lang.String} object.
     * @param sellerSKUList a {@link com.amazonaws.mws.fulfillmentinboundshipment.model.SellerSKUList} object.
     * @param marketplaceId a {@link java.lang.String} object.
     */
    public GetInboundGuidanceForSKURequest(String sellerId,SellerSKUList sellerSKUList,String marketplaceId) {
        this.sellerId = sellerId;
        this.sellerSKUList = sellerSKUList;
        this.marketplaceId = marketplaceId;
    }    

    /**
     * Default constructor.
     */
    public GetInboundGuidanceForSKURequest() {
        super();
    }

}
