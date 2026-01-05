package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurAgeBannMapper;
import com.drugsafe.pp.dur.service.DurAgeBannService;
import com.drugsafe.pp.dur.vo.DurAgeBannDVO;
import com.drugsafe.pp.dur.vo.DurAgeBannPVO;
import com.drugsafe.pp.dur.vo.DurAgeBannRVO;

@Service
public class DurAgeBannServiceImpl implements DurAgeBannService
{
    @Autowired
    private DurAgeBannMapper durAgeBannMapper;

    @Override
    public DurAgeBannRVO getDurAgeBann(DurAgeBannPVO durAgeBannPVO)
    {
        return durAgeBannMapper.getDurAgeBann(durAgeBannPVO);
    }

    @Override
    public int insertDurAgeBann(DurAgeBannPVO durAgeBannPVO)
    {
        return durAgeBannMapper.insertDurAgeBann(durAgeBannPVO);
    }

    @Override
    public int updateDurAgeBann(DurAgeBannPVO durAgeBannPVO)
    {
        return durAgeBannMapper.updateDurAgeBann(durAgeBannPVO);
    }

    @Override
    public int saveDurAgeBann(DurAgeBannPVO durAgeBannPVO)
    {
        return durAgeBannMapper.saveDurAgeBann(durAgeBannPVO);
    }

    @Override
    public int deleteDurAgeBann(DurAgeBannDVO durAgeBannDVO)
    {
        return durAgeBannMapper.deleteDurAgeBann(durAgeBannDVO);
    }
}
