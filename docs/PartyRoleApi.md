# PartyRoleApi

All URIs are relative to *https://serverRoot/tmf-api/partyRoleManagement/v4/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPartyRole**](PartyRoleApi.md#createPartyRole) | **POST** /partyRole | Creates a PartyRole
[**deletePartyRole**](PartyRoleApi.md#deletePartyRole) | **DELETE** /partyRole/{id} | Deletes a PartyRole
[**listPartyRole**](PartyRoleApi.md#listPartyRole) | **GET** /partyRole | List or find PartyRole objects
[**patchPartyRole**](PartyRoleApi.md#patchPartyRole) | **PATCH** /partyRole/{id} | Updates partially a PartyRole
[**retrievePartyRole**](PartyRoleApi.md#retrievePartyRole) | **GET** /partyRole/{id} | Retrieves a PartyRole by ID

<a name="createPartyRole"></a>
# **createPartyRole**
> PartyRole createPartyRole(body)

Creates a PartyRole

This operation creates a PartyRole entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyRoleApi;


PartyRoleApi apiInstance = new PartyRoleApi();
PartyRoleCreate body = new PartyRoleCreate(); // PartyRoleCreate | The PartyRole to be created
try {
    PartyRole result = apiInstance.createPartyRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyRoleApi#createPartyRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartyRoleCreate**](PartyRoleCreate.md)| The PartyRole to be created |

### Return type

[**PartyRole**](PartyRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deletePartyRole"></a>
# **deletePartyRole**
> deletePartyRole(id)

Deletes a PartyRole

This operation deletes a PartyRole entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyRoleApi;


PartyRoleApi apiInstance = new PartyRoleApi();
String id = "id_example"; // String | Identifier of the PartyRole
try {
    apiInstance.deletePartyRole(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyRoleApi#deletePartyRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the PartyRole |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="listPartyRole"></a>
# **listPartyRole**
> List&lt;PartyRole&gt; listPartyRole(fields, offset, limit)

List or find PartyRole objects

This operation list or find PartyRole entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyRoleApi;


PartyRoleApi apiInstance = new PartyRoleApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<PartyRole> result = apiInstance.listPartyRole(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyRoleApi#listPartyRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional]
 **limit** | **Integer**| Requested number of resources to be provided in response | [optional]

### Return type

[**List&lt;PartyRole&gt;**](PartyRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchPartyRole"></a>
# **patchPartyRole**
> PartyRole patchPartyRole(body, id)

Updates partially a PartyRole

This operation updates partially a PartyRole entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyRoleApi;


PartyRoleApi apiInstance = new PartyRoleApi();
PartyRoleUpdate body = new PartyRoleUpdate(); // PartyRoleUpdate | The PartyRole to be updated
String id = "id_example"; // String | Identifier of the PartyRole
try {
    PartyRole result = apiInstance.patchPartyRole(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyRoleApi#patchPartyRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartyRoleUpdate**](PartyRoleUpdate.md)| The PartyRole to be updated |
 **id** | **String**| Identifier of the PartyRole |

### Return type

[**PartyRole**](PartyRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrievePartyRole"></a>
# **retrievePartyRole**
> PartyRole retrievePartyRole(id, fields)

Retrieves a PartyRole by ID

This operation retrieves a PartyRole entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyRoleApi;


PartyRoleApi apiInstance = new PartyRoleApi();
String id = "id_example"; // String | Identifier of the PartyRole
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    PartyRole result = apiInstance.retrievePartyRole(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyRoleApi#retrievePartyRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the PartyRole |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**PartyRole**](PartyRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

