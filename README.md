<div align="center">

[![Visit Ukg](./header.png)](https://ukg.com)

# [Ukg](https://ukg.com)

Configure your UKG Pro Configuration Codes through UKG Pro APIs. Status: R1 deployment

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=UKG&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>ukg-java-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:ukg-java-sdk:v1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ukg-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActivitiesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://http:";
    
    // Configure OAuth2 access token for authorization: OauthSecurity
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Ukg client = new Ukg(configuration);
    try {
      ResultDtoActivityDto result = client
              .activities
              .getAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getEntities());
      System.out.println(result.getIndex());
      System.out.println(result.getRequestedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivitiesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultDtoActivityDto> response = client
              .activities
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivitiesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://http:*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitiesApi* | [**getAll**](docs/ActivitiesApi.md#getAll) | **GET** /simpleschedule/activities | Obtains all activities.
*AssignedHolidaysApi* | [**getAll**](docs/AssignedHolidaysApi.md#getAll) | **GET** /simpleschedule/assigned_holidays | Obtains all assigned holidays.
*AuditDetailsApi* | [**getData**](docs/AuditDetailsApi.md#getData) | **GET** /personnel/v1/audit-details | Get Audit Details Data
*BusinessRuleImportToolApi* | [**businessRuleImportFileUpload**](docs/BusinessRuleImportToolApi.md#businessRuleImportFileUpload) | **POST** /configuration/v1/businessruleimport-tool/fileupload | Takes an XML transaction and feeds it into the Business Rule Import Tool
*BusinessRuleImportToolApi* | [**getFileUploadStatus**](docs/BusinessRuleImportToolApi.md#getFileUploadStatus) | **GET** /configuration/v1/businessruleimport-tool/filestatus/{fileId} | Retrieves the status of an Business Rule Import Tool transaction
*BusinessRuleImportToolApi* | [**getStagingStatus**](docs/BusinessRuleImportToolApi.md#getStagingStatus) | **GET** /configuration/v1/businessruleimport-tool/transactionstatus/{stagingId} | Retrieves the status of an Business Rule Import Tool transaction
*BusinessRuleImportToolApi* | [**importsBusinessRuleStagingData**](docs/BusinessRuleImportToolApi.md#importsBusinessRuleStagingData) | **POST** /configuration/v1/businessruleimport-tool/transaction | Takes an XML transaction and feeds it into the Business Rule Import Tool (Staging)
*BusinessStructureStatusApi* | [**listEmployeesChangeBusinessStructure**](docs/BusinessStructureStatusApi.md#listEmployeesChangeBusinessStructure) | **GET** /personnel/v1/integration/kronos/business-structure-status | Gets a list of Employees for which there is a change in business structure
*CandidateRequestApi* | [**addBackgroundCheck**](docs/CandidateRequestApi.md#addBackgroundCheck) | **POST** /{tenant-alias}/api/candidates/{candidate-id}/background-checks | Background Check Request
*CandidateRequestApi* | [**updateBackgroundCheck**](docs/CandidateRequestApi.md#updateBackgroundCheck) | **PUT** /{tenant-alias}/api/candidates/{candidate-id}/background-checks/{background-check-id} | Background Check Status
*ChangesByDateApi* | [**getAllEmployeeChangesSinceLastCall**](docs/ChangesByDateApi.md#getAllEmployeeChangesSinceLastCall) | **GET** /personnel/v1/employee-changes | Changes By Date
*CodeTablesApi* | [**createCodeTables**](docs/CodeTablesApi.md#createCodeTables) | **POST** /configuration/v1/code-tables | Post Code Tables information
*CodeTablesApi* | [**getInfo**](docs/CodeTablesApi.md#getInfo) | **GET** /configuration/v1/code-tables | Get Code Tables information
*CompanyDetailsApi* | [**getCompanyDetails**](docs/CompanyDetailsApi.md#getCompanyDetails) | **GET** /configuration/v1/company-details | Get Company Details
*CompanyPayStatementApi* | [**getByDateRange**](docs/CompanyPayStatementApi.md#getByDateRange) | **POST** /payroll/v1/companies/pay-statements | Get employee(s) pay statement(s) for a company or pay group for a given date range.
*CompanyPayStatementApi* | [**getPaySummaries**](docs/CompanyPayStatementApi.md#getPaySummaries) | **POST** /payroll/v1/companies/pay-statements-summary | Get employee(s) pay statement(s) summary for a company or pay group for a given date range.
*CompensationDetailsApi* | [**getAllByCompany**](docs/CompensationDetailsApi.md#getAllByCompany) | **GET** /personnel/v1/companies/{companyId}/compensation-details | Get all compensation details by company
*CompensationDetailsApi* | [**getAllDetails**](docs/CompensationDetailsApi.md#getAllDetails) | **GET** /personnel/v1/compensation-details | Get all compensation details
*CompensationDetailsApi* | [**getByCompanyAndEmployee**](docs/CompensationDetailsApi.md#getByCompanyAndEmployee) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/compensation-details | Get all compensation details by company and employee
*CompensationDetailsApi* | [**getByEmployee**](docs/CompensationDetailsApi.md#getByEmployee) | **GET** /personnel/v1/compensation-details/{employeeId} | Get all compensation details by employee
*ContactApi* | [**getPersonnelContactDetails**](docs/ContactApi.md#getPersonnelContactDetails) | **GET** /personnel/v1/contacts/{contactId} | Get all details for a single person assigned to an employee as a contact
*ContactApi* | [**getPersonnelDetails**](docs/ContactApi.md#getPersonnelDetails) | **GET** /personnel/v1/contacts | Get all details for a person assigned to an employee as a contact
*DependentDeductionsApi* | [**get**](docs/DependentDeductionsApi.md#get) | **GET** /personnel/v1/dep-deductions | Get Dependent Deductions
*DirectDepositApi* | [**listDirectDepositDetailsByCompany**](docs/DirectDepositApi.md#listDirectDepositDetailsByCompany) | **GET** /payroll/v1/companies/{companyId}/direct-deposit | Get list of direct deposit details for US and Canadian employees by company
*DirectDepositApi* | [**listEmployeeDirectDepositDetails**](docs/DirectDepositApi.md#listEmployeeDirectDepositDetails) | **GET** /payroll/v1/direct-deposit | Get list of direct deposit details for US and Canadian employees
*EarningsApi* | [**addTimeClockData**](docs/EarningsApi.md#addTimeClockData) | **POST** /services/payroll/v1/import-pay-items/earnings | Add UKG Pro time clock data
*EarningsApi* | [**deleteEarning**](docs/EarningsApi.md#deleteEarning) | **DELETE** /services/payroll/v1/import-pay-items/earnings/{refId} | Delete a earning
*EarningsApi* | [**getConfigurationsFilteredByParameter**](docs/EarningsApi.md#getConfigurationsFilteredByParameter) | **GET** /configuration/v1/earnings/{calculationRule}/{taxCategory}/{useDeductionOffset}/{countryCode}/{includeInShiftDiffrential}/{includeInManualCheck} | Get list of earnings configurations filtered by Parameter including pagination params
*EarningsApi* | [**getStatusDetails**](docs/EarningsApi.md#getStatusDetails) | **GET** /services/payroll/v1/import-pay-items/earnings/{refId} | Get status details for specified earning
*EarningsApi* | [**listEarningsConfigurations**](docs/EarningsApi.md#listEarningsConfigurations) | **GET** /configuration/v1/earnings | Get a list of all earnings configurations
*EarningsApi* | [**specificConfigurationGet**](docs/EarningsApi.md#specificConfigurationGet) | **GET** /configuration/v1/earnings/{earningCode} | Get a specific earning configuration
*EarningsHistoryApi* | [**getInsRate**](docs/EarningsHistoryApi.md#getInsRate) | **GET** /payroll/v1/earnings-history-base-elements | Get Earnings History Base Elements
*EmpDedBenOptionDateApi* | [**get**](docs/EmpDedBenOptionDateApi.md#get) | **GET** /personnel/v1/emp-deductions-benefit-option-change-date | Get Employee Deduction Benefit Option Change Date
*EmpDeductionsApi* | [**list**](docs/EmpDeductionsApi.md#list) | **GET** /personnel/v1/emp-deductions | Get employee deductions
*EmpGlobalLocalizationElementApi* | [**get**](docs/EmpGlobalLocalizationElementApi.md#get) | **GET** /personnel/v1/employee-global-localization-elements | Get all global employee localization fields added to UKG Pro
*EmpMultiplePositionsApi* | [**get**](docs/EmpMultiplePositionsApi.md#get) | **GET** /personnel/v1/empl-multiple-positions | Get Employee Multiple Positions
*EmployeeChangesApi* | [**get**](docs/EmployeeChangesApi.md#get) | **GET** /personnel/v1/employee-changes/{employeeId} | Changes By Employee ID
*EmployeeDeductionHistoryEffectiveDateApi* | [**getByDeductionCodeAndField**](docs/EmployeeDeductionHistoryEffectiveDateApi.md#getByDeductionCodeAndField) | **GET** /personnel/v1/deduction-history-effective-change-dates | Deductions History Effective Change Date
*EmployeeDemographicDetailsApi* | [**get**](docs/EmployeeDemographicDetailsApi.md#get) | **GET** /personnel/v1/employee-demographic-details | Get Employee Demographic Details
*EmployeeIdLookupApi* | [**byCompanyIds**](docs/EmployeeIdLookupApi.md#byCompanyIds) | **POST** /personnel/v1/employee-ids | Employee ID Lookup
*EmployeeJobsApi* | [**getAll**](docs/EmployeeJobsApi.md#getAll) | **GET** /simpleschedule/employee_jobs | Obtains all jobs for an employee.
*EmployeeSecurityUserDetailsApi* | [**getDetails**](docs/EmployeeSecurityUserDetailsApi.md#getDetails) | **GET** /personnel/v1/employee-security-user-details | Get employee security user details
*EmployeeCobraDetailsApi* | [**get**](docs/EmployeeCobraDetailsApi.md#get) | **GET** /personnel/v1/employee-cobra-details | Get Employee Cobra Details
*EmployeeContractApi* | [**get**](docs/EmployeeContractApi.md#get) | **GET** /personnel/v1/employee-contract-details | Get all employment contract details
*EmployeeEducationApi* | [**get**](docs/EmployeeEducationApi.md#get) | **GET** /personnel/v1/employee-education | Get all education details
*EmployeeEmploymentDetailsApi* | [**getDetails**](docs/EmployeeEmploymentDetailsApi.md#getDetails) | **GET** /personnel/v1/employee-employment-details | Get Employee Employment Details
*EmployeeExtendedElementsApi* | [**get**](docs/EmployeeExtendedElementsApi.md#get) | **GET** /personnel/v1/employee-extended-elements | Get Employee Extended Elements
*EmployeeGlobalBankApi* | [**get**](docs/EmployeeGlobalBankApi.md#get) | **GET** /personnel/v1/employee-global-banks | Get all direct deposit details for global employees
*EmployeeJobHistoryDetailApi* | [**get**](docs/EmployeeJobHistoryDetailApi.md#get) | **GET** /personnel/v1/employee-job-history-details | Get all employee job history details
*EmployeeJobHistoryDetailApi* | [**getSingleRecord**](docs/EmployeeJobHistoryDetailApi.md#getSingleRecord) | **GET** /personnel/v1/employee-job-history-details/{systemId} | Get a single job history detail record
*EmployeeMultiPhoneNumbersApi* | [**get**](docs/EmployeeMultiPhoneNumbersApi.md#get) | **GET** /personnel/v1/employee-multi-phone-numbers | Get employee multiple phone numbers
*EmployeeMultipleJobsOppApi* | [**listDetails**](docs/EmployeeMultipleJobsOppApi.md#listDetails) | **GET** /personnel/v1/empl-multiple-jobs | Get employee multiple jobs details
*EmployeePayDeductionElementApi* | [**get**](docs/EmployeePayDeductionElementApi.md#get) | **GET** /personnel/v1/employee-pay-deduction-elements | Get Global Employee Payments and Deductions Service
*EmployeePayStatementApi* | [**getByDateRange**](docs/EmployeePayStatementApi.md#getByDateRange) | **POST** /payroll/v1/employees/pay-statements | Get employee pay statement(s) based on the passed employee identifier for a given date range.
*EmployeePayStatementApi* | [**getByPayIdentifier**](docs/EmployeePayStatementApi.md#getByPayIdentifier) | **GET** /payroll/v1/employees/pay-statement/{PayIdentifier} | Get employee pay statement based on the given pay identifier.
*EmployeePayStatementApi* | [**getLastPayStatement**](docs/EmployeePayStatementApi.md#getLastPayStatement) | **POST** /payroll/v1/employees/pay-statement/last | Get employee last pay statement based on the passed employee identifier.
*EmployeeSupervisorDetailsApi* | [**get**](docs/EmployeeSupervisorDetailsApi.md#get) | **GET** /personnel/v1/employee-supervisor-details | Get Employee Supervisor Details
*EmployeesApi* | [**getAll**](docs/EmployeesApi.md#getAll) | **GET** /simpleschedule/employees | Obtains all employees.
*EmploymentDetailsApi* | [**getByCompanyIdAndEmployeeId**](docs/EmploymentDetailsApi.md#getByCompanyIdAndEmployeeId) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/employment-details | Get Employment Details
*EmploymentDetailsApi* | [**getDetails**](docs/EmploymentDetailsApi.md#getDetails) | **GET** /personnel/v1/employment-details | Get Employment Details
*EmploymentDetailsApi* | [**listByCompany**](docs/EmploymentDetailsApi.md#listByCompany) | **GET** /personnel/v1/companies/{companyId}/employment-details | Get Employment Details
*GeneralLedgerRunDetailsV2Api* | [**get**](docs/GeneralLedgerRunDetailsV2Api.md#get) | **GET** /payroll/v2/general-ledger | Returns a list of details for a general ledger run, filterable by runId and blockId
*GeneralLedgerRunDetailsV2Api* | [**getByRunId**](docs/GeneralLedgerRunDetailsV2Api.md#getByRunId) | **GET** /payroll/v2/general-ledger/{runId} | Returns a list of details for a general ledger run, filterable by runId and blockId
*GetAllPtoPlansApi* | [**information**](docs/GetAllPtoPlansApi.md#information) | **GET** /personnel/v1/pto-plans | Get all pto-plans
*GetJobPostingsApi* | [**details**](docs/GetJobPostingsApi.md#details) | **GET** /talent/recruiting/v2/third-party-job-board-integrations/{integrationId}/postings | Get job postings
*GetSpecificEmployeesPtoPlansApi* | [**info**](docs/GetSpecificEmployeesPtoPlansApi.md#info) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/pto-plans | Get a specific employees pto-plans
*GetSpecificPtoPlanApi* | [**info**](docs/GetSpecificPtoPlanApi.md#info) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/pto-plans/{ptoPlan} | Get a specific pto-plan
*HourTypesApi* | [**obtainAll**](docs/HourTypesApi.md#obtainAll) | **GET** /simpleschedule/hour_types | Obtains all hour types.
*ImportToolApi* | [**getStatus**](docs/ImportToolApi.md#getStatus) | **GET** /personnel/v1/import-tool/status/{stagingId} | Retrieves the status of an import tool transaction
*ImportToolApi* | [**post**](docs/ImportToolApi.md#post) | **POST** /personnel/v1/import-tool | Takes an XML transaction and feeds it into the Import Tool
*InsRateApi* | [**getInsRate**](docs/InsRateApi.md#getInsRate) | **GET** /configuration/v1/insurance-rate | Get Insurance Rate
*IntegrationAuditConfigurationApi* | [**getData**](docs/IntegrationAuditConfigurationApi.md#getData) | **GET** /personnel/v1/integration-audit-configuration | Get Integration Audit Configuration Data
*InternationalEmployeeApi* | [**get**](docs/InternationalEmployeeApi.md#get) | **GET** /personnel/v1/international-employees | Get international employee details for all employees
*InternationalEmployeeApi* | [**getDetails**](docs/InternationalEmployeeApi.md#getDetails) | **GET** /personnel/v1/international-employees/{employeeId} | Get a single employees international details
*JobGroupApi* | [**get**](docs/JobGroupApi.md#get) | **GET** /configuration/v1/jobgroup | Get All Job Groups
*KronosEmployeeProfilesApi* | [**getList**](docs/KronosEmployeeProfilesApi.md#getList) | **GET** /personnel/v1/integration/kronos/employee-profiles | Get list of employees profile
*KronosEmployeeStatusApi* | [**get**](docs/KronosEmployeeStatusApi.md#get) | **GET** /personnel/v1/integration/kronos/employee-status | Get Employee Status
*NationalDocumentApi* | [**get**](docs/NationalDocumentApi.md#get) | **GET** /personnel/v1/national-documents | All employee national document details
*NewHiresApi* | [**createSingleNewHire**](docs/NewHiresApi.md#createSingleNewHire) | **POST** /tenants/{tenantIdentifier}/new-hires | Creates a single New Hire
*NewHiresApi* | [**getById**](docs/NewHiresApi.md#getById) | **GET** /tenants/{tenantIdentifier}/new-hires/{id} | Gets a single New Hire by Id
*OpenEnrollmentDependentDeductionsApi* | [**getData**](docs/OpenEnrollmentDependentDeductionsApi.md#getData) | **GET** /personnel/v1/open-enrollment-dep-deductions | Get Open Enrollment Dependent Deductions Data
*OpenEnrollmentEmployeeDeductionsApi* | [**getAuditDetails**](docs/OpenEnrollmentEmployeeDeductionsApi.md#getAuditDetails) | **GET** /personnel/v1/open-enrollment-emp-deductions | Get Open Enrollment Employee Deductions
*OptionRateApi* | [**getData**](docs/OptionRateApi.md#getData) | **GET** /configuration/v1/option-rate | Get Option Rate Data
*OrderRequestsApi* | [**backgroundCheckDetails**](docs/OrderRequestsApi.md#backgroundCheckDetails) | **GET** /{tenant-alias}/api/background-check-order-requests | Background Check Details
*OrganizationReportingCategoryApi* | [**get**](docs/OrganizationReportingCategoryApi.md#get) | **GET** /configuration/v1/organization-reporting-category | Get Organization Reporting Category
*PtoPlanPatchApi* | [**onePtoPlan**](docs/PtoPlanPatchApi.md#onePtoPlan) | **PATCH** /personnel/v1/companies/{companyId}/employees/{employeeId}/pto-plans/{ptoPlan} | Patch one PTO Plan
*PtoPlanPostApi* | [**ultiproRecord**](docs/PtoPlanPostApi.md#ultiproRecord) | **POST** /personnel/v1/pto-plans | Create A PTO Plan
*PayGroupPayPeriodApi* | [**getPayGroupPayPeriod**](docs/PayGroupPayPeriodApi.md#getPayGroupPayPeriod) | **GET** /payroll/v1/paygroup-payperiods | Get PayGroup PayPeriods
*PayRegisterApi* | [**get**](docs/PayRegisterApi.md#get) | **GET** /payroll/v1/pay-register | Get Pay Register
*PayrollDeductionsHistoryApi* | [**get**](docs/PayrollDeductionsHistoryApi.md#get) | **GET** /payroll/v1/payroll-deductions-history | Get Payroll Deductions History
*PersonDetailsApi* | [**getAllDetails**](docs/PersonDetailsApi.md#getAllDetails) | **GET** /personnel/v1/person-details | Get all person details
*PersonDetailsApi* | [**getSingleCompanyDetails**](docs/PersonDetailsApi.md#getSingleCompanyDetails) | **GET** /personnel/v1/companies/{companyId}/person-details | Get all person details for a single company
*PersonDetailsApi* | [**getSingleDetailRecord**](docs/PersonDetailsApi.md#getSingleDetailRecord) | **GET** /personnel/v1/person-details/{employeeId} | Get a single person detail record
*PersonDetailsApi* | [**getSingleRecord**](docs/PersonDetailsApi.md#getSingleRecord) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/person-details | Get a single person detail record for a single company
*PlatformConfigurationCustomFieldsSchemaApi* | [**getFieldsSchema**](docs/PlatformConfigurationCustomFieldsSchemaApi.md#getFieldsSchema) | **GET** /configuration/v1/platform-configuration/custom-fields-schema | Gets Platform Configuration standard classes custom fields schema
*PositionReportApi* | [**get**](docs/PositionReportApi.md#get) | **GET** /personnel/v1/position-report | Get Position Report
*PositionsApi* | [**listFiltered**](docs/PositionsApi.md#listFiltered) | **GET** /configuration/v1/positions | Returns list of employee position information filtered on various parameters
*PostNewTokenRequestApi* | [**obtainOAuthToken**](docs/PostNewTokenRequestApi.md#obtainOAuthToken) | **POST** /signin/oauth2/t/{tenant-name}/access_token | Obtain new oAuth token
*RolesGetApi* | [**securityRoles**](docs/RolesGetApi.md#securityRoles) | **GET** /configuration/v1/roles | Gets Roles from security roles table
*ScheduleDetailsApi* | [**publishDetails**](docs/ScheduleDetailsApi.md#publishDetails) | **PUT** /simpleschedule/schedule_details | Publish schedule details.
*ShiftCodeApi* | [**getData**](docs/ShiftCodeApi.md#getData) | **GET** /configuration/v1/shift-codes | Shift Codes API Data
*SingleOrganizationLevelApi* | [**get**](docs/SingleOrganizationLevelApi.md#get) | **GET** /configuration/v1/org-levels/{level}/{code} | Get single org-level
*SingleOrganizationLevelApi* | [**updateOrgLevel**](docs/SingleOrganizationLevelApi.md#updateOrgLevel) | **PUT** /configuration/v1/org-levels/{level}/{code} | Update one org-level
*SingleOrganizationLevelApi* | [**updateProperties**](docs/SingleOrganizationLevelApi.md#updateProperties) | **PATCH** /configuration/v1/org-levels/{level}/{code} | Patch one org-level
*TaxGroupsApi* | [**getAllDetails**](docs/TaxGroupsApi.md#getAllDetails) | **GET** /configuration/v1/tax-groups | Get all tax group details
*TeamsApi* | [**getAll**](docs/TeamsApi.md#getAll) | **GET** /simpleschedule/teams | Obtains all teams.
*TimeCodesApi* | [**getAll**](docs/TimeCodesApi.md#getAll) | **GET** /simpleschedule/time_codes | Obtains all time codes.
*TimeOffRequestsApi* | [**getAll**](docs/TimeOffRequestsApi.md#getAll) | **GET** /simpleschedule/timeoff_requests | Obtains all time off requests.
*UtaEmployeeApi* | [**getByCoIdAndEeId**](docs/UtaEmployeeApi.md#getByCoIdAndEeId) | **GET** /simpleschedule/{coid}/employees/{eeid} | Obtains a UTA Employee by coId and eeId.
*UserPreferencesApi* | [**getUserPreferencesDetails**](docs/UserPreferencesApi.md#getUserPreferencesDetails) | **GET** /personnel/v1/user-preferences | Get User Preferences Details
*UserProfileDetailsApi* | [**getAllDetails**](docs/UserProfileDetailsApi.md#getAllDetails) | **GET** /personnel/v1/user-profile-details | Get all user profile details
*UserDefinedFieldsApi* | [**get**](docs/UserDefinedFieldsApi.md#get) | **GET** /personnel/v1/user-defined-fields | Get User Defined Fields
*UserDefinedFieldsApi* | [**getSingleCompany**](docs/UserDefinedFieldsApi.md#getSingleCompany) | **GET** /personnel/v1/companies/{companyId}/user-defined-fields | Get User Defined Fields for single company
*UserDefinedFieldsApi* | [**getSingleEmployee**](docs/UserDefinedFieldsApi.md#getSingleEmployee) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/user-defined-fields | Get User Defined Fields for a single employee in a single company
*UserDetailsApi* | [**getUserDetails**](docs/UserDetailsApi.md#getUserDetails) | **GET** /personnel/v1/user-details | Get User Details
*ViewOrCreateOrganizationLevelsApi* | [**createOrgLevelConfig**](docs/ViewOrCreateOrganizationLevelsApi.md#createOrgLevelConfig) | **POST** /configuration/v1/org-levels | Create org-level configuration
*ViewOrCreateOrganizationLevelsApi* | [**getAllOrgLevels**](docs/ViewOrCreateOrganizationLevelsApi.md#getAllOrgLevels) | **GET** /configuration/v1/org-levels | Get all org-levels
*AllergyApi* | [**configurationsGet**](docs/AllergyApi.md#configurationsGet) | **GET** /allergy | Retrieve all allergy configurations
*AllergyApi* | [**createConfiguration**](docs/AllergyApi.md#createConfiguration) | **POST** /allergy | Create a new allergy configuration
*AllergyApi* | [**updateSingleConfiguration**](docs/AllergyApi.md#updateSingleConfiguration) | **PUT** /allergy/{code} | Update a single allergy configuration
*AwardTypeApi* | [**createConfiguration**](docs/AwardTypeApi.md#createConfiguration) | **POST** /awardType | Create a new awardType configuration
*AwardTypeApi* | [**getAllConfigurations**](docs/AwardTypeApi.md#getAllConfigurations) | **GET** /awardType | Retrieve all awardType configurations
*AwardTypeApi* | [**updateConfiguration**](docs/AwardTypeApi.md#updateConfiguration) | **PUT** /awardType/{code} | Update a single awardType configuration
*CareerProviderApi* | [**createConfigurationUkgPro**](docs/CareerProviderApi.md#createConfigurationUkgPro) | **POST** /careerProvider | Create a new careerProvider configuration
*CareerProviderApi* | [**getConfigurations**](docs/CareerProviderApi.md#getConfigurations) | **GET** /careerProvider | Retrieve all careerProvider configurations
*CareerProviderApi* | [**updateConfiguration**](docs/CareerProviderApi.md#updateConfiguration) | **PUT** /careerProvider/{code} | Update a single careerProvider configuration
*ChildSupportTypeApi* | [**createConfigurationUkgPro**](docs/ChildSupportTypeApi.md#createConfigurationUkgPro) | **POST** /childSupportType | Create a new childSupportType configuration
*ChildSupportTypeApi* | [**getConfigurations**](docs/ChildSupportTypeApi.md#getConfigurations) | **GET** /childSupportType | Retrieve all childSupportType configurations
*ChildSupportTypeApi* | [**updateConfiguration**](docs/ChildSupportTypeApi.md#updateConfiguration) | **PUT** /childSupportType/{code} | Update a single childSupportType configuration
*CobraStatusApi* | [**createConfiguration**](docs/CobraStatusApi.md#createConfiguration) | **POST** /cobraStatus | Create a new cobraStatus configuration
*CobraStatusApi* | [**getConfigurations**](docs/CobraStatusApi.md#getConfigurations) | **GET** /cobraStatus | Retrieve all cobraStatus configurations
*CobraStatusApi* | [**updateSingleConfiguration**](docs/CobraStatusApi.md#updateSingleConfiguration) | **PUT** /cobraStatus/{code} | Update a single cobraStatus configuration
*CompanyPropertyApi* | [**createConfigurationUkgPro**](docs/CompanyPropertyApi.md#createConfigurationUkgPro) | **POST** /companyProperty | Create a new companyProperty configuration
*CompanyPropertyApi* | [**getConfigurations**](docs/CompanyPropertyApi.md#getConfigurations) | **GET** /companyProperty | Retrieve all companyProperty configurations
*CompanyPropertyApi* | [**updateConfiguration**](docs/CompanyPropertyApi.md#updateConfiguration) | **PUT** /companyProperty/{code} | Update a single companyProperty configuration
*CourseCategoryApi* | [**createConfigurationUkgPro**](docs/CourseCategoryApi.md#createConfigurationUkgPro) | **POST** /courseCategory | Create a new courseCategory configuration
*CourseCategoryApi* | [**getAllConfigurations**](docs/CourseCategoryApi.md#getAllConfigurations) | **GET** /courseCategory | Retrieve all courseCategory configurations
*CourseCategoryApi* | [**updateConfiguration**](docs/CourseCategoryApi.md#updateConfiguration) | **PUT** /courseCategory/{code} | Update a single courseCategory configuration
*CourseDeliveryMetApi* | [**createConfigurationUkgPro**](docs/CourseDeliveryMetApi.md#createConfigurationUkgPro) | **POST** /courseDeliveryMet | Create a new courseDeliveryMet configuration
*CourseDeliveryMetApi* | [**getConfigurations**](docs/CourseDeliveryMetApi.md#getConfigurations) | **GET** /courseDeliveryMet | Retrieve all courseDeliveryMet configurations
*CourseDeliveryMetApi* | [**updateConfiguration**](docs/CourseDeliveryMetApi.md#updateConfiguration) | **PUT** /courseDeliveryMet/{code} | Update a single courseDeliveryMet configuration
*CourseSubCategoryApi* | [**createConfigurationUkgPro**](docs/CourseSubCategoryApi.md#createConfigurationUkgPro) | **POST** /courseSubCategory | Create a new courseSubCategory configuration
*CourseSubCategoryApi* | [**getConfigurations**](docs/CourseSubCategoryApi.md#getConfigurations) | **GET** /courseSubCategory | Retrieve all courseSubCategory configurations
*CourseSubCategoryApi* | [**updateConfiguration**](docs/CourseSubCategoryApi.md#updateConfiguration) | **PUT** /courseSubCategory/{code} | Update a single courseSubCategory configuration
*DisabilityApi* | [**createConfigurationUkgPro**](docs/DisabilityApi.md#createConfigurationUkgPro) | **POST** /disability | Create a new disability configuration
*DisabilityApi* | [**getConfigurations**](docs/DisabilityApi.md#getConfigurations) | **GET** /disability | Retrieve all disability configurations
*DisabilityApi* | [**updateConfiguration**](docs/DisabilityApi.md#updateConfiguration) | **PUT** /disability/{code} | Update a single disability configuration
*EmployeeTypeApi* | [**createConfigurationUkgPro**](docs/EmployeeTypeApi.md#createConfigurationUkgPro) | **POST** /employeeType | Create a new employeeType configuration
*EmployeeTypeApi* | [**getConfigurations**](docs/EmployeeTypeApi.md#getConfigurations) | **GET** /employeeType | Retrieve all employeeType configurations
*EmployeeTypeApi* | [**updateConfiguration**](docs/EmployeeTypeApi.md#updateConfiguration) | **PUT** /employeeType/{code} | Update a single employeeType configuration
*JobFamilyApi* | [**createConfiguration**](docs/JobFamilyApi.md#createConfiguration) | **POST** /jobFamily | Create a new jobFamily configuration
*JobFamilyApi* | [**getAllConfigurations**](docs/JobFamilyApi.md#getAllConfigurations) | **GET** /jobFamily | Retrieve all jobFamily configurations
*JobFamilyApi* | [**updateConfiguration**](docs/JobFamilyApi.md#updateConfiguration) | **PUT** /jobFamily/{code} | Update a single jobFamily configuration
*JobsApi* | [**getAllConfigurations**](docs/JobsApi.md#getAllConfigurations) | **GET** /jobs | Retrieve all jobs configurations
*JobsApi* | [**getConfiguration**](docs/JobsApi.md#getConfiguration) | **GET** /jobs/{code} | Retrieve a single job configuration
*LicenseTypeApi* | [**createConfiguration**](docs/LicenseTypeApi.md#createConfiguration) | **POST** /licenseType | Create a new licenseType configuration
*LicenseTypeApi* | [**getConfigurations**](docs/LicenseTypeApi.md#getConfigurations) | **GET** /licenseType | Retrieve all licenseType configurations
*LicenseTypeApi* | [**updateConfiguration**](docs/LicenseTypeApi.md#updateConfiguration) | **PUT** /licenseType/{code} | Update a single licenseType configuration
*LoanTypeApi* | [**createConfiguration**](docs/LoanTypeApi.md#createConfiguration) | **POST** /loanType | Create a new loanType configuration
*LoanTypeApi* | [**getConfigurations**](docs/LoanTypeApi.md#getConfigurations) | **GET** /loanType | Retrieve all loanType configurations
*LoanTypeApi* | [**updateConfiguration**](docs/LoanTypeApi.md#updateConfiguration) | **PUT** /loanType/{code} | Update a single loanType configuration
*LocationsApi* | [**getConfiguration**](docs/LocationsApi.md#getConfiguration) | **GET** /locations/{code} | Retrieve a single location configuration
*LocationsApi* | [**getConfigurations**](docs/LocationsApi.md#getConfigurations) | **GET** /locations | Retrieve all locations configurations
*MaritalStatusApi* | [**createConfigurationUkgPro**](docs/MaritalStatusApi.md#createConfigurationUkgPro) | **POST** /maritalStatus | Create a new maritalStatus configuration
*MaritalStatusApi* | [**getConfigurations**](docs/MaritalStatusApi.md#getConfigurations) | **GET** /maritalStatus | Retrieve all maritalStatus configurations
*MaritalStatusApi* | [**updateConfiguration**](docs/MaritalStatusApi.md#updateConfiguration) | **PUT** /maritalStatus/{code} | Update a single maritalStatus configuration
*MilitaryBranchesApi* | [**configureUkgPro**](docs/MilitaryBranchesApi.md#configureUkgPro) | **POST** /militaryBranches | Create a new militaryBranches configuration
*MilitaryBranchesApi* | [**getAllConfigurations**](docs/MilitaryBranchesApi.md#getAllConfigurations) | **GET** /militaryBranches | Retrieve all militaryBranches configurations
*MilitaryBranchesApi* | [**updateConfiguration**](docs/MilitaryBranchesApi.md#updateConfiguration) | **PUT** /militaryBranches/{code} | Update a single militaryBranches configuration
*MilitaryEraApi* | [**createConfigurationUkgPro**](docs/MilitaryEraApi.md#createConfigurationUkgPro) | **POST** /militaryEra | Create a new militaryEra configuration
*MilitaryEraApi* | [**getConfigurations**](docs/MilitaryEraApi.md#getConfigurations) | **GET** /militaryEra | Retrieve all militaryEra configurations
*MilitaryEraApi* | [**updateConfiguration**](docs/MilitaryEraApi.md#updateConfiguration) | **PUT** /militaryEra/{code} | Update a single militaryEra configuration
*NamePrefixApi* | [**configureNamePrefix**](docs/NamePrefixApi.md#configureNamePrefix) | **POST** /namePrefix | Create a new namePrefix configuration
*NamePrefixApi* | [**getConfigurations**](docs/NamePrefixApi.md#getConfigurations) | **GET** /namePrefix | Retrieve all namePrefix configurations
*NamePrefixApi* | [**updateConfiguration**](docs/NamePrefixApi.md#updateConfiguration) | **PUT** /namePrefix/{code} | Update a single namePrefix configuration
*OtherPhoneTypesApi* | [**createConfigurationUkgPro**](docs/OtherPhoneTypesApi.md#createConfigurationUkgPro) | **POST** /otherPhoneTypes | Create a new otherPhoneTypes configuration
*OtherPhoneTypesApi* | [**getConfigurations**](docs/OtherPhoneTypesApi.md#getConfigurations) | **GET** /otherPhoneTypes | Retrieve all otherPhoneTypes configurations
*OtherPhoneTypesApi* | [**updateConfiguration**](docs/OtherPhoneTypesApi.md#updateConfiguration) | **PUT** /otherPhoneTypes/{code} | Update a single otherPhoneTypes configuration
*ProjectApi* | [**createConfiguration**](docs/ProjectApi.md#createConfiguration) | **POST** /project | Create a new project configuration
*ProjectApi* | [**getAllConfigurations**](docs/ProjectApi.md#getAllConfigurations) | **GET** /project | Retrieve all Project configurations
*ProjectApi* | [**updateConfiguration**](docs/ProjectApi.md#updateConfiguration) | **PUT** /project/{code} | Update a single project configuration
*SchoolApi* | [**createConfiguration**](docs/SchoolApi.md#createConfiguration) | **POST** /school | Create a new school configuration
*SchoolApi* | [**getConfigurations**](docs/SchoolApi.md#getConfigurations) | **GET** /school | Retrieve all school configurations
*SchoolApi* | [**updateConfiguration**](docs/SchoolApi.md#updateConfiguration) | **PUT** /school/{code} | Update a single school configuration
*SkillProficiencyLevelApi* | [**createConfigurationUkgPro**](docs/SkillProficiencyLevelApi.md#createConfigurationUkgPro) | **POST** /skillProficiencyLevel | Create a new skillProficiencyLevel configuration
*SkillProficiencyLevelApi* | [**getAllConfigurations**](docs/SkillProficiencyLevelApi.md#getAllConfigurations) | **GET** /skillProficiencyLevel | Retrieve all skillProficiencyLevel configurations
*SkillProficiencyLevelApi* | [**updateConfiguration**](docs/SkillProficiencyLevelApi.md#updateConfiguration) | **PUT** /skillProficiencyLevel/{code} | Update a single skillProficiencyLevel configuration
*SkillsApi* | [**createConfiguration**](docs/SkillsApi.md#createConfiguration) | **POST** /skills | Create a new skills configuration
*SkillsApi* | [**getConfigurations**](docs/SkillsApi.md#getConfigurations) | **GET** /skills | Retrieve all skills configurations
*SkillsApi* | [**updateConfiguration**](docs/SkillsApi.md#updateConfiguration) | **PUT** /skills/{code} | Update a single skills configuration
*TermTypeApi* | [**createConfiguration**](docs/TermTypeApi.md#createConfiguration) | **POST** /termType | Create a new termType configuration
*TermTypeApi* | [**getConfigurations**](docs/TermTypeApi.md#getConfigurations) | **GET** /termType | Retrieve all termType configurations
*TermTypeApi* | [**updateConfiguration**](docs/TermTypeApi.md#updateConfiguration) | **PUT** /termType/{code} | Update a single termType configuration
*TimeApi* | [**addTimeEntries**](docs/TimeApi.md#addTimeEntries) | **POST** /hoursWorked | Add hours worked entries
*TimeApi* | [**getPendingTransactions**](docs/TimeApi.md#getPendingTransactions) | **GET** /time/pending_clock_transactions | Get pending clock transactions.
*TimeApi* | [**getProcessedTransactions**](docs/TimeApi.md#getProcessedTransactions) | **GET** /time/clock_transactions | Get processed clock transactions.
*TimeApi* | [**getWorkSummaries**](docs/TimeApi.md#getWorkSummaries) | **GET** /time/work_summaries | Obtain work summaries.
*TimeApi* | [**getWorkSummaryById**](docs/TimeApi.md#getWorkSummaryById) | **GET** /time/work_summary | Obtain a work summary.
*V1PlatformConfigurationCustomFieldsDataApi* | [**getFieldsData**](docs/V1PlatformConfigurationCustomFieldsDataApi.md#getFieldsData) | **GET** /personnel/v1/platform-configuration-fields/class-name/{className} | Platform Configuration Fields Data v1
*V2PlatformConfigurationCustomFieldsDataApi* | [**getFieldsData**](docs/V2PlatformConfigurationCustomFieldsDataApi.md#getFieldsData) | **GET** /personnel/v2/platform-configuration-fields/class-name/{className} | Platform Configuration Fields Data v2
*WaiveReasonApi* | [**createConfigurationUkgPro**](docs/WaiveReasonApi.md#createConfigurationUkgPro) | **POST** /waiveReason | Create a new waiveReason configuration
*WaiveReasonApi* | [**getConfigurations**](docs/WaiveReasonApi.md#getConfigurations) | **GET** /waiveReason | Retrieve all waiveReason configurations
*WaiveReasonApi* | [**updateSingleConfiguration**](docs/WaiveReasonApi.md#updateSingleConfiguration) | **PUT** /waiveReason/{code} | Update a single waiveReason configuration


## Documentation for Models

 - [ActivityDto](docs/ActivityDto.md)
 - [Application](docs/Application.md)
 - [ApplicationApplicantSource](docs/ApplicationApplicantSource.md)
 - [ApplicationCandidate](docs/ApplicationCandidate.md)
 - [ApplicationCreator](docs/ApplicationCreator.md)
 - [ApplicationHireDetails](docs/ApplicationHireDetails.md)
 - [ApplicationHireDetailsCompany](docs/ApplicationHireDetailsCompany.md)
 - [ApplicationHireDetailsCompensation](docs/ApplicationHireDetailsCompensation.md)
 - [ApplicationHireDetailsCompensationCurrency](docs/ApplicationHireDetailsCompensationCurrency.md)
 - [ApplicationHireDetailsHiringManager](docs/ApplicationHireDetailsHiringManager.md)
 - [ApplicationHireDetailsOnboardingOwner](docs/ApplicationHireDetailsOnboardingOwner.md)
 - [ApplicationHireDetailsTaxLocation](docs/ApplicationHireDetailsTaxLocation.md)
 - [ApplicationJobBoard](docs/ApplicationJobBoard.md)
 - [ApplicationJobPosting](docs/ApplicationJobPosting.md)
 - [ApplicationOpportunity](docs/ApplicationOpportunity.md)
 - [AuditDetails](docs/AuditDetails.md)
 - [BackgroundChecks](docs/BackgroundChecks.md)
 - [BackgroundChecksApplication](docs/BackgroundChecksApplication.md)
 - [BackgroundChecksAuthor](docs/BackgroundChecksAuthor.md)
 - [BackgroundChecksPackages](docs/BackgroundChecksPackages.md)
 - [Behaviors](docs/Behaviors.md)
 - [BusinessRuleFileUpload](docs/BusinessRuleFileUpload.md)
 - [BusinessRuleImportFileStaging](docs/BusinessRuleImportFileStaging.md)
 - [BusinessRuleImportFileStagingStatus](docs/BusinessRuleImportFileStagingStatus.md)
 - [BusinessRuleImportMessage](docs/BusinessRuleImportMessage.md)
 - [BusinessRuleImportRequest](docs/BusinessRuleImportRequest.md)
 - [CalcGroupDto](docs/CalcGroupDto.md)
 - [Candidate](docs/Candidate.md)
 - [CandidatePreferredLocale](docs/CandidatePreferredLocale.md)
 - [ClockTransactionDto](docs/ClockTransactionDto.md)
 - [ClockTransactionTypeDto](docs/ClockTransactionTypeDto.md)
 - [CodeObject](docs/CodeObject.md)
 - [CodeTablesGET](docs/CodeTablesGET.md)
 - [CodeTablesPOST](docs/CodeTablesPOST.md)
 - [CompanyDetails](docs/CompanyDetails.md)
 - [CompanyPayStatementFilter](docs/CompanyPayStatementFilter.md)
 - [CompanyPayStatementModel](docs/CompanyPayStatementModel.md)
 - [Contact](docs/Contact.md)
 - [ContactInfo](docs/ContactInfo.md)
 - [ContactInfoAddress](docs/ContactInfoAddress.md)
 - [ContactInfoAddressCountry](docs/ContactInfoAddressCountry.md)
 - [ContactInfoAddressCountryName](docs/ContactInfoAddressCountryName.md)
 - [ContactInfoPhone](docs/ContactInfoPhone.md)
 - [CountryQuestionResponses](docs/CountryQuestionResponses.md)
 - [CountryQuestionResponsesQuestion](docs/CountryQuestionResponsesQuestion.md)
 - [Creator](docs/Creator.md)
 - [CreatorBackgroundCheckIntegration](docs/CreatorBackgroundCheckIntegration.md)
 - [CreatorPreferredLocale](docs/CreatorPreferredLocale.md)
 - [DepartmentDto](docs/DepartmentDto.md)
 - [DependentDeductions](docs/DependentDeductions.md)
 - [DirectDepositModel](docs/DirectDepositModel.md)
 - [DocketDto](docs/DocketDto.md)
 - [Earning](docs/Earning.md)
 - [EarningStatusResponse](docs/EarningStatusResponse.md)
 - [EarningsAddTimeClockDataRequest](docs/EarningsAddTimeClockDataRequest.md)
 - [EarningsAddTimeClockDataResponse](docs/EarningsAddTimeClockDataResponse.md)
 - [EarningsDto](docs/EarningsDto.md)
 - [EarningsHistoryBaseElements](docs/EarningsHistoryBaseElements.md)
 - [EducationCriteria](docs/EducationCriteria.md)
 - [EducationCriteriaDegree](docs/EducationCriteriaDegree.md)
 - [Educations](docs/Educations.md)
 - [EducationsDegree](docs/EducationsDegree.md)
 - [EducationsFrom](docs/EducationsFrom.md)
 - [EducationsMajor](docs/EducationsMajor.md)
 - [EducationsMinor](docs/EducationsMinor.md)
 - [EducationsSchool](docs/EducationsSchool.md)
 - [EducationsTo](docs/EducationsTo.md)
 - [EmpCompensationDetails](docs/EmpCompensationDetails.md)
 - [EmpDedHistoryEffectiveChangeDate](docs/EmpDedHistoryEffectiveChangeDate.md)
 - [EmpDeductions](docs/EmpDeductions.md)
 - [EmpEmploymentDetails](docs/EmpEmploymentDetails.md)
 - [EmpGlobalLocalizationElementModel](docs/EmpGlobalLocalizationElementModel.md)
 - [EmpPersonDetails](docs/EmpPersonDetails.md)
 - [EmployeeChangesResponse](docs/EmployeeChangesResponse.md)
 - [EmployeeCobraDetails](docs/EmployeeCobraDetails.md)
 - [EmployeeContract](docs/EmployeeContract.md)
 - [EmployeeDeductionBenefitOptionChangeDate](docs/EmployeeDeductionBenefitOptionChangeDate.md)
 - [EmployeeDemographicDetails](docs/EmployeeDemographicDetails.md)
 - [EmployeeDto](docs/EmployeeDto.md)
 - [EmployeeEducationModel](docs/EmployeeEducationModel.md)
 - [EmployeeEmploymentDetails](docs/EmployeeEmploymentDetails.md)
 - [EmployeeExtendedElements](docs/EmployeeExtendedElements.md)
 - [EmployeeGlobalBanksModel](docs/EmployeeGlobalBanksModel.md)
 - [EmployeeIdentifier](docs/EmployeeIdentifier.md)
 - [EmployeeIdsResponse](docs/EmployeeIdsResponse.md)
 - [EmployeeIdsResponseMultistatusInner](docs/EmployeeIdsResponseMultistatusInner.md)
 - [EmployeeIdsResponseMultistatusInnerBody](docs/EmployeeIdsResponseMultistatusInnerBody.md)
 - [EmployeeIdsResponseMultistatusInnerModelstate](docs/EmployeeIdsResponseMultistatusInnerModelstate.md)
 - [EmployeeIdsResponseMultistatusInnerModelstatePropertyNameInner](docs/EmployeeIdsResponseMultistatusInnerModelstatePropertyNameInner.md)
 - [EmployeeJobDto](docs/EmployeeJobDto.md)
 - [EmployeeJobHistoryDetail](docs/EmployeeJobHistoryDetail.md)
 - [EmployeeMultiPhoneNumbers](docs/EmployeeMultiPhoneNumbers.md)
 - [EmployeeMultipleJobs](docs/EmployeeMultipleJobs.md)
 - [EmployeeMultiplePositions](docs/EmployeeMultiplePositions.md)
 - [EmployeePayDeductionElementsModel](docs/EmployeePayDeductionElementsModel.md)
 - [EmployeePayStatementAccrualsModel](docs/EmployeePayStatementAccrualsModel.md)
 - [EmployeePayStatementDeductionsModel](docs/EmployeePayStatementDeductionsModel.md)
 - [EmployeePayStatementEarningsModel](docs/EmployeePayStatementEarningsModel.md)
 - [EmployeePayStatementIdentifierModel](docs/EmployeePayStatementIdentifierModel.md)
 - [EmployeePayStatementModel](docs/EmployeePayStatementModel.md)
 - [EmployeePayStatementNetPayModel](docs/EmployeePayStatementNetPayModel.md)
 - [EmployeePayStatementRangeFilter](docs/EmployeePayStatementRangeFilter.md)
 - [EmployeePayStatementTaxesModel](docs/EmployeePayStatementTaxesModel.md)
 - [EmployeeProfiles](docs/EmployeeProfiles.md)
 - [EmployeeSecurityUserDetails](docs/EmployeeSecurityUserDetails.md)
 - [EmployeeStatus](docs/EmployeeStatus.md)
 - [EmployeeSupervisorDetails](docs/EmployeeSupervisorDetails.md)
 - [FileStatusModel](docs/FileStatusModel.md)
 - [GeneralLedgerRunDetailsV2](docs/GeneralLedgerRunDetailsV2.md)
 - [HolidayDto](docs/HolidayDto.md)
 - [HourTypeDto](docs/HourTypeDto.md)
 - [Hyperlinks](docs/Hyperlinks.md)
 - [Identifiers](docs/Identifiers.md)
 - [InsuranceRate](docs/InsuranceRate.md)
 - [IntegrationAuditConfiguration](docs/IntegrationAuditConfiguration.md)
 - [InternationalEmployeeModel](docs/InternationalEmployeeModel.md)
 - [JobBoards](docs/JobBoards.md)
 - [JobDto](docs/JobDto.md)
 - [JobGroupDetail](docs/JobGroupDetail.md)
 - [Jobs](docs/Jobs.md)
 - [Licenses](docs/Licenses.md)
 - [LicensesLicense](docs/LicensesLicense.md)
 - [Links](docs/Links.md)
 - [Locations](docs/Locations.md)
 - [LocationsCountry](docs/LocationsCountry.md)
 - [Motivations](docs/Motivations.md)
 - [MultiStatusDtoObject](docs/MultiStatusDtoObject.md)
 - [MultiStatusDtoScheduleModelStateDto](docs/MultiStatusDtoScheduleModelStateDto.md)
 - [MultiStatusResponse](docs/MultiStatusResponse.md)
 - [MultiStatusResponseMultistatusInner](docs/MultiStatusResponseMultistatusInner.md)
 - [MultiStatusResponseMultistatusInnerBody](docs/MultiStatusResponseMultistatusInnerBody.md)
 - [Name](docs/Name.md)
 - [NamePrefix](docs/NamePrefix.md)
 - [NameSuffix](docs/NameSuffix.md)
 - [NationalDocumentModel](docs/NationalDocumentModel.md)
 - [NewHirePostModel](docs/NewHirePostModel.md)
 - [NewHirePostModelCompensation](docs/NewHirePostModelCompensation.md)
 - [NewHirePostModelContactInformation](docs/NewHirePostModelContactInformation.md)
 - [NewHirePostModelContactInformationAddress](docs/NewHirePostModelContactInformationAddress.md)
 - [NewHirePostModelContactInformationName](docs/NewHirePostModelContactInformationName.md)
 - [NewHirePostModelContactInformationNamePrefix](docs/NewHirePostModelContactInformationNamePrefix.md)
 - [NewHirePostModelContactInformationNameSuffix](docs/NewHirePostModelContactInformationNameSuffix.md)
 - [NewHirePostModelJob](docs/NewHirePostModelJob.md)
 - [NewHirePostModelJobComponentCompany](docs/NewHirePostModelJobComponentCompany.md)
 - [NewHirePostModelJobEmployeeType](docs/NewHirePostModelJobEmployeeType.md)
 - [NewHirePostModelJobSupervisor](docs/NewHirePostModelJobSupervisor.md)
 - [NewHirePostModelJobWorkLocation](docs/NewHirePostModelJobWorkLocation.md)
 - [NewHirePostModelMentor](docs/NewHirePostModelMentor.md)
 - [NewHirePostModelOrganizationLevelsInner](docs/NewHirePostModelOrganizationLevelsInner.md)
 - [NewHireReadModel](docs/NewHireReadModel.md)
 - [NewHireReadModelCompensation](docs/NewHireReadModelCompensation.md)
 - [NewHireReadModelCompensationCurrency](docs/NewHireReadModelCompensationCurrency.md)
 - [NewHireReadModelCompensationRatePer](docs/NewHireReadModelCompensationRatePer.md)
 - [NewHireReadModelContactInformation](docs/NewHireReadModelContactInformation.md)
 - [NewHireReadModelContactInformationAddress](docs/NewHireReadModelContactInformationAddress.md)
 - [NewHireReadModelContactInformationAddressCountry](docs/NewHireReadModelContactInformationAddressCountry.md)
 - [NewHireReadModelContactInformationName](docs/NewHireReadModelContactInformationName.md)
 - [NewHireReadModelContactInformationNamePrefix](docs/NewHireReadModelContactInformationNamePrefix.md)
 - [NewHireReadModelContactInformationNameSuffix](docs/NewHireReadModelContactInformationNameSuffix.md)
 - [NewHireReadModelJob](docs/NewHireReadModelJob.md)
 - [NewHireReadModelJobComponentCompany](docs/NewHireReadModelJobComponentCompany.md)
 - [NewHireReadModelJobEmployeeType](docs/NewHireReadModelJobEmployeeType.md)
 - [NewHireReadModelJobSupervisor](docs/NewHireReadModelJobSupervisor.md)
 - [NewHireReadModelJobSupervisorName](docs/NewHireReadModelJobSupervisorName.md)
 - [NewHireReadModelJobSupervisorNamePrefix](docs/NewHireReadModelJobSupervisorNamePrefix.md)
 - [NewHireReadModelJobSupervisorNameSuffix](docs/NewHireReadModelJobSupervisorNameSuffix.md)
 - [NewHireReadModelJobWorkLocation](docs/NewHireReadModelJobWorkLocation.md)
 - [NewHireReadModelMentor](docs/NewHireReadModelMentor.md)
 - [NewHireReadModelMentorName](docs/NewHireReadModelMentorName.md)
 - [NewHireReadModelMentorNamePrefix](docs/NewHireReadModelMentorNamePrefix.md)
 - [NewHireReadModelMentorNameSuffix](docs/NewHireReadModelMentorNameSuffix.md)
 - [NewHireReadModelOnboardingOwner](docs/NewHireReadModelOnboardingOwner.md)
 - [NewHireReadModelOnboardingOwnerName](docs/NewHireReadModelOnboardingOwnerName.md)
 - [NewHireReadModelOnboardingOwnerNamePrefix](docs/NewHireReadModelOnboardingOwnerNamePrefix.md)
 - [NewHireReadModelOnboardingOwnerNameSuffix](docs/NewHireReadModelOnboardingOwnerNameSuffix.md)
 - [NewHireReadModelOrganizationLevelsInner](docs/NewHireReadModelOrganizationLevelsInner.md)
 - [NewHireReadModelProvisioning](docs/NewHireReadModelProvisioning.md)
 - [NewHireReadModelProvisioningProvisioningItemsInner](docs/NewHireReadModelProvisioningProvisioningItemsInner.md)
 - [NewHireReadModelProvisioningProvisioningItemsInnerSelectedOption](docs/NewHireReadModelProvisioningProvisioningItemsInnerSelectedOption.md)
 - [NewHiresCreateSingleNewHire201Response](docs/NewHiresCreateSingleNewHire201Response.md)
 - [NewHiresCreateSingleNewHire201ResponseCompensation](docs/NewHiresCreateSingleNewHire201ResponseCompensation.md)
 - [NewHiresCreateSingleNewHire201ResponseCompensationCurrency](docs/NewHiresCreateSingleNewHire201ResponseCompensationCurrency.md)
 - [NewHiresCreateSingleNewHire201ResponseCompensationRatePer](docs/NewHiresCreateSingleNewHire201ResponseCompensationRatePer.md)
 - [NewHiresCreateSingleNewHire201ResponseContactInformation](docs/NewHiresCreateSingleNewHire201ResponseContactInformation.md)
 - [NewHiresCreateSingleNewHire201ResponseContactInformationAddress](docs/NewHiresCreateSingleNewHire201ResponseContactInformationAddress.md)
 - [NewHiresCreateSingleNewHire201ResponseContactInformationAddressCountry](docs/NewHiresCreateSingleNewHire201ResponseContactInformationAddressCountry.md)
 - [NewHiresCreateSingleNewHire201ResponseContactInformationName](docs/NewHiresCreateSingleNewHire201ResponseContactInformationName.md)
 - [NewHiresCreateSingleNewHire201ResponseContactInformationNamePrefix](docs/NewHiresCreateSingleNewHire201ResponseContactInformationNamePrefix.md)
 - [NewHiresCreateSingleNewHire201ResponseContactInformationNameSuffix](docs/NewHiresCreateSingleNewHire201ResponseContactInformationNameSuffix.md)
 - [NewHiresCreateSingleNewHire201ResponseJob](docs/NewHiresCreateSingleNewHire201ResponseJob.md)
 - [NewHiresCreateSingleNewHire201ResponseJobComponentCompany](docs/NewHiresCreateSingleNewHire201ResponseJobComponentCompany.md)
 - [NewHiresCreateSingleNewHire201ResponseJobEmployeeType](docs/NewHiresCreateSingleNewHire201ResponseJobEmployeeType.md)
 - [NewHiresCreateSingleNewHire201ResponseJobSupervisor](docs/NewHiresCreateSingleNewHire201ResponseJobSupervisor.md)
 - [NewHiresCreateSingleNewHire201ResponseJobSupervisorName](docs/NewHiresCreateSingleNewHire201ResponseJobSupervisorName.md)
 - [NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix](docs/NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix.md)
 - [NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix](docs/NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix.md)
 - [NewHiresCreateSingleNewHire201ResponseJobWorkLocation](docs/NewHiresCreateSingleNewHire201ResponseJobWorkLocation.md)
 - [NewHiresCreateSingleNewHire201ResponseMentor](docs/NewHiresCreateSingleNewHire201ResponseMentor.md)
 - [NewHiresCreateSingleNewHire201ResponseMentorName](docs/NewHiresCreateSingleNewHire201ResponseMentorName.md)
 - [NewHiresCreateSingleNewHire201ResponseMentorNamePrefix](docs/NewHiresCreateSingleNewHire201ResponseMentorNamePrefix.md)
 - [NewHiresCreateSingleNewHire201ResponseMentorNameSuffix](docs/NewHiresCreateSingleNewHire201ResponseMentorNameSuffix.md)
 - [NewHiresCreateSingleNewHire201ResponseOnboardingOwner](docs/NewHiresCreateSingleNewHire201ResponseOnboardingOwner.md)
 - [NewHiresCreateSingleNewHire201ResponseOnboardingOwnerName](docs/NewHiresCreateSingleNewHire201ResponseOnboardingOwnerName.md)
 - [NewHiresCreateSingleNewHire201ResponseOnboardingOwnerNamePrefix](docs/NewHiresCreateSingleNewHire201ResponseOnboardingOwnerNamePrefix.md)
 - [NewHiresCreateSingleNewHire201ResponseOnboardingOwnerNameSuffix](docs/NewHiresCreateSingleNewHire201ResponseOnboardingOwnerNameSuffix.md)
 - [NewHiresCreateSingleNewHire201ResponseOrganizationLevelsInner](docs/NewHiresCreateSingleNewHire201ResponseOrganizationLevelsInner.md)
 - [NewHiresCreateSingleNewHire201ResponseProvisioning](docs/NewHiresCreateSingleNewHire201ResponseProvisioning.md)
 - [NewHiresCreateSingleNewHire201ResponseProvisioningProvisioningItemsInner](docs/NewHiresCreateSingleNewHire201ResponseProvisioningProvisioningItemsInner.md)
 - [NewHiresCreateSingleNewHire201ResponseProvisioningProvisioningItemsInnerSelectedOption](docs/NewHiresCreateSingleNewHire201ResponseProvisioningProvisioningItemsInnerSelectedOption.md)
 - [NewHiresCreateSingleNewHire400Response](docs/NewHiresCreateSingleNewHire400Response.md)
 - [NewHiresCreateSingleNewHire409Response](docs/NewHiresCreateSingleNewHire409Response.md)
 - [NewHiresCreateSingleNewHireRequest](docs/NewHiresCreateSingleNewHireRequest.md)
 - [NewHiresCreateSingleNewHireRequestCompensation](docs/NewHiresCreateSingleNewHireRequestCompensation.md)
 - [NewHiresCreateSingleNewHireRequestContactInformation](docs/NewHiresCreateSingleNewHireRequestContactInformation.md)
 - [NewHiresCreateSingleNewHireRequestContactInformationAddress](docs/NewHiresCreateSingleNewHireRequestContactInformationAddress.md)
 - [NewHiresCreateSingleNewHireRequestContactInformationName](docs/NewHiresCreateSingleNewHireRequestContactInformationName.md)
 - [NewHiresCreateSingleNewHireRequestContactInformationNamePrefix](docs/NewHiresCreateSingleNewHireRequestContactInformationNamePrefix.md)
 - [NewHiresCreateSingleNewHireRequestContactInformationNameSuffix](docs/NewHiresCreateSingleNewHireRequestContactInformationNameSuffix.md)
 - [NewHiresCreateSingleNewHireRequestJob](docs/NewHiresCreateSingleNewHireRequestJob.md)
 - [NewHiresCreateSingleNewHireRequestJobComponentCompany](docs/NewHiresCreateSingleNewHireRequestJobComponentCompany.md)
 - [NewHiresCreateSingleNewHireRequestJobEmployeeType](docs/NewHiresCreateSingleNewHireRequestJobEmployeeType.md)
 - [NewHiresCreateSingleNewHireRequestJobSupervisor](docs/NewHiresCreateSingleNewHireRequestJobSupervisor.md)
 - [NewHiresCreateSingleNewHireRequestJobWorkLocation](docs/NewHiresCreateSingleNewHireRequestJobWorkLocation.md)
 - [NewHiresCreateSingleNewHireRequestMentor](docs/NewHiresCreateSingleNewHireRequestMentor.md)
 - [NewHiresCreateSingleNewHireRequestOrganizationLevelsInner](docs/NewHiresCreateSingleNewHireRequestOrganizationLevelsInner.md)
 - [NewHiresCreateSingleNewHireResponse](docs/NewHiresCreateSingleNewHireResponse.md)
 - [NewHiresCreateSingleNewHireResponseCompensation](docs/NewHiresCreateSingleNewHireResponseCompensation.md)
 - [NewHiresCreateSingleNewHireResponseCompensationCurrency](docs/NewHiresCreateSingleNewHireResponseCompensationCurrency.md)
 - [NewHiresCreateSingleNewHireResponseCompensationRatePer](docs/NewHiresCreateSingleNewHireResponseCompensationRatePer.md)
 - [NewHiresCreateSingleNewHireResponseContactInformation](docs/NewHiresCreateSingleNewHireResponseContactInformation.md)
 - [NewHiresCreateSingleNewHireResponseContactInformationAddress](docs/NewHiresCreateSingleNewHireResponseContactInformationAddress.md)
 - [NewHiresCreateSingleNewHireResponseContactInformationAddressCountry](docs/NewHiresCreateSingleNewHireResponseContactInformationAddressCountry.md)
 - [NewHiresCreateSingleNewHireResponseContactInformationName](docs/NewHiresCreateSingleNewHireResponseContactInformationName.md)
 - [NewHiresCreateSingleNewHireResponseContactInformationNamePrefix](docs/NewHiresCreateSingleNewHireResponseContactInformationNamePrefix.md)
 - [NewHiresCreateSingleNewHireResponseContactInformationNameSuffix](docs/NewHiresCreateSingleNewHireResponseContactInformationNameSuffix.md)
 - [NewHiresCreateSingleNewHireResponseJob](docs/NewHiresCreateSingleNewHireResponseJob.md)
 - [NewHiresCreateSingleNewHireResponseJobComponentCompany](docs/NewHiresCreateSingleNewHireResponseJobComponentCompany.md)
 - [NewHiresCreateSingleNewHireResponseJobEmployeeType](docs/NewHiresCreateSingleNewHireResponseJobEmployeeType.md)
 - [NewHiresCreateSingleNewHireResponseJobSupervisor](docs/NewHiresCreateSingleNewHireResponseJobSupervisor.md)
 - [NewHiresCreateSingleNewHireResponseJobSupervisorName](docs/NewHiresCreateSingleNewHireResponseJobSupervisorName.md)
 - [NewHiresCreateSingleNewHireResponseJobSupervisorNamePrefix](docs/NewHiresCreateSingleNewHireResponseJobSupervisorNamePrefix.md)
 - [NewHiresCreateSingleNewHireResponseJobSupervisorNameSuffix](docs/NewHiresCreateSingleNewHireResponseJobSupervisorNameSuffix.md)
 - [NewHiresCreateSingleNewHireResponseJobWorkLocation](docs/NewHiresCreateSingleNewHireResponseJobWorkLocation.md)
 - [NewHiresCreateSingleNewHireResponseMentor](docs/NewHiresCreateSingleNewHireResponseMentor.md)
 - [NewHiresCreateSingleNewHireResponseMentorName](docs/NewHiresCreateSingleNewHireResponseMentorName.md)
 - [NewHiresCreateSingleNewHireResponseMentorNamePrefix](docs/NewHiresCreateSingleNewHireResponseMentorNamePrefix.md)
 - [NewHiresCreateSingleNewHireResponseMentorNameSuffix](docs/NewHiresCreateSingleNewHireResponseMentorNameSuffix.md)
 - [NewHiresCreateSingleNewHireResponseOnboardingOwner](docs/NewHiresCreateSingleNewHireResponseOnboardingOwner.md)
 - [NewHiresCreateSingleNewHireResponseOnboardingOwnerName](docs/NewHiresCreateSingleNewHireResponseOnboardingOwnerName.md)
 - [NewHiresCreateSingleNewHireResponseOnboardingOwnerNamePrefix](docs/NewHiresCreateSingleNewHireResponseOnboardingOwnerNamePrefix.md)
 - [NewHiresCreateSingleNewHireResponseOnboardingOwnerNameSuffix](docs/NewHiresCreateSingleNewHireResponseOnboardingOwnerNameSuffix.md)
 - [NewHiresCreateSingleNewHireResponseOrganizationLevelsInner](docs/NewHiresCreateSingleNewHireResponseOrganizationLevelsInner.md)
 - [NewHiresCreateSingleNewHireResponseProvisioning](docs/NewHiresCreateSingleNewHireResponseProvisioning.md)
 - [NewHiresCreateSingleNewHireResponseProvisioningProvisioningItemsInner](docs/NewHiresCreateSingleNewHireResponseProvisioningProvisioningItemsInner.md)
 - [NewHiresCreateSingleNewHireResponseProvisioningProvisioningItemsInnerSelectedOption](docs/NewHiresCreateSingleNewHireResponseProvisioningProvisioningItemsInnerSelectedOption.md)
 - [NewHiresGetById200Response](docs/NewHiresGetById200Response.md)
 - [NewHiresGetById200ResponseCompensation](docs/NewHiresGetById200ResponseCompensation.md)
 - [NewHiresGetById200ResponseCompensationCurrency](docs/NewHiresGetById200ResponseCompensationCurrency.md)
 - [NewHiresGetById200ResponseCompensationRatePer](docs/NewHiresGetById200ResponseCompensationRatePer.md)
 - [NewHiresGetById200ResponseContactInformation](docs/NewHiresGetById200ResponseContactInformation.md)
 - [NewHiresGetById200ResponseContactInformationAddress](docs/NewHiresGetById200ResponseContactInformationAddress.md)
 - [NewHiresGetById200ResponseContactInformationAddressCountry](docs/NewHiresGetById200ResponseContactInformationAddressCountry.md)
 - [NewHiresGetById200ResponseContactInformationName](docs/NewHiresGetById200ResponseContactInformationName.md)
 - [NewHiresGetById200ResponseContactInformationNamePrefix](docs/NewHiresGetById200ResponseContactInformationNamePrefix.md)
 - [NewHiresGetById200ResponseContactInformationNameSuffix](docs/NewHiresGetById200ResponseContactInformationNameSuffix.md)
 - [NewHiresGetById200ResponseJob](docs/NewHiresGetById200ResponseJob.md)
 - [NewHiresGetById200ResponseJobComponentCompany](docs/NewHiresGetById200ResponseJobComponentCompany.md)
 - [NewHiresGetById200ResponseJobEmployeeType](docs/NewHiresGetById200ResponseJobEmployeeType.md)
 - [NewHiresGetById200ResponseJobSupervisor](docs/NewHiresGetById200ResponseJobSupervisor.md)
 - [NewHiresGetById200ResponseJobSupervisorName](docs/NewHiresGetById200ResponseJobSupervisorName.md)
 - [NewHiresGetById200ResponseJobSupervisorNamePrefix](docs/NewHiresGetById200ResponseJobSupervisorNamePrefix.md)
 - [NewHiresGetById200ResponseJobSupervisorNameSuffix](docs/NewHiresGetById200ResponseJobSupervisorNameSuffix.md)
 - [NewHiresGetById200ResponseJobWorkLocation](docs/NewHiresGetById200ResponseJobWorkLocation.md)
 - [NewHiresGetById200ResponseMentor](docs/NewHiresGetById200ResponseMentor.md)
 - [NewHiresGetById200ResponseMentorName](docs/NewHiresGetById200ResponseMentorName.md)
 - [NewHiresGetById200ResponseMentorNamePrefix](docs/NewHiresGetById200ResponseMentorNamePrefix.md)
 - [NewHiresGetById200ResponseMentorNameSuffix](docs/NewHiresGetById200ResponseMentorNameSuffix.md)
 - [NewHiresGetById200ResponseOnboardingOwner](docs/NewHiresGetById200ResponseOnboardingOwner.md)
 - [NewHiresGetById200ResponseOnboardingOwnerName](docs/NewHiresGetById200ResponseOnboardingOwnerName.md)
 - [NewHiresGetById200ResponseOnboardingOwnerNamePrefix](docs/NewHiresGetById200ResponseOnboardingOwnerNamePrefix.md)
 - [NewHiresGetById200ResponseOnboardingOwnerNameSuffix](docs/NewHiresGetById200ResponseOnboardingOwnerNameSuffix.md)
 - [NewHiresGetById200ResponseOrganizationLevelsInner](docs/NewHiresGetById200ResponseOrganizationLevelsInner.md)
 - [NewHiresGetById200ResponseProvisioning](docs/NewHiresGetById200ResponseProvisioning.md)
 - [NewHiresGetById200ResponseProvisioningProvisioningItemsInner](docs/NewHiresGetById200ResponseProvisioningProvisioningItemsInner.md)
 - [NewHiresGetById200ResponseProvisioningProvisioningItemsInnerSelectedOption](docs/NewHiresGetById200ResponseProvisioningProvisioningItemsInnerSelectedOption.md)
 - [NewHiresGetById404Response](docs/NewHiresGetById404Response.md)
 - [NewHiresGetById404ResponseAllOf](docs/NewHiresGetById404ResponseAllOf.md)
 - [NewHiresGetById404ResponseAllOf1](docs/NewHiresGetById404ResponseAllOf1.md)
 - [NewHiresGetById404ResponseAllOf1Errors](docs/NewHiresGetById404ResponseAllOf1Errors.md)
 - [NewHiresGetById404ResponseAllOf1ErrorsGeneral](docs/NewHiresGetById404ResponseAllOf1ErrorsGeneral.md)
 - [NewHiresGetByIdResponse](docs/NewHiresGetByIdResponse.md)
 - [NewHiresGetByIdResponseCompensation](docs/NewHiresGetByIdResponseCompensation.md)
 - [NewHiresGetByIdResponseCompensationCurrency](docs/NewHiresGetByIdResponseCompensationCurrency.md)
 - [NewHiresGetByIdResponseCompensationRatePer](docs/NewHiresGetByIdResponseCompensationRatePer.md)
 - [NewHiresGetByIdResponseContactInformation](docs/NewHiresGetByIdResponseContactInformation.md)
 - [NewHiresGetByIdResponseContactInformationAddress](docs/NewHiresGetByIdResponseContactInformationAddress.md)
 - [NewHiresGetByIdResponseContactInformationAddressCountry](docs/NewHiresGetByIdResponseContactInformationAddressCountry.md)
 - [NewHiresGetByIdResponseContactInformationName](docs/NewHiresGetByIdResponseContactInformationName.md)
 - [NewHiresGetByIdResponseContactInformationNamePrefix](docs/NewHiresGetByIdResponseContactInformationNamePrefix.md)
 - [NewHiresGetByIdResponseContactInformationNameSuffix](docs/NewHiresGetByIdResponseContactInformationNameSuffix.md)
 - [NewHiresGetByIdResponseJob](docs/NewHiresGetByIdResponseJob.md)
 - [NewHiresGetByIdResponseJobComponentCompany](docs/NewHiresGetByIdResponseJobComponentCompany.md)
 - [NewHiresGetByIdResponseJobEmployeeType](docs/NewHiresGetByIdResponseJobEmployeeType.md)
 - [NewHiresGetByIdResponseJobSupervisor](docs/NewHiresGetByIdResponseJobSupervisor.md)
 - [NewHiresGetByIdResponseJobSupervisorName](docs/NewHiresGetByIdResponseJobSupervisorName.md)
 - [NewHiresGetByIdResponseJobSupervisorNamePrefix](docs/NewHiresGetByIdResponseJobSupervisorNamePrefix.md)
 - [NewHiresGetByIdResponseJobSupervisorNameSuffix](docs/NewHiresGetByIdResponseJobSupervisorNameSuffix.md)
 - [NewHiresGetByIdResponseJobWorkLocation](docs/NewHiresGetByIdResponseJobWorkLocation.md)
 - [NewHiresGetByIdResponseMentor](docs/NewHiresGetByIdResponseMentor.md)
 - [NewHiresGetByIdResponseMentorName](docs/NewHiresGetByIdResponseMentorName.md)
 - [NewHiresGetByIdResponseMentorNamePrefix](docs/NewHiresGetByIdResponseMentorNamePrefix.md)
 - [NewHiresGetByIdResponseMentorNameSuffix](docs/NewHiresGetByIdResponseMentorNameSuffix.md)
 - [NewHiresGetByIdResponseOnboardingOwner](docs/NewHiresGetByIdResponseOnboardingOwner.md)
 - [NewHiresGetByIdResponseOnboardingOwnerName](docs/NewHiresGetByIdResponseOnboardingOwnerName.md)
 - [NewHiresGetByIdResponseOnboardingOwnerNamePrefix](docs/NewHiresGetByIdResponseOnboardingOwnerNamePrefix.md)
 - [NewHiresGetByIdResponseOnboardingOwnerNameSuffix](docs/NewHiresGetByIdResponseOnboardingOwnerNameSuffix.md)
 - [NewHiresGetByIdResponseOrganizationLevelsInner](docs/NewHiresGetByIdResponseOrganizationLevelsInner.md)
 - [NewHiresGetByIdResponseProvisioning](docs/NewHiresGetByIdResponseProvisioning.md)
 - [NewHiresGetByIdResponseProvisioningProvisioningItemsInner](docs/NewHiresGetByIdResponseProvisioningProvisioningItemsInner.md)
 - [NewHiresGetByIdResponseProvisioningProvisioningItemsInnerSelectedOption](docs/NewHiresGetByIdResponseProvisioningProvisioningItemsInnerSelectedOption.md)
 - [OpenEnrollmentDependentDeductions](docs/OpenEnrollmentDependentDeductions.md)
 - [OpenEnrollmentEmployeeDeductions](docs/OpenEnrollmentEmployeeDeductions.md)
 - [Opportunity](docs/Opportunity.md)
 - [OpportunityCompany](docs/OpportunityCompany.md)
 - [OpportunityCompenasation](docs/OpportunityCompenasation.md)
 - [OpportunityCompenasationCurrency](docs/OpportunityCompenasationCurrency.md)
 - [OpportunityDedaultLocale](docs/OpportunityDedaultLocale.md)
 - [OpportunityDescription](docs/OpportunityDescription.md)
 - [OpportunityDescriptionBrief](docs/OpportunityDescriptionBrief.md)
 - [OpportunityFullTimeEquivalent](docs/OpportunityFullTimeEquivalent.md)
 - [OpportunityHeadCount](docs/OpportunityHeadCount.md)
 - [OpportunityIncumbent](docs/OpportunityIncumbent.md)
 - [OpportunityJobFamily](docs/OpportunityJobFamily.md)
 - [OpportunityRecruitingProcess](docs/OpportunityRecruitingProcess.md)
 - [OptionRate](docs/OptionRate.md)
 - [OrgLevels](docs/OrgLevels.md)
 - [OrgLevelsBodyInner](docs/OrgLevelsBodyInner.md)
 - [OrgUnitGroups](docs/OrgUnitGroups.md)
 - [OrgUnits](docs/OrgUnits.md)
 - [OrgUnitsOrgLevel](docs/OrgUnitsOrgLevel.md)
 - [OrganizationReportingCategoryDetails](docs/OrganizationReportingCategoryDetails.md)
 - [Output](docs/Output.md)
 - [PayGroupDto](docs/PayGroupDto.md)
 - [PayGroupPayPeriods](docs/PayGroupPayPeriods.md)
 - [PayRegister](docs/PayRegister.md)
 - [PayrollDeductionsHistory](docs/PayrollDeductionsHistory.md)
 - [PositionReport](docs/PositionReport.md)
 - [Positions](docs/Positions.md)
 - [PositionsUserDefinedField04](docs/PositionsUserDefinedField04.md)
 - [PostNewTokenRequestObtainOAuthTokenRequest](docs/PostNewTokenRequestObtainOAuthTokenRequest.md)
 - [PostingsInner](docs/PostingsInner.md)
 - [PostingsInnerBehaviorCriteriaInner](docs/PostingsInnerBehaviorCriteriaInner.md)
 - [PostingsInnerBehaviorCriteriaInnerBehavior](docs/PostingsInnerBehaviorCriteriaInnerBehavior.md)
 - [PostingsInnerCompany](docs/PostingsInnerCompany.md)
 - [PostingsInnerDefaultLocale](docs/PostingsInnerDefaultLocale.md)
 - [PostingsInnerDescription](docs/PostingsInnerDescription.md)
 - [PostingsInnerEducationCriteriaInner](docs/PostingsInnerEducationCriteriaInner.md)
 - [PostingsInnerEducationCriteriaInnerDegree](docs/PostingsInnerEducationCriteriaInnerDegree.md)
 - [PostingsInnerEducationCriteriaInnerMajor](docs/PostingsInnerEducationCriteriaInnerMajor.md)
 - [PostingsInnerJobFamily](docs/PostingsInnerJobFamily.md)
 - [PostingsInnerLicenseCriteriaInner](docs/PostingsInnerLicenseCriteriaInner.md)
 - [PostingsInnerLicenseCriteriaInnerLicense](docs/PostingsInnerLicenseCriteriaInnerLicense.md)
 - [PostingsInnerLinksInner](docs/PostingsInnerLinksInner.md)
 - [PostingsInnerLocalesInner](docs/PostingsInnerLocalesInner.md)
 - [PostingsInnerLocationsInner](docs/PostingsInnerLocationsInner.md)
 - [PostingsInnerLocationsInnerCountry](docs/PostingsInnerLocationsInnerCountry.md)
 - [PostingsInnerLocationsInnerState](docs/PostingsInnerLocationsInnerState.md)
 - [PostingsInnerMotivationCriteriaInner](docs/PostingsInnerMotivationCriteriaInner.md)
 - [PostingsInnerMotivationCriteriaInnerMotivation](docs/PostingsInnerMotivationCriteriaInnerMotivation.md)
 - [PostingsInnerOpportunity](docs/PostingsInnerOpportunity.md)
 - [PostingsInnerSkillCriteriaInner](docs/PostingsInnerSkillCriteriaInner.md)
 - [PostingsInnerSkillCriteriaInnerSkill](docs/PostingsInnerSkillCriteriaInnerSkill.md)
 - [PostingsInnerSkillCriteriaInnerSkillProficiencyLevel](docs/PostingsInnerSkillCriteriaInnerSkillProficiencyLevel.md)
 - [PostingsInnerTenant](docs/PostingsInnerTenant.md)
 - [PostingsInnerWorkExperienceCriteriaInner](docs/PostingsInnerWorkExperienceCriteriaInner.md)
 - [ProjectDto](docs/ProjectDto.md)
 - [PtoPlans](docs/PtoPlans.md)
 - [PtoPlansBodyInner](docs/PtoPlansBodyInner.md)
 - [PublishScheduleDetailDto](docs/PublishScheduleDetailDto.md)
 - [ResultDtoActivityDto](docs/ResultDtoActivityDto.md)
 - [ResultDtoClockTransactionDto](docs/ResultDtoClockTransactionDto.md)
 - [ResultDtoEmployeeDto](docs/ResultDtoEmployeeDto.md)
 - [ResultDtoEmployeeJobDto](docs/ResultDtoEmployeeJobDto.md)
 - [ResultDtoHolidayDto](docs/ResultDtoHolidayDto.md)
 - [ResultDtoHourTypeDto](docs/ResultDtoHourTypeDto.md)
 - [ResultDtoTimeCodeDto](docs/ResultDtoTimeCodeDto.md)
 - [ResultDtoTimeOffRequestDto](docs/ResultDtoTimeOffRequestDto.md)
 - [ResultDtoWorkbrainTeamDto](docs/ResultDtoWorkbrainTeamDto.md)
 - [Roles](docs/Roles.md)
 - [ScheduleDetailDto](docs/ScheduleDetailDto.md)
 - [ScheduleModelStateDto](docs/ScheduleModelStateDto.md)
 - [Screening](docs/Screening.md)
 - [ScreeningQuestionResponses](docs/ScreeningQuestionResponses.md)
 - [ScreeningQuestionResponsesQuestions](docs/ScreeningQuestionResponsesQuestions.md)
 - [ShiftCodeGetList](docs/ShiftCodeGetList.md)
 - [SingleStatusDtoObject](docs/SingleStatusDtoObject.md)
 - [Skill](docs/Skill.md)
 - [SkillProficiencyLevel](docs/SkillProficiencyLevel.md)
 - [SkillSkill](docs/SkillSkill.md)
 - [SkillSkillName](docs/SkillSkillName.md)
 - [StateDto](docs/StateDto.md)
 - [TaxGroupsDetails](docs/TaxGroupsDetails.md)
 - [TeamDto](docs/TeamDto.md)
 - [TimeCodeDto](docs/TimeCodeDto.md)
 - [TimeItem](docs/TimeItem.md)
 - [TimeItemList](docs/TimeItemList.md)
 - [TimeOffReasonDto](docs/TimeOffReasonDto.md)
 - [TimeOffRequestDayDto](docs/TimeOffRequestDayDto.md)
 - [TimeOffRequestDto](docs/TimeOffRequestDto.md)
 - [TimeOffTypeDto](docs/TimeOffTypeDto.md)
 - [TimesheetDtoWorkSummaryDto](docs/TimesheetDtoWorkSummaryDto.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [Translations](docs/Translations.md)
 - [UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema](docs/UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.md)
 - [UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcSchemaFilter](docs/UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcSchemaFilter.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStaging](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStaging.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStagingStatus](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStagingStatus.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportMessage](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportMessage.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportRequest](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportRequest.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsFieldData](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsFieldData.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsPcData](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsPcData.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsFieldData](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsFieldData.md)
 - [UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData](docs/UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData.md)
 - [UserDefinedFields](docs/UserDefinedFields.md)
 - [UserDefinedFieldsInternationalUserDefinedFields](docs/UserDefinedFieldsInternationalUserDefinedFields.md)
 - [UserDefinedFieldsPersonnelUserDefinedFields](docs/UserDefinedFieldsPersonnelUserDefinedFields.md)
 - [UserDefinedFieldsPersonnelUserDefinedFieldsPersonnelUDField01](docs/UserDefinedFieldsPersonnelUserDefinedFieldsPersonnelUDField01.md)
 - [UserDefinedFieldsPersonnelUserDefinedFieldsPersonnelUDField03](docs/UserDefinedFieldsPersonnelUserDefinedFieldsPersonnelUDField03.md)
 - [UserDefinedFieldsPersonnelUserDefinedFieldsPersonnelUDField05](docs/UserDefinedFieldsPersonnelUserDefinedFieldsPersonnelUDField05.md)
 - [UserDetails](docs/UserDetails.md)
 - [UserPreferencesDetails](docs/UserPreferencesDetails.md)
 - [UserProfileDetails](docs/UserProfileDetails.md)
 - [WorkDetailDto](docs/WorkDetailDto.md)
 - [WorkSummaryClockDto](docs/WorkSummaryClockDto.md)
 - [WorkSummaryClocksDto](docs/WorkSummaryClocksDto.md)
 - [WorkSummaryDto](docs/WorkSummaryDto.md)
 - [WorkbrainTeamDto](docs/WorkbrainTeamDto.md)
 - [Workexperience](docs/Workexperience.md)
 - [WorkexperienceFrom](docs/WorkexperienceFrom.md)
 - [WorkexperienceTo](docs/WorkexperienceTo.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
