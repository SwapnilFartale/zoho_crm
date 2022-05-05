package com.zohocrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Billing;
import com.zohocrm.services.BillingService;

@Controller
public class BillingController {
	@Autowired
	private BillingService billingService;
@RequestMapping("/generate")
public String generateBill(@ModelAttribute("bill")Billing bill,ModelMap model) {
	 billingService.generateOneBill(bill);
	 List<Billing> bills = billingService.getAllBills();
	 model.addAttribute("bills",bills);
	return "billing_result";
	
}
}
