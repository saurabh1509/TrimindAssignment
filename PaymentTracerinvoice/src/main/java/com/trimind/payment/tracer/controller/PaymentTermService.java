package com.trimind.payment.tracer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.trimind.payment.tracer.app.entities.PaymentTermInWrapper;

@Service
public class PaymentTermService {
	@Autowired
	JdbcTemplate jdbcTemplate;
public String createOrUpdatePaymentTerm(PaymentTermInWrapper paymentTermInWrapper) {
	
	String sql="INSERT INTO payment_term(id,code,payment_termcol,creationdate,days,reminderbeforedays) values('abc','bcd',now(),10,4)";
			
	jdbcTemplate.execute(sql);
	return null;
}
public String getPaymentTerm(PaymentTermInWrapper paymentTermInWrapper) {
	// TODO Auto-generated method stub
	String sql="select id,code,payment_termcol,creationdate,days,reminderbeforedays from payment_term  where id=?";
	jdbcTemplate.execute(sql);
	return null;
}
public String deletePaymentTerm(PaymentTermInWrapper paymentTermInWrapper) {
	String sql="delete from payment_term  where code=?";
	jdbcTemplate.execute(sql);
	return null;
}
}
