package com.fangruizhang.entity;import java.util.Date;/******************************************************************************* * javaBeans * player --> Player * <table explanation> * @author 2014-10-05 19:23:37 * */public class Player implements java.io.Serializable {	/**	 *	 */	private static final long serialVersionUID = -2654600457424808601L;	//field	/**  **/	private Integer playerId;	/**  **/	private String playerName;	/**  **/	private Date createtime;	/**  **/	private String phone;	/**  **/	private Integer attendtimes;	/**  **/	private Integer attendsuccescnt;	/**  **/	private String qq;	/**  **/	private String weixin;	/**  **/	private String mail;	/**  **/	private Integer sex;	/**  **/	private Date birthday;	private String password;	//method	public Integer getPlayerId() {		return playerId;	}	public void setPlayerId(Integer playerId) {		this.playerId = playerId;	}	public String getPlayerName() {		return playerName;	}	public void setPlayerName(String playerName) {		this.playerName = playerName;	}	public Date getCreatetime() {		return createtime;	}	public void setCreatetime(Date createtime) {		this.createtime = createtime;	}	public String getPhone() {		return phone;	}	public void setPhone(String phone) {		this.phone = phone;	}	public Integer getAttendtimes() {		return attendtimes;	}	public void setAttendtimes(Integer attendtimes) {		this.attendtimes = attendtimes;	}	public Integer getAttendsuccescnt() {		return attendsuccescnt;	}	public void setAttendsuccescnt(Integer attendsuccescnt) {		this.attendsuccescnt = attendsuccescnt;	}	public String getQq() {		return qq;	}	public void setQq(String qq) {		this.qq = qq;	}	public String getWeixin() {		return weixin;	}	public void setWeixin(String weixin) {		this.weixin = weixin;	}	public String getMail() {		return mail;	}	public void setMail(String mail) {		this.mail = mail;	}	public Integer getSex() {		return sex;	}	public void setSex(Integer sex) {		this.sex = sex;	}	public Date getBirthday() {		return birthday;	}	public void setBirthday(Date birthday) {		this.birthday = birthday;	}	public String getPassword() {		return password;	}	public void setPassword(String password) {		this.password = password;	}	//override toString Method	public String toString() {		StringBuffer sb=new StringBuffer();		sb.append("{");		sb.append("'playerId':'"+this.getPlayerId()+"',");		sb.append("'playerName':'"+this.getPlayerName()+"',");		sb.append("'createtime':'"+this.getCreatetime()+"',");		sb.append("'phone':'"+this.getPhone()+"',");		sb.append("'attendtimes':'"+this.getAttendtimes()+"',");		sb.append("'attendsuccescnt':'"+this.getAttendsuccescnt()+"',");		sb.append("'qq':'"+this.getQq()+"',");		sb.append("'weixin':'"+this.getWeixin()+"',");		sb.append("'mail':'"+this.getMail()+"',");		sb.append("'sex':'"+this.getSex()+"',");		sb.append("'birthday':'"+this.getBirthday()+"',");		sb.append("}");		return sb.toString();	}	//return String[] filed;	public String[] getField() {		return new String[]{"playerId","playerName","createtime","phone","attendtimes","attendsuccescnt","qq","weixin","mail","sex","birthday"};	}}