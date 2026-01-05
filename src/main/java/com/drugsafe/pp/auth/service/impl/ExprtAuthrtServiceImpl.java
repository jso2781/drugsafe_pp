package com.drugsafe.pp.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.auth.mapper.ExprtAuthrtMapper;
import com.drugsafe.pp.auth.service.ExprtAuthrtService;
import com.drugsafe.pp.auth.vo.ExprtAuthrtDVO;
import com.drugsafe.pp.auth.vo.ExprtAuthrtPVO;
import com.drugsafe.pp.auth.vo.ExprtAuthrtRVO;

@Service
public class ExprtAuthrtServiceImpl implements ExprtAuthrtService
{
    @Autowired
    private ExprtAuthrtMapper exprtAuthrtMapper;

    @Override
    public ExprtAuthrtRVO getExprtAuthrt(ExprtAuthrtPVO exprtAuthrtPVO)
    {
        return exprtAuthrtMapper.getExprtAuthrt(exprtAuthrtPVO);
    }

    @Override
    public int insertExprtAuthrt(ExprtAuthrtPVO exprtAuthrtPVO)
    {
        return exprtAuthrtMapper.insertExprtAuthrt(exprtAuthrtPVO);
    }

    @Override
    public int updateExprtAuthrt(ExprtAuthrtPVO exprtAuthrtPVO)
    {
        return exprtAuthrtMapper.updateExprtAuthrt(exprtAuthrtPVO);
    }

    @Override
    public int saveExprtAuthrt(ExprtAuthrtPVO exprtAuthrtPVO)
    {
        return exprtAuthrtMapper.saveExprtAuthrt(exprtAuthrtPVO);
    }

    @Override
    public int deleteExprtAuthrt(ExprtAuthrtDVO exprtAuthrtDVO)
    {
        return exprtAuthrtMapper.deleteExprtAuthrt(exprtAuthrtDVO);
    }
}
