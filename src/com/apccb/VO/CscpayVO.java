package com.apccb.VO;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class CscpayVO {
	
	protected String counterName;
	protected String csprdt;
	protected String csasd;
	
	protected String cgst;
	protected String sgst;
	protected String email;
	protected String remarks;
	protected String agependency;
	protected Double perWrt;
	protected Double amt;
	
	
	protected int aglwrt;
	protected int aglbrt;
	protected Double peraglWrt;
	protected Double aglamt;
	protected int aglpen;
	
	protected int fuseofcallwrt;
	protected int fuseofcallbrt;
	protected Double perfuseofcallWrt;
	protected Double fuseofcallamt;
	protected int fuseofcallpen;
	
	protected int relaglwrt;
	protected int relaglbrt;
	protected Double relperaglWrt;
	protected Double relaglamt;
	protected int relaglpen;
	
	protected int relSopDays;
	protected int relDelayDays;
	protected int relNoOfDays;
	protected String nameofconsumer;
	
	protected String contactno;
	protected String paidamount;
	protected String prdate;
	protected String reason;
	protected String existingaddress;
	protected String loginusername;
	protected String loginpassword;
	
	
	public String getCsasd() {
		return csasd;
	}
	public void setCsasd(String csasd) {
		this.csasd = csasd;
	}
	public String getExistingaddress() {
		return existingaddress;
	}
	public void setExistingaddress(String existingaddress) {
		this.existingaddress = existingaddress;
	}
	protected String dateofpayment;
	protected String noofdayspayment;
	protected String appdeleteon;
	
	protected String ltcat;
	protected String a11kvcirname;
	protected String a11kvcircount;
	
	
	
	
	
	
	public String getA11kvcirname() {
		return a11kvcirname;
	}
	public void setA11kvcirname(String a11kvcirname) {
		this.a11kvcirname = a11kvcirname;
	}
	public String getA11kvcircount() {
		return a11kvcircount;
	}
	public void setA11kvcircount(String a11kvcircount) {
		this.a11kvcircount = a11kvcircount;
	}
	public String getLtcat() {
		return ltcat;
	}
	public void setLtcat(String ltcat) {
		this.ltcat = ltcat;
	}
	protected String sapSno;
	
	protected String volt;
	protected String contractedLoad;
	protected String phonenumber;
	protected String supply_Rel_date;
	protected String noOfDays;
	protected String uscNumber;
	protected String avgDays;
	protected String circlecode;
	protected String noof;
	protected String appfee;
	protected String sd;
	protected String dev;
	protected String sl;
	protected String spv;
	protected String advcc;
	protected String temp;
	protected String other;
	protected String aelogin;
	protected String deelogin;
	protected String eelogin;
	protected String deecomml;
	protected String eetlogin;
	protected String selogin;
	protected String cgmlogin;
	protected String jcolonyregistered;
	protected String jcolonyreleased;
	protected String jcolonydeleted;
	protected String jcolonytotal;
	protected String feepaidbetween15to30;
	protected String feepaidgtr31;
	protected String feepaidtotal;
	protected String totregistration;
	protected String totestimateapprove;
	protected String pendingforestimatecreation;
	protected String pendingforapproval;
	protected String pendingattransco;
	protected String totpendingforestimateapprove;
	protected String pendingforpayment;
	protected String pendingforworkcompletion;
	protected String pendingforagreement;
	protected String pendingforreleaseorder;
	protected String pendingfortestreport;
	protected String pendingforbilling;
	protected String totalpending;
	protected String billingdone;
	
	protected String aptidcoapproved_count;
	protected String aptidcoregistered;
	protected String aptidcoreleased;
	protected String aptidcodeleted;
	protected String aptidcototal;
	protected String duplicategeocoorinates;
	protected String geo_regno;
	protected String geo_adress;
	protected String geo_trandt;
	protected String geo_geopartcd;
	protected String geo_longtitude;
	protected String geo_lattitude;
	protected String geo_lmcode;
	protected String geo_released;
	
	protected String ltapartmentgroupcount;
	protected String ltapartmentregistered;
	protected String ltapartmentreleased;
	protected String ltapartmentdeleted;
	protected String ltapartmentpending;
	
	
	
	
	public String getAptidcoapproved_count() {
		return aptidcoapproved_count;
	}
	public void setAptidcoapproved_count(String aptidcoapproved_count) {
		this.aptidcoapproved_count = aptidcoapproved_count;
	}
	public String getLtapartmentgroupcount() {
		return ltapartmentgroupcount;
	}
	public void setLtapartmentgroupcount(String ltapartmentgroupcount) {
		this.ltapartmentgroupcount = ltapartmentgroupcount;
	}
	public String getLtapartmentregistered() {
		return ltapartmentregistered;
	}
	public void setLtapartmentregistered(String ltapartmentregistered) {
		this.ltapartmentregistered = ltapartmentregistered;
	}
	public String getLtapartmentreleased() {
		return ltapartmentreleased;
	}
	public void setLtapartmentreleased(String ltapartmentreleased) {
		this.ltapartmentreleased = ltapartmentreleased;
	}
	public String getLtapartmentdeleted() {
		return ltapartmentdeleted;
	}
	public void setLtapartmentdeleted(String ltapartmentdeleted) {
		this.ltapartmentdeleted = ltapartmentdeleted;
	}
	public String getLtapartmentpending() {
		return ltapartmentpending;
	}
	public void setLtapartmentpending(String ltapartmentpending) {
		this.ltapartmentpending = ltapartmentpending;
	}
	public String getGeo_regno() {
		return geo_regno;
	}
	public void setGeo_regno(String geo_regno) {
		this.geo_regno = geo_regno;
	}
	public String getGeo_adress() {
		return geo_adress;
	}
	public void setGeo_adress(String geo_adress) {
		this.geo_adress = geo_adress;
	}
	public String getGeo_trandt() {
		return geo_trandt;
	}
	public void setGeo_trandt(String geo_trandt) {
		this.geo_trandt = geo_trandt;
	}
	public String getGeo_geopartcd() {
		return geo_geopartcd;
	}
	public void setGeo_geopartcd(String geo_geopartcd) {
		this.geo_geopartcd = geo_geopartcd;
	}
	public String getGeo_longtitude() {
		return geo_longtitude;
	}
	public void setGeo_longtitude(String geo_longtitude) {
		this.geo_longtitude = geo_longtitude;
	}
	public String getGeo_lattitude() {
		return geo_lattitude;
	}
	public void setGeo_lattitude(String geo_lattitude) {
		this.geo_lattitude = geo_lattitude;
	}
	public String getGeo_lmcode() {
		return geo_lmcode;
	}
	public void setGeo_lmcode(String geo_lmcode) {
		this.geo_lmcode = geo_lmcode;
	}
	public String getGeo_released() {
		return geo_released;
	}
	public void setGeo_released(String geo_released) {
		this.geo_released = geo_released;
	}
	public String getDuplicategeocoorinates() {
		return duplicategeocoorinates;
	}
	public void setDuplicategeocoorinates(String duplicategeocoorinates) {
		this.duplicategeocoorinates = duplicategeocoorinates;
	}
	public String getAptidcoregistered() {
		return aptidcoregistered;
	}
	public void setAptidcoregistered(String aptidcoregistered) {
		this.aptidcoregistered = aptidcoregistered;
	}
	public String getAptidcoreleased() {
		return aptidcoreleased;
	}
	public void setAptidcoreleased(String aptidcoreleased) {
		this.aptidcoreleased = aptidcoreleased;
	}
	public String getAptidcodeleted() {
		return aptidcodeleted;
	}
	public void setAptidcodeleted(String aptidcodeleted) {
		this.aptidcodeleted = aptidcodeleted;
	}
	public String getAptidcototal() {
		return aptidcototal;
	}
	public void setAptidcototal(String aptidcototal) {
		this.aptidcototal = aptidcototal;
	}
	public String getTotregistration() {
		return totregistration;
	}
	public void setTotregistration(String totregistration) {
		this.totregistration = totregistration;
	}
	public String getTotestimateapprove() {
		return totestimateapprove;
	}
	public void setTotestimateapprove(String totestimateapprove) {
		this.totestimateapprove = totestimateapprove;
	}
	public String getPendingforestimatecreation() {
		return pendingforestimatecreation;
	}
	public void setPendingforestimatecreation(String pendingforestimatecreation) {
		this.pendingforestimatecreation = pendingforestimatecreation;
	}
	public String getPendingforapproval() {
		return pendingforapproval;
	}
	public void setPendingforapproval(String pendingforapproval) {
		this.pendingforapproval = pendingforapproval;
	}
	public String getPendingattransco() {
		return pendingattransco;
	}
	public void setPendingattransco(String pendingattransco) {
		this.pendingattransco = pendingattransco;
	}
	public String getTotpendingforestimateapprove() {
		return totpendingforestimateapprove;
	}
	public void setTotpendingforestimateapprove(String totpendingforestimateapprove) {
		this.totpendingforestimateapprove = totpendingforestimateapprove;
	}
	public String getPendingforpayment() {
		return pendingforpayment;
	}
	public void setPendingforpayment(String pendingforpayment) {
		this.pendingforpayment = pendingforpayment;
	}
	public String getPendingforworkcompletion() {
		return pendingforworkcompletion;
	}
	public void setPendingforworkcompletion(String pendingforworkcompletion) {
		this.pendingforworkcompletion = pendingforworkcompletion;
	}
	public String getPendingforagreement() {
		return pendingforagreement;
	}
	public void setPendingforagreement(String pendingforagreement) {
		this.pendingforagreement = pendingforagreement;
	}
	public String getPendingforreleaseorder() {
		return pendingforreleaseorder;
	}
	public void setPendingforreleaseorder(String pendingforreleaseorder) {
		this.pendingforreleaseorder = pendingforreleaseorder;
	}
	public String getPendingfortestreport() {
		return pendingfortestreport;
	}
	public void setPendingfortestreport(String pendingfortestreport) {
		this.pendingfortestreport = pendingfortestreport;
	}
	public String getPendingforbilling() {
		return pendingforbilling;
	}
	public void setPendingforbilling(String pendingforbilling) {
		this.pendingforbilling = pendingforbilling;
	}
	public String getTotalpending() {
		return totalpending;
	}
	public void setTotalpending(String totalpending) {
		this.totalpending = totalpending;
	}
	public String getBillingdone() {
		return billingdone;
	}
	public void setBillingdone(String billingdone) {
		this.billingdone = billingdone;
	}
	
	
	public String getFeepaidbetween15to30() {
		return feepaidbetween15to30;
	}
	public void setFeepaidbetween15to30(String feepaidbetween15to30) {
		this.feepaidbetween15to30 = feepaidbetween15to30;
	}
	public String getFeepaidgtr31() {
		return feepaidgtr31;
	}
	public void setFeepaidgtr31(String feepaidgtr31) {
		this.feepaidgtr31 = feepaidgtr31;
	}
	public String getFeepaidtotal() {
		return feepaidtotal;
	}
	public void setFeepaidtotal(String feepaidtotal) {
		this.feepaidtotal = feepaidtotal;
	}
	public String getJcolonyregistered() {
		return jcolonyregistered;
	}
	public void setJcolonyregistered(String jcolonyregistered) {
		this.jcolonyregistered = jcolonyregistered;
	}
	public String getJcolonyreleased() {
		return jcolonyreleased;
	}
	public void setJcolonyreleased(String jcolonyreleased) {
		this.jcolonyreleased = jcolonyreleased;
	}
	public String getJcolonydeleted() {
		return jcolonydeleted;
	}
	public void setJcolonydeleted(String jcolonydeleted) {
		this.jcolonydeleted = jcolonydeleted;
	}
	public String getJcolonytotal() {
		return jcolonytotal;
	}
	public void setJcolonytotal(String jcolonytotal) {
		this.jcolonytotal = jcolonytotal;
	}
	
	
	
	
	
	public String getAelogin() {
		return aelogin;
	}
	public void setAelogin(String aelogin) {
		this.aelogin = aelogin;
	}
	public String getDeelogin() {
		return deelogin;
	}
	public void setDeelogin(String deelogin) {
		this.deelogin = deelogin;
	}
	public String getEelogin() {
		return eelogin;
	}
	public void setEelogin(String eelogin) {
		this.eelogin = eelogin;
	}
	public String getDeecomml() {
		return deecomml;
	}
	public void setDeecomml(String deecomml) {
		this.deecomml = deecomml;
	}
	public String getEetlogin() {
		return eetlogin;
	}
	public void setEetlogin(String eetlogin) {
		this.eetlogin = eetlogin;
	}
	public String getSelogin() {
		return selogin;
	}
	public void setSelogin(String selogin) {
		this.selogin = selogin;
	}
	public String getCgmlogin() {
		return cgmlogin;
	}
	public void setCgmlogin(String cgmlogin) {
		this.cgmlogin = cgmlogin;
	}
	public String getPrdate() {
		return prdate;
	}
	public void setPrdate(String prdate) {
		this.prdate = prdate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getNameofconsumer() {
		return nameofconsumer;
	}
	public void setNameofconsumer(String nameofconsumer) {
		this.nameofconsumer = nameofconsumer;
	}
	
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getPaidamount() {
		return paidamount;
	}
	public void setPaidamount(String paidamount) {
		this.paidamount = paidamount;
	}
	public String getDateofpayment() {
		return dateofpayment;
	}
	public void setDateofpayment(String dateofpayment) {
		this.dateofpayment = dateofpayment;
	}
	public String getNoofdayspayment() {
		return noofdayspayment;
	}
	public void setNoofdayspayment(String noofdayspayment) {
		this.noofdayspayment = noofdayspayment;
	}
	public String getAppdeleteon() {
		return appdeleteon;
	}
	public void setAppdeleteon(String appdeleteon) {
		this.appdeleteon = appdeleteon;
	}
	public String getCirclecode() {
		return circlecode;
	}
	public void setCirclecode(String circlecode) {
		this.circlecode = circlecode;
	}
	public String getNoof() {
		return noof;
	}
	public void setNoof(String noof) {
		this.noof = noof;
	}
	public String getAppfee() {
		return appfee;
	}
	public void setAppfee(String appfee) {
		this.appfee = appfee;
	}
	public String getSd() {
		return sd;
	}
	public void setSd(String sd) {
		this.sd = sd;
	}
	public String getDev() {
		return dev;
	}
	public void setDev(String dev) {
		this.dev = dev;
	}
	public String getSl() {
		return sl;
	}
	public void setSl(String sl) {
		this.sl = sl;
	}
	public String getSpv() {
		return spv;
	}
	public void setSpv(String spv) {
		this.spv = spv;
	}
	public String getAdvcc() {
		return advcc;
	}
	public void setAdvcc(String advcc) {
		this.advcc = advcc;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	
	public String getContractedLoad() {
		return contractedLoad;
	}
	public void setContractedLoad(String contractedLoad) {
		this.contractedLoad = contractedLoad;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getSupply_Rel_date() {
		return supply_Rel_date;
	}
	public void setSupply_Rel_date(String supply_Rel_date) {
		this.supply_Rel_date = supply_Rel_date;
	}
	public String getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getUscNumber() {
		return uscNumber;
	}
	public void setUscNumber(String uscNumber) {
		this.uscNumber = uscNumber;
	}
	public String getAvgDays() {
		return avgDays;
	}
	public void setAvgDays(String avgDays) {
		this.avgDays = avgDays;
	}
	public String getVolt() {
		return volt;
	}
	public void setVolt(String volt) {
		this.volt = volt;
	}
	protected int relPenality;
	
	
	protected String serviceType;
	
	
	public String getSapSno() {
		return sapSno;
	}
	public void setSapSno(String sapSno) {
		this.sapSno = sapSno;
	}
	
	public int getFuseofcallwrt() {
		return fuseofcallwrt;
	}
	public void setFuseofcallwrt(int fuseofcallwrt) {
		this.fuseofcallwrt = fuseofcallwrt;
	}
	public int getFuseofcallbrt() {
		return fuseofcallbrt;
	}
	public void setFuseofcallbrt(int fuseofcallbrt) {
		this.fuseofcallbrt = fuseofcallbrt;
	}
	public Double getPerfuseofcallWrt() {
		return perfuseofcallWrt;
	}
	public void setPerfuseofcallWrt(Double perfuseofcallWrt) {
		this.perfuseofcallWrt = perfuseofcallWrt;
	}
	public Double getFuseofcallamt() {
		return fuseofcallamt;
	}
	public void setFuseofcallamt(Double fuseofcallamt) {
		this.fuseofcallamt = fuseofcallamt;
	}
	public int getFuseofcallpen() {
		return fuseofcallpen;
	}
	public void setFuseofcallpen(int fuseofcallpen) {
		this.fuseofcallpen = fuseofcallpen;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public int getRelSopDays() {
		return relSopDays;
	}
	public void setRelSopDays(int relSopDays) {
		this.relSopDays = relSopDays;
	}
	public int getRelDelayDays() {
		return relDelayDays;
	}
	public void setRelDelayDays(int relDelayDays) {
		this.relDelayDays = relDelayDays;
	}
	public int getRelNoOfDays() {
		return relNoOfDays;
	}
	public void setRelNoOfDays(int relNoOfDays) {
		this.relNoOfDays = relNoOfDays;
	}
	public int getRelPenality() {
		return relPenality;
	}
	public void setRelPenality(int relPenality) {
		this.relPenality = relPenality;
	}
	public int getRelaglwrt() {
		return relaglwrt;
	}
	public void setRelaglwrt(int relaglwrt) {
		this.relaglwrt = relaglwrt;
	}
	public int getRelaglbrt() {
		return relaglbrt;
	}
	public void setRelaglbrt(int relaglbrt) {
		this.relaglbrt = relaglbrt;
	}
	public Double getRelperaglWrt() {
		return relperaglWrt;
	}
	public void setRelperaglWrt(Double relperaglWrt) {
		this.relperaglWrt = relperaglWrt;
	}
	public Double getRelaglamt() {
		return relaglamt;
	}
	public void setRelaglamt(Double relaglamt) {
		this.relaglamt = relaglamt;
	}
	public int getRelaglpen() {
		return relaglpen;
	}
	public void setRelaglpen(int relaglpen) {
		this.relaglpen = relaglpen;
	}
	public int getAglwrt() {
		return aglwrt;
	}
	public void setAglwrt(int aglwrt) {
		this.aglwrt = aglwrt;
	}
	public int getAglbrt() {
		return aglbrt;
	}
	public void setAglbrt(int aglbrt) {
		this.aglbrt = aglbrt;
	}
	public Double getPeraglWrt() {
		return peraglWrt;
	}
	public void setPeraglWrt(Double peraglWrt) {
		this.peraglWrt = peraglWrt;
	}
	public Double getAglamt() {
		return aglamt;
	}
	public void setAglamt(Double aglamt) {
		this.aglamt = aglamt;
	}
	
	public int getAglpen() {
		return aglpen;
	}
	public void setAglpen(int aglpen) {
		this.aglpen = aglpen;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	public Double getPerWrt() {
		return perWrt;
	}
	public void setPerWrt(Double perWrt) {
		this.perWrt = perWrt;
	}
	public String getAgependency() {
		return agependency;
	}
	public void setAgependency(String agependency) {
		this.agependency = agependency;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getClose_date() {
		return close_date;
	}
	public void setClose_date(String close_date) {
		this.close_date = close_date;
	}
	//new added
	protected String flag;
	protected String circle;
	protected String ero;	
	protected String division;	
	protected String subDiv;	
	protected String sec;
	protected String repName;
	protected String type;
	protected String cat;
	
	//AllCounters,Single desdk,all Website
	protected String appPending;
	protected String appReceived;
	protected String appPaid;
	protected String appDeleted;
	protected String appReleased;
	protected String beyondReleased;
	protected String turnKey;
	protected String wrt;
	
	
	
	
	protected String demand;
	protected String load;
	protected String paid;
	protected String paid_date;
	protected String ref_no;
	protected String estatus;
	protected String estwrtbrt;
	
	
	//All Service request
	
	protected String Registered;
	protected String Released_Wrt;
	protected String Released_Brt;
	protected String completed;
	
	
	protected String deleted;
	protected String balance;
	protected String Balance_Wrt;
	protected String Balance_Brt;
	
	protected String servieconn_no;
	protected String regDate;
	protected String cunsu_name;
	protected String cunsu_fname;
	protected String address;
	
	protected String phono;
	protected String complaint_desc;
	protected String contrct_load;
	protected String Additional_load;
	protected String meeseva_ref;
	
	protected String sanction_date;
	
	
	
	protected List<String> Catcols;
	protected List<LinkedList<String>> CatList;
	protected List<String> cscCols;
	protected List<LinkedList<String>> cscList;
	
	protected String tot_reg;
	
	protected String tot_reg_two;
	public String getTot_reg_two() {
		return tot_reg_two;
	}
	public void setTot_reg_two(String tot_reg_two) {
		this.tot_reg_two = tot_reg_two;
	}
	protected String estimation_san;
	protected String payment_pen;
	
	public String getEstimation_san() {
		return estimation_san;
	}
	public void setEstimation_san(String estimation_san) {
		this.estimation_san = estimation_san;
	}
	public String getPayment_pen() {
		return payment_pen;
	}
	public void setPayment_pen(String payment_pen) {
		this.payment_pen = payment_pen;
	}
	protected String tot_crt;
	protected String tot_pen;
	protected String purpose;
	
//category types	
	protected int cat1Scs;
	protected int cat2Scs;
	protected int cat3Scs;
	protected int cat4Scs;
	protected int cat5Scs;
	protected int cat6Scs;
	protected int cat7Scs;
	protected int cat8Scs;
	
	
	protected String simply_rel;
	protected String esti_rel;
	protected String dem_within_sop;
	protected String dem_beyond_sop;
	
	protected String amt_paid_within_sop;
	protected String amt_paid_dem_beyond_sop;
	
	protected String pen_simply_wrt;
	protected String pen_simply_brt;
	
	protected String pen_esti_wrt;
	protected String pen_est_brt;
	
	protected String status;
	protected String ob;
	protected String ob_after_rel;
	
	protected String rel_esti_wrt;
	protected String rel_est_brt;
	
	
	protected String countrows;
	protected String s_group;
	
	protected String group_demand;
	protected String group_coll;
	protected String rel_date;
	
	protected String uscno;
	protected String sla_desc;
	protected String exe_type;
	
	protected String brt_les_3months;
	protected String brt_gtr_3months;
	protected String brt_gtr_6months;
	protected String brt_gtr_9months;
	protected String brt_gtr_1year;
	protected String brt_gtr_2months;
	protected String total_dept;
	
	
	protected String turnkey_les_3months;
	protected String turnkey_gtr_3months;
	protected String turnkey_gtr_6months;
	protected String turnkey_gtr_9months;
	protected String turnkey_gtr_1year;
	protected String turnkey_gtr_2months;
	
	
	protected String tot_brt;
	protected String tot_turnkey;
	
	protected String brt_gtr_1months;
	
	protected String tot_brt_dept;
	protected String tot_brt_turnkey;
	
	protected String wrt_turnkey;
	
	
	
	public String getWrt_turnkey() {
		return wrt_turnkey;
	}
	public void setWrt_turnkey(String wrt_turnkey) {
		this.wrt_turnkey = wrt_turnkey;
	}
	protected String amt_paid;
	protected String amt_not_paid;
	protected String est_not_sanctioned;
	protected String est_not_created;
	
	protected String total;
	
	//LT_HT NEW SERVICES REPORT
	
	protected String amt_paid_wrt;
	protected String amt_paid_brt;
	protected String amt_not_paid_tot;
	protected String est_not_sanctioned_wrt;
	protected String est_not_sanctioned_brt;
	protected String est_not_created_wrt;
	protected String est_not_created_brt;
	protected String tot_pending;
	
	
	public String getAmt_paid_wrt() {
		return amt_paid_wrt;
	}
	public void setAmt_paid_wrt(String amt_paid_wrt) {
		this.amt_paid_wrt = amt_paid_wrt;
	}
	public String getAmt_paid_brt() {
		return amt_paid_brt;
	}
	public void setAmt_paid_brt(String amt_paid_brt) {
		this.amt_paid_brt = amt_paid_brt;
	}
	public String getAmt_not_paid_tot() {
		return amt_not_paid_tot;
	}
	public void setAmt_not_paid_tot(String amt_not_paid_tot) {
		this.amt_not_paid_tot = amt_not_paid_tot;
	}
	public String getEst_not_sanctioned_wrt() {
		return est_not_sanctioned_wrt;
	}
	public void setEst_not_sanctioned_wrt(String est_not_sanctioned_wrt) {
		this.est_not_sanctioned_wrt = est_not_sanctioned_wrt;
	}
	public String getEst_not_sanctioned_brt() {
		return est_not_sanctioned_brt;
	}
	public void setEst_not_sanctioned_brt(String est_not_sanctioned_brt) {
		this.est_not_sanctioned_brt = est_not_sanctioned_brt;
	}
	public String getEst_not_created_wrt() {
		return est_not_created_wrt;
	}
	public void setEst_not_created_wrt(String est_not_created_wrt) {
		this.est_not_created_wrt = est_not_created_wrt;
	}
	public String getEst_not_created_brt() {
		return est_not_created_brt;
	}
	public void setEst_not_created_brt(String est_not_created_brt) {
		this.est_not_created_brt = est_not_created_brt;
	}
	public String getTot_pending() {
		return tot_pending;
	}
	public void setTot_pending(String tot_pending) {
		this.tot_pending = tot_pending;
	}
	protected int obreg;
	protected int reg;
	protected int delreg;
	protected int relreg;
	protected int wrtreg;
	protected int brtreg;
	protected int tkeyreg;
	
	protected String scs_rel_paid_less7;
	protected String scs_rel_paid_less30;
	protected String scs_rel_paid_gre30;
	protected String scs_rel_paid_gre45;
	protected String scs_rel_paid_gre60;
	protected String scs_rel_paid_gre90;
	
	//Average Days Taken For Service Release
	
	protected String cattype;
	protected String executiontype;
	
	public String getCattype() {
		return cattype;
	}
	public void setCattype(String cattype) {
		this.cattype = cattype;
	}
	public String getExecutiontype() {
		return executiontype;
	}
	public void setExecutiontype(String executiontype) {
		this.executiontype = executiontype;
	}
	//GGMP Report
	protected String ggmpmandalname;
	protected String ggmpdivision;
	protected String ggmpsubdivision;
	protected String ggmpsection;
	protected String ggmpconstituency;
	protected String ggmpdateofcomplaint;
	protected String ggmpdescofcomplaint;
	protected String ggmpworkinvolvement;
	protected String ggmpcollectorproceedingsno;
	protected String ggmptypeofestimate;
	protected String ggmpsanctionno;
	protected String ggmpworkstatus;
	public String getGgmpmandalname() {
		return ggmpmandalname;
	}
	public void setGgmpmandalname(String ggmpmandalname) {
		this.ggmpmandalname = ggmpmandalname;
	}
	public String getGgmpdivision() {
		return ggmpdivision;
	}
	public void setGgmpdivision(String ggmpdivision) {
		this.ggmpdivision = ggmpdivision;
	}
	public String getGgmpsubdivision() {
		return ggmpsubdivision;
	}
	public void setGgmpsubdivision(String ggmpsubdivision) {
		this.ggmpsubdivision = ggmpsubdivision;
	}
	public String getGgmpsection() {
		return ggmpsection;
	}
	public void setGgmpsection(String ggmpsection) {
		this.ggmpsection = ggmpsection;
	}
	public String getGgmpconstituency() {
		return ggmpconstituency;
	}
	public void setGgmpconstituency(String ggmpconstituency) {
		this.ggmpconstituency = ggmpconstituency;
	}
	public String getGgmpdateofcomplaint() {
		return ggmpdateofcomplaint;
	}
	public void setGgmpdateofcomplaint(String ggmpdateofcomplaint) {
		this.ggmpdateofcomplaint = ggmpdateofcomplaint;
	}
	public String getGgmpdescofcomplaint() {
		return ggmpdescofcomplaint;
	}
	public void setGgmpdescofcomplaint(String ggmpdescofcomplaint) {
		this.ggmpdescofcomplaint = ggmpdescofcomplaint;
	}
	public String getGgmpworkinvolvement() {
		return ggmpworkinvolvement;
	}
	public void setGgmpworkinvolvement(String ggmpworkinvolvement) {
		this.ggmpworkinvolvement = ggmpworkinvolvement;
	}
	public String getGgmpcollectorproceedingsno() {
		return ggmpcollectorproceedingsno;
	}
	public void setGgmpcollectorproceedingsno(String ggmpcollectorproceedingsno) {
		this.ggmpcollectorproceedingsno = ggmpcollectorproceedingsno;
	}
	public String getGgmptypeofestimate() {
		return ggmptypeofestimate;
	}
	public void setGgmptypeofestimate(String ggmptypeofestimate) {
		this.ggmptypeofestimate = ggmptypeofestimate;
	}
	public String getGgmpsanctionno() {
		return ggmpsanctionno;
	}
	public void setGgmpsanctionno(String ggmpsanctionno) {
		this.ggmpsanctionno = ggmpsanctionno;
	}
	public String getGgmpworkstatus() {
		return ggmpworkstatus;
	}
	public void setGgmpworkstatus(String ggmpworkstatus) {
		this.ggmpworkstatus = ggmpworkstatus;
	}
	
	//REPORT2 EstimatesPendingForApproval
	
	
	
	protected String AE_WBS;
	protected String AE_REG;
	protected String ADE_WBS;
	protected String ADE_REG;
	protected String DE_WBS;
	protected String DE_REG;
	protected String SE_WBS;
	protected String SE_REG;
	protected String CORP_WBS;
	protected String CORP_REG;
	protected String TOT_WBS;
	protected String TOT_REG;
	
	public String getAE_WBS() {
		return AE_WBS;
	}
	public void setAE_WBS(String AE_WBS) {
		this.AE_WBS = AE_WBS;
	}
	public String getAE_REG() {
		return AE_REG;
	}
	public void setAE_REG(String AE_REG) {
		this.AE_REG = AE_REG;
	}
	public String getADE_WBS() {
		return ADE_WBS;
	}
	public void setADE_WBS(String ADE_WBS) {
		this.ADE_WBS = ADE_WBS;
	}
	public String getADE_REG() {
		return ADE_REG;
	}
	public void setADE_REG(String ADE_REG) {
		this.ADE_REG = ADE_REG;
	}
	public String getDE_WBS() {
		return DE_WBS;
	}
	public void setDE_WBS(String DE_WBS) {
		this.DE_WBS = DE_WBS;
	}
	public String getDE_REG() {
		return DE_REG;
	}
	public void setDE_REG(String DE_REG) {
		this.DE_REG = DE_REG;
	}
	public String getSE_WBS() {
		return SE_WBS;
	}
	public void setSE_WBS(String SE_WBS) {
		this.SE_WBS = SE_WBS;
	}
	public String getSE_REG() {
		return SE_REG;
	}
	public void setSE_REG(String SE_REG) {
		this.SE_REG = SE_REG;
	}
	public String getCORP_WBS() {
		return CORP_WBS;
	}
	public void setCORP_WBS(String CORP_WBS) {
		this.CORP_WBS = CORP_WBS;
	}
	public String getCORP_REG() {
		return CORP_REG;
	}
	public void setCORP_REG(String CORP_REG) {
		this.CORP_REG = CORP_REG;
	}
	public String getTOT_WBS() {
		return TOT_WBS;
	}
	public void setTOT_WBS(String TOT_WBS) {
		this.TOT_WBS = TOT_WBS;
	}
	public String getTOT_REG() {
		return TOT_REG;
	}
	public void setTOT_REG(String TOT_REG) {
		this.TOT_REG = TOT_REG;
	}
	
	
	public String getScs_rel_paid_less7() {
		return scs_rel_paid_less7;
	}
	public void setScs_rel_paid_less7(String scs_rel_paid_less7) {
		this.scs_rel_paid_less7 = scs_rel_paid_less7;
	}
	public String getScs_rel_paid_less30() {
		return scs_rel_paid_less30;
	}
	public void setScs_rel_paid_less30(String scs_rel_paid_less30) {
		this.scs_rel_paid_less30 = scs_rel_paid_less30;
	}
	public String getScs_rel_paid_gre30() {
		return scs_rel_paid_gre30;
	}
	public void setScs_rel_paid_gre30(String scs_rel_paid_gre30) {
		this.scs_rel_paid_gre30 = scs_rel_paid_gre30;
	}
	public String getScs_rel_paid_gre45() {
		return scs_rel_paid_gre45;
	}
	public void setScs_rel_paid_gre45(String scs_rel_paid_gre45) {
		this.scs_rel_paid_gre45 = scs_rel_paid_gre45;
	}
	public String getScs_rel_paid_gre60() {
		return scs_rel_paid_gre60;
	}
	public void setScs_rel_paid_gre60(String scs_rel_paid_gre60) {
		this.scs_rel_paid_gre60 = scs_rel_paid_gre60;
	}
	public String getScs_rel_paid_gre90() {
		return scs_rel_paid_gre90;
	}
	public void setScs_rel_paid_gre90(String scs_rel_paid_gre90) {
		this.scs_rel_paid_gre90 = scs_rel_paid_gre90;
	}
	public String getBrt_gtr_2months() {
		return brt_gtr_2months;
	}
	public void setBrt_gtr_2months(String brt_gtr_2months) {
		this.brt_gtr_2months = brt_gtr_2months;
	}
	public String getTotal_dept() {
		return total_dept;
	}
	public void setTotal_dept(String total_dept) {
		this.total_dept = total_dept;
	}
	public String getTurnkey_gtr_2months() {
		return turnkey_gtr_2months;
	}
	public void setTurnkey_gtr_2months(String turnkey_gtr_2months) {
		this.turnkey_gtr_2months = turnkey_gtr_2months;
	}
	public String getTot_brt_dept() {
		return tot_brt_dept;
	}
	public void setTot_brt_dept(String tot_brt_dept) {
		this.tot_brt_dept = tot_brt_dept;
	}
	public String getTot_brt_turnkey() {
		return tot_brt_turnkey;
	}
	public void setTot_brt_turnkey(String tot_brt_turnkey) {
		this.tot_brt_turnkey = tot_brt_turnkey;
	}
	public String getCounterName() {
		return counterName;
	}
	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	
	
	protected Map<String, Map<String, CscpayVO>> catmapFinal;
	protected Map<String,CscpayVO> cscmap;
	//protected List<String> catList;
	
	
	
	public Map<String, Map<String, CscpayVO>> getCatmapFinal() {
		return catmapFinal;
	}
	public Map<String, CscpayVO> getCscmap() {
		return cscmap;
	}
	public void setCscmap(Map<String, CscpayVO> cscmap) {
		this.cscmap = cscmap;
	}
	public void setCatmapFinal(Map<String, Map<String, CscpayVO>> catmapFinal) {
		this.catmapFinal = catmapFinal;
	}
	/*public void setCatList(List<String> catList) {
		this.catList = catList;
	}
*/

	protected String from_date;
	protected String to_date;
	protected String reg_no;
	protected String consumerName;
	protected String circleName;
	protected String circleCode;
	protected String category;
	protected String countername;
	protected String compcountername;
	public String getCompcountername() {
		return compcountername;
	}
	public void setCompcountername(String compcountername) {
		this.compcountername = compcountername;
	}
	protected String conncted_load;
	protected String close_date;
	
	protected String cirname = "";
	protected String month;
	protected String year;
	protected String divname = "";
	protected String eroname = "";
	protected String subname = "";
	protected String secname = "";
	protected String group;
	
	
	
	protected int nlr_scs;
	protected BigDecimal nlr_cl;
	
	protected int tpt_scs;
	protected BigDecimal tpt_cl;
	
	protected int kdp_scs;
	protected BigDecimal kdp_cl;
	
	protected int kur_scs;
	protected BigDecimal kur_cl;
	
	protected int ant_scs;
	protected BigDecimal ant_cl;
	
	
	protected int nlr_fscs;
	protected BigDecimal nlr_fcl;
	
	protected int tpt_fscs;
	protected BigDecimal tpt_fcl;
	
	protected int kdp_fscs;
	protected BigDecimal kdp_fcl;
	
	protected int kur_fscs;
	protected BigDecimal kur_fcl;
	
	protected int ant_fscs;
	protected BigDecimal ant_fcl;
	
	protected int tot_scs;
	protected BigDecimal  tot_load;
	
	
	protected int ftot_scs;
	protected BigDecimal ftot_load;
	
	
	protected BigDecimal new_ob_load;
	protected BigDecimal new_reg_load;
	protected BigDecimal new_del_load;
	protected BigDecimal new_rel_load;
	protected BigDecimal new_cb_load;
	
	
	protected BigDecimal addi_ob_load;
	protected BigDecimal addi_reg_load;
	protected BigDecimal addi_del_load;
	protected BigDecimal addi_rel_load;
	protected BigDecimal addi_cb_load;
	
	protected int cb;
	
	protected int agl_sc_scs;
	protected int agl_st_scs;
	protected int agl_bc_scs;
	protected int agl_oc_scs;
	protected int agl_othe_scs;
	
	
	protected int three_hp;
	protected int five_hp;
	protected int eight_hp;
	protected int ten_hp;
	protected int twele_hp;
	protected int fourteen_hp;
	protected int sixteenhp;
	protected int eighteenhp;
	protected int twentyhp;
	
	
	
	protected int ht_new;
	protected int ht_addi;
	protected int ht_lt3;
	
	protected int cat5Aqua;
	protected int cat5Agl;
	protected int cat5Other;
	
	protected int tot_ltcat;
	protected int ht_scs;
	protected int tot_cat;
	
	
	
	protected int rnlr_scs;
	protected BigDecimal rnlr_cl;
	
	protected int rtpt_scs;
	protected BigDecimal rtpt_cl;
	
	protected int rkdp_scs;
	protected BigDecimal rkdp_cl;
	
	protected int rkur_scs;
	protected BigDecimal rkur_cl;
	
	protected int rant_scs;
	protected BigDecimal rant_cl;
	
	
	protected int rnlr_fscs;
	protected BigDecimal rnlr_fcl;
	
	protected int rtpt_fscs;
	protected BigDecimal rtpt_fcl;
	
	protected int rkdp_fscs;
	protected BigDecimal rkdp_fcl;
	
	protected int rkur_fscs;
	protected BigDecimal rkur_fcl;
	
	protected int rant_fscs;
	protected BigDecimal rant_fcl;
	
	protected int rtot_scs;
	protected BigDecimal  rtot_load;
	
	
	protected int rftot_scs;
	protected BigDecimal rftot_load;
	
	protected String noofapp;
	protected String delapp;
	protected String balapp;
	protected String estcreatedless15;
	protected String estcreatedgtr15;
	protected String apptobeestless15;
	protected String apptobeestgtr15;
	protected String estimatesSanapp;
	protected String noofapppaid;
	protected String noofapptobepaid;
	protected String servicereleasedless30;
	protected String servicereleasedgtr30;
	protected String balscstobereleased;
	
	
	
	
	

	public int getRnlr_scs() {
		return rnlr_scs;
	}
	public void setRnlr_scs(int rnlr_scs) {
		this.rnlr_scs = rnlr_scs;
	}
	public BigDecimal getRnlr_cl() {
		return rnlr_cl;
	}
	public void setRnlr_cl(BigDecimal rnlr_cl) {
		this.rnlr_cl = rnlr_cl;
	}
	public int getRtpt_scs() {
		return rtpt_scs;
	}
	public void setRtpt_scs(int rtpt_scs) {
		this.rtpt_scs = rtpt_scs;
	}
	public BigDecimal getRtpt_cl() {
		return rtpt_cl;
	}
	public void setRtpt_cl(BigDecimal rtpt_cl) {
		this.rtpt_cl = rtpt_cl;
	}
	public int getRkdp_scs() {
		return rkdp_scs;
	}
	public void setRkdp_scs(int rkdp_scs) {
		this.rkdp_scs = rkdp_scs;
	}
	public BigDecimal getRkdp_cl() {
		return rkdp_cl;
	}
	public void setRkdp_cl(BigDecimal rkdp_cl) {
		this.rkdp_cl = rkdp_cl;
	}
	public int getRkur_scs() {
		return rkur_scs;
	}
	public void setRkur_scs(int rkur_scs) {
		this.rkur_scs = rkur_scs;
	}
	public BigDecimal getRkur_cl() {
		return rkur_cl;
	}
	public void setRkur_cl(BigDecimal rkur_cl) {
		this.rkur_cl = rkur_cl;
	}
	public int getRant_scs() {
		return rant_scs;
	}
	public void setRant_scs(int rant_scs) {
		this.rant_scs = rant_scs;
	}
	public BigDecimal getRant_cl() {
		return rant_cl;
	}
	public void setRant_cl(BigDecimal rant_cl) {
		this.rant_cl = rant_cl;
	}
	public int getRnlr_fscs() {
		return rnlr_fscs;
	}
	public void setRnlr_fscs(int rnlr_fscs) {
		this.rnlr_fscs = rnlr_fscs;
	}
	public BigDecimal getRnlr_fcl() {
		return rnlr_fcl;
	}
	public void setRnlr_fcl(BigDecimal rnlr_fcl) {
		this.rnlr_fcl = rnlr_fcl;
	}
	public int getRtpt_fscs() {
		return rtpt_fscs;
	}
	public void setRtpt_fscs(int rtpt_fscs) {
		this.rtpt_fscs = rtpt_fscs;
	}
	public BigDecimal getRtpt_fcl() {
		return rtpt_fcl;
	}
	public void setRtpt_fcl(BigDecimal rtpt_fcl) {
		this.rtpt_fcl = rtpt_fcl;
	}
	public int getRkdp_fscs() {
		return rkdp_fscs;
	}
	public void setRkdp_fscs(int rkdp_fscs) {
		this.rkdp_fscs = rkdp_fscs;
	}
	public BigDecimal getRkdp_fcl() {
		return rkdp_fcl;
	}
	public void setRkdp_fcl(BigDecimal rkdp_fcl) {
		this.rkdp_fcl = rkdp_fcl;
	}
	public int getRkur_fscs() {
		return rkur_fscs;
	}
	public void setRkur_fscs(int rkur_fscs) {
		this.rkur_fscs = rkur_fscs;
	}
	public BigDecimal getRkur_fcl() {
		return rkur_fcl;
	}
	public void setRkur_fcl(BigDecimal rkur_fcl) {
		this.rkur_fcl = rkur_fcl;
	}
	public int getRant_fscs() {
		return rant_fscs;
	}
	public void setRant_fscs(int rant_fscs) {
		this.rant_fscs = rant_fscs;
	}
	public BigDecimal getRant_fcl() {
		return rant_fcl;
	}
	public void setRant_fcl(BigDecimal rant_fcl) {
		this.rant_fcl = rant_fcl;
	}
	public int getRtot_scs() {
		return rtot_scs;
	}
	public void setRtot_scs(int rtot_scs) {
		this.rtot_scs = rtot_scs;
	}
	public BigDecimal getRtot_load() {
		return rtot_load;
	}
	public void setRtot_load(BigDecimal rtot_load) {
		this.rtot_load = rtot_load;
	}
	public int getRftot_scs() {
		return rftot_scs;
	}
	public void setRftot_scs(int rftot_scs) {
		this.rftot_scs = rftot_scs;
	}
	public BigDecimal getRftot_load() {
		return rftot_load;
	}
	public void setRftot_load(BigDecimal rftot_load) {
		this.rftot_load = rftot_load;
	}
	public int getCat5Aqua() {
		return cat5Aqua;
	}
	public void setCat5Aqua(int cat5Aqua) {
		this.cat5Aqua = cat5Aqua;
	}
	public int getCat5Agl() {
		return cat5Agl;
	}
	public void setCat5Agl(int cat5Agl) {
		this.cat5Agl = cat5Agl;
	}
	public int getCat5Other() {
		return cat5Other;
	}
	public void setCat5Other(int cat5Other) {
		this.cat5Other = cat5Other;
	}
	public int getTot_ltcat() {
		return tot_ltcat;
	}
	public void setTot_ltcat(int tot_ltcat) {
		this.tot_ltcat = tot_ltcat;
	}
	public int getHt_scs() {
		return ht_scs;
	}
	public void setHt_scs(int ht_scs) {
		this.ht_scs = ht_scs;
	}
	public int getTot_cat() {
		return tot_cat;
	}
	public void setTot_cat(int tot_cat) {
		this.tot_cat = tot_cat;
	}
	public int getHt_new() {
		return ht_new;
	}
	public void setHt_new(int ht_new) {
		this.ht_new = ht_new;
	}
	public int getHt_addi() {
		return ht_addi;
	}
	public void setHt_addi(int ht_addi) {
		this.ht_addi = ht_addi;
	}
	public int getHt_lt3() {
		return ht_lt3;
	}
	public void setHt_lt3(int ht_lt3) {
		this.ht_lt3 = ht_lt3;
	}
	public int getThree_hp() {
		return three_hp;
	}
	public void setThree_hp(int three_hp) {
		this.three_hp = three_hp;
	}
	public int getFive_hp() {
		return five_hp;
	}
	public void setFive_hp(int five_hp) {
		this.five_hp = five_hp;
	}
	public int getEight_hp() {
		return eight_hp;
	}
	public void setEight_hp(int eight_hp) {
		this.eight_hp = eight_hp;
	}
	public int getTen_hp() {
		return ten_hp;
	}
	public void setTen_hp(int ten_hp) {
		this.ten_hp = ten_hp;
	}
	public int getTwele_hp() {
		return twele_hp;
	}
	public void setTwele_hp(int twele_hp) {
		this.twele_hp = twele_hp;
	}
	public int getFourteen_hp() {
		return fourteen_hp;
	}
	public void setFourteen_hp(int fourteen_hp) {
		this.fourteen_hp = fourteen_hp;
	}
	public int getSixteenhp() {
		return sixteenhp;
	}
	public void setSixteenhp(int sixteenhp) {
		this.sixteenhp = sixteenhp;
	}
	public int getEighteenhp() {
		return eighteenhp;
	}
	public void setEighteenhp(int eighteenhp) {
		this.eighteenhp = eighteenhp;
	}
	public int getTwentyhp() {
		return twentyhp;
	}
	public void setTwentyhp(int twentyhp) {
		this.twentyhp = twentyhp;
	}
	public int getAgl_sc_scs() {
		return agl_sc_scs;
	}
	public void setAgl_sc_scs(int agl_sc_scs) {
		this.agl_sc_scs = agl_sc_scs;
	}
	public int getAgl_st_scs() {
		return agl_st_scs;
	}
	public void setAgl_st_scs(int agl_st_scs) {
		this.agl_st_scs = agl_st_scs;
	}
	public int getAgl_bc_scs() {
		return agl_bc_scs;
	}
	public void setAgl_bc_scs(int agl_bc_scs) {
		this.agl_bc_scs = agl_bc_scs;
	}
	public int getAgl_oc_scs() {
		return agl_oc_scs;
	}
	public void setAgl_oc_scs(int agl_oc_scs) {
		this.agl_oc_scs = agl_oc_scs;
	}
	public int getAgl_othe_scs() {
		return agl_othe_scs;
	}
	public void setAgl_othe_scs(int agl_othe_scs) {
		this.agl_othe_scs = agl_othe_scs;
	}
	public int getCb() {
		return cb;
	}
	public void setCb(int cb) {
		this.cb = cb;
	}
	public BigDecimal getNew_ob_load() {
		return new_ob_load;
	}
	public void setNew_ob_load(BigDecimal new_ob_load) {
		this.new_ob_load = new_ob_load;
	}
	public BigDecimal getNew_reg_load() {
		return new_reg_load;
	}
	public void setNew_reg_load(BigDecimal new_reg_load) {
		this.new_reg_load = new_reg_load;
	}
	public BigDecimal getNew_del_load() {
		return new_del_load;
	}
	public void setNew_del_load(BigDecimal new_del_load) {
		this.new_del_load = new_del_load;
	}
	public BigDecimal getNew_rel_load() {
		return new_rel_load;
	}
	public void setNew_rel_load(BigDecimal new_rel_load) {
		this.new_rel_load = new_rel_load;
	}
	public BigDecimal getNew_cb_load() {
		return new_cb_load;
	}
	public void setNew_cb_load(BigDecimal new_cb_load) {
		this.new_cb_load = new_cb_load;
	}
	public BigDecimal getAddi_ob_load() {
		return addi_ob_load;
	}
	public void setAddi_ob_load(BigDecimal addi_ob_load) {
		this.addi_ob_load = addi_ob_load;
	}
	public BigDecimal getAddi_reg_load() {
		return addi_reg_load;
	}
	public void setAddi_reg_load(BigDecimal addi_reg_load) {
		this.addi_reg_load = addi_reg_load;
	}
	public BigDecimal getAddi_del_load() {
		return addi_del_load;
	}
	public void setAddi_del_load(BigDecimal addi_del_load) {
		this.addi_del_load = addi_del_load;
	}
	public BigDecimal getAddi_rel_load() {
		return addi_rel_load;
	}
	public void setAddi_rel_load(BigDecimal addi_rel_load) {
		this.addi_rel_load = addi_rel_load;
	}
	public BigDecimal getAddi_cb_load() {
		return addi_cb_load;
	}
	public void setAddi_cb_load(BigDecimal addi_cb_load) {
		this.addi_cb_load = addi_cb_load;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public BigDecimal getFtot_load() {
		return ftot_load;
	}
	public void setFtot_load(BigDecimal ftot_load) {
		this.ftot_load = ftot_load;
	}
	public BigDecimal getTot_load() {
		return tot_load;
	}
	public void setTot_load(BigDecimal tot_load) {
		this.tot_load = tot_load;
	}
	
	public int getTot_scs() {
		return tot_scs;
	}
	public void setTot_scs(int tot_scs) {
		this.tot_scs = tot_scs;
	}
	
	public int getFtot_scs() {
		return ftot_scs;
	}
	public void setFtot_scs(int ftot_scs) {
		this.ftot_scs = ftot_scs;
	}
	
	public String getCirname() {
		return cirname;
	}
	public void setCirname(String cirname) {
		this.cirname = cirname;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDivname() {
		return divname;
	}
	public void setDivname(String divname) {
		this.divname = divname;
	}
	public String getEroname() {
		return eroname;
	}
	public void setEroname(String eroname) {
		this.eroname = eroname;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getSecname() {
		return secname;
	}
	public void setSecname(String secname) {
		this.secname = secname;
	}
	public int getNlr_scs() {
		return nlr_scs;
	}
	public void setNlr_scs(int nlr_scs) {
		this.nlr_scs = nlr_scs;
	}
	
	public int getTpt_scs() {
		return tpt_scs;
	}
	public void setTpt_scs(int tpt_scs) {
		this.tpt_scs = tpt_scs;
	}
	
	public int getKdp_scs() {
		return kdp_scs;
	}
	public void setKdp_scs(int kdp_scs) {
		this.kdp_scs = kdp_scs;
	}
	
	public int getKur_scs() {
		return kur_scs;
	}
	public void setKur_scs(int kur_scs) {
		this.kur_scs = kur_scs;
	}
	
	public int getAnt_scs() {
		return ant_scs;
	}
	public void setAnt_scs(int ant_scs) {
		this.ant_scs = ant_scs;
	}
	
	public int getNlr_fscs() {
		return nlr_fscs;
	}
	public void setNlr_fscs(int nlr_fscs) {
		this.nlr_fscs = nlr_fscs;
	}
	
	public int getTpt_fscs() {
		return tpt_fscs;
	}
	public void setTpt_fscs(int tpt_fscs) {
		this.tpt_fscs = tpt_fscs;
	}
	
	public int getKdp_fscs() {
		return kdp_fscs;
	}
	public void setKdp_fscs(int kdp_fscs) {
		this.kdp_fscs = kdp_fscs;
	}
	
	public int getKur_fscs() {
		return kur_fscs;
	}
	public void setKur_fscs(int kur_fscs) {
		this.kur_fscs = kur_fscs;
	}
	
	public int getAnt_fscs() {
		return ant_fscs;
	}
	public void setAnt_fscs(int ant_fscs) {
		this.ant_fscs = ant_fscs;
	}
	
	public String getConncted_load() {
		return conncted_load;
	}
	public void setConncted_load(String conncted_load) {
		this.conncted_load = conncted_load;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public BigDecimal getNlr_cl() {
		return nlr_cl;
	}
	public void setNlr_cl(BigDecimal nlr_cl) {
		this.nlr_cl = nlr_cl;
	}
	public BigDecimal getTpt_cl() {
		return tpt_cl;
	}
	public void setTpt_cl(BigDecimal tpt_cl) {
		this.tpt_cl = tpt_cl;
	}
	public BigDecimal getKdp_cl() {
		return kdp_cl;
	}
	public void setKdp_cl(BigDecimal kdp_cl) {
		this.kdp_cl = kdp_cl;
	}
	public BigDecimal getKur_cl() {
		return kur_cl;
	}
	public void setKur_cl(BigDecimal kur_cl) {
		this.kur_cl = kur_cl;
	}
	public BigDecimal getAnt_cl() {
		return ant_cl;
	}
	public void setAnt_cl(BigDecimal ant_cl) {
		this.ant_cl = ant_cl;
	}
	public BigDecimal getNlr_fcl() {
		return nlr_fcl;
	}
	public void setNlr_fcl(BigDecimal nlr_fcl) {
		this.nlr_fcl = nlr_fcl;
	}
	public BigDecimal getTpt_fcl() {
		return tpt_fcl;
	}
	public void setTpt_fcl(BigDecimal tpt_fcl) {
		this.tpt_fcl = tpt_fcl;
	}
	public BigDecimal getKdp_fcl() {
		return kdp_fcl;
	}
	public void setKdp_fcl(BigDecimal kdp_fcl) {
		this.kdp_fcl = kdp_fcl;
	}
	public BigDecimal getKur_fcl() {
		return kur_fcl;
	}
	public void setKur_fcl(BigDecimal kur_fcl) {
		this.kur_fcl = kur_fcl;
	}
	public BigDecimal getAnt_fcl() {
		return ant_fcl;
	}
	public void setAnt_fcl(BigDecimal ant_fcl) {
		this.ant_fcl = ant_fcl;
	}


	
	
	
	


	public int getObreg() {
		return obreg;
	}
	public void setObreg(int obreg) {
		this.obreg = obreg;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	
	public int getDelreg() {
		return delreg;
	}
	public void setDelreg(int delreg) {
		this.delreg = delreg;
	}
	public int getRelreg() {
		return relreg;
	}
	public void setRelreg(int relreg) {
		this.relreg = relreg;
	}
	public int getWrtreg() {
		return wrtreg;
	}
	public void setWrtreg(int wrtreg) {
		this.wrtreg = wrtreg;
	}
	public int getBrtreg() {
		return brtreg;
	}
	public void setBrtreg(int brtreg) {
		this.brtreg = brtreg;
	}
	public int getTkeyreg() {
		return tkeyreg;
	}
	public void setTkeyreg(int tkeyreg) {
		this.tkeyreg = tkeyreg;
	}
	public String getAmt_paid() {
		return amt_paid;
	}
	public void setAmt_paid(String amt_paid) {
		this.amt_paid = amt_paid;
	}
	public String getAmt_not_paid() {
		return amt_not_paid;
	}
	public void setAmt_not_paid(String amt_not_paid) {
		this.amt_not_paid = amt_not_paid;
	}
	public String getEst_not_sanctioned() {
		return est_not_sanctioned;
	}
	public void setEst_not_sanctioned(String est_not_sanctioned) {
		this.est_not_sanctioned = est_not_sanctioned;
	}
	public String getEst_not_created() {
		return est_not_created;
	}
	public void setEst_not_created(String est_not_created) {
		this.est_not_created = est_not_created;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getBrt_gtr_1months() {
		return brt_gtr_1months;
	}
	public void setBrt_gtr_1months(String brt_gtr_1months) {
		this.brt_gtr_1months = brt_gtr_1months;
	}
	public String getTot_brt() {
		return tot_brt;
	}
	public void setTot_brt(String tot_brt) {
		this.tot_brt = tot_brt;
	}
	public String getTot_turnkey() {
		return tot_turnkey;
	}
	public void setTot_turnkey(String tot_turnkey) {
		this.tot_turnkey = tot_turnkey;
	}
	public String getBrt_les_3months() {
		return brt_les_3months;
	}
	public void setBrt_les_3months(String brt_les_3months) {
		this.brt_les_3months = brt_les_3months;
	}
	public String getBrt_gtr_3months() {
		return brt_gtr_3months;
	}
	public void setBrt_gtr_3months(String brt_gtr_3months) {
		this.brt_gtr_3months = brt_gtr_3months;
	}
	public String getBrt_gtr_6months() {
		return brt_gtr_6months;
	}
	public void setBrt_gtr_6months(String brt_gtr_6months) {
		this.brt_gtr_6months = brt_gtr_6months;
	}
	public String getBrt_gtr_9months() {
		return brt_gtr_9months;
	}
	public void setBrt_gtr_9months(String brt_gtr_9months) {
		this.brt_gtr_9months = brt_gtr_9months;
	}
	public String getBrt_gtr_1year() {
		return brt_gtr_1year;
	}
	public void setBrt_gtr_1year(String brt_gtr_1year) {
		this.brt_gtr_1year = brt_gtr_1year;
	}
	public String getTurnkey_les_3months() {
		return turnkey_les_3months;
	}
	public void setTurnkey_les_3months(String turnkey_les_3months) {
		this.turnkey_les_3months = turnkey_les_3months;
	}
	public String getTurnkey_gtr_3months() {
		return turnkey_gtr_3months;
	}
	public void setTurnkey_gtr_3months(String turnkey_gtr_3months) {
		this.turnkey_gtr_3months = turnkey_gtr_3months;
	}
	public String getTurnkey_gtr_6months() {
		return turnkey_gtr_6months;
	}
	public void setTurnkey_gtr_6months(String turnkey_gtr_6months) {
		this.turnkey_gtr_6months = turnkey_gtr_6months;
	}
	public String getTurnkey_gtr_9months() {
		return turnkey_gtr_9months;
	}
	public void setTurnkey_gtr_9months(String turnkey_gtr_9months) {
		this.turnkey_gtr_9months = turnkey_gtr_9months;
	}
	public String getTurnkey_gtr_1year() {
		return turnkey_gtr_1year;
	}
	public void setTurnkey_gtr_1year(String turnkey_gtr_1year) {
		this.turnkey_gtr_1year = turnkey_gtr_1year;
	}
	public String getUscno() {
		return uscno;
	}
	public void setUscno(String uscno) {
		this.uscno = uscno;
	}
	public String getSla_desc() {
		return sla_desc;
	}
	public void setSla_desc(String sla_desc) {
		this.sla_desc = sla_desc;
	}
	public String getExe_type() {
		return exe_type;
	}
	public void setExe_type(String exe_type) {
		this.exe_type = exe_type;
	}
	public String getRel_date() {
		return rel_date;
	}
	public void setRel_date(String rel_date) {
		this.rel_date = rel_date;
	}
	public String getGroup_demand() {
		return group_demand;
	}
	public void setGroup_demand(String group_demand) {
		this.group_demand = group_demand;
	}
	public String getGroup_coll() {
		return group_coll;
	}
	public void setGroup_coll(String group_coll) {
		this.group_coll = group_coll;
	}
	public String getS_group() {
		return s_group;
	}
	public void setS_group(String s_group) {
		this.s_group = s_group;
	}
	public String getCountrows() {
		return countrows;
	}
	public void setCountrows(String string) {
		this.countrows = string;
	}
	public String getRel_esti_wrt() {
		return rel_esti_wrt;
	}
	public void setRel_esti_wrt(String rel_esti_wrt) {
		this.rel_esti_wrt = rel_esti_wrt;
	}
	public String getRel_est_brt() {
		return rel_est_brt;
	}
	public void setRel_est_brt(String rel_est_brt) {
		this.rel_est_brt = rel_est_brt;
	}
	public String getOb_after_rel() {
		return ob_after_rel;
	}
	public void setOb_after_rel(String ob_after_rel) {
		this.ob_after_rel = ob_after_rel;
	}
	public String getOb() {
		return ob;
	}
	public void setOb(String ob) {
		this.ob = ob;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSanction_date() {
		return sanction_date;
	}
	public void setSanction_date(String sanction_date) {
		this.sanction_date = sanction_date;
	}
	public String getSimply_rel() {
		return simply_rel;
	}
	public void setSimply_rel(String simply_rel) {
		this.simply_rel = simply_rel;
	}
	public String getEsti_rel() {
		return esti_rel;
	}
	public void setEsti_rel(String esti_rel) {
		this.esti_rel = esti_rel;
	}
	public String getDem_within_sop() {
		return dem_within_sop;
	}
	public void setDem_within_sop(String dem_within_sop) {
		this.dem_within_sop = dem_within_sop;
	}
	public String getDem_beyond_sop() {
		return dem_beyond_sop;
	}
	public void setDem_beyond_sop(String dem_beyond_sop) {
		this.dem_beyond_sop = dem_beyond_sop;
	}
	public String getAmt_paid_within_sop() {
		return amt_paid_within_sop;
	}
	public void setAmt_paid_within_sop(String amt_paid_within_sop) {
		this.amt_paid_within_sop = amt_paid_within_sop;
	}
	public String getAmt_paid_dem_beyond_sop() {
		return amt_paid_dem_beyond_sop;
	}
	public void setAmt_paid_dem_beyond_sop(String amt_paid_dem_beyond_sop) {
		this.amt_paid_dem_beyond_sop = amt_paid_dem_beyond_sop;
	}
	public String getPen_simply_wrt() {
		return pen_simply_wrt;
	}
	public void setPen_simply_wrt(String pen_simply_wrt) {
		this.pen_simply_wrt = pen_simply_wrt;
	}
	public String getPen_simply_brt() {
		return pen_simply_brt;
	}
	public void setPen_simply_brt(String pen_simply_brt) {
		this.pen_simply_brt = pen_simply_brt;
	}
	public String getPen_esti_wrt() {
		return pen_esti_wrt;
	}
	public void setPen_esti_wrt(String pen_esti_wrt) {
		this.pen_esti_wrt = pen_esti_wrt;
	}
	public String getPen_est_brt() {
		return pen_est_brt;
	}
	public void setPen_est_brt(String pen_est_brt) {
		this.pen_est_brt = pen_est_brt;
	}
	public int getCat1Scs() {
		return cat1Scs;
	}
	public void setCat1Scs(int cat1Scs) {
		this.cat1Scs = cat1Scs;
	}
	public int getCat2Scs() {
		return cat2Scs;
	}
	public void setCat2Scs(int cat2Scs) {
		this.cat2Scs = cat2Scs;
	}
	public int getCat3Scs() {
		return cat3Scs;
	}
	public void setCat3Scs(int cat3Scs) {
		this.cat3Scs = cat3Scs;
	}
	public int getCat4Scs() {
		return cat4Scs;
	}
	public void setCat4Scs(int cat4Scs) {
		this.cat4Scs = cat4Scs;
	}
	public int getCat5Scs() {
		return cat5Scs;
	}
	public void setCat5Scs(int cat5Scs) {
		this.cat5Scs = cat5Scs;
	}
	public int getCat6Scs() {
		return cat6Scs;
	}
	public void setCat6Scs(int cat6Scs) {
		this.cat6Scs = cat6Scs;
	}
	public int getCat7Scs() {
		return cat7Scs;
	}
	public void setCat7Scs(int cat7Scs) {
		this.cat7Scs = cat7Scs;
	}
	public int getCat8Scs() {
		return cat8Scs;
	}
	public void setCat8Scs(int cat8Scs) {
		this.cat8Scs = cat8Scs;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getWrt() {
		return wrt;
	}
	public void setWrt(String wrt) {
		this.wrt = wrt;
	}
	public String getTot_reg() {
		return tot_reg;
	}
	public void setTot_reg(String tot_reg) {
		this.tot_reg = tot_reg;
	}
	public String getTot_crt() {
		return tot_crt;
	}
	public void setTot_crt(String tot_crt) {
		this.tot_crt = tot_crt;
	}
	public String getTot_pen() {
		return tot_pen;
	}
	public void setTot_pen(String tot_pen) {
		this.tot_pen = tot_pen;
	}
	public List<String> getCscCols() {
		return cscCols;
	}
	public void setCscCols(List<String> cscCols) {
		this.cscCols = cscCols;
	}
	public List<LinkedList<String>> getCscList() {
		return cscList;
	}
	public void setCscList(List<LinkedList<String>> cscList) {
		this.cscList = cscList;
	}
	public List<String> getCatcols() {
		return Catcols;
	}
	public void setCatcols(List<String> catcols) {
		Catcols = catcols;
	}
	public List<LinkedList<String>> getCatList() {
		return CatList;
	}
	public void setCatList(List<LinkedList<String>> catList) {
		CatList = catList;
	}
	public String getServieconn_no() {
		return servieconn_no;
	}
	public void setServieconn_no(String servieconn_no) {
		this.servieconn_no = servieconn_no;
	}
	public String getCunsu_fname() {
		return cunsu_fname;
	}
	public void setCunsu_fname(String cunsu_fname) {
		this.cunsu_fname = cunsu_fname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhono() {
		return phono;
	}
	public void setPhono(String phono) {
		this.phono = phono;
	}
	public String getComplaint_desc() {
		return complaint_desc;
	}
	public void setComplaint_desc(String complaint_desc) {
		this.complaint_desc = complaint_desc;
	}
	public String getContrct_load() {
		return contrct_load;
	}
	public void setContrct_load(String contrct_load) {
		this.contrct_load = contrct_load;
	}
	public String getAdditional_load() {
		return Additional_load;
	}
	public void setAdditional_load(String additional_load) {
		Additional_load = additional_load;
	}
	public String getMeeseva_ref() {
		return meeseva_ref;
	}
	public void setMeeseva_ref(String meeseva_ref) {
		this.meeseva_ref = meeseva_ref;
	}
	public String getRegDate() {
		return regDate;
	}
	public String getRegistered() {
		return Registered;
	}
	public void setRegistered(String registered) {
		Registered = registered;
	}
	
	
	
	public String getReleased_Wrt() {
		return Released_Wrt;
	}

	public void setReleased_Wrt(String Released_Wrt) {
		this.Released_Wrt = Released_Wrt;
	}
	
	public String getReleased_Brt() {
		return Released_Brt;
	}
	
	public void setReleased_Brt(String Released_Brt) {
		this.Released_Brt = Released_Brt;
	}
	
	public String getBalance_Wrt() {
		return Balance_Wrt;
	}
	public void setBalance_Wrt(String Balance_Wrt) {
		this.Balance_Wrt = Balance_Wrt;
	}
	
	
	public String getBalance_Brt() {
		return Balance_Brt;
	}
	public void setBalance_Brt(String Balance_Brt) {
		this.Balance_Brt = Balance_Brt;
	}
	
	
	
	
	
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getCunsu_name() {
		return cunsu_name;
	}
	public void setCunsu_name(String cunsu_name) {
		this.cunsu_name = cunsu_name;
	}
	public String getDemand() {
		return demand;
	}
	public void setDemand(String demand) {
		this.demand = demand;
	}
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
	public String getPaid_date() {
		return paid_date;
	}
	public void setPaid_date(String paid_date) {
		this.paid_date = paid_date;
	}
	public String getRef_no() {
		return ref_no;
	}
	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
	public String getEstwrtbrt() {
		return estwrtbrt;
	}
	public void setEstwrtbrt(String estwrtbrt) {
		this.estwrtbrt = estwrtbrt;
	}
	public String getAppPending() {
		return appPending;
	}
	public void setAppPending(String appPending) {
		this.appPending = appPending;
	}
	public String getAppReceived() {
		return appReceived;
	}
	public void setAppReceived(String appReceived) {
		this.appReceived = appReceived;
	}
	public String getAppPaid() {
		return appPaid;
	}
	public void setAppPaid(String appPaid) {
		this.appPaid = appPaid;
	}
	public String getAppDeleted() {
		return appDeleted;
	}
	public void setAppDeleted(String appDeleted) {
		this.appDeleted = appDeleted;
	}
	public String getAppReleased() {
		return appReleased;
	}
	public void setAppReleased(String appReleased) {
		this.appReleased = appReleased;
	}
	public String getBeyondReleased() {
		return beyondReleased;
	}
	public void setBeyondReleased(String beyondReleased) {
		this.beyondReleased = beyondReleased;
	}
	public String getTurnKey() {
		return turnKey;
	}
	public void setTurnKey(String turnKey) {
		this.turnKey = turnKey;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String getEro() {
		return ero;
	}
	public void setEro(String ero) {
		this.ero = ero;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getSubDiv() {
		return subDiv;
	}
	public void setSubDiv(String subDiv) {
		this.subDiv = subDiv;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getRepName() {
		return repName;
	}
	public void setRepName(String repName) {
		this.repName = repName;
	}
	public String getCgst() {
		return cgst;
	}
	public void setCgst(String cgst) {
		this.cgst = cgst;
	}
	public String getSgst() {
		return sgst;
	}
	public void setSgst(String sgst) {
		this.sgst = sgst;
	}
	public String getCsprdt() {
		return csprdt;
	}
	public void setCsprdt(String csprdt) {
		this.csprdt = csprdt;
	}
	protected List<CscpayVO> list;
	
	protected List<CscpayVO> list2;
	protected List<CscpayVO> list3;
	protected List<CscpayVO> list4;
	protected List<CscpayVO> list5;
	
	
	public List<CscpayVO> getList2() {
		return list2;
	}
	public void setList2(List<CscpayVO> list2) {
		this.list2 = list2;
	}
	public List<CscpayVO> getList3() {
		return list3;
	}
	public void setList3(List<CscpayVO> list3) {
		this.list3 = list3;
	}
	public List<CscpayVO> getList4() {
		return list4;
	}
	public void setList4(List<CscpayVO> list4) {
		this.list4 = list4;
	}
	public List<CscpayVO> getList5() {
		return list5;
	}
	public void setList5(List<CscpayVO> list5) {
		this.list5 = list5;
	}
	public List<CscpayVO> getList() {
		return list;
	}
	public void setList(List<CscpayVO> list) {
		this.list = list;
	}
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getCircleCode() {
		return circleCode;
	}
	public void setCircleCode(String circleCode) {
		this.circleCode = circleCode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCountername() {
		return countername;
	}
	public void setCountername(String countername) {
		this.countername = countername;
	}
	public String getServicedeposit() {
		return servicedeposit;
	}
	public void setServicedeposit(String servicedeposit) {
		this.servicedeposit = servicedeposit;
	}
	public String getAppFees() {
		return appFees;
	}
	public void setAppFees(String appFees) {
		this.appFees = appFees;
	}
	public String getDevChrgs() {
		return devChrgs;
	}
	public void setDevChrgs(String devChrgs) {
		this.devChrgs = devChrgs;
	}
	public String getServLineChrgs() {
		return servLineChrgs;
	}
	public void setServLineChrgs(String servLineChrgs) {
		this.servLineChrgs = servLineChrgs;
	}
	public String getTotAmt() {
		return totAmt;
	}
	public void setTotAmt(String totAmt) {
		this.totAmt = totAmt;
	}
	public String getAdvChrgs() {
		return advChrgs;
	}
	public void setAdvChrgs(String advChrgs) {
		this.advChrgs = advChrgs;
	}
	public String getSupChrgs() {
		return supChrgs;
	}
	public void setSupChrgs(String supChrgs) {
		this.supChrgs = supChrgs;
	}
	public String getOtherChrgs() {
		return otherChrgs;
	}
	public void setOtherChrgs(String otherChrgs) {
		this.otherChrgs = otherChrgs;
	}
	public String getContractLoad() {
		return contractLoad;
	}
	public void setContractLoad(String contractLoad) {
		this.contractLoad = contractLoad;
	}
	protected String servicedeposit = null;
	protected String appFees = null;
	protected String devChrgs = null;
	protected String servLineChrgs = null;
	protected String totAmt = null;
	protected String advChrgs = null;
	protected String supChrgs = null;
	protected String otherChrgs = null;
	protected String contractLoad = null;
	protected String Load_Type = null;
	protected String type1 = null;
	
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getLoad_Type() {
		return Load_Type;
	}
	public void setLoad_Type(String load_Type) {
		this.Load_Type = load_Type;
	}
	protected String complaintType = null;
	
	protected String tempconchgs = null;
	protected String csprno = null;
	protected String tot_temp_chgs = null;
	protected String ctype = null;
	
	
	
	
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getTot_temp_chgs() {
		return tot_temp_chgs;
	}
	public void setTot_temp_chgs(String tot_temp_chgs) {
		this.tot_temp_chgs = tot_temp_chgs;
	}
	public String getTempconchgs() {
		return tempconchgs;
	}
	public void setTempconchgs(String tempconchgs) {
		this.tempconchgs = tempconchgs;
	}
	public String getCsprno() {
		return csprno;
	}
	public void setCsprno(String csprno) {
		this.csprno = csprno;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	protected Map<String,CscpayVO> cscpaymap;
	protected Map<String,CscpayVO> cscpaymap1;
	protected Map<String,CscpayVO> cscpaymap2;
	

	protected Map<String,CscpayVO> cscpaymap3;
	protected Map<String,CscpayVO> cscpaymap4;
	protected Map<String,CscpayVO> cscpaymap5;
	
	
	
	public Map<String, CscpayVO> getCscpaymap5() {
		return cscpaymap5;
	}
	public void setCscpaymap5(Map<String, CscpayVO> cscpaymap5) {
		this.cscpaymap5 = cscpaymap5;
	}
	public Map<String, CscpayVO> getCscpaymap3() {
		return cscpaymap3;
	}
	public void setCscpaymap3(Map<String, CscpayVO> cscpaymap3) {
		this.cscpaymap3 = cscpaymap3;
	}
	public Map<String, CscpayVO> getCscpaymap4() {
		return cscpaymap4;
	}
	public void setCscpaymap4(Map<String, CscpayVO> cscpaymap4) {
		this.cscpaymap4 = cscpaymap4;
	}
	public Map<String, CscpayVO> getCscpaymap1() {
		return cscpaymap1;
	}
	public void setCscpaymap1(Map<String, CscpayVO> cscpaymap1) {
		this.cscpaymap1 = cscpaymap1;
	}
	public Map<String, CscpayVO> getCscpaymap2() {
		return cscpaymap2;
	}
	public void setCscpaymap2(Map<String, CscpayVO> cscpaymap2) {
		this.cscpaymap2 = cscpaymap2;
	}
	public Map<String, CscpayVO> getCscpaymap() {
		return cscpaymap;
	}
	public void setCscpaymap(Map<String, CscpayVO> cscpaymap) {
		this.cscpaymap = cscpaymap;
	}
	public String getNoofapp() {
		return noofapp;
	}
	public void setNoofapp(String noofapp) {
		this.noofapp = noofapp;
	}
	public String getDelapp() {
		return delapp;
	}
	public void setDelapp(String delapp) {
		this.delapp = delapp;
	}
	public String getBalapp() {
		return balapp;
	}
	public void setBalapp(String balapp) {
		this.balapp = balapp;
	}
	public String getEstcreatedless15() {
		return estcreatedless15;
	}
	public void setEstcreatedless15(String estcreatedless15) {
		this.estcreatedless15 = estcreatedless15;
	}
	public String getEstcreatedgtr15() {
		return estcreatedgtr15;
	}
	public void setEstcreatedgtr15(String estcreatedgtr15) {
		this.estcreatedgtr15 = estcreatedgtr15;
	}
	public String getApptobeestless15() {
		return apptobeestless15;
	}
	public void setApptobeestless15(String apptobeestless15) {
		this.apptobeestless15 = apptobeestless15;
	}
	public String getApptobeestgtr15() {
		return apptobeestgtr15;
	}
	public void setApptobeestgtr15(String apptobeestgtr15) {
		this.apptobeestgtr15 = apptobeestgtr15;
	}
	public String getEstimatesSanapp() {
		return estimatesSanapp;
	}
	public void setEstimatesSanapp(String estimatesSanapp) {
		this.estimatesSanapp = estimatesSanapp;
	}
	public String getNoofapppaid() {
		return noofapppaid;
	}
	public void setNoofapppaid(String noofapppaid) {
		this.noofapppaid = noofapppaid;
	}
	public String getNoofapptobepaid() {
		return noofapptobepaid;
	}
	public void setNoofapptobepaid(String noofapptobepaid) {
		this.noofapptobepaid = noofapptobepaid;
	}
	public String getServicereleasedless30() {
		return servicereleasedless30;
	}
	public void setServicereleasedless30(String servicereleasedless30) {
		this.servicereleasedless30 = servicereleasedless30;
	}
	public String getServicereleasedgtr30() {
		return servicereleasedgtr30;
	}
	public void setServicereleasedgtr30(String servicereleasedgtr30) {
		this.servicereleasedgtr30 = servicereleasedgtr30;
	}
	public String getBalscstobereleased() {
		return balscstobereleased;
	}
	public void setBalscstobereleased(String balscstobereleased) {
		this.balscstobereleased = balscstobereleased;
	}
	public String getLoginusername() {
		return loginusername;
	}
	public void setLoginusername(String loginusername) {
		this.loginusername = loginusername;
	}
	public String getLoginpassword() {
		return loginpassword;
	}
	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}
	
}
