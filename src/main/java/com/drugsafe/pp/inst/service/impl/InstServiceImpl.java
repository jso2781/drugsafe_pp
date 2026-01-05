package com.drugsafe.pp.inst.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.inst.mapper.InstMapper;
import com.drugsafe.pp.inst.service.InstService;
import com.drugsafe.pp.inst.vo.InstDVO;
import com.drugsafe.pp.inst.vo.InstPVO;
import com.drugsafe.pp.inst.vo.InstRVO;

@Service
public class InstServiceImpl implements InstService
{
    @Autowired
    private InstMapper instMapper;

    @Override
    public InstRVO getInst(InstPVO instPVO)
    {
        return instMapper.getInst(instPVO);
    }

    @Override
    public int insertInst(InstPVO instPVO)
    {
        return instMapper.insertInst(instPVO);
    }

    @Override
    public int updateInst(InstPVO instPVO)
    {
        return instMapper.updateInst(instPVO);
    }

    @Override
    public int saveInst(InstPVO instPVO)
    {
        return instMapper.saveInst(instPVO);
    }

    @Override
    public int deleteInst(InstDVO instDVO)
    {
        return instMapper.deleteInst(instDVO);
    }
}
