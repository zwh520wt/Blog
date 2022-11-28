package com.example.blogadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blogadmin.pojo.Admin;
import com.example.blogadmin.pojo.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Z
 */
public interface AdminMapper extends BaseMapper<Admin> {

    /***
     * 查询所有的权限用户
     * @param adminId
     * @return
     */
    @Select("SELECT * FROM ms_permission where id in (select permission_id from ms_admin_permission where admin_id=#{adminId})")
    List<Permission> findPermissionByAdminId(Long adminId);
}
