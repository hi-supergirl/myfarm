package com.myfarm.flashsale.core.modules.cart.repository.mappers;

import com.myfarm.flashsale.core.modules.cart.model.Cart;
import com.myfarm.flashsale.core.modules.cart.model.CartExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cart
     *
     * @mbg.generated Mon Feb 01 15:20:44 CST 2021
     */
    long countByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cart
     *
     * @mbg.generated Mon Feb 01 15:20:44 CST 2021
     */
    int deleteByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cart
     *
     * @mbg.generated Mon Feb 01 15:20:44 CST 2021
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cart
     *
     * @mbg.generated Mon Feb 01 15:20:44 CST 2021
     */
    int insertSelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cart
     *
     * @mbg.generated Mon Feb 01 15:20:44 CST 2021
     */
    List<Cart> selectByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cart
     *
     * @mbg.generated Mon Feb 01 15:20:44 CST 2021
     */
    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cart
     *
     * @mbg.generated Mon Feb 01 15:20:44 CST 2021
     */
    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);
}