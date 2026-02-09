package com.multithreading.shopjobscheduler;

public class Job {
	private String name;
	private int page;
	private int priority;
	
	public Job(String name, int page, int priority) {
		this.name = name;
		this.page = page;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Job [name=" + name + ", page=" + page + ", priority=" + priority + "]";
	}
}