package com.apccb.VO;

import java.sql.Blob;
import java.util.List;
import java.util.Map;

public class BaseVO {
	
	protected String circleName = null;
	protected String divisionName = null;
	protected String mandalName = null;
	protected String assemblyName = null;
	protected String substationCode = null;
	protected String substationName = null;
	
	protected List substationList = null;
	protected List substationNamesList = null;
	protected List divisionsList = null;
	

	public List getDivisionsList() {
		return divisionsList;
	}

	public void setDivisionsList(List divisionsList) {
		this.divisionsList = divisionsList;
	}

	public List getSubstationNamesList() {
		return substationNamesList;
	}

	public void setSubstationNamesList(List substationNamesList) {
		this.substationNamesList = substationNamesList;
	}

	public String getSubstationCode() {
		return substationCode;
	}

	public void setSubstationCode(String substationCode) {
		this.substationCode = substationCode;
	}

	public String getSubstationName() {
		return substationName;
	}

	public void setSubstationName(String substationName) {
		this.substationName = substationName;
	}

	protected String loginUserName = null;

	protected String loginPassword = null;

	protected String dbUserName = null;
	
	protected String accountID = null;

	protected String eroCode = null;

	protected String eroName = null;

	protected String userType = null;

	protected String circleCode = null;

	protected String ctrNo = null;

	protected String fromDate = null;

	protected String toDate = null;

	protected String mobileNo = null;

	protected String[] uscNos = null;

	protected String aadharNo = null;
	
	protected String irdaStatus = null;

	protected String aadharName = null;

	protected String aadharLink = null;

	protected String minAmount = null;

	protected String feederName = null;

	protected List sectionsList = null;

	protected List sectionsNamesList = null;

	protected List eroNamesList = null;

	protected String currentDate = null;

	protected String unitCode = null;

	protected String secCode = null;

	protected String unitName = null;

	protected String unitType = null;

	protected String oldPwd = null;

	protected String newPwd = null;

	protected String paaCode = null;
	
	protected String machineCode = null;

	protected String confirmPwd = null;

	protected String errorMessage = null;

	protected boolean containsData = false;

	protected List sapRJDiscList = null;

	protected String uscno = null;

	protected String poleNum = null;

	protected String dtrCode = null;

	protected String fdrCode = null;

	protected boolean validLogin = false;

	protected String displayMessage = null;

	protected String flag = null;

	protected String flogin = null;

	protected String serviceType = null;

	protected String reportType = null;

	protected String ledDate = null;

	protected String prAmount = null;

	protected String DCBFlag = null;

	protected String dispatchNo = null;

	protected String dispatchDate = null;

	protected String distributionCode = null;

	protected String distributionName = null;

	protected String ledCRTot = null;

	protected String ledCBTot = null;

	protected String ledLPDT = null;

	protected String disConnDate = null;

	protected String reading = null;

	protected String sapEro = null;

	protected String message = null;

	protected String uploadFlag = null;

	protected String prNo = null;

	protected String bcrcNo = null;

	protected String prDt = null;

	protected String group = null;

	protected String cycle = null;

	protected String consumerName = null;

	protected String category = null;

	protected String monthYear = null;
	
	protected String censusCodes = null;

	protected List failedVOList = null;

	protected List baseVOList = null;

	protected String load = null;

	protected String dateOfOrder = null;

	protected String orderNumber = null;

	protected String ipAddress = null;

	protected List apdrpTownsList = null;

	protected String socialCategory = null;

	protected String certificateNo = null;

	protected String certificateIssueDate = null;

	protected String certificateIssueAuth = null;

	protected String colonyName = null;

	protected String scstUnits = null;

	protected String fatherName = null;

	protected String doorNo = null;

	protected String street = null;

	protected String area = null;

	protected String city_Town = null;

	protected String pinCode = null;

	protected String nameInAadharCard = null;

	protected String aadharRelationshipFlag = null;

	protected String addressInAadharCard = null;

	protected String panNo = null;

	protected String panName = null;
	
	protected String lineManCode = null;
	
