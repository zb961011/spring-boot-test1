package com.example.web.entity;

import java.util.Date;
import java.util.List;

public class TestEntity {
    private  String  id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String parent;	// 父级编号
	private String parentIds; // 所有父级编号
    private String area;		// 归属区域
    private String code; 	// 机构编码
    private String name; 	// 机构名称

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    private Integer sort;		// 排序
    private String type; 	// 机构类型（1：公司；2：部门；3：小组）
    private String grade; 	// 机构等级（1：一级；2：二级；3：三级；4：四级）
    private String address; // 联系地址
    private String zipCode; // 邮政编码
    private String master; 	// 负责人
    private String phone; 	// 电话
    private String fax; 	// 传真
    private String email; 	// 邮箱
    private String useable;//是否可用
    private String primaryPerson;//主负责人
    private String deputyPerson;//副负责人
    private List<String> childDeptList;//快速添加子部门
    private String promise;
    private String images;
    private String ordernum;
    private String ontop;
    private String allflag;
    private String collectflag;
    private Integer collect;
    private String ordernumflag;
    private String limit;
    private String casenum;
    private String softVersion;//企业软件版本类型
    private String softAccountNum;//当前企业版本账户数量
    private Date serviceEndtime;//版本服务时间
    private Integer  discount;//折扣率（%）

    private Date begindate;
    private Date enddate;
    private String arepro;//省市标志
    private String contractprice; //合同金额

    public TestEntity() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable;
    }

    public String getPrimaryPerson() {
        return primaryPerson;
    }

    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson;
    }

    public String getDeputyPerson() {
        return deputyPerson;
    }

    public void setDeputyPerson(String deputyPerson) {
        this.deputyPerson = deputyPerson;
    }

    public List<String> getChildDeptList() {
        return childDeptList;
    }

    public void setChildDeptList(List<String> childDeptList) {
        this.childDeptList = childDeptList;
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public String getOntop() {
        return ontop;
    }

    public void setOntop(String ontop) {
        this.ontop = ontop;
    }

    public String getAllflag() {
        return allflag;
    }

    public void setAllflag(String allflag) {
        this.allflag = allflag;
    }

    public String getCollectflag() {
        return collectflag;
    }

    public void setCollectflag(String collectflag) {
        this.collectflag = collectflag;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public String getOrdernumflag() {
        return ordernumflag;
    }

    public void setOrdernumflag(String ordernumflag) {
        this.ordernumflag = ordernumflag;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getCasenum() {
        return casenum;
    }

    public void setCasenum(String casenum) {
        this.casenum = casenum;
    }

    public String getSoftVersion() {
        return softVersion;
    }

    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    public String getSoftAccountNum() {
        return softAccountNum;
    }

    public void setSoftAccountNum(String softAccountNum) {
        this.softAccountNum = softAccountNum;
    }

    public Date getServiceEndtime() {
        return serviceEndtime;
    }

    public void setServiceEndtime(Date serviceEndtime) {
        this.serviceEndtime = serviceEndtime;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getArepro() {
        return arepro;
    }

    public void setArepro(String arepro) {
        this.arepro = arepro;
    }

    public String getContractprice() {
        return contractprice;
    }

    public void setContractprice(String contractprice) {
        this.contractprice = contractprice;
    }
}
