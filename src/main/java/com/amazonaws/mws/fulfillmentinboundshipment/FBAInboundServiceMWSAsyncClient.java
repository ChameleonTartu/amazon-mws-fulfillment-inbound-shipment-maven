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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * <p>FBAInboundServiceMWSAsyncClient class.</p>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class FBAInboundServiceMWSAsyncClient extends FBAInboundServiceMWSClient implements FBAInboundServiceMWSAsync {

    /**
     * <p>Constructor for FBAInboundServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinboundshipment.FBAInboundServiceMWSConfig} object.
     * @param executor a {@link java.util.concurrent.ExecutorService} object.
     */
    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInboundServiceMWSConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    /**
     * <p>Constructor for FBAInboundServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinboundshipment.FBAInboundServiceMWSConfig} object.
     */
    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInboundServiceMWSConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    /**
     * <p>Constructor for FBAInboundServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinboundshipment.FBAInboundServiceMWSConfig} object.
     */
    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            FBAInboundServiceMWSConfig config) {
        super(accessKey, secretKey, config);
    }

    /**
     * <p>Constructor for FBAInboundServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    /** {@inheritDoc} */
    public Future<ConfirmPreorderResponse> confirmPreorderAsync(
        ConfirmPreorderRequest request) {
        return connection.callAsync(
            new RequestType("ConfirmPreorder", ConfirmPreorderResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ConfirmTransportRequestResponse> confirmTransportRequestAsync(
        ConfirmTransportInputRequest request) {
        return connection.callAsync(
            new RequestType("ConfirmTransportRequest", ConfirmTransportRequestResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<CreateInboundShipmentResponse> createInboundShipmentAsync(
        CreateInboundShipmentRequest request) {
        return connection.callAsync(
            new RequestType("CreateInboundShipment", CreateInboundShipmentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<CreateInboundShipmentPlanResponse> createInboundShipmentPlanAsync(
        CreateInboundShipmentPlanRequest request) {
        return connection.callAsync(
            new RequestType("CreateInboundShipmentPlan", CreateInboundShipmentPlanResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<EstimateTransportRequestResponse> estimateTransportRequestAsync(
        EstimateTransportInputRequest request) {
        return connection.callAsync(
            new RequestType("EstimateTransportRequest", EstimateTransportRequestResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetBillOfLadingResponse> getBillOfLadingAsync(
        GetBillOfLadingRequest request) {
        return connection.callAsync(
            new RequestType("GetBillOfLading", GetBillOfLadingResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetInboundGuidanceForASINResponse> getInboundGuidanceForASINAsync(
        GetInboundGuidanceForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetInboundGuidanceForASIN", GetInboundGuidanceForASINResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetInboundGuidanceForSKUResponse> getInboundGuidanceForSKUAsync(
        GetInboundGuidanceForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetInboundGuidanceForSKU", GetInboundGuidanceForSKUResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetPackageLabelsResponse> getPackageLabelsAsync(
        GetPackageLabelsRequest request) {
        return connection.callAsync(
            new RequestType("GetPackageLabels", GetPackageLabelsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetPalletLabelsResponse> getPalletLabelsAsync(
        GetPalletLabelsRequest request) {
        return connection.callAsync(
            new RequestType("GetPalletLabels", GetPalletLabelsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetPreorderInfoResponse> getPreorderInfoAsync(
        GetPreorderInfoRequest request) {
        return connection.callAsync(
            new RequestType("GetPreorderInfo", GetPreorderInfoResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetPrepInstructionsForASINResponse> getPrepInstructionsForASINAsync(
        GetPrepInstructionsForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetPrepInstructionsForASIN", GetPrepInstructionsForASINResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetPrepInstructionsForSKUResponse> getPrepInstructionsForSKUAsync(
        GetPrepInstructionsForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetPrepInstructionsForSKU", GetPrepInstructionsForSKUResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetTransportContentResponse> getTransportContentAsync(
        GetTransportContentRequest request) {
        return connection.callAsync(
            new RequestType("GetTransportContent", GetTransportContentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetUniquePackageLabelsResponse> getUniquePackageLabelsAsync(
        GetUniquePackageLabelsRequest request) {
        return connection.callAsync(
            new RequestType("GetUniquePackageLabels", GetUniquePackageLabelsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListInboundShipmentItemsResponse> listInboundShipmentItemsAsync(
        ListInboundShipmentItemsRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipmentItems", ListInboundShipmentItemsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListInboundShipmentItemsByNextTokenResponse> listInboundShipmentItemsByNextTokenAsync(
        ListInboundShipmentItemsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipmentItemsByNextToken", ListInboundShipmentItemsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListInboundShipmentsResponse> listInboundShipmentsAsync(
        ListInboundShipmentsRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipments", ListInboundShipmentsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListInboundShipmentsByNextTokenResponse> listInboundShipmentsByNextTokenAsync(
        ListInboundShipmentsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipmentsByNextToken", ListInboundShipmentsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<PutTransportContentResponse> putTransportContentAsync(
        PutTransportContentRequest request) {
        return connection.callAsync(
            new RequestType("PutTransportContent", PutTransportContentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<UpdateInboundShipmentResponse> updateInboundShipmentAsync(
        UpdateInboundShipmentRequest request) {
        return connection.callAsync(
            new RequestType("UpdateInboundShipment", UpdateInboundShipmentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<VoidTransportRequestResponse> voidTransportRequestAsync(
        VoidTransportInputRequest request) {
        return connection.callAsync(
            new RequestType("VoidTransportRequest", VoidTransportRequestResponse.class, servicePath),
            request);
    }


}
