package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurSnctzMedMapper;
import com.drugsafe.pp.dur.service.DurSnctzMedService;
import com.drugsafe.pp.dur.vo.DurSnctzMedDVO;
import com.drugsafe.pp.dur.vo.DurSnctzMedPVO;
import com.drugsafe.pp.dur.vo.DurSnctzMedRVO;

@Service
public class DurSnctzMedServiceImpl implements DurSnctzMedService
{
    @Autowired
    private DurSnctzMedMapper durSnctzMedMapper;

    @Override
    public DurSnctzMedRVO getDurSnctzMed(DurSnctzMedPVO durSnctzMedPVO)
    {
        return durSnctzMedMapper.getDurSnctzMed(durSnctzMedPVO);
    }

    @Override
    public int insertDurSnctzMed(DurSnctzMedPVO durSnctzMedPVO)
    {
        return durSnctzMedMapper.insertDurSnctzMed(durSnctzMedPVO);
    }

    @Override
    public int updateDurSnctzMed(DurSnctzMedPVO durSnctzMedPVO)
    {
        return durSnctzMedMapper.updateDurSnctzMed(durSnctzMedPVO);
    }

    @Override
    public int saveDurSnctzMed(DurSnctzMedPVO durSnctzMedPVO)
    {
        return durSnctzMedMapper.saveDurSnctzMed(durSnctzMedPVO);
    }

    @Override
    public int deleteDurSnctzMed(DurSnctzMedDVO durSnctzMedDVO)
    {
        return durSnctzMedMapper.deleteDurSnctzMed(durSnctzMedDVO);
    }
}
