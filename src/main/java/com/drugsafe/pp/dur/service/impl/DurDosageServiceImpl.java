package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurDosageMapper;
import com.drugsafe.pp.dur.service.DurDosageService;
import com.drugsafe.pp.dur.vo.DurDosageDVO;
import com.drugsafe.pp.dur.vo.DurDosagePVO;
import com.drugsafe.pp.dur.vo.DurDosageRVO;

@Service
public class DurDosageServiceImpl implements DurDosageService
{
    @Autowired
    private DurDosageMapper durDosageMapper;

    @Override
    public DurDosageRVO getDurDosage(DurDosagePVO durDosagePVO)
    {
        return durDosageMapper.getDurDosage(durDosagePVO);
    }

    @Override
    public int insertDurDosage(DurDosagePVO durDosagePVO)
    {
        return durDosageMapper.insertDurDosage(durDosagePVO);
    }

    @Override
    public int updateDurDosage(DurDosagePVO durDosagePVO)
    {
        return durDosageMapper.updateDurDosage(durDosagePVO);
    }

    @Override
    public int saveDurDosage(DurDosagePVO durDosagePVO)
    {
        return durDosageMapper.saveDurDosage(durDosagePVO);
    }

    @Override
    public int deleteDurDosage(DurDosageDVO durDosageDVO)
    {
        return durDosageMapper.deleteDurDosage(durDosageDVO);
    }
}
