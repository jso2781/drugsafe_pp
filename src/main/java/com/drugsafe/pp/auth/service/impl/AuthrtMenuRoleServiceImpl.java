package com.drugsafe.pp.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.auth.mapper.AuthrtMenuRoleMapper;
import com.drugsafe.pp.auth.service.AuthrtMenuRoleService;
import com.drugsafe.pp.auth.vo.AuthrtMenuRoleDVO;
import com.drugsafe.pp.auth.vo.AuthrtMenuRolePVO;
import com.drugsafe.pp.auth.vo.AuthrtMenuRoleRVO;

@Service
public class AuthrtMenuRoleServiceImpl implements AuthrtMenuRoleService
{
    @Autowired
    private AuthrtMenuRoleMapper authrtMenuRoleMapper;

    @Override
    public AuthrtMenuRoleRVO getAuthrtMenuRole(AuthrtMenuRolePVO authrtMenuRolePVO)
    {
        return authrtMenuRoleMapper.getAuthrtMenuRole(authrtMenuRolePVO);
    }

    @Override
    public int insertAuthrtMenuRole(AuthrtMenuRolePVO authrtMenuRolePVO)
    {
        return authrtMenuRoleMapper.insertAuthrtMenuRole(authrtMenuRolePVO);
    }

    @Override
    public int updateAuthrtMenuRole(AuthrtMenuRolePVO authrtMenuRolePVO)
    {
        return authrtMenuRoleMapper.updateAuthrtMenuRole(authrtMenuRolePVO);
    }

    @Override
    public int saveAuthrtMenuRole(AuthrtMenuRolePVO authrtMenuRolePVO)
    {
        return authrtMenuRoleMapper.saveAuthrtMenuRole(authrtMenuRolePVO);
    }

    @Override
    public int deleteAuthrtMenuRole(AuthrtMenuRoleDVO authrtMenuRoleDVO)
    {
        return authrtMenuRoleMapper.deleteAuthrtMenuRole(authrtMenuRoleDVO);
    }
}
