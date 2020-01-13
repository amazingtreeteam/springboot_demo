package com.example.demo.repository;

import com.example.demo.entity.SysUsers;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface SysUsersRepository extends Repository<SysUsers, Integer> {

    /**
     * 方法名称名称查询方式
     *
     * 名称规则：方法的名称必须遵循驼峰式名称规则 : findBy(关键字) + 属性名称（首字母大写） + 查询条件（首字母大写）
     */

    // 单条件
    List<SysUsers> findByName(String name);

    // 多条件（and）
    List<SysUsers> findByNameAndAge(String name, int age);

    // 多条件（or）
    List<SysUsers> findByNameOrAge(String name, int age);

    // 单条件（like）
    List<SysUsers> findByNameLike(String name);

    void save(SysUsers sysUsers);
}
