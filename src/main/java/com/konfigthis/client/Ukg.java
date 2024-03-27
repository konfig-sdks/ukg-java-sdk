package com.konfigthis.client;

import com.konfigthis.client.api.ActivitiesApi;
import com.konfigthis.client.api.AssignedHolidaysApi;
import com.konfigthis.client.api.AuditDetailsApi;
import com.konfigthis.client.api.BusinessRuleImportToolApi;
import com.konfigthis.client.api.BusinessStructureStatusApi;
import com.konfigthis.client.api.CandidateRequestApi;
import com.konfigthis.client.api.ChangesByDateApi;
import com.konfigthis.client.api.CodeTablesApi;
import com.konfigthis.client.api.CompanyDetailsApi;
import com.konfigthis.client.api.CompanyPayStatementApi;
import com.konfigthis.client.api.CompensationDetailsApi;
import com.konfigthis.client.api.ContactApi;
import com.konfigthis.client.api.DependentDeductionsApi;
import com.konfigthis.client.api.DirectDepositApi;
import com.konfigthis.client.api.EarningsApi;
import com.konfigthis.client.api.EarningsHistoryApi;
import com.konfigthis.client.api.EmpDedBenOptionDateApi;
import com.konfigthis.client.api.EmpDeductionsApi;
import com.konfigthis.client.api.EmpGlobalLocalizationElementApi;
import com.konfigthis.client.api.EmpMultiplePositionsApi;
import com.konfigthis.client.api.EmployeeChangesApi;
import com.konfigthis.client.api.EmployeeDeductionHistoryEffectiveDateApi;
import com.konfigthis.client.api.EmployeeDemographicDetailsApi;
import com.konfigthis.client.api.EmployeeIdLookupApi;
import com.konfigthis.client.api.EmployeeJobsApi;
import com.konfigthis.client.api.EmployeeSecurityUserDetailsApi;
import com.konfigthis.client.api.EmployeeCobraDetailsApi;
import com.konfigthis.client.api.EmployeeContractApi;
import com.konfigthis.client.api.EmployeeEducationApi;
import com.konfigthis.client.api.EmployeeEmploymentDetailsApi;
import com.konfigthis.client.api.EmployeeExtendedElementsApi;
import com.konfigthis.client.api.EmployeeGlobalBankApi;
import com.konfigthis.client.api.EmployeeJobHistoryDetailApi;
import com.konfigthis.client.api.EmployeeMultiPhoneNumbersApi;
import com.konfigthis.client.api.EmployeeMultipleJobsOppApi;
import com.konfigthis.client.api.EmployeePayDeductionElementApi;
import com.konfigthis.client.api.EmployeePayStatementApi;
import com.konfigthis.client.api.EmployeeSupervisorDetailsApi;
import com.konfigthis.client.api.EmployeesApi;
import com.konfigthis.client.api.EmploymentDetailsApi;
import com.konfigthis.client.api.GeneralLedgerRunDetailsV2Api;
import com.konfigthis.client.api.GetAllPtoPlansApi;
import com.konfigthis.client.api.GetJobPostingsApi;
import com.konfigthis.client.api.GetSpecificEmployeesPtoPlansApi;
import com.konfigthis.client.api.GetSpecificPtoPlanApi;
import com.konfigthis.client.api.HourTypesApi;
import com.konfigthis.client.api.ImportToolApi;
import com.konfigthis.client.api.InsRateApi;
import com.konfigthis.client.api.IntegrationAuditConfigurationApi;
import com.konfigthis.client.api.InternationalEmployeeApi;
import com.konfigthis.client.api.JobGroupApi;
import com.konfigthis.client.api.KronosEmployeeProfilesApi;
import com.konfigthis.client.api.KronosEmployeeStatusApi;
import com.konfigthis.client.api.NationalDocumentApi;
import com.konfigthis.client.api.NewHiresApi;
import com.konfigthis.client.api.OpenEnrollmentDependentDeductionsApi;
import com.konfigthis.client.api.OpenEnrollmentEmployeeDeductionsApi;
import com.konfigthis.client.api.OptionRateApi;
import com.konfigthis.client.api.OrderRequestsApi;
import com.konfigthis.client.api.OrganizationReportingCategoryApi;
import com.konfigthis.client.api.PtoPlanPatchApi;
import com.konfigthis.client.api.PtoPlanPostApi;
import com.konfigthis.client.api.PayGroupPayPeriodApi;
import com.konfigthis.client.api.PayRegisterApi;
import com.konfigthis.client.api.PayrollDeductionsHistoryApi;
import com.konfigthis.client.api.PersonDetailsApi;
import com.konfigthis.client.api.PlatformConfigurationCustomFieldsSchemaApi;
import com.konfigthis.client.api.PositionReportApi;
import com.konfigthis.client.api.PositionsApi;
import com.konfigthis.client.api.PostNewTokenRequestApi;
import com.konfigthis.client.api.RolesGetApi;
import com.konfigthis.client.api.ScheduleDetailsApi;
import com.konfigthis.client.api.ShiftCodeApi;
import com.konfigthis.client.api.SingleOrganizationLevelApi;
import com.konfigthis.client.api.TaxGroupsApi;
import com.konfigthis.client.api.TeamsApi;
import com.konfigthis.client.api.TimeCodesApi;
import com.konfigthis.client.api.TimeOffRequestsApi;
import com.konfigthis.client.api.UtaEmployeeApi;
import com.konfigthis.client.api.UserPreferencesApi;
import com.konfigthis.client.api.UserProfileDetailsApi;
import com.konfigthis.client.api.UserDefinedFieldsApi;
import com.konfigthis.client.api.UserDetailsApi;
import com.konfigthis.client.api.ViewOrCreateOrganizationLevelsApi;
import com.konfigthis.client.api.AllergyApi;
import com.konfigthis.client.api.AwardTypeApi;
import com.konfigthis.client.api.CareerProviderApi;
import com.konfigthis.client.api.ChildSupportTypeApi;
import com.konfigthis.client.api.CobraStatusApi;
import com.konfigthis.client.api.CompanyPropertyApi;
import com.konfigthis.client.api.CourseCategoryApi;
import com.konfigthis.client.api.CourseDeliveryMetApi;
import com.konfigthis.client.api.CourseSubCategoryApi;
import com.konfigthis.client.api.DisabilityApi;
import com.konfigthis.client.api.EmployeeTypeApi;
import com.konfigthis.client.api.JobFamilyApi;
import com.konfigthis.client.api.JobsApi;
import com.konfigthis.client.api.LicenseTypeApi;
import com.konfigthis.client.api.LoanTypeApi;
import com.konfigthis.client.api.LocationsApi;
import com.konfigthis.client.api.MaritalStatusApi;
import com.konfigthis.client.api.MilitaryBranchesApi;
import com.konfigthis.client.api.MilitaryEraApi;
import com.konfigthis.client.api.NamePrefixApi;
import com.konfigthis.client.api.OtherPhoneTypesApi;
import com.konfigthis.client.api.ProjectApi;
import com.konfigthis.client.api.SchoolApi;
import com.konfigthis.client.api.SkillProficiencyLevelApi;
import com.konfigthis.client.api.SkillsApi;
import com.konfigthis.client.api.TermTypeApi;
import com.konfigthis.client.api.TimeApi;
import com.konfigthis.client.api.V1PlatformConfigurationCustomFieldsDataApi;
import com.konfigthis.client.api.V2PlatformConfigurationCustomFieldsDataApi;
import com.konfigthis.client.api.WaiveReasonApi;

