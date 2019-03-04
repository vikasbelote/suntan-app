package com.suntan.suntanapp.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name = "suntan_person")
@EntityListeners(AuditingEntityListener.class)
@Data
public class PersonEntity extends BaseEntity{
	
	@Id
	@GeneratedValue
	@Column(name="person_id")
	private Long personId;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="user_id")
	private UserEntity userEntity;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="address_id")
	private AddressEntity addressEntity;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="mobile_number")
	private Long modileNumber;
	
	@Column(name="pan_id")
	private String panId;
	
	@Column(name="adhar_number")
	private Long adharNumber;
	
	@Column(name="is_email_verified")
	private char emailVerified;
	
	@Column(name="is_mobile_verfied")
	private char mobileVerified;
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getModileNumber() {
		return modileNumber;
	}

	public void setModileNumber(Long modileNumber) {
		this.modileNumber = modileNumber;
	}

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
	}

	public Long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(Long adharNumber) {
		this.adharNumber = adharNumber;
	}

	public char getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(char emailVerified) {
		this.emailVerified = emailVerified;
	}

	public char getMobileVerified() {
		return mobileVerified;
	}

	public void setMobileVerified(char mobileVerified) {
		this.mobileVerified = mobileVerified;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
