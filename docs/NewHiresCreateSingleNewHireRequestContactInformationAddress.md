

# NewHiresCreateSingleNewHireRequestContactInformationAddress

Address of the new hire

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**line1** | **String** | Line 1 of the address. maxLength: 100 for US/Canadian address country, 255 otherwise |  [optional] |
|**line2** | **String** | Line 2 of the address. maxLength: 100 for US/Canadian address country, 255 otherwise |  [optional] |
|**city** | **String** | City of the address. maxLength: 50 for US/Canadian address country, 255 otherwise |  [optional] |
|**postalCode** | **String** | Zip/postal code of the address. maxLength: 50 for hires not in US/Canadian address country. If hire&#39;s address country is US/Canada, a valid postal code format is expected |  [optional] |
|**county** | **String** | County name of the address. maxLength: 30 for US/Canadian address country, 255 otherwise |  [optional] |
|**stateCode** | **String** | State code of the address |  [optional] |
|**countryCode** | **String** | ISO country code of the address |  [optional] |



