package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealDTO;
import com.sky.entity.Setmeal;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Classname SetmealDishMapper
 * @Description
 * @Date 2024/2/15 12:21
 * @Created by wangxiaojie
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套菜id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 添加套餐菜菜品
     * @param setmealDishes
     */
    void save(List<SetmealDish> setmealDishes);

    /**
     * 通过套餐id查询套餐关联的菜品信息
     * @param setmealId
     * @return
     */
    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);

    /**
     * 通过套餐id删除套餐关联的菜品信息
     * @param setmealId
     */
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);

    /**
     * 根据套餐id查询套餐关系表的主键
     * @param setmealId
     * @return
     */
    @Select("select * from setmeal_dish where setmeal_id =#{setmealId}")
    List<SetmealDish> getsetmealDishById(Long setmealId);
}

