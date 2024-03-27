

# NewHiresGetByIdResponseJob

Job of the new hire

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the job |  [optional] |
|**name** | **Map&lt;String, String&gt;** | The name of the job |  [optional] |
|**code** | **String** | Code of the job |  [optional] |
|**requisitionId** | **String** | RequisitionId of the job |  [optional] |
|**selectedFLSAStatus** | [**SelectedFLSAStatusEnum**](#SelectedFLSAStatusEnum) | Selected FLSA status for the job |  [optional] |
|**componentCompany** | [**NewHiresGetByIdResponseJobComponentCompany**](NewHiresGetByIdResponseJobComponentCompany.md) |  |  [optional] |
|**workLocation** | [**NewHiresGetByIdResponseJobWorkLocation**](NewHiresGetByIdResponseJobWorkLocation.md) |  |  [optional] |
|**supervisor** | [**NewHiresGetByIdResponseJobSupervisor**](NewHiresGetByIdResponseJobSupervisor.md) |  |  [optional] |
|**employeeType** | [**NewHiresGetByIdResponseJobEmployeeType**](NewHiresGetByIdResponseJobEmployeeType.md) |  |  [optional] |



## Enum: SelectedFLSAStatusEnum

| Name | Value |
|---- | -----|
| NOT_SPECIFIED_0 | &quot;Not specified &#x3D; 0&quot; |
| EXEMPT_1 | &quot;Exempt &#x3D; 1&quot; |
| NONEXEMPT_2 | &quot;NonExempt &#x3D; 2&quot; |



