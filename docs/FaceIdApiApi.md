# FaceIdApiApi

All URIs are relative to *https://brainrexapi.appspot.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**faceidVerify**](FaceIdApiApi.md#faceidVerify) | **POST** /verifyID | Verify costumer identity by biometric recognition


<a name="faceidVerify"></a>
# **faceidVerify**
> String faceidVerify(text)

Verify costumer identity by biometric recognition

Gives a -0 to 1 score, depending on bearish/bullish sentiment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaceIdApiApi;


FaceIdApiApi apiInstance = new FaceIdApiApi();
Text text = new Text(); // Text | Selfie image to be checked against uploaded id.
try {
    String result = apiInstance.faceidVerify(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceIdApiApi#faceidVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | [**Text**](Text.md)| Selfie image to be checked against uploaded id. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

