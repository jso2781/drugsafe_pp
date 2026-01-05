package com.drugsafe.pp.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.auth.mapper.AuthrtMenuMapper;
import com.drugsafe.pp.auth.service.AuthrtMenuService;
import com.drugsafe.pp.auth.vo.AuthrtMenuDVO;
import com.drugsafe.pp.auth.vo.AuthrtMenuPVO;
import com.drugsafe.pp.auth.vo.AuthrtMenuRVO;

@Service
public class AuthrtMenuServiceImpl implements AuthrtMenuService
{
    @Autowired
    private AuthrtMenuMapper authrtMenuMapper;

    @Override
    public AuthrtMenuRVO getAuthrtMenu(AuthrtMenuPVO authrtMenuPVO)
    {
        return authrtMenuMapper.getAuthrtMenu(authrtMenuPVO);
    }

    @Override
    public int insertAuthrtMenu(AuthrtMenuPVO authrtMenuPVO)
    {
        return authrtMenuMapper.insertAuthrtMenu(authrtMenuPVO);
    }

    @Override
    public int updateAuthrtMenu(AuthrtMenuPVO authrtMenuPVO)
    {
        return authrtMenuMapper.updateAuthrtMenu(authrtMenuPVO);
    }

    @Override
    public int saveAuthrtMenu(AuthrtMenuPVO authrtMenuPVO)
    {
        return authrtMenuMapper.saveAuthrtMenu(authrtMenuPVO);
    }

    @Override
    public int deleteAuthrtMenu(AuthrtMenuDVO authrtMenuDVO)
    {
        return authrtMenuMapper.deleteAuthrtMenu(authrtMenuDVO);
    }
}
