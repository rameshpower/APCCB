package com.apccb.VO;

import java.util.*;

public class UtilityCounters {

	private Map<String,String> counters;

	private Map<String,String> billDeskCounters;
	
	public Map<String, String> getBillDeskCounters() {
		return billDeskCounters;
	}

	public void setBillDeskCounters(Map<String, String> billDeskCounters) {
		this.billDeskCounters = billDeskCounters;
	}

	public Map<String, String> getCounters() {
		return counters;
	}

	public void setCounters(Map<String, String> counters) {
		this.counters = counters;
	}

	public UtilityCounters() {
		super();
		Map<String, String> cntr= new LinkedHashMap<String,String>();
		cntr.put("343434", "ATP-PHOENIX");
		cntr.put("444444", "BILLDESK");
		cntr.put("888888", "ERO");
		cntr.put("999999", "ESEVA");
		cntr.put("111111", "SCM");
		cntr.put("777777", "RSDP");
		
		this.counters = cntr;
		Map<String, String> bill= new LinkedHashMap<String,String>();
		bill.put("EBPP", "INSTA PAYMENT MODE");
		bill.put("EBPP1", "EBPP MODE");
		bill.put("PGBQR", "BHARAT QR");
		bill.put("PGC", "CREDIT CARD");
		bill.put("PGD", "DEBIT CARD");
		bill.put("PGIUPI", "UPI");
		bill.put("PGN", "NET BANKING");
		bill.put("PGW", "WALLET");
		this.billDeskCounters = bill;
	}
	
	
	
}
