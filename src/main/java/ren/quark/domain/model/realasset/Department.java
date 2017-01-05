/** *dianping.com Inc *Copyright(c)2004-2017 All Rights Reserved. */package ren.quark.domain.model.realasset;import ren.quark.domain.model.shared.Entity;import ren.quark.domain.model.shared.GeoPoint;import java.math.BigDecimal;/** * 公寓实体 * * @author zhangjie * @version $Id: Department.java, v 0.1 2017-01-03 下午3:53 zhangjie Exp $$ */public class Department implements Entity<Department> {    /**     * 公寓唯一标识     */    private String departmentId;    /**     * 公寓所属小区ID     */    private String communityId;    /**     * 公寓名称     */    private String departmentName;    /**     * 公寓总价     */    private BigDecimal totalPrice;    /**     * 公寓面积     */    private Double acreage;    /**     * 公寓每平方米单价     */    private BigDecimal pricePerAcreage;    /**     * 公寓楼层描述     */    private String floorDesc;    /**     * 公寓经纬度     */    private GeoPoint geoPoint;    /**     * 建造年份     */    private int buildYear;    /**     * cityId     */    private String cityName;    /**     * 公寓地址     */    private String address;    @Override    public boolean sameIdentityAs(Department other) {        return false;    }    public String getCityName() {        return cityName;    }    public void setCityName(String cityName) {        this.cityName = cityName;    }    public String getDepartmentId() {        return departmentId;    }    public void setDepartmentId(String departmentId) {        this.departmentId = departmentId;    }    public String getCommunityId() {        return communityId;    }    public void setCommunityId(String communityId) {        this.communityId = communityId;    }    public String getDepartmentName() {        return departmentName;    }    public void setDepartmentName(String departmentName) {        this.departmentName = departmentName;    }    public BigDecimal getTotalPrice() {        return totalPrice;    }    public void setTotalPrice(BigDecimal totalPrice) {        this.totalPrice = totalPrice;    }    public Double getAcreage() {        return acreage;    }    public void setAcreage(Double acreage) {        this.acreage = acreage;    }    public BigDecimal getPricePerAcreage() {        return pricePerAcreage;    }    public void setPricePerAcreage(BigDecimal pricePerAcreage) {        this.pricePerAcreage = pricePerAcreage;    }    public String getFloorDesc() {        return floorDesc;    }    public void setFloorDesc(String floorDesc) {        this.floorDesc = floorDesc;    }    public GeoPoint getGeoPoint() {        return geoPoint;    }    public void setGeoPoint(GeoPoint geoPoint) {        this.geoPoint = geoPoint;    }    public int getBuildYear() {        return buildYear;    }    public void setBuildYear(int buildYear) {        this.buildYear = buildYear;    }    public String getAddress() {        return address;    }    public void setAddress(String address) {        this.address = address;    }}