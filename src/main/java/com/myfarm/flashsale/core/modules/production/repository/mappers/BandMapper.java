package com.myfarm.flashsale.core.modules.production.repository.mappers;

import com.myfarm.flashsale.core.modules.production.model.Band;
import com.myfarm.flashsale.core.modules.production.model.BandExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    long countByExample(BandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int deleteByExample(BandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int deleteByPrimaryKey(Object bandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int insert(Band record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int insertSelective(Band record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    List<Band> selectByExample(BandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    Band selectByPrimaryKey(Object bandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int updateByExampleSelective(@Param("record") Band record, @Param("example") BandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int updateByExample(@Param("record") Band record, @Param("example") BandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int updateByPrimaryKeySelective(Band record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.band
     *
     * @mbg.generated Fri Jan 29 09:21:21 CST 2021
     */
    int updateByPrimaryKey(Band record);
}