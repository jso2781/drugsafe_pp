package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurSnctzMapper;
import com.drugsafe.pp.dur.service.DurSnctzService;
import com.drugsafe.pp.dur.vo.DurSnctzDVO;
import com.drugsafe.pp.dur.vo.DurSnctzPVO;
import com.drugsafe.pp.dur.vo.DurSnctzRVO;

@Service
public class DurSnctzServiceImpl implements DurSnctzService
{
    @Autowired
    private DurSnctzMapper durSnctzMapper;

    @Override
    public DurSnctzRVO getDurSnctz(DurSnctzPVO durSnctzPVO)
    {
        return durSnctzMapper.getDurSnctz(durSnctzPVO);
    }

    @Override
    public int insertDurSnctz(DurSnctzPVO durSnctzPVO)
    {
        return durSnctzMapper.insertDurSnctz(durSnctzPVO);
    }

    @Override
    public int updateDurSnctz(DurSnctzPVO durSnctzPVO)
    {
        return durSnctzMapper.updateDurSnctz(durSnctzPVO);
    }

    @Override
    public int saveDurSnctz(DurSnctzPVO durSnctzPVO)
    {
        return durSnctzMapper.saveDurSnctz(durSnctzPVO);
    }

    @Override
    public int deleteDurSnctz(DurSnctzDVO durSnctzDVO)
    {
        return durSnctzMapper.deleteDurSnctz(durSnctzDVO);
    }
}
