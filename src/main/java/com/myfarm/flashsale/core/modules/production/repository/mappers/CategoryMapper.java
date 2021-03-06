package com.myfarm.flashsale.core.modules.production.repository.mappers;

import com.myfarm.flashsale.core.modules.production.model.Category;
import com.myfarm.flashsale.core.modules.production.model.CategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    long countByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int deleteByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int deleteByPrimaryKey(Object categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    Category selectByPrimaryKey(Object categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 29 09:22:42 CST 2021
     */
    int updateByPrimaryKey(Category record);
}