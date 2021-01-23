package com.trimind.payment.tracer.controller;



import java.lang.reflect.Type;

import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.trimind.payment.tracer.app.entities.PaymentTermInWrapper;

@RestController

public class PaymentTermController {
@Autowired
PaymentTermService services;
	
	
	@RequestMapping("/data")
	public ResponseEntity<String> createOrUpdatePaymentTerm(HttpEntity<String> requestEntity) throws SystemException{
		HttpHeaders responseHeaders = new HttpHeaders();
		 try { 
			
			
			String requestBody = requestEntity.getBody();
			Gson gson = new Gson();
			Type type = new TypeToken<PaymentTermInWrapper>() {
			}.getType();
			PaymentTermInWrapper paymentTermInWrapper=gson.fromJson(requestBody, type);
			
			String userValidationResponse =services.createOrUpdatePaymentTerm(paymentTermInWrapper);
			if(userValidationResponse!=""|| !StringUtils.isEmpty(userValidationResponse))
			{
			
			return new ResponseEntity<String>(userValidationResponse,
					responseHeaders, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<String>(
					e.getMessage(),
					responseHeaders, HttpStatus.UNAUTHORIZED);
		}
		return null;
}
	@RequestMapping("/data")
	public ResponseEntity<String> getPaymentTerm(HttpEntity<String> requestEntity) throws SystemException{
		HttpHeaders responseHeaders = new HttpHeaders();
		 try { 
			
			
			String requestBody = requestEntity.getBody();
			Gson gson = new Gson();
			Type type = new TypeToken<PaymentTermInWrapper>() {
			}.getType();
			PaymentTermInWrapper paymentTermInWrapper=gson.fromJson(requestBody, type);
			
			String userValidationResponse =services.getPaymentTerm(paymentTermInWrapper);
			if(userValidationResponse!=""|| !StringUtils.isEmpty(userValidationResponse))
			{
			
			return new ResponseEntity<String>(userValidationResponse,
					responseHeaders, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<String>(
					e.getMessage(),
					responseHeaders, HttpStatus.UNAUTHORIZED);
		}
		return null;
}
	
	@RequestMapping("/data")
	public ResponseEntity<String> deletePaymentTerm(HttpEntity<String> requestEntity) throws SystemException{
		HttpHeaders responseHeaders = new HttpHeaders();
		 try { 
			
			
			String requestBody = requestEntity.getBody();
			Gson gson = new Gson();
			Type type = new TypeToken<PaymentTermInWrapper>() {
			}.getType();
			PaymentTermInWrapper paymentTermInWrapper=gson.fromJson(requestBody, type);
			
			String userValidationResponse =services.deletePaymentTerm(paymentTermInWrapper);
			if(userValidationResponse!=""|| !StringUtils.isEmpty(userValidationResponse))
			{
			
			return new ResponseEntity<String>(userValidationResponse,
					responseHeaders, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<String>(
					e.getMessage(),
					responseHeaders, HttpStatus.UNAUTHORIZED);
		}
		return null;
}
		
}