	protected String panchayatName = null;
	
	
	
	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getAssemblyName() {
		return assemblyName;
	}

	public void setAssemblyName(String assemblyName) {
		this.assemblyName = assemblyName;
	}

	protected String irdascs=null;
	
	protected String msmeValue=null;
	
	protected String msmeValid=null;
		
	protected String validateMsme=null;
	
	protected String msmeVlidateUscno=null;
	
	protected String msmeIsValid = null ;
	
	protected String msmeCmacct = null ;
	
	protected String scstSubsidyValid=null;
	
	protected String scstSubsidyCmacct=null;
	
	protected String dateEffectFrom=null;
	
	protected String struckKwh=null;
	
	protected String struckKvah=null;
	
	protected String chkRdgDt=null;
	
	protected String struckStatus=null;
	
	protected String rdgDt=null;
	
	protected String blclrrdg=null;
	
	protected String blclrkwh=null;
	
	protected String blclrkvah=null;
	
	protected String blclrstat=null;
	
	protected String aadharFlag=null;
	
	protected String gmtypecode=null;
	
	protected String gmdeptcode=null;
	
	protected String gmsubdeptcode=null;
	
	protected String ccoldvalue=null;
	
	List<String> noticationList = null ;
	
	Map<String,String[]> noticationMap = null ;
	
	Map<String,Blob> notifiBlob = null ;
	
	protected String lgdMandalName=null;
	
	protected String lgdPanchayatName=null;
	
	protected String lgdCode=null;
		
	protected String lgdVillageName=null;
	
	protected String lgdDdo=null;
	
	protected String gstno = null ;
	
	protected String gstExNonex = null ;
		
	public String getIrdascs() {
		return irdascs;
	}

