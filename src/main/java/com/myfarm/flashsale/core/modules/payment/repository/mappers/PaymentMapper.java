package com.myfarm.flashsale.core.modules.payment.repository.mappers;

import com.myfarm.flashsale.core.modules.payment.model.Payment;
import com.myfarm.flashsale.core.modules.payment.model.PaymentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    long countByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int deleteByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int deleteByPrimaryKey(Object paymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int insert(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int insertSelective(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    List<Payment> selectByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    Payment selectByPrimaryKey(Object paymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int updateByPrimaryKeySelective(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated Tue Feb 02 09:55:50 CST 2021
     */
    int updateByPrimaryKey(Payment record);
}