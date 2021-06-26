package com.rsa.mustang.Pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Cobra {

    @SerializedName("ContactList")
    @Expose
    private List<Contact> contactList = null;
    @SerializedName("CustomerList")
    @Expose
    private List<Customer> customerList = null;
    @SerializedName("DriverList")
    @Expose
    private List<Driver> driverList = null;
    @SerializedName("BrokerList")
    @Expose
    private List<Broker> brokerList = null;
    @SerializedName("VendorList")
    @Expose
    private List<Vendor> vendorList = null;
    @SerializedName("CarrierList")
    @Expose
    private List<Carrier> carrierList = null;
    @SerializedName("FactoringList")
    @Expose
    private List<Factoring> factoringList = null;
    @SerializedName("StaffList")
    @Expose
    private List<Staff> staffList = null;
    @SerializedName("OperationStatus")
    @Expose
    private Integer operationStatus;
    @SerializedName("ErrorMessage")
    @Expose
    private Object errorMessage;
    @SerializedName("ShortMessage")
    @Expose
    private Object shortMessage;

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }

    public List<Broker> getBrokerList() {
        return brokerList;
    }

    public void setBrokerList(List<Broker> brokerList) {
        this.brokerList = brokerList;
    }

    public List<Vendor> getVendorList() {
        return vendorList;
    }

    public void setVendorList(List<Vendor> vendorList) {
        this.vendorList = vendorList;
    }

    public List<Carrier> getCarrierList() {
        return carrierList;
    }

    public void setCarrierList(List<Carrier> carrierList) {
        this.carrierList = carrierList;
    }

    public List<Factoring> getFactoringList() {
        return factoringList;
    }

    public void setFactoringList(List<Factoring> factoringList) {
        this.factoringList = factoringList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(Object shortMessage) {
        this.shortMessage = shortMessage;
    }

    public class Contact {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("AT")
        @Expose
        private String at;
        @SerializedName("CN")
        @Expose
        private String cn;
        @SerializedName("CTN")
        @Expose
        private String ctn;
        @SerializedName("ME")
        @Expose
        private Object me;
        @SerializedName("CE")
        @Expose
        private Object ce;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("MP")
        @Expose
        private Object mp;
        @SerializedName("MPE")
        @Expose
        private Object mpe;
        @SerializedName("CP")
        @Expose
        private Object cp;
        @SerializedName("CPE")
        @Expose
        private Object cpe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("AD1")
        @Expose
        private String ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private String ct;
        @SerializedName("ST")
        @Expose
        private String st;
        @SerializedName("CTY")
        @Expose
        private Object cty;
        @SerializedName("ZP")
        @Expose
        private String zp;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private String cfn;
        @SerializedName("CLN")
        @Expose
        private String cln;
        @SerializedName("PSP")
        @Expose
        private Object psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("LatLong")
        @Expose
        private String latLong;

        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getAt() {
            return at;
        }

        public void setAt(String at) {
            this.at = at;
        }

        public String getCn() {
            return cn;
        }

        public void setCn(String cn) {
            this.cn = cn;
        }

        public String getCtn() {
            return ctn;
        }

        public void setCtn(String ctn) {
            this.ctn = ctn;
        }

        public Object getMe() {
            return me;
        }

        public void setMe(Object me) {
            this.me = me;
        }

        public Object getCe() {
            return ce;
        }

        public void setCe(Object ce) {
            this.ce = ce;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public Object getMp() {
            return mp;
        }

        public void setMp(Object mp) {
            this.mp = mp;
        }

        public Object getMpe() {
            return mpe;
        }

        public void setMpe(Object mpe) {
            this.mpe = mpe;
        }

        public Object getCp() {
            return cp;
        }

        public void setCp(Object cp) {
            this.cp = cp;
        }

        public Object getCpe() {
            return cpe;
        }

        public void setCpe(Object cpe) {
            this.cpe = cpe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public String getAd1() {
            return ad1;
        }

        public void setAd1(String ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public String getCt() {
            return ct;
        }

        public void setCt(String ct) {
            this.ct = ct;
        }

        public String getSt() {
            return st;
        }

        public void setSt(String st) {
            this.st = st;
        }

        public Object getCty() {
            return cty;
        }

        public void setCty(Object cty) {
            this.cty = cty;
        }

        public String getZp() {
            return zp;
        }

        public void setZp(String zp) {
            this.zp = zp;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public String getCfn() {
            return cfn;
        }

        public void setCfn(String cfn) {
            this.cfn = cfn;
        }

        public String getCln() {
            return cln;
        }

        public void setCln(String cln) {
            this.cln = cln;
        }

        public Object getPsp() {
            return psp;
        }

        public void setPsp(Object psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public String getLatLong() {
            return latLong;
        }

        public void setLatLong(String latLong) {
            this.latLong = latLong;
        }

    }

    public class Customer {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("CN")
        @Expose
        private String cn;
        @SerializedName("CTN")
        @Expose
        private String ctn;
        @SerializedName("DBAN")
        @Expose
        private Object dban;
        @SerializedName("AN")
        @Expose
        private Object an;
        @SerializedName("ME")
        @Expose
        private Object me;
        @SerializedName("CE")
        @Expose
        private Object ce;
        @SerializedName("AE")
        @Expose
        private Object ae;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("MP")
        @Expose
        private Object mp;
        @SerializedName("MPE")
        @Expose
        private Object mpe;
        @SerializedName("CP")
        @Expose
        private Object cp;
        @SerializedName("CPE")
        @Expose
        private Object cpe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("AD1")
        @Expose
        private String ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private String ct;
        @SerializedName("ST")
        @Expose
        private String st;
        @SerializedName("CTY")
        @Expose
        private String cty;
        @SerializedName("ZP")
        @Expose
        private String zp;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private Object cfn;
        @SerializedName("CLN")
        @Expose
        private Object cln;
        @SerializedName("PSP")
        @Expose
        private Object psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("SCL")
        @Expose
        private Boolean scl;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("CUSID")
        @Expose
        private Integer cusid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("LatLong")
        @Expose
        private Object latLong;
        @SerializedName("CustomerOrderCharges")
        @Expose
        private Object customerOrderCharges;
        @SerializedName("CustomerAccessoryFeeCharges")
        @Expose
        private Object customerAccessoryFeeCharges;



        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getCn() {
            return cn;
        }

        public void setCn(String cn) {
            this.cn = cn;
        }

        public String getCtn() {
            return ctn;
        }

        public void setCtn(String ctn) {
            this.ctn = ctn;
        }

        public Object getDban() {
            return dban;
        }

        public void setDban(Object dban) {
            this.dban = dban;
        }

        public Object getAn() {
            return an;
        }

        public void setAn(Object an) {
            this.an = an;
        }

        public Object getMe() {
            return me;
        }

        public void setMe(Object me) {
            this.me = me;
        }

        public Object getCe() {
            return ce;
        }

        public void setCe(Object ce) {
            this.ce = ce;
        }

        public Object getAe() {
            return ae;
        }

        public void setAe(Object ae) {
            this.ae = ae;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public Object getMp() {
            return mp;
        }

        public void setMp(Object mp) {
            this.mp = mp;
        }

        public Object getMpe() {
            return mpe;
        }

        public void setMpe(Object mpe) {
            this.mpe = mpe;
        }

        public Object getCp() {
            return cp;
        }

        public void setCp(Object cp) {
            this.cp = cp;
        }

        public Object getCpe() {
            return cpe;
        }

        public void setCpe(Object cpe) {
            this.cpe = cpe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public String getAd1() {
            return ad1;
        }

        public void setAd1(String ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public String getCt() {
            return ct;
        }

        public void setCt(String ct) {
            this.ct = ct;
        }

        public String getSt() {
            return st;
        }

        public void setSt(String st) {
            this.st = st;
        }

        public String getCty() {
            return cty;
        }

        public void setCty(String cty) {
            this.cty = cty;
        }

        public String getZp() {
            return zp;
        }

        public void setZp(String zp) {
            this.zp = zp;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public Object getCfn() {
            return cfn;
        }

        public void setCfn(Object cfn) {
            this.cfn = cfn;
        }

        public Object getCln() {
            return cln;
        }

        public void setCln(Object cln) {
            this.cln = cln;
        }

        public Object getPsp() {
            return psp;
        }

        public void setPsp(Object psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Boolean getScl() {
            return scl;
        }

        public void setScl(Boolean scl) {
            this.scl = scl;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getCusid() {
            return cusid;
        }

        public void setCusid(Integer cusid) {
            this.cusid = cusid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public Object getLatLong() {
            return latLong;
        }

        public void setLatLong(Object latLong) {
            this.latLong = latLong;
        }

        public Object getCustomerOrderCharges() {
            return customerOrderCharges;
        }

        public void setCustomerOrderCharges(Object customerOrderCharges) {
            this.customerOrderCharges = customerOrderCharges;
        }

        public Object getCustomerAccessoryFeeCharges() {
            return customerAccessoryFeeCharges;
        }

        public void setCustomerAccessoryFeeCharges(Object customerAccessoryFeeCharges) {
            this.customerAccessoryFeeCharges = customerAccessoryFeeCharges;
        }

    }

    public class Driver {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("DN")
        @Expose
        private String dn;
        @SerializedName("DT")
        @Expose
        private String dt;
        @SerializedName("DS")
        @Expose
        private String ds;
        @SerializedName("WE")
        @Expose
        private Object we;
        @SerializedName("PE")
        @Expose
        private Object pe;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("WP")
        @Expose
        private Object wp;
        @SerializedName("WPE")
        @Expose
        private Object wpe;
        @SerializedName("HP")
        @Expose
        private Object hp;
        @SerializedName("HPE")
        @Expose
        private Object hpe;
        @SerializedName("PP")
        @Expose
        private Object pp;
        @SerializedName("PPE")
        @Expose
        private Object ppe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("AD1")
        @Expose
        private Object ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private Object ct;
        @SerializedName("ST")
        @Expose
        private Object st;
        @SerializedName("CTY")
        @Expose
        private Object cty;
        @SerializedName("ZP")
        @Expose
        private Object zp;
        @SerializedName("DIN")
        @Expose
        private String din;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private String cfn;
        @SerializedName("CLN")
        @Expose
        private String cln;
        @SerializedName("PSP")
        @Expose
        private String psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("ISACT")
        @Expose
        private Boolean isact;
        @SerializedName("ISOO")
        @Expose
        private Boolean isoo;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("DRID")
        @Expose
        private Integer drid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("CN")
        @Expose
        private String cn;
        @SerializedName("PaymentType")
        @Expose
        private Integer paymentType;
        @SerializedName("LoadedMiles")
        @Expose
        private Double loadedMiles;
        @SerializedName("EmptyMiles")
        @Expose
        private Double emptyMiles;
        @SerializedName("LoadPayPercent")
        @Expose
        private Double loadPayPercent;
        @SerializedName("LoadPaymentPercentType")
        @Expose
        private Integer loadPaymentPercentType;
        @SerializedName("PayPerHour")
        @Expose
        private Double payPerHour;
        @SerializedName("DefaultEmptyMiles")
        @Expose
        private Integer defaultEmptyMiles;
        @SerializedName("LatLong")
        @Expose
        private Object latLong;

        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getDn() {
            return dn;
        }

        public void setDn(String dn) {
            this.dn = dn;
        }

        public String getDt() {
            return dt;
        }

        public void setDt(String dt) {
            this.dt = dt;
        }

        public String getDs() {
            return ds;
        }

        public void setDs(String ds) {
            this.ds = ds;
        }

        public Object getWe() {
            return we;
        }

        public void setWe(Object we) {
            this.we = we;
        }

        public Object getPe() {
            return pe;
        }

        public void setPe(Object pe) {
            this.pe = pe;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public Object getWp() {
            return wp;
        }

        public void setWp(Object wp) {
            this.wp = wp;
        }

        public Object getWpe() {
            return wpe;
        }

        public void setWpe(Object wpe) {
            this.wpe = wpe;
        }

        public Object getHp() {
            return hp;
        }

        public void setHp(Object hp) {
            this.hp = hp;
        }

        public Object getHpe() {
            return hpe;
        }

        public void setHpe(Object hpe) {
            this.hpe = hpe;
        }

        public Object getPp() {
            return pp;
        }

        public void setPp(Object pp) {
            this.pp = pp;
        }

        public Object getPpe() {
            return ppe;
        }

        public void setPpe(Object ppe) {
            this.ppe = ppe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public Object getAd1() {
            return ad1;
        }

        public void setAd1(Object ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public Object getCt() {
            return ct;
        }

        public void setCt(Object ct) {
            this.ct = ct;
        }

        public Object getSt() {
            return st;
        }

        public void setSt(Object st) {
            this.st = st;
        }

        public Object getCty() {
            return cty;
        }

        public void setCty(Object cty) {
            this.cty = cty;
        }

        public Object getZp() {
            return zp;
        }

        public void setZp(Object zp) {
            this.zp = zp;
        }

        public String getDin() {
            return din;
        }

        public void setDin(String din) {
            this.din = din;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public String getCfn() {
            return cfn;
        }

        public void setCfn(String cfn) {
            this.cfn = cfn;
        }

        public String getCln() {
            return cln;
        }

        public void setCln(String cln) {
            this.cln = cln;
        }

        public String getPsp() {
            return psp;
        }

        public void setPsp(String psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Boolean getIsact() {
            return isact;
        }

        public void setIsact(Boolean isact) {
            this.isact = isact;
        }

        public Boolean getIsoo() {
            return isoo;
        }

        public void setIsoo(Boolean isoo) {
            this.isoo = isoo;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getDrid() {
            return drid;
        }

        public void setDrid(Integer drid) {
            this.drid = drid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public String getCn() {
            return cn;
        }

        public void setCn(String cn) {
            this.cn = cn;
        }

        public Integer getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
        }

        public Double getLoadedMiles() {
            return loadedMiles;
        }

        public void setLoadedMiles(Double loadedMiles) {
            this.loadedMiles = loadedMiles;
        }

        public Double getEmptyMiles() {
            return emptyMiles;
        }

        public void setEmptyMiles(Double emptyMiles) {
            this.emptyMiles = emptyMiles;
        }

        public Double getLoadPayPercent() {
            return loadPayPercent;
        }

        public void setLoadPayPercent(Double loadPayPercent) {
            this.loadPayPercent = loadPayPercent;
        }

        public Integer getLoadPaymentPercentType() {
            return loadPaymentPercentType;
        }

        public void setLoadPaymentPercentType(Integer loadPaymentPercentType) {
            this.loadPaymentPercentType = loadPaymentPercentType;
        }

        public Double getPayPerHour() {
            return payPerHour;
        }

        public void setPayPerHour(Double payPerHour) {
            this.payPerHour = payPerHour;
        }

        public Integer getDefaultEmptyMiles() {
            return defaultEmptyMiles;
        }

        public void setDefaultEmptyMiles(Integer defaultEmptyMiles) {
            this.defaultEmptyMiles = defaultEmptyMiles;
        }

        public Object getLatLong() {
            return latLong;
        }

        public void setLatLong(Object latLong) {
            this.latLong = latLong;
        }

    }

    public class Broker {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("CN")
        @Expose
        private String cn;
        @SerializedName("CTN")
        @Expose
        private String ctn;
        @SerializedName("BT")
        @Expose
        private String bt;
        @SerializedName("DBAN")
        @Expose
        private Object dban;
        @SerializedName("AN")
        @Expose
        private String an;
        @SerializedName("MCN")
        @Expose
        private String mcn;
        @SerializedName("DNO")
        @Expose
        private String dno;
        @SerializedName("ME")
        @Expose
        private Object me;
        @SerializedName("CE")
        @Expose
        private Object ce;
        @SerializedName("AE")
        @Expose
        private Object ae;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("MP")
        @Expose
        private Object mp;
        @SerializedName("MPE")
        @Expose
        private Object mpe;
        @SerializedName("CP")
        @Expose
        private Object cp;
        @SerializedName("CPE")
        @Expose
        private Object cpe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("AD1")
        @Expose
        private String ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private String ct;
        @SerializedName("ST")
        @Expose
        private String st;
        @SerializedName("CTY")
        @Expose
        private String cty;
        @SerializedName("ZP")
        @Expose
        private String zp;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private String cfn;
        @SerializedName("CLN")
        @Expose
        private String cln;
        @SerializedName("PSP")
        @Expose
        private Object psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("BOID")
        @Expose
        private Integer boid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("LatLong")
        @Expose
        private Object latLong;

        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getCn() {
            return cn;
        }

        public void setCn(String cn) {
            this.cn = cn;
        }

        public String getCtn() {
            return ctn;
        }

        public void setCtn(String ctn) {
            this.ctn = ctn;
        }

        public String getBt() {
            return bt;
        }

        public void setBt(String bt) {
            this.bt = bt;
        }

        public Object getDban() {
            return dban;
        }

        public void setDban(Object dban) {
            this.dban = dban;
        }

        public String getAn() {
            return an;
        }

        public void setAn(String an) {
            this.an = an;
        }

        public String getMcn() {
            return mcn;
        }

        public void setMcn(String mcn) {
            this.mcn = mcn;
        }

        public String getDno() {
            return dno;
        }

        public void setDno(String dno) {
            this.dno = dno;
        }

        public Object getMe() {
            return me;
        }

        public void setMe(Object me) {
            this.me = me;
        }

        public Object getCe() {
            return ce;
        }

        public void setCe(Object ce) {
            this.ce = ce;
        }

        public Object getAe() {
            return ae;
        }

        public void setAe(Object ae) {
            this.ae = ae;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public Object getMp() {
            return mp;
        }

        public void setMp(Object mp) {
            this.mp = mp;
        }

        public Object getMpe() {
            return mpe;
        }

        public void setMpe(Object mpe) {
            this.mpe = mpe;
        }

        public Object getCp() {
            return cp;
        }

        public void setCp(Object cp) {
            this.cp = cp;
        }

        public Object getCpe() {
            return cpe;
        }

        public void setCpe(Object cpe) {
            this.cpe = cpe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public String getAd1() {
            return ad1;
        }

        public void setAd1(String ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public String getCt() {
            return ct;
        }

        public void setCt(String ct) {
            this.ct = ct;
        }

        public String getSt() {
            return st;
        }

        public void setSt(String st) {
            this.st = st;
        }

        public String getCty() {
            return cty;
        }

        public void setCty(String cty) {
            this.cty = cty;
        }

        public String getZp() {
            return zp;
        }

        public void setZp(String zp) {
            this.zp = zp;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public String getCfn() {
            return cfn;
        }

        public void setCfn(String cfn) {
            this.cfn = cfn;
        }

        public String getCln() {
            return cln;
        }

        public void setCln(String cln) {
            this.cln = cln;
        }

        public Object getPsp() {
            return psp;
        }

        public void setPsp(Object psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getBoid() {
            return boid;
        }

        public void setBoid(Integer boid) {
            this.boid = boid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public Object getLatLong() {
            return latLong;
        }

        public void setLatLong(Object latLong) {
            this.latLong = latLong;
        }

    }

    public class Vendor {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("CN")
        @Expose
        private String cn;
        @SerializedName("VN")
        @Expose
        private String vn;
        @SerializedName("IPV")
        @Expose
        private Boolean ipv;
        @SerializedName("AN")
        @Expose
        private Object an;
        @SerializedName("ME")
        @Expose
        private Object me;
        @SerializedName("CE")
        @Expose
        private Object ce;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("MP")
        @Expose
        private Object mp;
        @SerializedName("MPE")
        @Expose
        private Object mpe;
        @SerializedName("CP")
        @Expose
        private Object cp;
        @SerializedName("CPE")
        @Expose
        private Object cpe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("AD1")
        @Expose
        private Object ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private Object ct;
        @SerializedName("ST")
        @Expose
        private Object st;
        @SerializedName("CTY")
        @Expose
        private Object cty;
        @SerializedName("ZP")
        @Expose
        private Object zp;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private String cfn;
        @SerializedName("CLN")
        @Expose
        private String cln;
        @SerializedName("PSP")
        @Expose
        private Object psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("VDID")
        @Expose
        private Integer vdid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("LatLong")
        @Expose
        private Object latLong;

        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getCn() {
            return cn;
        }

        public void setCn(String cn) {
            this.cn = cn;
        }

        public String getVn() {
            return vn;
        }

        public void setVn(String vn) {
            this.vn = vn;
        }

        public Boolean getIpv() {
            return ipv;
        }

        public void setIpv(Boolean ipv) {
            this.ipv = ipv;
        }

        public Object getAn() {
            return an;
        }

        public void setAn(Object an) {
            this.an = an;
        }

        public Object getMe() {
            return me;
        }

        public void setMe(Object me) {
            this.me = me;
        }

        public Object getCe() {
            return ce;
        }

        public void setCe(Object ce) {
            this.ce = ce;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public Object getMp() {
            return mp;
        }

        public void setMp(Object mp) {
            this.mp = mp;
        }

        public Object getMpe() {
            return mpe;
        }

        public void setMpe(Object mpe) {
            this.mpe = mpe;
        }

        public Object getCp() {
            return cp;
        }

        public void setCp(Object cp) {
            this.cp = cp;
        }

        public Object getCpe() {
            return cpe;
        }

        public void setCpe(Object cpe) {
            this.cpe = cpe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public Object getAd1() {
            return ad1;
        }

        public void setAd1(Object ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public Object getCt() {
            return ct;
        }

        public void setCt(Object ct) {
            this.ct = ct;
        }

        public Object getSt() {
            return st;
        }

        public void setSt(Object st) {
            this.st = st;
        }

        public Object getCty() {
            return cty;
        }

        public void setCty(Object cty) {
            this.cty = cty;
        }

        public Object getZp() {
            return zp;
        }

        public void setZp(Object zp) {
            this.zp = zp;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public String getCfn() {
            return cfn;
        }

        public void setCfn(String cfn) {
            this.cfn = cfn;
        }

        public String getCln() {
            return cln;
        }

        public void setCln(String cln) {
            this.cln = cln;
        }

        public Object getPsp() {
            return psp;
        }

        public void setPsp(Object psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getVdid() {
            return vdid;
        }

        public void setVdid(Integer vdid) {
            this.vdid = vdid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public Object getLatLong() {
            return latLong;
        }

        public void setLatLong(Object latLong) {
            this.latLong = latLong;
        }

    }


    public class Carrier {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("CAN")
        @Expose
        private String can;
        @SerializedName("CTN")
        @Expose
        private String ctn;
        @SerializedName("MCN")
        @Expose
        private Object mcn;
        @SerializedName("DNO")
        @Expose
        private Object dno;
        @SerializedName("ME")
        @Expose
        private Object me;
        @SerializedName("CE")
        @Expose
        private Object ce;
        @SerializedName("AE")
        @Expose
        private Object ae;
        @SerializedName("BE")
        @Expose
        private Object be;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("MP")
        @Expose
        private Object mp;
        @SerializedName("MPE")
        @Expose
        private Object mpe;
        @SerializedName("CP")
        @Expose
        private Object cp;
        @SerializedName("CPE")
        @Expose
        private Object cpe;
        @SerializedName("BP")
        @Expose
        private Object bp;
        @SerializedName("BPE")
        @Expose
        private Object bpe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("BF")
        @Expose
        private Object bf;
        @SerializedName("AD1")
        @Expose
        private Object ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private Object ct;
        @SerializedName("ST")
        @Expose
        private Object st;
        @SerializedName("CTY")
        @Expose
        private Object cty;
        @SerializedName("ZP")
        @Expose
        private Object zp;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private Object cfn;
        @SerializedName("CLN")
        @Expose
        private Object cln;
        @SerializedName("PSP")
        @Expose
        private Object psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("CTCID")
        @Expose
        private Integer ctcid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("PaymentType")
        @Expose
        private Integer paymentType;
        @SerializedName("LoadedMiles")
        @Expose
        private Double loadedMiles;
        @SerializedName("EmptyMiles")
        @Expose
        private Double emptyMiles;
        @SerializedName("LoadPayPercent")
        @Expose
        private Double loadPayPercent;
        @SerializedName("LoadPaymentPercentType")
        @Expose
        private Integer loadPaymentPercentType;
        @SerializedName("PayPerHour")
        @Expose
        private Double payPerHour;
        @SerializedName("DefaultEmptyMiles")
        @Expose
        private Integer defaultEmptyMiles;
        @SerializedName("LatLong")
        @Expose
        private Object latLong;
        @SerializedName("CarrierTruckList")
        @Expose
        private List<Object> carrierTruckList = null;
        @SerializedName("CarrierDriverList")
        @Expose
        private List<Object> carrierDriverList = null;

        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getCan() {
            return can;
        }

        public void setCan(String can) {
            this.can = can;
        }

        public String getCtn() {
            return ctn;
        }

        public void setCtn(String ctn) {
            this.ctn = ctn;
        }

        public Object getMcn() {
            return mcn;
        }

        public void setMcn(Object mcn) {
            this.mcn = mcn;
        }

        public Object getDno() {
            return dno;
        }

        public void setDno(Object dno) {
            this.dno = dno;
        }

        public Object getMe() {
            return me;
        }

        public void setMe(Object me) {
            this.me = me;
        }

        public Object getCe() {
            return ce;
        }

        public void setCe(Object ce) {
            this.ce = ce;
        }

        public Object getAe() {
            return ae;
        }

        public void setAe(Object ae) {
            this.ae = ae;
        }

        public Object getBe() {
            return be;
        }

        public void setBe(Object be) {
            this.be = be;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public Object getMp() {
            return mp;
        }

        public void setMp(Object mp) {
            this.mp = mp;
        }

        public Object getMpe() {
            return mpe;
        }

        public void setMpe(Object mpe) {
            this.mpe = mpe;
        }

        public Object getCp() {
            return cp;
        }

        public void setCp(Object cp) {
            this.cp = cp;
        }

        public Object getCpe() {
            return cpe;
        }

        public void setCpe(Object cpe) {
            this.cpe = cpe;
        }

        public Object getBp() {
            return bp;
        }

        public void setBp(Object bp) {
            this.bp = bp;
        }

        public Object getBpe() {
            return bpe;
        }

        public void setBpe(Object bpe) {
            this.bpe = bpe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public Object getBf() {
            return bf;
        }

        public void setBf(Object bf) {
            this.bf = bf;
        }

        public Object getAd1() {
            return ad1;
        }

        public void setAd1(Object ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public Object getCt() {
            return ct;
        }

        public void setCt(Object ct) {
            this.ct = ct;
        }

        public Object getSt() {
            return st;
        }

        public void setSt(Object st) {
            this.st = st;
        }

        public Object getCty() {
            return cty;
        }

        public void setCty(Object cty) {
            this.cty = cty;
        }

        public Object getZp() {
            return zp;
        }

        public void setZp(Object zp) {
            this.zp = zp;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public Object getCfn() {
            return cfn;
        }

        public void setCfn(Object cfn) {
            this.cfn = cfn;
        }

        public Object getCln() {
            return cln;
        }

        public void setCln(Object cln) {
            this.cln = cln;
        }

        public Object getPsp() {
            return psp;
        }

        public void setPsp(Object psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getCtcid() {
            return ctcid;
        }

        public void setCtcid(Integer ctcid) {
            this.ctcid = ctcid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public Integer getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
        }

        public Double getLoadedMiles() {
            return loadedMiles;
        }

        public void setLoadedMiles(Double loadedMiles) {
            this.loadedMiles = loadedMiles;
        }

        public Double getEmptyMiles() {
            return emptyMiles;
        }

        public void setEmptyMiles(Double emptyMiles) {
            this.emptyMiles = emptyMiles;
        }

        public Double getLoadPayPercent() {
            return loadPayPercent;
        }

        public void setLoadPayPercent(Double loadPayPercent) {
            this.loadPayPercent = loadPayPercent;
        }

        public Integer getLoadPaymentPercentType() {
            return loadPaymentPercentType;
        }

        public void setLoadPaymentPercentType(Integer loadPaymentPercentType) {
            this.loadPaymentPercentType = loadPaymentPercentType;
        }

        public Double getPayPerHour() {
            return payPerHour;
        }

        public void setPayPerHour(Double payPerHour) {
            this.payPerHour = payPerHour;
        }

        public Integer getDefaultEmptyMiles() {
            return defaultEmptyMiles;
        }

        public void setDefaultEmptyMiles(Integer defaultEmptyMiles) {
            this.defaultEmptyMiles = defaultEmptyMiles;
        }

        public Object getLatLong() {
            return latLong;
        }

        public void setLatLong(Object latLong) {
            this.latLong = latLong;
        }

        public List<Object> getCarrierTruckList() {
            return carrierTruckList;
        }

        public void setCarrierTruckList(List<Object> carrierTruckList) {
            this.carrierTruckList = carrierTruckList;
        }

        public List<Object> getCarrierDriverList() {
            return carrierDriverList;
        }

        public void setCarrierDriverList(List<Object> carrierDriverList) {
            this.carrierDriverList = carrierDriverList;
        }

    }

    public class Factoring {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("CN")
        @Expose
        private String cn;
        @SerializedName("CTN")
        @Expose
        private String ctn;
        @SerializedName("ME")
        @Expose
        private Object me;
        @SerializedName("CE")
        @Expose
        private Object ce;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("MP")
        @Expose
        private String mp;
        @SerializedName("MPE")
        @Expose
        private Object mpe;
        @SerializedName("CP")
        @Expose
        private Object cp;
        @SerializedName("CPE")
        @Expose
        private Object cpe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("AD1")
        @Expose
        private String ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private String ct;
        @SerializedName("ST")
        @Expose
        private String st;
        @SerializedName("CTY")
        @Expose
        private String cty;
        @SerializedName("ZP")
        @Expose
        private String zp;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private Object cfn;
        @SerializedName("CLN")
        @Expose
        private Object cln;
        @SerializedName("PSP")
        @Expose
        private Object psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("FCID")
        @Expose
        private Integer fcid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("LatLong")
        @Expose
        private Object latLong;

        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getCn() {
            return cn;
        }

        public void setCn(String cn) {
            this.cn = cn;
        }

        public String getCtn() {
            return ctn;
        }

        public void setCtn(String ctn) {
            this.ctn = ctn;
        }

        public Object getMe() {
            return me;
        }

        public void setMe(Object me) {
            this.me = me;
        }

        public Object getCe() {
            return ce;
        }

        public void setCe(Object ce) {
            this.ce = ce;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public String getMp() {
            return mp;
        }

        public void setMp(String mp) {
            this.mp = mp;
        }

        public Object getMpe() {
            return mpe;
        }

        public void setMpe(Object mpe) {
            this.mpe = mpe;
        }

        public Object getCp() {
            return cp;
        }

        public void setCp(Object cp) {
            this.cp = cp;
        }

        public Object getCpe() {
            return cpe;
        }

        public void setCpe(Object cpe) {
            this.cpe = cpe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public String getAd1() {
            return ad1;
        }

        public void setAd1(String ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public String getCt() {
            return ct;
        }

        public void setCt(String ct) {
            this.ct = ct;
        }

        public String getSt() {
            return st;
        }

        public void setSt(String st) {
            this.st = st;
        }

        public String getCty() {
            return cty;
        }

        public void setCty(String cty) {
            this.cty = cty;
        }

        public String getZp() {
            return zp;
        }

        public void setZp(String zp) {
            this.zp = zp;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public Object getCfn() {
            return cfn;
        }

        public void setCfn(Object cfn) {
            this.cfn = cfn;
        }

        public Object getCln() {
            return cln;
        }

        public void setCln(Object cln) {
            this.cln = cln;
        }

        public Object getPsp() {
            return psp;
        }

        public void setPsp(Object psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getFcid() {
            return fcid;
        }

        public void setFcid(Integer fcid) {
            this.fcid = fcid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public Object getLatLong() {
            return latLong;
        }

        public void setLatLong(Object latLong) {
            this.latLong = latLong;
        }

    }

    public class Staff {

        @SerializedName("CI")
        @Expose
        private Integer ci;
        @SerializedName("CTN")
        @Expose
        private String ctn;
        @SerializedName("EI")
        @Expose
        private Object ei;
        @SerializedName("DOB")
        @Expose
        private Object dob;
        @SerializedName("WE")
        @Expose
        private String we;
        @SerializedName("CE")
        @Expose
        private Object ce;
        @SerializedName("OE")
        @Expose
        private Object oe;
        @SerializedName("WP")
        @Expose
        private Object wp;
        @SerializedName("WPE")
        @Expose
        private Object wpe;
        @SerializedName("CP")
        @Expose
        private Object cp;
        @SerializedName("CPE")
        @Expose
        private Object cpe;
        @SerializedName("OP")
        @Expose
        private Object op;
        @SerializedName("OPE")
        @Expose
        private Object ope;
        @SerializedName("AD1")
        @Expose
        private Object ad1;
        @SerializedName("AD2")
        @Expose
        private Object ad2;
        @SerializedName("CT")
        @Expose
        private Object ct;
        @SerializedName("ST")
        @Expose
        private Object st;
        @SerializedName("CTY")
        @Expose
        private Object cty;
        @SerializedName("ZP")
        @Expose
        private Object zp;
        @SerializedName("ID")
        @Expose
        private Boolean id;
        @SerializedName("CFN")
        @Expose
        private Object cfn;
        @SerializedName("CLN")
        @Expose
        private String cln;
        @SerializedName("PSP")
        @Expose
        private Object psp;
        @SerializedName("UID")
        @Expose
        private Integer uid;
        @SerializedName("CAO")
        @Expose
        private Object cao;
        @SerializedName("MCI")
        @Expose
        private Integer mci;
        @SerializedName("CAID")
        @Expose
        private Integer caid;
        @SerializedName("COID")
        @Expose
        private Integer coid;
        @SerializedName("STID")
        @Expose
        private Integer stid;
        @SerializedName("STFID")
        @Expose
        private Integer stfid;
        @SerializedName("SCLId")
        @Expose
        private Integer sCLId;
        @SerializedName("LatLong")
        @Expose
        private Object latLong;

        public Integer getCi() {
            return ci;
        }

        public void setCi(Integer ci) {
            this.ci = ci;
        }

        public String getCtn() {
            return ctn;
        }

        public void setCtn(String ctn) {
            this.ctn = ctn;
        }

        public Object getEi() {
            return ei;
        }

        public void setEi(Object ei) {
            this.ei = ei;
        }

        public Object getDob() {
            return dob;
        }

        public void setDob(Object dob) {
            this.dob = dob;
        }

        public String getWe() {
            return we;
        }

        public void setWe(String we) {
            this.we = we;
        }

        public Object getCe() {
            return ce;
        }

        public void setCe(Object ce) {
            this.ce = ce;
        }

        public Object getOe() {
            return oe;
        }

        public void setOe(Object oe) {
            this.oe = oe;
        }

        public Object getWp() {
            return wp;
        }

        public void setWp(Object wp) {
            this.wp = wp;
        }

        public Object getWpe() {
            return wpe;
        }

        public void setWpe(Object wpe) {
            this.wpe = wpe;
        }

        public Object getCp() {
            return cp;
        }

        public void setCp(Object cp) {
            this.cp = cp;
        }

        public Object getCpe() {
            return cpe;
        }

        public void setCpe(Object cpe) {
            this.cpe = cpe;
        }

        public Object getOp() {
            return op;
        }

        public void setOp(Object op) {
            this.op = op;
        }

        public Object getOpe() {
            return ope;
        }

        public void setOpe(Object ope) {
            this.ope = ope;
        }

        public Object getAd1() {
            return ad1;
        }

        public void setAd1(Object ad1) {
            this.ad1 = ad1;
        }

        public Object getAd2() {
            return ad2;
        }

        public void setAd2(Object ad2) {
            this.ad2 = ad2;
        }

        public Object getCt() {
            return ct;
        }

        public void setCt(Object ct) {
            this.ct = ct;
        }

        public Object getSt() {
            return st;
        }

        public void setSt(Object st) {
            this.st = st;
        }

        public Object getCty() {
            return cty;
        }

        public void setCty(Object cty) {
            this.cty = cty;
        }

        public Object getZp() {
            return zp;
        }

        public void setZp(Object zp) {
            this.zp = zp;
        }

        public Boolean getId() {
            return id;
        }

        public void setId(Boolean id) {
            this.id = id;
        }

        public Object getCfn() {
            return cfn;
        }

        public void setCfn(Object cfn) {
            this.cfn = cfn;
        }

        public String getCln() {
            return cln;
        }

        public void setCln(String cln) {
            this.cln = cln;
        }

        public Object getPsp() {
            return psp;
        }

        public void setPsp(Object psp) {
            this.psp = psp;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Object getCao() {
            return cao;
        }

        public void setCao(Object cao) {
            this.cao = cao;
        }

        public Integer getMci() {
            return mci;
        }

        public void setMci(Integer mci) {
            this.mci = mci;
        }

        public Integer getCaid() {
            return caid;
        }

        public void setCaid(Integer caid) {
            this.caid = caid;
        }

        public Integer getCoid() {
            return coid;
        }

        public void setCoid(Integer coid) {
            this.coid = coid;
        }

        public Integer getStid() {
            return stid;
        }

        public void setStid(Integer stid) {
            this.stid = stid;
        }

        public Integer getStfid() {
            return stfid;
        }

        public void setStfid(Integer stfid) {
            this.stfid = stfid;
        }

        public Integer getSCLId() {
            return sCLId;
        }

        public void setSCLId(Integer sCLId) {
            this.sCLId = sCLId;
        }

        public Object getLatLong() {
            return latLong;
        }

        public void setLatLong(Object latLong) {
            this.latLong = latLong;
        }

    }
}
