package com.myspace.fyndna;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NEFT implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String customer;
	private Integer flat_rate;
	private java.lang.Integer no_of_transaction;

	public NEFT() {
	}

	public java.lang.String getCustomer() {
		return this.customer;
	}

	public void setCustomer(java.lang.String customer) {
		this.customer = customer;
	}

	public java.lang.Integer getNo_of_transaction() {
		return this.no_of_transaction;
	}

	public void setNo_of_transaction(java.lang.Integer no_of_transaction) {
		this.no_of_transaction = no_of_transaction;
	}

	public java.lang.Integer getFlat_rate() {
		return this.flat_rate;
	}

	public void setFlat_rate(java.lang.Integer flat_rate) {
		this.flat_rate = flat_rate;
	}

	public NEFT(java.lang.String customer, java.lang.Integer flat_rate,
			java.lang.Integer no_of_transaction) {
		this.customer = customer;
		this.flat_rate = flat_rate;
		this.no_of_transaction = no_of_transaction;
	}

}