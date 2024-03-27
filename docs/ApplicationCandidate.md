

# ApplicationCandidate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the candidate who has applied to an opportunity. |  [optional] |
|**isInrernal** | **Boolean** | A flag indicating whether the candidate is an internal employee.  |  [optional] |
|**isActive** | **Boolean** | A flag indicating whether the candidate is an active employee. Can only be specified when is_internal is true. |  [optional] |
|**name** | [**List&lt;Name&gt;**](Name.md) | The candidate name section. Captured at the moment of application submission. May be different from the one in the Candidate section |  [optional] |



