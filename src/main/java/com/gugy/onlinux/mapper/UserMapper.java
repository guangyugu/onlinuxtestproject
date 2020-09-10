package com.gugy.onlinux.mapper;

import com.gugy.onlinux.entities.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author GGY
 */
@Mapper
public interface UserMapper {

    /**
     *
     * @param user
     */
    void insert(@Param("user") UserBean user);

    /**
     *
     * @return
     */
    List<UserBean> findAll();

    /**
     *
     * @param user
     */
    void update(@Param("user") UserBean user);
}
