package com.myspace.fyndna;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class application implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	private java.lang.String accountNumber;
	private java.lang.Integer loanAmount;
	private Float rateofInterest;

	private java.lang.Integer loanTerm;

	private java.lang.Integer applicationId;

	private java.lang.String brokerGroup;

	private java.lang.String broker;

	private java.lang.String product;

	private java.lang.String promoCode;

	public application() {
	}
	public java.lang.String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(java.lang.String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public java.lang.Integer getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(java.lang.Integer loanAmount) {
		this.loanAmount = loanAmount;
	}

	public java.lang.Float getRateofInterest() {
		return this.rateofInterest;
	}

	public void setRateofInterest(java.lang.Float rateofInterest) {
		this.rateofInterest = rateofInterest;
	}

	public java.lang.Integer getLoanTerm() {
		return this.loanTerm;
	}

	public void setLoanTerm(java.lang.Integer loanTerm) {
		this.loanTerm = loanTerm;
	}

	public java.lang.Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(java.lang.Integer applicationId) {
		this.applicationId = applicationId;
	}

	public java.lang.String getBrokerGroup() {
		return this.brokerGroup;
	}

	public void setBrokerGroup(java.lang.String brokerGroup) {
		this.brokerGroup = brokerGroup;
	}

	public java.lang.String getBroker() {
		return this.broker;
	}

	public void setBroker(java.lang.String broker) {
		this.broker = broker;
	}

	public java.lang.String getProduct() {
		return this.product;
	}

	public void setProduct(java.lang.String product) {
		this.product = product;
	}

	public java.lang.String getPromoCode() {
		return this.promoCode;
	}

	public void setPromoCode(java.lang.String promoCode) {
		this.promoCode = promoCode;
	}

	public application(java.lang.String accountNumber,
			java.lang.Integer loanAmount, java.lang.Float rateofInterest,
			java.lang.Integer loanTerm, java.lang.Integer applicationId,
			java.lang.String brokerGroup, java.lang.String broker,
			java.lang.String product, java.lang.String promoCode) {
		this.accountNumber = accountNumber;
		this.loanAmount = loanAmount;
		this.rateofInterest = rateofInterest;
		this.loanTerm = loanTerm;
		this.applicationId = applicationId;
		this.brokerGroup = brokerGroup;
		this.broker = broker;
		this.product = product;
		this.promoCode = promoCode;
	}

}
