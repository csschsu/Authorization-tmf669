# NotificationListenersClientSideApi

All URIs are relative to *https://serverRoot/tmf-api/partyRoleManagement/v4/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listenToPartyRoleAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToPartyRoleAttributeValueChangeEvent) | **POST** /listener/partyRoleAttributeValueChangeEvent | Client listener for entity PartyRoleAttributeValueChangeEvent
[**listenToPartyRoleCreateEvent**](NotificationListenersClientSideApi.md#listenToPartyRoleCreateEvent) | **POST** /listener/partyRoleCreateEvent | Client listener for entity PartyRoleCreateEvent
[**listenToPartyRoleDeleteEvent**](NotificationListenersClientSideApi.md#listenToPartyRoleDeleteEvent) | **POST** /listener/partyRoleDeleteEvent | Client listener for entity PartyRoleDeleteEvent
[**listenToPartyRoleStateChangeEvent**](NotificationListenersClientSideApi.md#listenToPartyRoleStateChangeEvent) | **POST** /listener/partyRoleStateChangeEvent | Client listener for entity PartyRoleStateChangeEvent

<a name="listenToPartyRoleAttributeValueChangeEvent"></a>
# **listenToPartyRoleAttributeValueChangeEvent**
> EventSubscription listenToPartyRoleAttributeValueChangeEvent(body)

Client listener for entity PartyRoleAttributeValueChangeEvent

Example of a client listener for receiving the notification PartyRoleAttributeValueChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
PartyRoleAttributeValueChangeEvent body = new PartyRoleAttributeValueChangeEvent(); // PartyRoleAttributeValueChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToPartyRoleAttributeValueChangeEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToPartyRoleAttributeValueChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartyRoleAttributeValueChangeEvent**](PartyRoleAttributeValueChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToPartyRoleCreateEvent"></a>
# **listenToPartyRoleCreateEvent**
> EventSubscription listenToPartyRoleCreateEvent(body)

Client listener for entity PartyRoleCreateEvent

Example of a client listener for receiving the notification PartyRoleCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
PartyRoleCreateEvent body = new PartyRoleCreateEvent(); // PartyRoleCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToPartyRoleCreateEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToPartyRoleCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartyRoleCreateEvent**](PartyRoleCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToPartyRoleDeleteEvent"></a>
# **listenToPartyRoleDeleteEvent**
> EventSubscription listenToPartyRoleDeleteEvent(body)

Client listener for entity PartyRoleDeleteEvent

Example of a client listener for receiving the notification PartyRoleDeleteEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
PartyRoleDeleteEvent body = new PartyRoleDeleteEvent(); // PartyRoleDeleteEvent | The event data
try {
    EventSubscription result = apiInstance.listenToPartyRoleDeleteEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToPartyRoleDeleteEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartyRoleDeleteEvent**](PartyRoleDeleteEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToPartyRoleStateChangeEvent"></a>
# **listenToPartyRoleStateChangeEvent**
> EventSubscription listenToPartyRoleStateChangeEvent(body)

Client listener for entity PartyRoleStateChangeEvent

Example of a client listener for receiving the notification PartyRoleStateChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
PartyRoleStateChangeEvent body = new PartyRoleStateChangeEvent(); // PartyRoleStateChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToPartyRoleStateChangeEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToPartyRoleStateChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartyRoleStateChangeEvent**](PartyRoleStateChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

