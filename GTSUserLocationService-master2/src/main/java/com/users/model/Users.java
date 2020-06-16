package com.users.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//
@Entity
@Table(name="users")
public class Users {
	

    
	
    @Id
   
	private String tcity;
	
	private String tdistrict;
	
    private String tstate;
    private String tcontactno;
    private String tpin;

	
	public String getTcity() {
		return tcity;
	}

	public void setTcity(String tcity) {
		this.tcity = tcity;
	}

	public String getTdistrict() {
		return tdistrict;
	}

	public void setTdistrict(String tdistrict) {
		this.tdistrict = tdistrict;
	}
	public String getTstate() {
		return tstate;
	}

	public void setTstate(String tstate) {
		this.tstate = tstate;
	}	

	public String getTcontactno() {
		return tcontactno;
	}

	public void setTcontactno(String tcontactno) {
		this.tcontactno = tcontactno;
	}	
	public String getTpin() {
		return tpin;
	}

	public void setTpin(String tpin) {
		this.tpin = tpin;
	}	
	
  




    
   
}
	
	
	
	
