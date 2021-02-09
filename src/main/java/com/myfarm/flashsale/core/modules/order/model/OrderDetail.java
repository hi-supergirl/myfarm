package com.myfarm.flashsale.core.modules.order.model;

import java.util.Date;

public class OrderDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_detail.order_detail_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    private Object orderDetailId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_detail.order_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    private Object orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_detail.production_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    private Object productionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_detail.quantity
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_detail.add_cart_date
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    private Date addCartDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_detail.order_detail_id
     *
     * @return the value of public.order_detail.order_detail_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public Object getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_detail.order_detail_id
     *
     * @param orderDetailId the value for public.order_detail.order_detail_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public void setOrderDetailId(Object orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_detail.order_id
     *
     * @return the value of public.order_detail.order_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public Object getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_detail.order_id
     *
     * @param orderId the value for public.order_detail.order_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public void setOrderId(Object orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_detail.production_id
     *
     * @return the value of public.order_detail.production_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public Object getProductionId() {
        return productionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_detail.production_id
     *
     * @param productionId the value for public.order_detail.production_id
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public void setProductionId(Object productionId) {
        this.productionId = productionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_detail.quantity
     *
     * @return the value of public.order_detail.quantity
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_detail.quantity
     *
     * @param quantity the value for public.order_detail.quantity
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_detail.add_cart_date
     *
     * @return the value of public.order_detail.add_cart_date
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public Date getAddCartDate() {
        return addCartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_detail.add_cart_date
     *
     * @param addCartDate the value for public.order_detail.add_cart_date
     *
     * @mbg.generated Tue Feb 09 15:50:24 CST 2021
     */
    public void setAddCartDate(Date addCartDate) {
        this.addCartDate = addCartDate;
    }
}