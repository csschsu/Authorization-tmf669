# PartyRoleCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles. | 
**status** | **String** | Used to track the lifecycle status of the party role. |  [optional]
**statusReason** | **String** | A string providing an explanation on the value of the status lifecycle. For instance if the status is Rejected, statusReason will provide the reason for rejection. |  [optional]
**account** | [**List&lt;AccountRef&gt;**](AccountRef.md) |  |  [optional]
**agreement** | [**List&lt;AgreementRef&gt;**](AgreementRef.md) |  |  [optional]
**characteristic** | [**List&lt;Characteristic&gt;**](Characteristic.md) | Describes the characteristic of a party role. |  [optional]
**contactMedium** | [**List&lt;ContactMedium&gt;**](ContactMedium.md) |  |  [optional]
**creditProfile** | [**List&lt;CreditProfile&gt;**](CreditProfile.md) |  |  [optional]
**engagedParty** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**paymentMethod** | [**List&lt;PaymentMethodRef&gt;**](PaymentMethodRef.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
