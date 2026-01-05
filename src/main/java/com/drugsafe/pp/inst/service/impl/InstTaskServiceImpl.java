package com.drugsafe.pp.inst.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.inst.mapper.InstTaskMapper;
import com.drugsafe.pp.inst.service.InstTaskService;
import com.drugsafe.pp.inst.vo.InstTaskDVO;
import com.drugsafe.pp.inst.vo.InstTaskPVO;
import com.drugsafe.pp.inst.vo.InstTaskRVO;

@Service
public class InstTaskServiceImpl implements InstTaskService
{
    @Autowired
    private InstTaskMapper instTaskMapper;

    @Override
    public InstTaskRVO getInstTask(InstTaskPVO instTaskPVO)
    {
        return instTaskMapper.getInstTask(instTaskPVO);
    }

    @Override
    public int insertInstTask(InstTaskPVO instTaskPVO)
    {
        return instTaskMapper.insertInstTask(instTaskPVO);
    }

    @Override
    public int updateInstTask(InstTaskPVO instTaskPVO)
    {
        return instTaskMapper.updateInstTask(instTaskPVO);
    }

    @Override
    public int saveInstTask(InstTaskPVO instTaskPVO)
    {
        return instTaskMapper.saveInstTask(instTaskPVO);
    }

    @Override
    public int deleteInstTask(InstTaskDVO instTaskDVO)
    {
        return instTaskMapper.deleteInstTask(instTaskDVO);
    }
}
