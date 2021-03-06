package com.mps.model;
// Generated 2016-6-17 8:20:37 by Hibernate Tools 4.3.1.Final

/**
 * Route generated by hbm2java
 */
public class Route implements java.io.Serializable {

	private Integer id;
	private Team team;
	private String startpoint;
	private String endpoint;
	private Integer ordernumber;

	public Route() {
	}

	public Route(Team team) {
		this.team = team;
	}

	public Route(Team team, String startpoint, String endpoint, Integer ordernumber) {
		this.team = team;
		this.startpoint = startpoint;
		this.endpoint = endpoint;
		this.ordernumber = ordernumber;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getStartpoint() {
		return this.startpoint;
	}

	public void setStartpoint(String startpoint) {
		this.startpoint = startpoint;
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public Integer getOrdernumber() {
		return this.ordernumber;
	}

	public void setOrdernumber(Integer ordernumber) {
		this.ordernumber = ordernumber;
	}

}
