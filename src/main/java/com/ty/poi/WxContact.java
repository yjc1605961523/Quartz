package com.ty.poi;

import java.io.Serializable;
public class WxContact implements Serializable{

    private Integer contactId;

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getExternalPosition() {
        return externalPosition;
    }

    public void setExternalPosition(String externalPosition) {
        this.externalPosition = externalPosition;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCorpFullName() {
        return corpFullName;
    }

    public void setCorpFullName(String corpFullName) {
        this.corpFullName = corpFullName;
    }

    public String getExternalProfile() {
        return externalProfile;
    }

    public void setExternalProfile(String externalProfile) {
        this.externalProfile = externalProfile;
    }

    public String getCustomerClassification() {
        return customerClassification;
    }

    public void setCustomerClassification(String customerClassification) {
        this.customerClassification = customerClassification;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getWechatID() {
        return wechatID;
    }

    public void setWechatID(String wechatID) {
        this.wechatID = wechatID;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhysicalStatus() {
        return physicalStatus;
    }

    public void setPhysicalStatus(String physicalStatus) {
        this.physicalStatus = physicalStatus;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getConsumptionPower() {
        return consumptionPower;
    }

    public void setConsumptionPower(String consumptionPower) {
        this.consumptionPower = consumptionPower;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getCommunicationNumber() {
        return communicationNumber;
    }

    public void setCommunicationNumber(String communicationNumber) {
        this.communicationNumber = communicationNumber;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMediaChannel() {
        return mediaChannel;
    }

    public void setMediaChannel(String mediaChannel) {
        this.mediaChannel = mediaChannel;
    }

    public String getDiffuse() {
        return diffuse;
    }

    public void setDiffuse(String diffuse) {
        this.diffuse = diffuse;
    }

    private String userId;

    private String externalId;

    //客户头像
    private String avatar;

    private int type;

    private String unionId;
    //联系人职位
    private String externalPosition;
    //公司名称
    private String corpName;
    //公司全名称
    private String corpFullName;

    private String externalProfile;

    private String customerClassification;//'客户分类',


    private String externalName;

    private String customerName;//'客户名称',
    private String wechatID;//'微信号',

    private String mobile;

    private String area;//'地区',

    //外部联系人性别
    private int gender;


    private String age;//'年龄',

    private String physicalStatus;//'身体情况',

    private String familyStatus;//'家庭状况',

    private String consumptionPower;//'消费能力',

    private String industry;//'行业',

    private String hobby;//'爱好',

    private String income;//'收入情况',

    private String communicationNumber;//'沟通次数',

    private String height;//'身高',

    private String weight;//'体重',

    private String mediaChannel ;//'媒体渠道',

    private String diffuse;//'传播',


    @Override
    public String toString() {
        return "WxContact{" +
                "contactId=" + contactId +
                ", userId='" + userId + '\'' +
                ", externalId='" + externalId + '\'' +
                ", avatar='" + avatar + '\'' +
                ", type=" + type +
                ", unionId='" + unionId + '\'' +
                ", externalPosition='" + externalPosition + '\'' +
                ", corpName='" + corpName + '\'' +
                ", corpFullName='" + corpFullName + '\'' +
                ", externalProfile='" + externalProfile + '\'' +
                ", customerClassification='" + customerClassification + '\'' +
                ", externalName='" + externalName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", wechatID='" + wechatID + '\'' +
                ", mobile='" + mobile + '\'' +
                ", area='" + area + '\'' +
                ", gender=" + gender +
                ", age='" + age + '\'' +
                ", physicalStatus='" + physicalStatus + '\'' +
                ", familyStatus='" + familyStatus + '\'' +
                ", consumptionPower='" + consumptionPower + '\'' +
                ", industry='" + industry + '\'' +
                ", hobby='" + hobby + '\'' +
                ", income='" + income + '\'' +
                ", communicationNumber='" + communicationNumber + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", mediaChannel='" + mediaChannel + '\'' +
                ", diffuse='" + diffuse + '\'' +
                '}';
    }
}
