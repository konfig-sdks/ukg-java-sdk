

# WorkSummaryDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**empId** | **Long** |  |  [optional] |
|**workDate** | **OffsetDateTime** |  |  [optional] |
|**wrkMins** | **Long** |  |  [optional] |
|**authorized** | **Boolean** |  |  [optional] |
|**overtime** | **Boolean** | true if work summary contain details with an overtime hour type |  [optional] |
|**absent** | **Boolean** | true if LTA override exists on day |  [optional] |
|**absentTimeCode** | **String** | time code used in LTA override if present |  [optional] |
|**authorizedMessage** | **String** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**clocks** | [**WorkSummaryClocksDto**](WorkSummaryClocksDto.md) |  |  [optional] |
|**workDetails** | [**List&lt;WorkDetailDto&gt;**](WorkDetailDto.md) |  |  [optional] |
|**exceptions** | **List&lt;String&gt;** |  |  [optional] |
|**wrksMessages** | **String** |  |  [optional] |
|**readOnly** | **Boolean** | true if timesheet has been locked |  [optional] |
|**readOnlyReason** | **String** |  |  [optional] |
|**daily** | **Boolean** |  |  [optional] |
|**flag1** | **String** |  |  [optional] |
|**flag2** | **String** |  |  [optional] |
|**flag3** | **String** |  |  [optional] |
|**flag4** | **String** |  |  [optional] |
|**flag5** | **String** |  |  [optional] |
|**udf1** | **String** |  |  [optional] |
|**udf2** | **String** |  |  [optional] |
|**udf3** | **String** |  |  [optional] |
|**udf4** | **String** |  |  [optional] |
|**udf5** | **String** |  |  [optional] |
|**udf6** | **String** |  |  [optional] |
|**udf7** | **String** |  |  [optional] |
|**udf8** | **String** |  |  [optional] |
|**udf9** | **String** |  |  [optional] |
|**udf10** | **String** |  |  [optional] |
|**payGroup** | [**PayGroupDto**](PayGroupDto.md) |  |  [optional] |
|**calcGroup** | [**CalcGroupDto**](CalcGroupDto.md) |  |  [optional] |



