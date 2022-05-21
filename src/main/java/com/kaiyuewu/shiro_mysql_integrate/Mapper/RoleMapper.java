package com.kaiyuewu.shiro_mysql_integrate.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface RoleMapper {
    // Select p.name from permission p Inner Join role_permission rp
    // on rp.permission_id = p.id
    // where rp.role_id = #{role_id}

    @Select("Select p.name " +
            "from permission p " +
            "Inner Join role_permission rp " +
            "on rp.permission_id = p.id " +
            "where rp.role_id = #{role_id}")
    Set<String> getPermissionByRoleId(@Param("role_id") Long roleId);
}
