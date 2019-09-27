# BlockchainApiApi

All URIs are relative to *https://brainrexapi.appspot.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockchainAverageTx**](BlockchainApiApi.md#blockchainAverageTx) | **POST** /average_tx_fee | Download raw ticker data from major crypto markets
[**blockchainList**](BlockchainApiApi.md#blockchainList) | **GET** /list_blockchain | The blockchains data structure supported by the Brainrex API


<a name="blockchainAverageTx"></a>
# **blockchainAverageTx**
> String blockchainAverageTx(request)

Download raw ticker data from major crypto markets

Downloads specified asset class and market and time frame. Of our raw ticker data format

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockchainApiApi;


BlockchainApiApi apiInstance = new BlockchainApiApi();
Request request = new Request(); // Request | Person to create
try {
    String result = apiInstance.blockchainAverageTx(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApiApi#blockchainAverageTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Request**](Request.md)| Person to create |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockchainList"></a>
# **blockchainList**
> List&lt;Object&gt; blockchainList()

The blockchains data structure supported by the Brainrex API

List of supported blockchains networks for analysis. The full history of the networks are available.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockchainApiApi;


BlockchainApiApi apiInstance = new BlockchainApiApi();
try {
    List<Object> result = apiInstance.blockchainList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApiApi#blockchainList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

