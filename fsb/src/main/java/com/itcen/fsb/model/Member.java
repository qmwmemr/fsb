package com.itcen.fsb.model;

import java.util.Date;

public class Member {
	String memberId = "";
	String memberPassword = "";
	String memberName = "";
	String memberNickName = "";
	String memberEmail = "";
	String memberPhone = "";
	String memberAddress = "";
	String memberTier = "";
	Date memberCreateDate = null;
	
	public Member() {
		super();
	}
	
	public Member(String memberId, String memberPassword, String memberName, String memberNickName,
			String memberEmail, String memberPhone, String memberAddress, String memberTier, Date memberCreateDate) {
		super();
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberNickName = memberNickName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberTier = memberTier;
		this.memberCreateDate = memberCreateDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNickName() {
		return memberNickName;
	}

	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberTier() {
		return memberTier;
	}

	public void setMemberTier(String memberTier) {
		this.memberTier = memberTier;
	}

	public Date getMemberCreateDate() {
		return memberCreateDate;
	}

	public void setMemberCreateDate(Date memberCreateDate) {
		this.memberCreateDate = memberCreateDate;
	}

	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberPassword=" + memberPassword + ", memberName=" + memberName
				+ ", memberNickName=" + memberNickName + ", memberEmail=" + memberEmail + ", memberPhone=" + memberPhone
				+ ", memberAddress=" + memberAddress + ", memberTier=" + memberTier + ", memberCreateDate="
				+ memberCreateDate + "]";
	}
}
