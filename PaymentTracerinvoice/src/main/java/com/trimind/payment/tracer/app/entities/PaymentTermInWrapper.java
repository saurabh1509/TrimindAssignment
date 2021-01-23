package com.trimind.payment.tracer.app.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

public class PaymentTermInWrapper implements Serializable {
	

@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private int id;
private String code;
private String description;
@DateTimeFormat(pattern = "dd/MM/yyyy")
private Date date;
private long days;
private long reminderBeforeDays;




public PaymentTermInWrapper(int id, String code, String description, Date date, long days, long reminderBeforeDays) {
	super();
	this.id = id;
	this.code = code;
	this.description = description;
	this.date = date;
	this.days = days;
	this.reminderBeforeDays = reminderBeforeDays;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public java.util.Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public long getDays() {
	return days;
}
public void setDays(long days) {
	this.days = days;
}
public long getReminderBeforeDays() {
	return reminderBeforeDays;
}
public void setReminderBeforeDays(long reminderBeforeDays) {
	this.reminderBeforeDays = reminderBeforeDays;
}
@Override
public String toString() {
	return "PaymentTermInWrapper [id=" + id + ", code=" + code + ", description=" + description + ", date=" + date
			+ ", days=" + days + ", reminderBeforeDays=" + reminderBeforeDays + "]";
}



}