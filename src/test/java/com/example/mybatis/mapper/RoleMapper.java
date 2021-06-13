package com.example.mybatis.mapper;

import com.example.mybatis.pojo.Role;

import java.util.List;

public interface RoleMapper {

  List<Role> findAll();

  Role findById(String id);

  Role findRoleAndUserListById(String id);
}
