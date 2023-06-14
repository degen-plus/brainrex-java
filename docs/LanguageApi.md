# LanguageApi

All URIs are relative to *https://api.brainrex.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageGetCryptoEntities**](LanguageApi.md#languageGetCryptoEntities) | **POST** /entity/get_crypto_entities | Extracts known crypto entities like coin names, exchanges, media from text.
[**languageGetGeneralSentiment**](LanguageApi.md#languageGetGeneralSentiment) | **POST** /sentiment/get_general_sentiment | Returns a -1 to 1 score, depending on positive/negative sentiment
[**languageGetPriceSentiment**](LanguageApi.md#languageGetPriceSentiment) | **POST** /language/get_price_sentiment | Sentiment analysis score using a model trained for buy signals.

<a name="languageGetCryptoEntities"></a>
# **languageGetCryptoEntities**
> languageGetCryptoEntities(body)

Extracts known crypto entities like coin names, exchanges, media from text.

The Crypto Entities endpoint ingests written MIT Digital Currency Initiative Paper A paper describing how our sentiment and entity analyzer are built. And how the can be used for trading several cryptocurrencies successfully  We prove that using sentiment only as a input to a trading algorithm can be profitable. If combined with other machine learning models. We descri This Paper could be published in MIT Crypto Economics Journal . . &lt;br&gt;&lt;br&gt; Our AI selects from several models, choosing the one that fits the given data best, and we give you the avality to customize the sensitivy of the model. Our model has been trained to recognize anomalies in popular blockchain networks e.g. Bitcoin, Ethereum, learning from past events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LanguageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

LanguageApi apiInstance = new LanguageApi();
Text body = new Text(); // Text | String of text to be analyze for investor sentiment.
try {
    apiInstance.languageGetCryptoEntities(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageApi#languageGetCryptoEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Text**](Text.md)| String of text to be analyze for investor sentiment. |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="languageGetGeneralSentiment"></a>
# **languageGetGeneralSentiment**
> String languageGetGeneralSentiment(body)

Returns a -1 to 1 score, depending on positive/negative sentiment

This endpoints returns a score from -1 to +1 where depending on negative or positive attitude in the text.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LanguageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

LanguageApi apiInstance = new LanguageApi();
Text body = new Text(); // Text | String of text to be analyze for general sentiment.
try {
    String result = apiInstance.languageGetGeneralSentiment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageApi#languageGetGeneralSentiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Text**](Text.md)| String of text to be analyze for general sentiment. |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="languageGetPriceSentiment"></a>
# **languageGetPriceSentiment**
> String languageGetPriceSentiment(body)

Sentiment analysis score using a model trained for buy signals.

Gives a 0 to 1 score, depending on buy/sell sentiment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LanguageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

LanguageApi apiInstance = new LanguageApi();
Text body = new Text(); // Text | String of text to be analyze for investor sentiment.
try {
    String result = apiInstance.languageGetPriceSentiment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageApi#languageGetPriceSentiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Text**](Text.md)| String of text to be analyze for investor sentiment. |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

