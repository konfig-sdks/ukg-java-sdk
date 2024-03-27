

# Identifiers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeIdentifierType** | [**EmployeeIdentifierTypeEnum**](#EmployeeIdentifierTypeEnum) | Employee Identifier Type |  |
|**employeeIdentifierValue** | **String** | Employee Identifier Value (specific to Employee Identifer Type) |  |
|**companyIdentifierType** | [**CompanyIdentifierTypeEnum**](#CompanyIdentifierTypeEnum) |  |  [optional] |
|**companyIdentifierValue** | **String** | Company Identifier Value (specific to Company Identifer Type) |  [optional] |



## Enum: EmployeeIdentifierTypeEnum

| Name | Value |
|---- | -----|
| EMAILADDRESS | &quot;EmailAddress&quot; |
| EMPLOYEENUMBER | &quot;EmployeeNumber&quot; |
| NATIONALID | &quot;NationalID&quot; |
| SIN | &quot;SIN&quot; |
| PERSONID | &quot;PersonID&quot; |
| SSN | &quot;SSN&quot; |
| EMPLOYEEID | &quot;EmployeeID&quot; |
| USERINTEGRATIONKEY | &quot;UserIntegrationKey&quot; |



## Enum: CompanyIdentifierTypeEnum

| Name | Value |
|---- | -----|
| COMPANY_ID | &quot;Company ID&quot; |
| COMPANY_CODE | &quot;Company Code&quot; |
| FEDERAL_ID | &quot;Federal ID&quot; |



