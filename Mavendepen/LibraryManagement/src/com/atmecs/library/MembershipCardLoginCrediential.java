package com.atmecs.library;

public class MembershipCardLoginCrediential {
	 private String name; 
	    private String id;
	   /**
	 * 
	 */
	private transient String psw;
	 public String getname() {
	  return name;
	 }
	 public void setname(String name) {
	  this.name = name;
	 }
	 public String getid() {
	  return id;
	 }
	 public void setid(String id) {
	  this.id = id;
	 }
	 public String getpassword() {
	  return psw;
	 }
	 public void setpassword(String psw) {
	  this.psw = psw;
	 }
	}
