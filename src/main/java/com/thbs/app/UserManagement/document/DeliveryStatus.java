package com.thbs.app.UserManagement.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="deliveryStatus")
public class DeliveryStatus {

	@Id
	private int id;
	private String projects;
	private String engagement;
	private String startDate;
	private String planned;
	private String actual;
	private String month;
	private String comments;

	
	public DeliveryStatus() {

		System.out.println("created"+this.getClass().getSimpleName());
	}

	

	public DeliveryStatus(int id, String projects, String engagement, String startDate, String planned, String actual,
			String month, String comments) {

		this.id = id;
		this.projects = projects;
		this.engagement = engagement;
		this.startDate = startDate;
		this.planned = planned;
		this.actual = actual;
		this.month = month;
		this.comments = comments;
	}



	
	/**
	 * @return the id
	 */
	public int getId() {
	
		return id;
	}



	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
	
		this.id = id;
	}



	
	/**
	 * @return the projects
	 */
	public String getProjects() {
	
		return projects;
	}



	
	/**
	 * @param projects the projects to set
	 */
	public void setProjects(String projects) {
	
		this.projects = projects;
	}



	
	/**
	 * @return the engagement
	 */
	public String getEngagement() {
	
		return engagement;
	}



	
	/**
	 * @param engagement the engagement to set
	 */
	public void setEngagement(String engagement) {
	
		this.engagement = engagement;
	}



	
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
	
		return startDate;
	}



	
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
	
		this.startDate = startDate;
	}



	
	/**
	 * @return the planned
	 */
	public String getPlanned() {
	
		return planned;
	}



	
	/**
	 * @param planned the planned to set
	 */
	public void setPlanned(String planned) {
	
		this.planned = planned;
	}



	
	/**
	 * @return the actual
	 */
	public String getActual() {
	
		return actual;
	}



	
	/**
	 * @param actual the actual to set
	 */
	public void setActual(String actual) {
	
		this.actual = actual;
	}



	
	/**
	 * @return the month
	 */
	public String getMonth() {
	
		return month;
	}



	
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
	
		this.month = month;
	}



	
	/**
	 * @return the comments
	 */
	public String getComments() {
	
		return comments;
	}



	
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
	
		this.comments = comments;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "DeliveryStatus [id=" + id + ", projects=" + projects + ", engagement=" + engagement + ", startDate="
				+ startDate + ", planned=" + planned + ", actual=" + actual + ", month=" + month + ", comments="
				+ comments + "]";
	}

	


	
}
