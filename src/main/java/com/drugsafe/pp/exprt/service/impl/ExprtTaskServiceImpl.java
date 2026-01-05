package com.drugsafe.pp.exprt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.exprt.mapper.ExprtTaskMapper;
import com.drugsafe.pp.exprt.service.ExprtTaskService;
import com.drugsafe.pp.exprt.vo.ExprtTaskDVO;
import com.drugsafe.pp.exprt.vo.ExprtTaskPVO;
import com.drugsafe.pp.exprt.vo.ExprtTaskRVO;

@Service
public class ExprtTaskServiceImpl implements ExprtTaskService
{
    @Autowired
    private ExprtTaskMapper exprtTaskMapper;

    @Override
    public ExprtTaskRVO getExprtTask(ExprtTaskPVO exprtTaskPVO)
    {
        return exprtTaskMapper.getExprtTask(exprtTaskPVO);
    }

    @Override
    public int insertExprtTask(ExprtTaskPVO exprtTaskPVO)
    {
        return exprtTaskMapper.insertExprtTask(exprtTaskPVO);
    }

    @Override
    public int updateExprtTask(ExprtTaskPVO exprtTaskPVO)
    {
        return exprtTaskMapper.updateExprtTask(exprtTaskPVO);
    }

    @Override
    public int saveExprtTask(ExprtTaskPVO exprtTaskPVO)
    {
        return exprtTaskMapper.saveExprtTask(exprtTaskPVO);
    }

    @Override
    public int deleteExprtTask(ExprtTaskDVO exprtTaskDVO)
    {
        return exprtTaskMapper.deleteExprtTask(exprtTaskDVO);
    }
}
