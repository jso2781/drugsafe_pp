package com.drugsafe.pp.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.auth.mapper.MenuDMapper;
import com.drugsafe.pp.auth.service.MenuDService;
import com.drugsafe.pp.auth.vo.MenuDDVO;
import com.drugsafe.pp.auth.vo.MenuDPVO;
import com.drugsafe.pp.auth.vo.MenuDRVO;

@Service
public class MenuDServiceImpl implements MenuDService
{
    @Autowired
    private MenuDMapper menuDMapper;

    @Override
    public MenuDRVO getMenuD(MenuDPVO menuDPVO)
    {
        return menuDMapper.getMenuD(menuDPVO);
    }

    @Override
    public int insertMenuD(MenuDPVO menuDPVO)
    {
        return menuDMapper.insertMenuD(menuDPVO);
    }

    @Override
    public int updateMenuD(MenuDPVO menuDPVO)
    {
        return menuDMapper.updateMenuD(menuDPVO);
    }

    @Override
    public int saveMenuD(MenuDPVO menuDPVO)
    {
        return menuDMapper.saveMenuD(menuDPVO);
    }

    @Override
    public int deleteMenuD(MenuDDVO menuDDVO)
    {
        return menuDMapper.deleteMenuD(menuDDVO);
    }
}
