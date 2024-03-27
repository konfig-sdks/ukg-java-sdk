

# Candidate

The section with details of a candidate whom the background check order is requested for

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the candidate for whom the background check order has been requested. |  [optional] |
|**createdAt** | **String** | The candidate creation date. |  [optional] |
|**creatorId** | **String** | The id of the person who has created the application. |  [optional] |
|**personId** | **String** | The candidate id in the core HR system. |  [optional] |
|**integration** | **String** | The alternative user id that can be used in third-party vendors’ integrations. Returned only for users with the “recruiter”, “hiring-manager”, or “recruiting-administrator” role. |  [optional] |
|**isInternal** | **String** | A flag indicating whether the candidate is an internal employee.  |  [optional] |
|**isActive** | **String** | A flag indicating whether the candidate is an active employee. Can only be specified when is_internal is true. |  [optional] |
|**isWillingToRelocate** | **String** | A flag indicating whether the candidate is willing to relocate.  |  [optional] |
|**preferredLocale** | [**CandidatePreferredLocale**](CandidatePreferredLocale.md) |  |  [optional] |
|**name** | [**List&lt;Name&gt;**](Name.md) |  |  [optional] |
|**contactInfo** | [**List&lt;ContactInfo&gt;**](ContactInfo.md) |  |  [optional] |
|**skills** | [**List&lt;Skill&gt;**](Skill.md) | An array containing candidate’s skills. |  [optional] |
|**workExperience** | [**List&lt;Workexperience&gt;**](Workexperience.md) |  |  [optional] |
|**educations** | [**List&lt;Educations&gt;**](Educations.md) |  |  [optional] |
|**licenses** | [**List&lt;Licenses&gt;**](Licenses.md) |  |  [optional] |
|**behaviors** | [**List&lt;Behaviors&gt;**](Behaviors.md) |  |  [optional] |
|**motivations** | [**List&lt;Motivations&gt;**](Motivations.md) |  |  [optional] |
|**roles** | **List&lt;Object&gt;** | An array of  user roles associated with this candidate:  recruiter  hiring-manager  onboarding-owner  recruiting-administrator  |  [optional] |
|**hyperlinks** | [**List&lt;Hyperlinks&gt;**](Hyperlinks.md) |  |  [optional] |
|**updatedAt** | **String** | The last updated date. |  [optional] |
|**orgUnits** | **Object** |  |  [optional] |
|**links** | [**List&lt;Links&gt;**](Links.md) |  |  [optional] |