public class Ukg {
    private ApiClient apiClient;
    public final ActivitiesApi activities;
    public final AssignedHolidaysApi assignedHolidays;
    public final AuditDetailsApi auditDetails;
    public final BusinessRuleImportToolApi businessRuleImportTool;
    public final BusinessStructureStatusApi businessStructureStatus;
    public final CandidateRequestApi candidateRequest;
    public final ChangesByDateApi changesByDate;
    public final CodeTablesApi codeTables;
    public final CompanyDetailsApi companyDetails;
    public final CompanyPayStatementApi companyPayStatement;
    public final CompensationDetailsApi compensationDetails;
    public final ContactApi contact;
    public final DependentDeductionsApi dependentDeductions;
    public final DirectDepositApi directDeposit;
    public final EarningsApi earnings;
    public final EarningsHistoryApi earningsHistory;
    public final EmpDedBenOptionDateApi empDedBenOptionDate;
    public final EmpDeductionsApi empDeductions;
    public final EmpGlobalLocalizationElementApi empGlobalLocalizationElement;
    public final EmpMultiplePositionsApi empMultiplePositions;
    public final EmployeeChangesApi employeeChanges;
    public final EmployeeDeductionHistoryEffectiveDateApi employeeDeductionHistoryEffectiveDate;
    public final EmployeeDemographicDetailsApi employeeDemographicDetails;
    public final EmployeeIdLookupApi employeeIdLookup;
    public final EmployeeJobsApi employeeJobs;
    public final EmployeeSecurityUserDetailsApi employeeSecurityUserDetails;
    public final EmployeeCobraDetailsApi employeeCobraDetails;
    public final EmployeeContractApi employeeContract;
    public final EmployeeEducationApi employeeEducation;
    public final EmployeeEmploymentDetailsApi employeeEmploymentDetails;
    public final EmployeeExtendedElementsApi employeeExtendedElements;
    public final EmployeeGlobalBankApi employeeGlobalBank;
    public final EmployeeJobHistoryDetailApi employeeJobHistoryDetail;
    public final EmployeeMultiPhoneNumbersApi employeeMultiPhoneNumbers;
    public final EmployeeMultipleJobsOppApi employeeMultipleJobsOpp;
    public final EmployeePayDeductionElementApi employeePayDeductionElement;
    public final EmployeePayStatementApi employeePayStatement;
    public final EmployeeSupervisorDetailsApi employeeSupervisorDetails;
    public final EmployeesApi employees;
    public final EmploymentDetailsApi employmentDetails;
    public final GeneralLedgerRunDetailsV2Api generalLedgerRunDetailsV2;
    public final GetAllPtoPlansApi getAllPtoPlans;
    public final GetJobPostingsApi getJobPostings;
    public final GetSpecificEmployeesPtoPlansApi getSpecificEmployeesPtoPlans;
    public final GetSpecificPtoPlanApi getSpecificPtoPlan;
    public final HourTypesApi hourTypes;
    public final ImportToolApi importTool;
    public final InsRateApi insRate;
    public final IntegrationAuditConfigurationApi integrationAuditConfiguration;
    public final InternationalEmployeeApi internationalEmployee;
    public final JobGroupApi jobGroup;
    public final KronosEmployeeProfilesApi kronosEmployeeProfiles;
    public final KronosEmployeeStatusApi kronosEmployeeStatus;
    public final NationalDocumentApi nationalDocument;
    public final NewHiresApi newHires;
    public final OpenEnrollmentDependentDeductionsApi openEnrollmentDependentDeductions;
    public final OpenEnrollmentEmployeeDeductionsApi openEnrollmentEmployeeDeductions;
    public final OptionRateApi optionRate;
    public final OrderRequestsApi orderRequests;
    public final OrganizationReportingCategoryApi organizationReportingCategory;
    public final PtoPlanPatchApi ptoPlanPatch;
    public final PtoPlanPostApi ptoPlanPost;
    public final PayGroupPayPeriodApi payGroupPayPeriod;
    public final PayRegisterApi payRegister;
    public final PayrollDeductionsHistoryApi payrollDeductionsHistory;
    public final PersonDetailsApi personDetails;
    public final PlatformConfigurationCustomFieldsSchemaApi platformConfigurationCustomFieldsSchema;
    public final PositionReportApi positionReport;
    public final PositionsApi positions;
    public final PostNewTokenRequestApi postNewTokenRequest;
    public final RolesGetApi rolesGet;
    public final ScheduleDetailsApi scheduleDetails;
    public final ShiftCodeApi shiftCode;
    public final SingleOrganizationLevelApi singleOrganizationLevel;
    public final TaxGroupsApi taxGroups;
    public final TeamsApi teams;
    public final TimeCodesApi timeCodes;
    public final TimeOffRequestsApi timeOffRequests;
    public final UtaEmployeeApi utaEmployee;
    public final UserPreferencesApi userPreferences;
    public final UserProfileDetailsApi userProfileDetails;
    public final UserDefinedFieldsApi userDefinedFields;
    public final UserDetailsApi userDetails;
    public final ViewOrCreateOrganizationLevelsApi viewOrCreateOrganizationLevels;
    public final AllergyApi allergy;
    public final AwardTypeApi awardType;
    public final CareerProviderApi careerProvider;
    public final ChildSupportTypeApi childSupportType;
    public final CobraStatusApi cobraStatus;
    public final CompanyPropertyApi companyProperty;
    public final CourseCategoryApi courseCategory;
    public final CourseDeliveryMetApi courseDeliveryMet;
    public final CourseSubCategoryApi courseSubCategory;
    public final DisabilityApi disability;
    public final EmployeeTypeApi employeeType;
    public final JobFamilyApi jobFamily;
    public final JobsApi jobs;
    public final LicenseTypeApi licenseType;
    public final LoanTypeApi loanType;
    public final LocationsApi locations;
    public final MaritalStatusApi maritalStatus;
    public final MilitaryBranchesApi militaryBranches;
    public final MilitaryEraApi militaryEra;
    public final NamePrefixApi namePrefix;
    public final OtherPhoneTypesApi otherPhoneTypes;
    public final ProjectApi project;
    public final SchoolApi school;
    public final SkillProficiencyLevelApi skillProficiencyLevel;
    public final SkillsApi skills;
    public final TermTypeApi termType;
    public final TimeApi time;
    public final V1PlatformConfigurationCustomFieldsDataApi v1PlatformConfigurationCustomFieldsData;
    public final V2PlatformConfigurationCustomFieldsDataApi v2PlatformConfigurationCustomFieldsData;
    public final WaiveReasonApi waiveReason;

