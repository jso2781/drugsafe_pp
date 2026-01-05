package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurCpctMapper;
import com.drugsafe.pp.dur.service.DurCpctService;
import com.drugsafe.pp.dur.vo.DurCpctDVO;
import com.drugsafe.pp.dur.vo.DurCpctPVO;
import com.drugsafe.pp.dur.vo.DurCpctRVO;

@Service
public class DurCpctServiceImpl implements DurCpctService
{
    @Autowired
    private DurCpctMapper durCpctMapper;

    @Override
    public DurCpctRVO getDurCpct(DurCpctPVO durCpctPVO)
    {
        return durCpctMapper.getDurCpct(durCpctPVO);
    }

    @Override
    public int insertDurCpct(DurCpctPVO durCpctPVO)
    {
        return durCpctMapper.insertDurCpct(durCpctPVO);
    }

    @Override
    public int updateDurCpct(DurCpctPVO durCpctPVO)
    {
        return durCpctMapper.updateDurCpct(durCpctPVO);
    }

    @Override
    public int saveDurCpct(DurCpctPVO durCpctPVO)
    {
        return durCpctMapper.saveDurCpct(durCpctPVO);
    }

    @Override
    public int deleteDurCpct(DurCpctDVO durCpctDVO)
    {
        return durCpctMapper.deleteDurCpct(durCpctDVO);
    }
}
