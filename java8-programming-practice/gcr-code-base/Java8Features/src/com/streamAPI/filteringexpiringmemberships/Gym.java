package com.streamAPI.filteringexpiringmemberships;

import java.time.LocalDate;

public class Gym {
	private long id;
	private String name;
	private LocalDate membershipDate;
	private LocalDate expriyDate;
	
	public Gym(long id, String name, LocalDate membershipDate, LocalDate expriyDate) {
		this.id = id;
		this.name = name;
		this.membershipDate = membershipDate;
		this.expriyDate = expriyDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(LocalDate membershipDate) {
		this.membershipDate = membershipDate;
	}

	public LocalDate getExpriyDate() {
		return expriyDate;
	}

	public void setExpriyDate(LocalDate expriyDate) {
		this.expriyDate = expriyDate;
	}

	@Override
	public String toString() {
		return "Gym [id=" + id + ", name=" + name + ", membershipDate=" + membershipDate + ", expriyDate=" + expriyDate
				+ "]";
	}
}