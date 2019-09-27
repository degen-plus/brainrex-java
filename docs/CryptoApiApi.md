# CryptoApiApi

All URIs are relative to *https://brainrexapi.appspot.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exchangesDownloadCandles**](CryptoApiApi.md#exchangesDownloadCandles) | **POST** /download_candles | Downloads candle format market data
[**exchangesList**](CryptoApiApi.md#exchangesList) | **GET** /markets | The markets data structure supported by the Brainrex Market API
[**exchangesMarketmaker**](CryptoApiApi.md#exchangesMarketmaker) | **POST** /market_making | Download raw ticker data from major crypto markets
[**exchangesRead**](CryptoApiApi.md#exchangesRead) | **GET** /exchanges | The exchanges data structure supported by the Brainrex API
[**exchangesTickerDataDownload**](CryptoApiApi.md#exchangesTickerDataDownload) | **POST** /download_ticker | Download raw ticker data from major crypto markets


<a name="exchangesDownloadCandles"></a>
# **exchangesDownloadCandles**
> exchangesDownloadCandles(request)

Downloads candle format market data

Returns a list of candle data from specified market and data range

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CryptoApiApi;


CryptoApiApi apiInstance = new CryptoApiApi();
Request2 request = new Request2(); // Request2 | Person to create
try {
    apiInstance.exchangesDownloadCandles(request);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoApiApi#exchangesDownloadCandles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Request2**](Request2.md)| Person to create |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exchangesList"></a>
# **exchangesList**
> List&lt;Object&gt; exchangesList()

The markets data structure supported by the Brainrex Market API

Read the list of supported markets ( currency pairs ) in each exchange

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CryptoApiApi;


CryptoApiApi apiInstance = new CryptoApiApi();
try {
    List<Object> result = apiInstance.exchangesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoApiApi#exchangesList");
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

<a name="exchangesMarketmaker"></a>
# **exchangesMarketmaker**
> String exchangesMarketmaker(request)

Download raw ticker data from major crypto markets

Downloads specified asset class and market and time frame. Of our raw ticker data format

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CryptoApiApi;


CryptoApiApi apiInstance = new CryptoApiApi();
Request3 request = new Request3(); // Request3 | Person to create
try {
    String result = apiInstance.exchangesMarketmaker(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoApiApi#exchangesMarketmaker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Request3**](Request3.md)| Person to create |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exchangesRead"></a>
# **exchangesRead**
> List&lt;Object&gt; exchangesRead()

The exchanges data structure supported by the Brainrex API

Read the list of supported exchanges in the Market Data API

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CryptoApiApi;


CryptoApiApi apiInstance = new CryptoApiApi();
try {
    List<Object> result = apiInstance.exchangesRead();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoApiApi#exchangesRead");
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

<a name="exchangesTickerDataDownload"></a>
# **exchangesTickerDataDownload**
> String exchangesTickerDataDownload(request)

Download raw ticker data from major crypto markets

Downloads specified asset class and market and time frame. Of our raw ticker data format

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CryptoApiApi;


CryptoApiApi apiInstance = new CryptoApiApi();
Request1 request = new Request1(); // Request1 | Person to create
try {
    String result = apiInstance.exchangesTickerDataDownload(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoApiApi#exchangesTickerDataDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Request1**](Request1.md)| Person to create |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

