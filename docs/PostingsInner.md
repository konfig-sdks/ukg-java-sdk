

# PostingsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | [**Translations**](Translations.md) |  |  [optional] |
|**description** | [**PostingsInnerDescription**](PostingsInnerDescription.md) |  |  [optional] |
|**id** | **String** | The unique Job Posting Id (GUID). |  [optional] |
|**tenant** | [**PostingsInnerTenant**](PostingsInnerTenant.md) |  |  [optional] |
|**opportunity** | [**PostingsInnerOpportunity**](PostingsInnerOpportunity.md) |  |  [optional] |
|**updatedAt** | **String** | Time stamp of last update to posting |  [optional] |
|**createdAt** | **String** | Time stamp of posting creation |  [optional] |
|**requisitionNumber** | **String** | The customer-defined number associated with the Job Opportunity. |  [optional] |
|**defaultLocale** | [**PostingsInnerDefaultLocale**](PostingsInnerDefaultLocale.md) |  |  [optional] |
|**compensation** | **String** | Job Posting compensation details. |  [optional] |
|**jobFamily** | [**PostingsInnerJobFamily**](PostingsInnerJobFamily.md) |  |  [optional] |
|**locations** | [**List&lt;PostingsInnerLocationsInner&gt;**](PostingsInnerLocationsInner.md) |  |  [optional] |
|**locationsSummary** | **String** | The list of available locations delimited by semi-colon. The location fields within each location are delimited by comma.  |  [optional] |
|**company** | [**PostingsInnerCompany**](PostingsInnerCompany.md) |  |  [optional] |
|**isFeatured** | **Boolean** | Indicates if the Job Posting is published as a featured job on an UltiPro Recruiting job board. |  [optional] |
|**skillCriteria** | [**List&lt;PostingsInnerSkillCriteriaInner&gt;**](PostingsInnerSkillCriteriaInner.md) |  |  [optional] |
|**workExperienceCriteria** | [**List&lt;PostingsInnerWorkExperienceCriteriaInner&gt;**](PostingsInnerWorkExperienceCriteriaInner.md) |  |  [optional] |
|**educationCriteria** | [**List&lt;PostingsInnerEducationCriteriaInner&gt;**](PostingsInnerEducationCriteriaInner.md) |  |  [optional] |
|**licenseCriteria** | [**List&lt;PostingsInnerLicenseCriteriaInner&gt;**](PostingsInnerLicenseCriteriaInner.md) |  |  [optional] |
|**behaviorCriteria** | [**List&lt;PostingsInnerBehaviorCriteriaInner&gt;**](PostingsInnerBehaviorCriteriaInner.md) |  |  [optional] |
|**motivationCriteria** | [**List&lt;PostingsInnerMotivationCriteriaInner&gt;**](PostingsInnerMotivationCriteriaInner.md) |  |  [optional] |
|**publishDate** | **String** | Date in which posting was published |  [optional] |
|**locales** | [**List&lt;PostingsInnerLocalesInner&gt;**](PostingsInnerLocalesInner.md) |  |  [optional] |
|**recruitingApplyUrl** | **String** | The URL to the full job description on the UltiPro Recruiting job board. Should be mapped to the Job URL in the partner’s XML feed |  [optional] |
|**links** | [**List&lt;PostingsInnerLinksInner&gt;**](PostingsInnerLinksInner.md) |  |  [optional] |



