

# Creator

The section that contains details of a recruiter who submitted this background check order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the recruiter who created the background check order. |  [optional] |
|**personId** | **String** | The recruiter id in the core HR system. |  [optional] |
|**createdAt** | **String** | The date of this user creation date. |  [optional] |
|**integrationUserId** | **String** | The alternative user id that can be used in third-party vendors’ integrations. Returned only for users with the “recruiter”, “hiring-manager”, or “recruiting-administrator” role. |  [optional] |
|**isInternal** | **Boolean** | A flag indicating whether the recruiter is an internal employee.  |  [optional] |
|**isActive** | **Boolean** | A flag indicating whether the recruiter is an active employee. Can only be specified when is_internal is true. |  [optional] |
|**preferredLocale** | [**CreatorPreferredLocale**](CreatorPreferredLocale.md) |  |  [optional] |
|**name** | [**List&lt;Name&gt;**](Name.md) |  |  [optional] |
|**contactInfo** | [**List&lt;ContactInfo&gt;**](ContactInfo.md) |  |  [optional] |
|**roles** | **List&lt;Object&gt;** |  |  [optional] |
|**hyperlinks** | [**List&lt;Hyperlinks&gt;**](Hyperlinks.md) |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**links** | [**List&lt;Links&gt;**](Links.md) |  |  [optional] |
|**backgroundCheckIntegration** | [**CreatorBackgroundCheckIntegration**](CreatorBackgroundCheckIntegration.md) |  |  [optional] |



