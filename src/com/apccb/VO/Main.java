package com.apccb.VO;

import java.text.NumberFormat;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String  ff ="13";
		String kk ="14";
		double per = Double.parseDouble(ff)/Double.parseDouble(kk);
		System.out.println("PER:"+NumberFormat.getPercentInstance().format(Double.parseDouble(ff)/Double.parseDouble(kk)));
		
	}
	public static String getPercentValue(double value)
	  {
	    //moved from HTMLReport.getPercentValue()
	      value = Math.floor(value * 100) / 100; //to represent 199 covered lines from 200 as 99% covered, not 100 %
	    return NumberFormat.getPercentInstance().format(value);
	  }


}
