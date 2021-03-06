package com.myfarm.flashsale.core.modules.common;

public class Constants {
    public static final String API_RESPONSE_SUCCESS_MESSAGE_DEFAULT_KEY = "OK";
    public static final String API_RESPONSE_FAIL_MESSAGE_DEFAULT_KEY = "ERROR";
    public static final String API_RESPONSE_SUCCESS_MESSAGE_DEFAULT_VALUE = "success";
    public static final String host = "localhost";
    public enum Order{
        ASC("ASC", "升序"),
        DESC("DESC","降序");
        private String code;
        private String description;

        Order(String code, String des){
            this.code = code;
            this.description = des;
        }

        public String getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "code='" + code + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public enum SiteStatus{
        In_business("In_business", "正常营业"),
        Out_business("Out_business", "已下线");
        private String status;
        private String des;
        SiteStatus(String status, String des){
            this.status = status;
            this.des = des;
        }

        public String getStatus() {
            return status;
        }

        public String getDes() {
            return des;
        }

        @Override
        public String toString() {
            return "SiteStatus{" +
                    "status='" + status + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }

    public enum ProviderStatus{
        In_business("In_business", "正常营业"),
        Out_business("Out_business", "已下线");
        private String status;
        private String des;
        ProviderStatus(String status, String des){
            this.status = status;
            this.des = des;
        }

        public String getStatus() {
            return status;
        }

        public String getDes() {
            return des;
        }

        @Override
        public String toString() {
            return "ProviderStatus{" +
                    "status='" + status + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }

    public enum ProductionStatus{
        New("New", "新上"),
        On("On", "上架"),
        Off("Off", "下架");
        private String status;
        private String des;
        ProductionStatus(String status, String des){
            this.status = status;
            this.des = des;
        }

        public String getStatus() {
            return status;
        }

        public String getDes() {
            return des;
        }

        @Override
        public String toString() {
            return "ProductionStatus{" +
                    "status='" + status + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }

    public enum AuditStatus{
        Awaiting("Awaiting", "待审核"),
        Approved("Approved", "审核通过"),
        Rejected("Rejected", "驳回");
        private String status;
        private String des;
        AuditStatus(String status, String des){
            this.status = status;
            this.des = des;
        }

        public String getStatus() {
            return status;
        }

        public String getDes() {
            return des;
        }

        @Override
        public String toString() {
            return "AuditStatus{" +
                    "status='" + status + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }

    public enum PayWay{
        weichat("weichat", "微信"),
        alipay("alipay", "支付宝");
        private String status;
        private String des;
        PayWay(String status, String des){
            this.status = status;
            this.des = des;
        }

        public String getStatus() {
            return status;
        }

        public String getDes() {
            return des;
        }

        @Override
        public String toString() {
            return "PayWay{" +
                    "status='" + status + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }

    public enum OrderStatus{
        Waiting_for_pay("Waiting_for_pay", "待付款"),
        Waiting_for_fetch("Waiting_for_fetch", "待提货"),
        fetched("fetched", "已提货"),
        close("close", "交易关闭");
        private String status;
        private String des;
        OrderStatus(String status, String des){
            this.status = status;
            this.des = des;
        }

        public String getStatus() {
            return status;
        }

        public String getDes() {
            return des;
        }

        @Override
        public String toString() {
            return "OrderStatus{" +
                    "status='" + status + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }

    // auth2
    public final static String CLIENT_SECRET = "123456";
    public final static String CLIENT_ID ="client_1";
    public final static String PREFIX_AUTHORIZATION = "Basic ";
    public final static String GRANT_TYPE[] = {"password","refresh_token"};
    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";
    public final static String GRANT_TYPE_KEY = "grant_type";
    public final static String REFRESH_TOKEN = "refresh_token";
    public static final String ROLE_ADMIN = "admin";
    public static final String ROLE_USER = "user";
    public static final String AUTH2_TOKEN_URL = "http://127.0.0.1:8080/v1.0/api/oauth/token";
    public static final String ACCESS_TOKEN_KEY = "access_token";
    public final static String HEADER_KEY_AUTHORIZATION = "Authorization";
    public enum UserRole{
        admin("admin", "管理员"),
        super_admin("super_admin", "超级管理员"),
        user("user","普通用户");
        private String name;
        private String des;
        UserRole(String name, String des){
            this.name = name;
            this.des = des;
        }

        public String getName() {
            return name;
        }

        public String getDes() {
            return des;
        }

        @Override
        public String toString() {
            return "UserRole{" +
                    "name='" + name + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }


    //swagger related info
    public static final String API_TITLE = "农菜鲜后端api手册";
    public static final String project_description = "农菜鲜项目描述";
}
