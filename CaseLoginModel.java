package com.hotfoot.rapid.los.app.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class CaseLoginModel {
	
	@JsonProperty("rep_name_of_ro")
	@SerializedName("rep_name_of_ro")
	private String nameOfRO;
	
	@JsonProperty("rep_ro_employee_id")
	@SerializedName("rep_ro_employee_id")
	private String roEmpId;
	
	@JsonProperty("rep_crm_lead_no")
	@SerializedName("rep_crm_lead_no")
	private String crmLeadNo;
	
	@JsonProperty("rep_login_date_time")
	@SerializedName("rep_login_date_time")
	private String loginDateTime;

	@JsonProperty("customer_details")
	@SerializedName("customer_details")
	List<CaseLoginCustomerDetails> customerDetails;
	
	@JsonProperty("rep_signed_application_form")
	@SerializedName("rep_signed_application_form")
	private String signedApplicationForm;
	
	@JsonProperty("rep_imd_cheque_paytm")
	@SerializedName("rep_imd_cheque_paytm")
	private String imdChequePaytm;
	
	@JsonProperty("rep_bank_statement")
	@SerializedName("rep_bank_statement")
	private String bankStatement;
	
	@JsonProperty("rep_income_documents")
	@SerializedName("rep_income_documents")
	private String incomeDocuments;
	
	@JsonProperty("rep_business_salary_proof")
	@SerializedName("rep_business_salary_proof")
	private String businessSalaryProof;
	
	@JsonProperty("rep_property_papers")
	@SerializedName("rep_property_papers")
	private String propertyPapers;
	
	@JsonProperty("loan_details")
	@SerializedName("loan_details")
	private List<CaseLoginLoanDetails> loanDetails;
	
	@JsonProperty("rep_occupation_of_customer")
	@SerializedName("rep_occupation_of_customer")
	private String occupationOfCustomer;
	
	@JsonProperty("rep_mode_of_salary")
	@SerializedName("rep_mode_of_salary")
	private String modeOfSalary;
	
	@JsonProperty("rep_customer_profile")
	@SerializedName("rep_customer_profile")
	private String customerProfile;
	
	@JsonProperty("rep_existing_customer")
	@SerializedName("rep_existing_customer")
	private String existingCustomer;
	
	@JsonProperty("rep_business_employed")
	@SerializedName("rep_business_employed")
	private String businessEmployed;
	
	@JsonProperty("rep_entity_business_employer")
	@SerializedName("rep_entity_business_employer")
	private String entityBusinessEmployer;
	
	@JsonProperty("rep_monthly_income")
	@SerializedName("rep_monthly_income")
	private String monthlyIncome;
	
	@JsonProperty("rep_present_residence_type")
	@SerializedName("rep_present_residence_type")
	private String presentResidenceType;
	
	@JsonProperty("rep_present_residence_months")
	@SerializedName("rep_present_residence_months")
	private String presentResidenceMonths;
	
	@JsonProperty("rep_present_residence_years")
	@SerializedName("rep_present_residence_years")
	private String presentResidenceYears;
	
	@JsonProperty("rep_living_city_years")
	@SerializedName("rep_living_city_years")
	private String livingCityYears;
	
	@JsonProperty("rep_living_city_months")
	@SerializedName("rep_living_city_months")
	private String livingCityMonths;
	
	@JsonProperty("rep_number_of_family_members")
	@SerializedName("rep_number_of_family_members")
	private String numberOfFamilyMembers;
	
	@JsonProperty("rep_details_of_family_members")
	@SerializedName("rep_details_of_family_members")
	private String detailsOfFamilyMembers;
	
	@JsonProperty("rep_monthly_household_expenses")
	@SerializedName("rep_monthly_household_expenses")
	private String monthlyHouseholdExpenses;
	
	@JsonProperty("rep_number_of_dependents")
	@SerializedName("rep_number_of_dependents")
	private String numberOfDependents;
	
	@JsonProperty("rep_customer_known")
	@SerializedName("rep_customer_known")
	private String customerKnown;
	
	@JsonProperty("rep_borrower_behavior")
	@SerializedName("rep_borrower_behavior")
	private String borrowerBehavior;
	
	@JsonProperty("res_any_dispute")
	@SerializedName("res_any_dispute")
	private String anyDispute;
	
	@JsonProperty("rep_associated_political")
	@SerializedName("rep_associated_political")
	private String associatedPolitical;
	
	@JsonProperty("rep_illegal_activities")
	@SerializedName("rep_illegal_activities")
	private String illegalActivities;
	
	@JsonProperty("rep_name_of_reference1")
	@SerializedName("rep_name_of_reference1")
	private String nameOfReference1;
	
	@JsonProperty("rep_name_of_reference2")
	@SerializedName("rep_name_of_reference2")
	private String nameOfReference2;
	
	@JsonProperty("rep_number_of_reference1")
	@SerializedName("rep_number_of_reference1")
	private String numberOfReference1;
	
	@JsonProperty("rep_number_of_reference2")
	@SerializedName("rep_number_of_reference2")
	private String numberOfReference2;
	
	@JsonProperty("rep_address_of_referencec1")
	@SerializedName("rep_address_of_referencec1")
	private String addressOfReferencec1;
	
	@JsonProperty("rep_address_of_referencec2")
	@SerializedName("rep_address_of_referencec2")
	private String addressOfReferencec2;
	
	@JsonProperty("rep_relationship_of_referencec1")
	@SerializedName("rep_relationship_of_referencec1")
	private String relationshipOfReferencec1;
	
	@JsonProperty("rep_relationship_of_referencec2")
	@SerializedName("rep_relationship_of_referencec2")
	private String relationshipOfReferencec2;
	
	@JsonProperty("property_details")
	@SerializedName("property_details")
	private List<CaseLoginPropertyDetails> propertyDetails;
	
	@JsonProperty("rep_remarks")
	@SerializedName("rep_remarks")
	private String remarks;
	
	
	
}
