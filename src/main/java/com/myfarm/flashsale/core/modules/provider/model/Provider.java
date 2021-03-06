package com.myfarm.flashsale.core.modules.provider.model;

public class Provider {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.provider.provider_id
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    private Object providerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.provider.name
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.provider.telphone
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    private String telphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.provider.address
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.provider.operating_status
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    private String operatingStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.provider.pic_license_id
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    private Object picLicenseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.provider.comments
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    private String comments;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.provider.provider_id
     *
     * @return the value of public.provider.provider_id
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public Object getProviderId() {
        return providerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.provider.provider_id
     *
     * @param providerId the value for public.provider.provider_id
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public void setProviderId(Object providerId) {
        this.providerId = providerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.provider.name
     *
     * @return the value of public.provider.name
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.provider.name
     *
     * @param name the value for public.provider.name
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.provider.telphone
     *
     * @return the value of public.provider.telphone
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.provider.telphone
     *
     * @param telphone the value for public.provider.telphone
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.provider.address
     *
     * @return the value of public.provider.address
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.provider.address
     *
     * @param address the value for public.provider.address
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.provider.operating_status
     *
     * @return the value of public.provider.operating_status
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.provider.operating_status
     *
     * @param operatingStatus the value for public.provider.operating_status
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus == null ? null : operatingStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.provider.pic_license_id
     *
     * @return the value of public.provider.pic_license_id
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public Object getPicLicenseId() {
        return picLicenseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.provider.pic_license_id
     *
     * @param picLicenseId the value for public.provider.pic_license_id
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public void setPicLicenseId(Object picLicenseId) {
        this.picLicenseId = picLicenseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.provider.comments
     *
     * @return the value of public.provider.comments
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.provider.comments
     *
     * @param comments the value for public.provider.comments
     *
     * @mbg.generated Fri Jan 22 17:53:30 CST 2021
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}