	public void setIrdascs(String irdascs) {
		this.irdascs = irdascs;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public String getPanchayatName() {
		return panchayatName;
	}

	public void setPanchayatName(String panchayatName) {
		this.panchayatName = panchayatName;
	}

	public String getLineManCode() {
		return lineManCode;
	}

	public void setLineManCode(String lineManCode) {
		this.lineManCode = lineManCode;
	}

	public String getDistributionCode() {
		return distributionCode;
	}

	public void setDistributionCode(String distributionCode) {
		this.distributionCode = distributionCode;
	}

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public String getDisplayMessage() {
		return this.displayMessage;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getEroCode() {
		return eroCode;
	}

	public void setEroCode(String eroCode) {
		this.eroCode = eroCode;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

	public List getSectionsList() {
		return sectionsList;
	}

	public void setSectionsList(List sectionsList) {
		this.sectionsList = sectionsList;
	}
	
	
	

	public List getSubstationList() {
		return substationList;
	}

	public void setSubstationList(List substationList) {
		this.substationList = substationList;
	}

	public String getEroName() {
		return eroName;
	}

	public void setEroName(String eroName) {
		this.eroName = eroName;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public List getSectionsNamesList() {
		return sectionsNamesList;
	}

	public void setSectionsNamesList(List sectionsNamesList) {
		this.sectionsNamesList = sectionsNamesList;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public boolean isContainsData() {
		return containsData;
	}

	public void setContainsData(boolean containsData) {
		this.containsData = containsData;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getSecCode() {
		return secCode;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public String getFlogin() {
		return flogin;
	}

	public void setFlogin(String flogin) {
		this.flogin = flogin;
	}

	public boolean isValidLogin() {
		return validLogin;
	}

	public void setValidLogin(boolean validLogin) {
		this.validLogin = validLogin;
	}

	public List getSapRJDiscList() {
		return sapRJDiscList;
	}

	public void setSapRJDiscList(List sapRJDiscList) {
		this.sapRJDiscList = sapRJDiscList;
	}

	public String getUscno() {
		return uscno;
	}

	public void setUscno(String uscno) {
		this.uscno = uscno;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getLedDate() {
		return ledDate;
	}

	public void setLedDate(String ledDate) {
		this.ledDate = ledDate;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getDCBFlag() {
		return DCBFlag;
	}

	public void setDCBFlag(String flag) {
		DCBFlag = flag;
	}

	public String getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(String dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public String getDispatchNo() {
		return dispatchNo;
	}

	public void setDispatchNo(String dispatchNo) {
		this.dispatchNo = dispatchNo;
	}

	public String getDisConnDate() {
		return disConnDate;
	}

	public void setDisConnDate(String disConnDate) {
		this.disConnDate = disConnDate;
	}

	public String getLedCBTot() {
		return ledCBTot;
	}

	public void setLedCBTot(String ledCBTot) {
		this.ledCBTot = ledCBTot;
	}

	public String getLedCRTot() {
		return ledCRTot;
	}

	public void setLedCRTot(String ledCRTot) {
		this.ledCRTot = ledCRTot;
	}

	public String getLedLPDT() {
		return ledLPDT;
	}

	public void setLedLPDT(String ledLPDT) {
		this.ledLPDT = ledLPDT;
	}

	public String getReading() {
		return reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}

	public String getSapEro() {
		return sapEro;
	}

	public void setSapEro(String sapEro) {
		this.sapEro = sapEro;
	}

	public List getFailedVOList() {
		return failedVOList;
	}

	public void setFailedVOList(List failedVOList) {
		this.failedVOList = failedVOList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUploadFlag() {
		return uploadFlag;
	}

	public void setUploadFlag(String uploadFlag) {
		this.uploadFlag = uploadFlag;
	}

	public String getBcrcNo() {
		return bcrcNo;
	}

	public void setBcrcNo(String bcrcNo) {
		this.bcrcNo = bcrcNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getPrDt() {
		return prDt;
	}

	public void setPrDt(String prDt) {
		this.prDt = prDt;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public String getDistributionName() {
		return distributionName;
	}

	public void setDistributionName(String distributionName) {
		this.distributionName = distributionName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getPoleNum() {
		return poleNum;
	}

	public void setPoleNum(String poleNum) {
		this.poleNum = poleNum;
	}

	public String getPrAmount() {
		return prAmount;
	}

	public void setPrAmount(String prAmount) {
		this.prAmount = prAmount;
	}

	public String getCircleCode() {
		return circleCode;
	}

	public void setCircleCode(String circleCode) {
		this.circleCode = circleCode;
	}
	
	
	//new added circleName,mandal,div,assembly
	
	public String getcircleName() {
		return circleName;
	}
	
	public void setcircleName(String circleName) {
		this.circleName = circleName;
	}
	//new added circleName,mandal,div,assembly
	
	

	public List getEroNamesList() {
		return eroNamesList;
	}

	public void setEroNamesList(List eroNamesList) {
		this.eroNamesList = eroNamesList;
	}

	public List getBaseVOList() {
		return baseVOList;
	}

	public void setBaseVOList(List baseVOList) {
		this.baseVOList = baseVOList;
	}

	public String getDtrCode() {
		return dtrCode;
	}

	public void setDtrCode(String dtrCode) {
		this.dtrCode = dtrCode;
	}

	public String getFdrCode() {
		return fdrCode;
	}

	public void setFdrCode(String fdrCode) {
		this.fdrCode = fdrCode;
	}

	public String getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}

	public String getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public String getLoad() {
		return load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public List getApdrpTownsList() {
		return apdrpTownsList;
	}

	public void setApdrpTownsList(List apdrpTownsList) {
		this.apdrpTownsList = apdrpTownsList;
	}

	public String getSocialCategory() {
		return socialCategory;
	}

	public void setSocialCategory(String socialCategory) {
		this.socialCategory = socialCategory;
	}

	public String getScstUnits() {
		return scstUnits;
	}

	public void setScstUnits(String scstUnits) {
		this.scstUnits = scstUnits;
	}

	public String getCertificateIssueAuth() {
		return certificateIssueAuth;
	}

	public void setCertificateIssueAuth(String certificateIssueAuth) {
		this.certificateIssueAuth = certificateIssueAuth;
	}

	public String getCertificateIssueDate() {
		return certificateIssueDate;
	}

	public void setCertificateIssueDate(String certificateIssueDate) {
		this.certificateIssueDate = certificateIssueDate;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public String getCtrNo() {
		return ctrNo;
	}

	public void setCtrNo(String ctrNo) {
		this.ctrNo = ctrNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPaaCode() {
		return paaCode;
	}

	public void setPaaCode(String paaCode) {
		this.paaCode = paaCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity_Town() {
		return city_Town;
	}

	public void setCity_Town(String city_Town) {
		this.city_Town = city_Town;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getFeederName() {
		return feederName;
	}

	public void setFeederName(String feederName) {
		this.feederName = feederName;
	}

	public String[] getUscNos() {
		return uscNos;
	}

	public void setUscNos(String[] uscNos) {
		this.uscNos = uscNos;
	}

	public String getAadharRelationshipFlag() {
		return aadharRelationshipFlag;
	}

	public void setAadharRelationshipFlag(String aadharRelationshipFlag) {
		this.aadharRelationshipFlag = aadharRelationshipFlag;
	}

	public String getAddressInAadharCard() {
		return addressInAadharCard;
	}

	public void setAddressInAadharCard(String addressInAadharCard) {
		this.addressInAadharCard = addressInAadharCard;
	}

	public String getNameInAadharCard() {
		return nameInAadharCard;
	}

	public void setNameInAadharCard(String nameInAadharCard) {
		this.nameInAadharCard = nameInAadharCard;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getAadharLink() {
		return aadharLink;
	}

	public void setAadharLink(String aadharLink) {
		this.aadharLink = aadharLink;
	}

	public String getAadharName() {
		return aadharName;
	}

	public void setAadharName(String aadharName) {
		this.aadharName = aadharName;
	}

	public String getPanName() {
		return panName;
	}

	public void setPanName(String panName) {
		this.panName = panName;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getMachineCode() {
		return machineCode;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getCensusCodes() {
		return censusCodes;
	}

	public void setCensusCodes(String censusCodes) {
		this.censusCodes = censusCodes;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getIrdaStatus() {
		return irdaStatus;
	}

	public void setIrdaStatus(String irdaStatus) {
		this.irdaStatus = irdaStatus;
	}

	public String getMsmeValue() {
		return msmeValue;
	}

	public void setMsmeValue(String msmeValue) {
		this.msmeValue = msmeValue;
	}

	public String getMsmeValid() {
		return msmeValid;
	}

	public void setMsmeValid(String msmeValid) {
		this.msmeValid = msmeValid;
	}

	public String getValidateMsme() {
		return validateMsme;
	}

	public void setValidateMsme(String validateMsme) {
		this.validateMsme = validateMsme;
	}

	public String getMsmeVlidateUscno() {
		return msmeVlidateUscno;
	}

	public void setMsmeVlidateUscno(String msmeVlidateUscno) {
		this.msmeVlidateUscno = msmeVlidateUscno;
	}

	public String getMsmeIsValid() {
		return msmeIsValid;
	}

	public void setMsmeIsValid(String msmeIsValid) {
		this.msmeIsValid = msmeIsValid;
	}

	public String getMsmeCmacct() {
		return msmeCmacct;
	}

	public void setMsmeCmacct(String msmeCmacct) {
		this.msmeCmacct = msmeCmacct;
	}

	public String getScstSubsidyValid() {
		return scstSubsidyValid;
	}

	public void setScstSubsidyValid(String scstSubsidyValid) {
		this.scstSubsidyValid = scstSubsidyValid;
	}

	public String getScstSubsidyCmacct() {
		return scstSubsidyCmacct;
	}

	public void setScstSubsidyCmacct(String scstSubsidyCmacct) {
		this.scstSubsidyCmacct = scstSubsidyCmacct;
	}

	public String getDateEffectFrom() {
		return dateEffectFrom;
	}

	public void setDateEffectFrom(String dateEffectFrom) {
		this.dateEffectFrom = dateEffectFrom;
	}

	public String getStruckKwh() {
		return struckKwh;
	}

	public void setStruckKwh(String struckKwh) {
		this.struckKwh = struckKwh;
	}

	public String getStruckKvah() {
		return struckKvah;
	}

	public void setStruckKvah(String struckKvah) {
		this.struckKvah = struckKvah;
	}

	public String getChkRdgDt() {
		return chkRdgDt;
	}

	public void setChkRdgDt(String chkRdgDt) {
		this.chkRdgDt = chkRdgDt;
	}

	public String getStruckStatus() {
		return struckStatus;
	}

	public void setStruckStatus(String struckStatus) {
		this.struckStatus = struckStatus;
	}

	public String getRdgDt() {
		return rdgDt;
	}

	public void setRdgDt(String rdgDt) {
		this.rdgDt = rdgDt;
	}

	public String getBlclrrdg() {
		return blclrrdg;
	}

	public void setBlclrrdg(String blclrrdg) {
		this.blclrrdg = blclrrdg;
	}

	public String getBlclrkwh() {
		return blclrkwh;
	}

	public void setBlclrkwh(String blclrkwh) {
		this.blclrkwh = blclrkwh;
	}

	public String getBlclrkvah() {
		return blclrkvah;
	}

	public void setBlclrkvah(String blclrkvah) {
		this.blclrkvah = blclrkvah;
	}

	public String getBlclrstat() {
		return blclrstat;
	}

	public void setBlclrstat(String blclrstat) {
		this.blclrstat = blclrstat;
	}

	public String getAadharFlag() {
		return aadharFlag;
	}

	public void setAadharFlag(String aadharFlag) {
		this.aadharFlag = aadharFlag;
	}

	public String getGmtypecode() {
		return gmtypecode;
	}

	public void setGmtypecode(String gmtypecode) {
		this.gmtypecode = gmtypecode;
	}

	public String getGmdeptcode() {
		return gmdeptcode;
	}

	public void setGmdeptcode(String gmdeptcode) {
		this.gmdeptcode = gmdeptcode;
	}

	public String getGmsubdeptcode() {
		return gmsubdeptcode;
	}

	public void setGmsubdeptcode(String gmsubdeptcode) {
		this.gmsubdeptcode = gmsubdeptcode;
	}

	public String getCcoldvalue() {
		return ccoldvalue;
	}

	public void setCcoldvalue(String ccoldvalue) {
		this.ccoldvalue = ccoldvalue;
	}

	public List<String> getNoticationList() {
		return noticationList;
	}

	public void setNoticationList(List<String> noticationList) {
		this.noticationList = noticationList;
	}

	public Map<String, String[]> getNoticationMap() {
		return noticationMap;
	}

	public void setNoticationMap(Map<String, String[]> noticationMap) {
		this.noticationMap = noticationMap;
	}

	public Map<String, Blob> getNotifiBlob() {
		return notifiBlob;
	}

	public void setNotifiBlob(Map<String, Blob> notifiBlob) {
		this.notifiBlob = notifiBlob;
	}

	public String getLgdMandalName() {
		return lgdMandalName;
	}

	public void setLgdMandalName(String lgdMandalName) {
		this.lgdMandalName = lgdMandalName;
	}

	public String getLgdPanchayatName() {
		return lgdPanchayatName;
	}

	public void setLgdPanchayatName(String lgdPanchayatName) {
		this.lgdPanchayatName = lgdPanchayatName;
	}

	public String getLgdCode() {
		return lgdCode;
	}

	public void setLgdCode(String lgdCode) {
		this.lgdCode = lgdCode;
	}

	public String getLgdVillageName() {
		return lgdVillageName;
	}

	public void setLgdVillageName(String lgdVillageName) {
		this.lgdVillageName = lgdVillageName;
	}

	public String getLgdDdo() {
		return lgdDdo;
	}

	public void setLgdDdo(String lgdDdo) {
		this.lgdDdo = lgdDdo;
	}

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getGstExNonex() {
		return gstExNonex;
	}

	public void setGstExNonex(String gstExNonex) {
		this.gstExNonex = gstExNonex;
	}

	

	
}
