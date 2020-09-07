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
 * FBA Inbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinboundshipment;

import com.amazonaws.mws.fulfillmentinboundshipment.model.*;
import com.amazonservices.mws.client.*;

/**
 * <p>FBAInboundServiceMWSClient class.</p>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class FBAInboundServiceMWSClient implements FBAInboundServiceMWS {

    private static final String libraryName = "FBAInboundServiceMWS";

    private static final String libraryVersion = "2016-10-05";

    protected String servicePath;

    protected final MwsConnection connection;

    /**
     * <p>Constructor for FBAInboundServiceMWSClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinboundshipment.FBAInboundServiceMWSConfig} object.
     */
    public FBAInboundServiceMWSClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInboundServiceMWSConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    /**
     * <p>Constructor for FBAInboundServiceMWSClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinboundshipment.FBAInboundServiceMWSConfig} object.
     */
    public FBAInboundServiceMWSClient(
            String accessKey,
            String secretKey,
            FBAInboundServiceMWSConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    /**
     * <p>Constructor for FBAInboundServiceMWSClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public FBAInboundServiceMWSClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new FBAInboundServiceMWSConfig());
    }

    /** {@inheritDoc} */
    public ConfirmPreorderResponse confirmPreorder(ConfirmPreorderRequest request) {
        return connection.call(
            new RequestType("ConfirmPreorder", ConfirmPreorderResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ConfirmTransportRequestResponse confirmTransportRequest(ConfirmTransportInputRequest request) {
        return connection.call(
            new RequestType("ConfirmTransportRequest", ConfirmTransportRequestResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public CreateInboundShipmentResponse createInboundShipment(CreateInboundShipmentRequest request) {
        return connection.call(
            new RequestType("CreateInboundShipment", CreateInboundShipmentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public CreateInboundShipmentPlanResponse createInboundShipmentPlan(CreateInboundShipmentPlanRequest request) {
        return connection.call(
            new RequestType("CreateInboundShipmentPlan", CreateInboundShipmentPlanResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public EstimateTransportRequestResponse estimateTransportRequest(EstimateTransportInputRequest request) {
        return connection.call(
            new RequestType("EstimateTransportRequest", EstimateTransportRequestResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetBillOfLadingResponse getBillOfLading(GetBillOfLadingRequest request) {
        return connection.call(
            new RequestType("GetBillOfLading", GetBillOfLadingResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetInboundGuidanceForASINResponse getInboundGuidanceForASIN(GetInboundGuidanceForASINRequest request) {
        return connection.call(
            new RequestType("GetInboundGuidanceForASIN", GetInboundGuidanceForASINResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetInboundGuidanceForSKUResponse getInboundGuidanceForSKU(GetInboundGuidanceForSKURequest request) {
        return connection.call(
            new RequestType("GetInboundGuidanceForSKU", GetInboundGuidanceForSKUResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetPackageLabelsResponse getPackageLabels(GetPackageLabelsRequest request) {
        return connection.call(
            new RequestType("GetPackageLabels", GetPackageLabelsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetPalletLabelsResponse getPalletLabels(GetPalletLabelsRequest request) {
        return connection.call(
            new RequestType("GetPalletLabels", GetPalletLabelsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetPreorderInfoResponse getPreorderInfo(GetPreorderInfoRequest request) {
        return connection.call(
            new RequestType("GetPreorderInfo", GetPreorderInfoResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetPrepInstructionsForASINResponse getPrepInstructionsForASIN(GetPrepInstructionsForASINRequest request) {
        return connection.call(
            new RequestType("GetPrepInstructionsForASIN", GetPrepInstructionsForASINResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetPrepInstructionsForSKUResponse getPrepInstructionsForSKU(GetPrepInstructionsForSKURequest request) {
        return connection.call(
            new RequestType("GetPrepInstructionsForSKU", GetPrepInstructionsForSKUResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetTransportContentResponse getTransportContent(GetTransportContentRequest request) {
        return connection.call(
            new RequestType("GetTransportContent", GetTransportContentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetUniquePackageLabelsResponse getUniquePackageLabels(GetUniquePackageLabelsRequest request) {
        return connection.call(
            new RequestType("GetUniquePackageLabels", GetUniquePackageLabelsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListInboundShipmentItemsResponse listInboundShipmentItems(ListInboundShipmentItemsRequest request) {
        return connection.call(
            new RequestType("ListInboundShipmentItems", ListInboundShipmentItemsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListInboundShipmentItemsByNextTokenResponse listInboundShipmentItemsByNextToken(ListInboundShipmentItemsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListInboundShipmentItemsByNextToken", ListInboundShipmentItemsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListInboundShipmentsResponse listInboundShipments(ListInboundShipmentsRequest request) {
        return connection.call(
            new RequestType("ListInboundShipments", ListInboundShipmentsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListInboundShipmentsByNextTokenResponse listInboundShipmentsByNextToken(ListInboundShipmentsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListInboundShipmentsByNextToken", ListInboundShipmentsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public PutTransportContentResponse putTransportContent(PutTransportContentRequest request) {
        return connection.call(
            new RequestType("PutTransportContent", PutTransportContentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public UpdateInboundShipmentResponse updateInboundShipment(UpdateInboundShipmentRequest request) {
        return connection.call(
            new RequestType("UpdateInboundShipment", UpdateInboundShipmentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public VoidTransportRequestResponse voidTransportRequest(VoidTransportInputRequest request) {
        return connection.call(
            new RequestType("VoidTransportRequest", VoidTransportRequestResponse.class, servicePath),
            request);
    }

    /**
     * <p>quoteAppName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    /**
     * <p>quoteAppVersion.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    /**
     * <p>quoteAttributeName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    /**
     * <p>quoteAttributeValue.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new FBAInboundServiceMWSException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
