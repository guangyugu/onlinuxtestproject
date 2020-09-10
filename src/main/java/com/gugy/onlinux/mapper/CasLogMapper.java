package com.gugy.onlinux.mapper;

import com.gugy.onlinux.entities.casLogBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;

@Mapper
public interface CasLogMapper {

    void insert(@Param("casLog")casLogBean casLog);
}
