

# ApplicationHireDetails



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerDate** | **String** | The date on which the offer was presented to a candidate for the specified application Must not be before 1/1/1881 or after 12/31/2199  |  [optional] |
|**acceptDate** | **String** | The date on which the offer was accepted by a candidate for the specified application Must not be before 1/1/1881 or after 12/31/2199  |  [optional] |
|**hireDate** | **String** | The date on which the candidate is hired for the opportunity associated with the specified application Must not be before 1/1/1881 or after 12/31/2199  |  [optional] |
|**startDate** | **String** | The date on which the candidate is set to start working Must not be before 1/1/1881 or after 12/31/2199  |  [optional] |
|**fullTimeEquivalent** | **String** | The full time equivalent of the hire (decimal) Must be greater than 0 and no more than 9999999999.9999 |  [optional] |
|**compensation** | [**ApplicationHireDetailsCompensation**](ApplicationHireDetailsCompensation.md) |  |  [optional] |
|**company** | [**ApplicationHireDetailsCompany**](ApplicationHireDetailsCompany.md) |  |  [optional] |
|**taxLocation** | [**ApplicationHireDetailsTaxLocation**](ApplicationHireDetailsTaxLocation.md) |  |  [optional] |
|**hiringManager** | [**ApplicationHireDetailsHiringManager**](ApplicationHireDetailsHiringManager.md) |  |  [optional] |
|**onboardingOwner** | [**ApplicationHireDetailsOnboardingOwner**](ApplicationHireDetailsOnboardingOwner.md) |  |  [optional] |
|**orgUnits** | [**List&lt;OrgUnits&gt;**](OrgUnits.md) |  |  [optional] |



