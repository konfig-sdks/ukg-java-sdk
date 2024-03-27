

# Earning


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refId** | **UUID** | Unique identifier for each earnings. |  |
|**companyCode** | **String** | Company code associated with employee. |  |
|**empNo** | **String** | Employee number associated with employee for time data. |  |
|**chargeDate** | **OffsetDateTime** | Used in the calculation of coefficient overtime and tips processing. Formatting must conform to ISO 8601 UTC Format |  [optional] |
|**code** | **String** | Earnings code for time data |  |
|**hours** | **BigDecimal** | Number of hours associated with earnings, if appropriate. Decimal value up to 4 decimal places. Positive and negative values allowed. |  [optional] |
|**amount** | **BigDecimal** | Amount associated with earnings, if appropriate. Positive and negative values allowed. |  [optional] |
|**pieceCount** | **BigDecimal** | Number of pieces associated with earnings, if appropriate. Positive and negative values allowed. |  [optional] |
|**shiftCode** | **String** | Shift code associated with time data. |  [optional] |
|**location** | **String** | Location associated with employee. |  [optional] |
|**job** | **String** | Job code associated with employee’s time data. |  [optional] |
|**project** | **String** | Project code or value associated with employee’s time data. |  [optional] |
|**orgLvl1** | **String** | Organization level 1 code associated with employee’s time data |  [optional] |
|**orgLvl2** | **String** | Organization level 2 code associated with employee’s time data. |  [optional] |
|**orgLvl3** | **String** | Organization level 3 code associated with employee’s time data. |  [optional] |
|**orgLvl4** | **String** | Organization level 4 code associated with employee’s time data. |  [optional] |
|**payRate** | **BigDecimal** | Pay rate associated with employee’s time data.  Value overrides pay rate in UKG Pro. |  [optional] |
|**pieceRate** | **BigDecimal** | Piece rate associated with employee’s time data.  Value overrides piece rate in UKG Pro. |  [optional] |
|**roePayDate** | **OffsetDateTime** | The Record of Employment pay date.  Must be a valid pay date. |  [optional] |
|**adjEarnPeriodStartDate** | **OffsetDateTime** | Used for co-efficient overtime period adjustment start date. |  [optional] |
|**adjEarnPeriodEndDate** | **OffsetDateTime** | Used for co-efficient overtime period adjustment end date. |  [optional] |
|**checkSequence** | **Integer** | Sequence of multiple checks for a single employee. Specify the type of additional pay (check or DDA) being added to the employee(s) via Time Clock Import. A - Creates an additional direct deposit advice with deductions (for employees  with existing DD setups). D - Creates an additional direct deposit with No deductions (for employees with existing DD setups). B - Creates an additional pay with deductions; this will create a live check for the employees. J -  Creates an additional pay with No deductions; this will create a live check for the employees  |  [optional] |
|**createPayType** | **String** | R - Creates a Regular Pay check. |  [optional] |
|**forcePayCreation** | **String** | To force the creation of an additional pay via Time clock import, set this to Y. |  [optional] |
|**grossUp** | **String** | This identifies if an earning is to be grossed up. |  [optional] |
|**grossUpTarget** | **Integer** | Specified net amount. |  [optional] |
|**grossUpTaxCalcMethod** | **Integer** | The Gross Up Tax Calculation Method (E_Batch. EbtGrossUpTaxCalcMethod) Numeric value to identify which taxes to include in the gross up calculation. |  [optional] |
|**source** | **String** | Source of the data as appropriate. Usually an alias of the system sending the data. |  |



