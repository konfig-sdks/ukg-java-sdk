

# BusinessRuleImportFileStagingStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stagingId** | **UUID** |  |  [optional] |
|**fileProcessDate** | **OffsetDateTime** |  |  [optional] |
|**serviceSubmittalDate** | **OffsetDateTime** |  |  [optional] |
|**lastRepostDate** | **OffsetDateTime** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**transaction** | **String** |  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**messages** | [**List&lt;BusinessRuleImportMessage&gt;**](BusinessRuleImportMessage.md) |  |  [optional] |
|**childTransactionStatuses** | [**List&lt;ChildTransactionStatusesEnum&gt;**](#List&lt;ChildTransactionStatusesEnum&gt;) |  |  [optional] |



## Enum: List&lt;ChildTransactionStatusesEnum&gt;

| Name | Value |
|---- | -----|
| BUSINESSRULEIMPORTFILESTAGINGSTATUS_OBJECT | &quot;BusinessRuleImportFileStagingStatus object&quot; |



