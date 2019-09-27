# SentimentAnalysisApiApi

All URIs are relative to *https://brainrexapi.appspot.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sentimentGetPriceSentiment**](SentimentAnalysisApiApi.md#sentimentGetPriceSentiment) | **POST** /get_buy_sentiment | Sentiment analysis score using a model trained for buy signals.
[**sentimentGetSentiment**](SentimentAnalysisApiApi.md#sentimentGetSentiment) | **POST** /get_sentiment | Sentiment analysis for any given blob of text


<a name="sentimentGetPriceSentiment"></a>
# **sentimentGetPriceSentiment**
> String sentimentGetPriceSentiment(text)

Sentiment analysis score using a model trained for buy signals.

Gives a 0 to 1 score, depending on buy/sell sentiment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SentimentAnalysisApiApi;


SentimentAnalysisApiApi apiInstance = new SentimentAnalysisApiApi();
Text2 text = new Text2(); // Text2 | String of text to be analyzed. I can be in any language.
try {
    String result = apiInstance.sentimentGetPriceSentiment(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SentimentAnalysisApiApi#sentimentGetPriceSentiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | [**Text2**](Text2.md)| String of text to be analyzed. I can be in any language. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sentimentGetSentiment"></a>
# **sentimentGetSentiment**
> String sentimentGetSentiment(text)

Sentiment analysis for any given blob of text

Gives a -1 to 1 score, depending on bearish/bullish sentiment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SentimentAnalysisApiApi;


SentimentAnalysisApiApi apiInstance = new SentimentAnalysisApiApi();
Text1 text = new Text1(); // Text1 | String of text to be analyzed. I can be in any language.
try {
    String result = apiInstance.sentimentGetSentiment(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SentimentAnalysisApiApi#sentimentGetSentiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | [**Text1**](Text1.md)| String of text to be analyzed. I can be in any language. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

