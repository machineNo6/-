package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResolveIdSelfGrowingFailureMapper {

    /**
     * 解决id字段自增长失效的问题
     * 参数传递的是表名
     * @param tableName
     */
    void resolveIdSelfGrowingFailureMapper(String tableName);
}
