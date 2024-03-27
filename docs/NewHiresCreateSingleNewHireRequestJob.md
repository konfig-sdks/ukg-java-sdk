

# NewHiresCreateSingleNewHireRequestJob

Job information for the new hire

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the job |  [optional] |
|**code** | **String** | UltiPro job code |  [optional] |
|**requisitionId** | **String** | RequisitionId of the job |  [optional] |
|**componentCompany** | [**NewHiresCreateSingleNewHireRequestJobComponentCompany**](NewHiresCreateSingleNewHireRequestJobComponentCompany.md) |  |  [optional] |
|**workLocation** | [**NewHiresCreateSingleNewHireRequestJobWorkLocation**](NewHiresCreateSingleNewHireRequestJobWorkLocation.md) |  |  [optional] |
|**supervisor** | [**NewHiresCreateSingleNewHireRequestJobSupervisor**](NewHiresCreateSingleNewHireRequestJobSupervisor.md) |  |  [optional] |
|**employeeType** | [**NewHiresCreateSingleNewHireRequestJobEmployeeType**](NewHiresCreateSingleNewHireRequestJobEmployeeType.md) |  |  [optional] |
|**selectedFLSAStatus** | [**SelectedFLSAStatusEnum**](#SelectedFLSAStatusEnum) | Selected FLSA status for the job |  [optional] |



## Enum: SelectedFLSAStatusEnum

| Name | Value |
|---- | -----|
| NOT_SPECIFIED_0 | &quot;Not specified &#x3D; 0&quot; |
| EXEMPT_1 | &quot;Exempt &#x3D; 1&quot; |
| NONEXEMPT_2 | &quot;NonExempt &#x3D; 2&quot; |



