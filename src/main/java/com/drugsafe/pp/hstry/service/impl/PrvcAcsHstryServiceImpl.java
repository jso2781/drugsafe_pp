package com.drugsafe.pp.hstry.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.hstry.mapper.PrvcAcsHstryMapper;
import com.drugsafe.pp.hstry.service.PrvcAcsHstryService;
import com.drugsafe.pp.hstry.vo.PrvcAcsHstryDVO;
import com.drugsafe.pp.hstry.vo.PrvcAcsHstryPVO;
import com.drugsafe.pp.hstry.vo.PrvcAcsHstryRVO;

@Service
public class PrvcAcsHstryServiceImpl implements PrvcAcsHstryService
{
    @Autowired
    private PrvcAcsHstryMapper prvcAcsHstryMapper;

    @Override
    public PrvcAcsHstryRVO getPrvcAcsHstry(PrvcAcsHstryPVO prvcAcsHstryPVO)
    {
        return prvcAcsHstryMapper.getPrvcAcsHstry(prvcAcsHstryPVO);
    }

    @Override
    public int insertPrvcAcsHstry(PrvcAcsHstryPVO prvcAcsHstryPVO)
    {
        return prvcAcsHstryMapper.insertPrvcAcsHstry(prvcAcsHstryPVO);
    }

    @Override
    public int updatePrvcAcsHstry(PrvcAcsHstryPVO prvcAcsHstryPVO)
    {
        return prvcAcsHstryMapper.updatePrvcAcsHstry(prvcAcsHstryPVO);
    }

    @Override
    public int savePrvcAcsHstry(PrvcAcsHstryPVO prvcAcsHstryPVO)
    {
        return prvcAcsHstryMapper.savePrvcAcsHstry(prvcAcsHstryPVO);
    }

    @Override
    public int deletePrvcAcsHstry(PrvcAcsHstryDVO prvcAcsHstryDVO)
    {
        return prvcAcsHstryMapper.deletePrvcAcsHstry(prvcAcsHstryDVO);
    }
}