    public Ukg() {
        this(null);
    }

    public Ukg(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.activities = new ActivitiesApi(this.apiClient);
        this.assignedHolidays = new AssignedHolidaysApi(this.apiClient);
        this.auditDetails = new AuditDetailsApi(this.apiClient);
        this.businessRuleImportTool = new BusinessRuleImportToolApi(this.apiClient);
        this.businessStructureStatus = new BusinessStructureStatusApi(this.apiClient);
        this.candidateRequest = new CandidateRequestApi(this.apiClient);
        this.changesByDate = new ChangesByDateApi(this.apiClient);
        this.codeTables = new CodeTablesApi(this.apiClient);
        this.companyDetails = new CompanyDetailsApi(this.apiClient);
        this.companyPayStatement = new CompanyPayStatementApi(this.apiClient);
        this.compensationDetails = new CompensationDetailsApi(this.apiClient);
        this.contact = new ContactApi(this.apiClient);
        this.dependentDeductions = new DependentDeductionsApi(this.apiClient);
        this.directDeposit = new DirectDepositApi(this.apiClient);
        this.earnings = new EarningsApi(this.apiClient);
        this.earningsHistory = new EarningsHistoryApi(this.apiClient);
        this.empDedBenOptionDate = new EmpDedBenOptionDateApi(this.apiClient);
        this.empDeductions = new EmpDeductionsApi(this.apiClient);
        this.empGlobalLocalizationElement = new EmpGlobalLocalizationElementApi(this.apiClient);
        this.empMultiplePositions = new EmpMultiplePositionsApi(this.apiClient);
        this.employeeChanges = new EmployeeChangesApi(this.apiClient);
        this.employeeDeductionHistoryEffectiveDate = new EmployeeDeductionHistoryEffectiveDateApi(this.apiClient);
        this.employeeDemographicDetails = new EmployeeDemographicDetailsApi(this.apiClient);
        this.employeeIdLookup = new EmployeeIdLookupApi(this.apiClient);
        this.employeeJobs = new EmployeeJobsApi(this.apiClient);
        this.employeeSecurityUserDetails = new EmployeeSecurityUserDetailsApi(this.apiClient);
        this.employeeCobraDetails = new EmployeeCobraDetailsApi(this.apiClient);
        this.employeeContract = new EmployeeContractApi(this.apiClient);
        this.employeeEducation = new EmployeeEducationApi(this.apiClient);
        this.employeeEmploymentDetails = new EmployeeEmploymentDetailsApi(this.apiClient);
        this.employeeExtendedElements = new EmployeeExtendedElementsApi(this.apiClient);
        this.employeeGlobalBank = new EmployeeGlobalBankApi(this.apiClient);
        this.employeeJobHistoryDetail = new EmployeeJobHistoryDetailApi(this.apiClient);
        this.employeeMultiPhoneNumbers = new EmployeeMultiPhoneNumbersApi(this.apiClient);
        this.employeeMultipleJobsOpp = new EmployeeMultipleJobsOppApi(this.apiClient);
        this.employeePayDeductionElement = new EmployeePayDeductionElementApi(this.apiClient);
        this.employeePayStatement = new EmployeePayStatementApi(this.apiClient);
        this.employeeSupervisorDetails = new EmployeeSupervisorDetailsApi(this.apiClient);
        this.employees = new EmployeesApi(this.apiClient);
        this.employmentDetails = new EmploymentDetailsApi(this.apiClient);
        this.generalLedgerRunDetailsV2 = new GeneralLedgerRunDetailsV2Api(this.apiClient);
        this.getAllPtoPlans = new GetAllPtoPlansApi(this.apiClient);
        this.getJobPostings = new GetJobPostingsApi(this.apiClient);
        this.getSpecificEmployeesPtoPlans = new GetSpecificEmployeesPtoPlansApi(this.apiClient);
        this.getSpecificPtoPlan = new GetSpecificPtoPlanApi(this.apiClient);
        this.hourTypes = new HourTypesApi(this.apiClient);
        this.importTool = new ImportToolApi(this.apiClient);
        this.insRate = new InsRateApi(this.apiClient);
        this.integrationAuditConfiguration = new IntegrationAuditConfigurationApi(this.apiClient);
        this.internationalEmployee = new InternationalEmployeeApi(this.apiClient);
        this.jobGroup = new JobGroupApi(this.apiClient);
        this.kronosEmployeeProfiles = new KronosEmployeeProfilesApi(this.apiClient);
        this.kronosEmployeeStatus = new KronosEmployeeStatusApi(this.apiClient);
        this.nationalDocument = new NationalDocumentApi(this.apiClient);
        this.newHires = new NewHiresApi(this.apiClient);
        this.openEnrollmentDependentDeductions = new OpenEnrollmentDependentDeductionsApi(this.apiClient);
        this.openEnrollmentEmployeeDeductions = new OpenEnrollmentEmployeeDeductionsApi(this.apiClient);
        this.optionRate = new OptionRateApi(this.apiClient);
        this.orderRequests = new OrderRequestsApi(this.apiClient);
        this.organizationReportingCategory = new OrganizationReportingCategoryApi(this.apiClient);
        this.ptoPlanPatch = new PtoPlanPatchApi(this.apiClient);
        this.ptoPlanPost = new PtoPlanPostApi(this.apiClient);
        this.payGroupPayPeriod = new PayGroupPayPeriodApi(this.apiClient);
        this.payRegister = new PayRegisterApi(this.apiClient);
        this.payrollDeductionsHistory = new PayrollDeductionsHistoryApi(this.apiClient);
        this.personDetails = new PersonDetailsApi(this.apiClient);
        this.platformConfigurationCustomFieldsSchema = new PlatformConfigurationCustomFieldsSchemaApi(this.apiClient);
        this.positionReport = new PositionReportApi(this.apiClient);
        this.positions = new PositionsApi(this.apiClient);
        this.postNewTokenRequest = new PostNewTokenRequestApi(this.apiClient);
        this.rolesGet = new RolesGetApi(this.apiClient);
        this.scheduleDetails = new ScheduleDetailsApi(this.apiClient);
        this.shiftCode = new ShiftCodeApi(this.apiClient);
        this.singleOrganizationLevel = new SingleOrganizationLevelApi(this.apiClient);
        this.taxGroups = new TaxGroupsApi(this.apiClient);
        this.teams = new TeamsApi(this.apiClient);
        this.timeCodes = new TimeCodesApi(this.apiClient);
        this.timeOffRequests = new TimeOffRequestsApi(this.apiClient);
        this.utaEmployee = new UtaEmployeeApi(this.apiClient);
        this.userPreferences = new UserPreferencesApi(this.apiClient);
        this.userProfileDetails = new UserProfileDetailsApi(this.apiClient);
        this.userDefinedFields = new UserDefinedFieldsApi(this.apiClient);
        this.userDetails = new UserDetailsApi(this.apiClient);
        this.viewOrCreateOrganizationLevels = new ViewOrCreateOrganizationLevelsApi(this.apiClient);
        this.allergy = new AllergyApi(this.apiClient);
        this.awardType = new AwardTypeApi(this.apiClient);
        this.careerProvider = new CareerProviderApi(this.apiClient);
        this.childSupportType = new ChildSupportTypeApi(this.apiClient);
        this.cobraStatus = new CobraStatusApi(this.apiClient);
        this.companyProperty = new CompanyPropertyApi(this.apiClient);
        this.courseCategory = new CourseCategoryApi(this.apiClient);
        this.courseDeliveryMet = new CourseDeliveryMetApi(this.apiClient);
        this.courseSubCategory = new CourseSubCategoryApi(this.apiClient);
        this.disability = new DisabilityApi(this.apiClient);
        this.employeeType = new EmployeeTypeApi(this.apiClient);
        this.jobFamily = new JobFamilyApi(this.apiClient);
        this.jobs = new JobsApi(this.apiClient);
        this.licenseType = new LicenseTypeApi(this.apiClient);
        this.loanType = new LoanTypeApi(this.apiClient);
        this.locations = new LocationsApi(this.apiClient);
        this.maritalStatus = new MaritalStatusApi(this.apiClient);
        this.militaryBranches = new MilitaryBranchesApi(this.apiClient);
        this.militaryEra = new MilitaryEraApi(this.apiClient);
        this.namePrefix = new NamePrefixApi(this.apiClient);
        this.otherPhoneTypes = new OtherPhoneTypesApi(this.apiClient);
        this.project = new ProjectApi(this.apiClient);
        this.school = new SchoolApi(this.apiClient);
        this.skillProficiencyLevel = new SkillProficiencyLevelApi(this.apiClient);
        this.skills = new SkillsApi(this.apiClient);
        this.termType = new TermTypeApi(this.apiClient);
        this.time = new TimeApi(this.apiClient);
        this.v1PlatformConfigurationCustomFieldsData = new V1PlatformConfigurationCustomFieldsDataApi(this.apiClient);
        this.v2PlatformConfigurationCustomFieldsData = new V2PlatformConfigurationCustomFieldsDataApi(this.apiClient);
        this.waiveReason = new WaiveReasonApi(this.apiClient);
    }

}
