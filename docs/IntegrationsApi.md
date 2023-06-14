# IntegrationsApi

All URIs are relative to *https://api.brainrex.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cryptoGetCandleData**](IntegrationsApi.md#cryptoGetCandleData) | **POST** /crypto/get_candles | Downloads candle format market data
[**cryptoGetExchangeAssets**](IntegrationsApi.md#cryptoGetExchangeAssets) | **POST** /crypto/get_exchange_assets | Gets all coin pairs traded in specified exchange
[**cryptoGetOrderbooks**](IntegrationsApi.md#cryptoGetOrderbooks) | **POST** /crypto/get_orderbooks | Returns the current state of the orderbook.
[**cryptoGetSupportedExchanges**](IntegrationsApi.md#cryptoGetSupportedExchanges) | **GET** /crypto/get_supported_exchanges | Gets all cryptocurrency exchanges supported by the Brainrex API
[**cryptoGetTicker**](IntegrationsApi.md#cryptoGetTicker) | **POST** /crypto/get_ticker | Downloads candle format market data

<a name="cryptoGetCandleData"></a>
# **cryptoGetCandleData**
> CandleResponse cryptoGetCandleData(body)

Downloads candle format market data

Returns a list of candle data from specified market and data range

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

IntegrationsApi apiInstance = new IntegrationsApi();
CandleRequest body = new CandleRequest(); // CandleRequest | The Get candles end point return market data in Open High Close Volume format. In order to use this endpoint you need to enter your API keys to your data provider in the console
try {
    CandleResponse result = apiInstance.cryptoGetCandleData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#cryptoGetCandleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CandleRequest**](CandleRequest.md)| The Get candles end point return market data in Open High Close Volume format. In order to use this endpoint you need to enter your API keys to your data provider in the console |

### Return type

[**CandleResponse**](CandleResponse.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cryptoGetExchangeAssets"></a>
# **cryptoGetExchangeAssets**
> ExchangeAssetsResponse cryptoGetExchangeAssets(body)

Gets all coin pairs traded in specified exchange

This endpoint returns all the Available currency pairs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

IntegrationsApi apiInstance = new IntegrationsApi();
Exchange body = new Exchange(); // Exchange | Name of the cryptocurrency exchange
try {
    ExchangeAssetsResponse result = apiInstance.cryptoGetExchangeAssets(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#cryptoGetExchangeAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Exchange**](Exchange.md)| Name of the cryptocurrency exchange |

### Return type

[**ExchangeAssetsResponse**](ExchangeAssetsResponse.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cryptoGetOrderbooks"></a>
# **cryptoGetOrderbooks**
> OrderbookResponse cryptoGetOrderbooks(body)

Returns the current state of the orderbook.

This endpoint returns the current state of the ordebook with a limit set by you. The maximun orderbook depth is 25.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

IntegrationsApi apiInstance = new IntegrationsApi();
OrderbookRequest body = new OrderbookRequest(); // OrderbookRequest | Exchange, trading pair and date rage for data
try {
    OrderbookResponse result = apiInstance.cryptoGetOrderbooks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#cryptoGetOrderbooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderbookRequest**](OrderbookRequest.md)| Exchange, trading pair and date rage for data |

### Return type

[**OrderbookResponse**](OrderbookResponse.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cryptoGetSupportedExchanges"></a>
# **cryptoGetSupportedExchanges**
> SupportedExchanges cryptoGetSupportedExchanges()

Gets all cryptocurrency exchanges supported by the Brainrex API

Returns a list of candle data from specified market and data range

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

IntegrationsApi apiInstance = new IntegrationsApi();
try {
    SupportedExchanges result = apiInstance.cryptoGetSupportedExchanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#cryptoGetSupportedExchanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SupportedExchanges**](SupportedExchanges.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoGetTicker"></a>
# **cryptoGetTicker**
> TickerResponse cryptoGetTicker(body)

Downloads candle format market data

Returns a list of candle data from specified market and data range

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

IntegrationsApi apiInstance = new IntegrationsApi();
Exchange body = new Exchange(); // Exchange | Get ticker data from specified crypto exchange
try {
    TickerResponse result = apiInstance.cryptoGetTicker(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#cryptoGetTicker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Exchange**](Exchange.md)| Get ticker data from specified crypto exchange |

### Return type

[**TickerResponse**](TickerResponse.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

