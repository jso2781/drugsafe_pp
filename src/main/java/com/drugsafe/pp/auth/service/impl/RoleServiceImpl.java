package com.drugsafe.pp.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.auth.mapper.RoleMapper;
import com.drugsafe.pp.auth.service.RoleService;
import com.drugsafe.pp.auth.vo.RoleDVO;
import com.drugsafe.pp.auth.vo.RolePVO;
import com.drugsafe.pp.auth.vo.RoleRVO;

@Service
public class RoleServiceImpl implements RoleService
{
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RoleRVO getRole(RolePVO rolePVO)
    {
        return roleMapper.getRole(rolePVO);
    }

    @Override
    public int insertRole(RolePVO rolePVO)
    {
        return roleMapper.insertRole(rolePVO);
    }

    @Override
    public int updateRole(RolePVO rolePVO)
    {
        return roleMapper.updateRole(rolePVO);
    }

    @Override
    public int saveRole(RolePVO rolePVO)
    {
        return roleMapper.saveRole(rolePVO);
    }

    @Override
    public int deleteRole(RoleDVO roleDVO)
    {
        return roleMapper.deleteRole(roleDVO);
    }
}
