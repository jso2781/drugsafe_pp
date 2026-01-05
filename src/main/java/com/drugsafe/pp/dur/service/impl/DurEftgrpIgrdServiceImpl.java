package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurEftgrpIgrdMapper;
import com.drugsafe.pp.dur.service.DurEftgrpIgrdService;
import com.drugsafe.pp.dur.vo.DurEftgrpIgrdDVO;
import com.drugsafe.pp.dur.vo.DurEftgrpIgrdPVO;
import com.drugsafe.pp.dur.vo.DurEftgrpIgrdRVO;

@Service
public class DurEftgrpIgrdServiceImpl implements DurEftgrpIgrdService
{
    @Autowired
    private DurEftgrpIgrdMapper durEftgrpIgrdMapper;

    @Override
    public DurEftgrpIgrdRVO getDurEftgrpIgrd(DurEftgrpIgrdPVO durEftgrpIgrdPVO)
    {
        return durEftgrpIgrdMapper.getDurEftgrpIgrd(durEftgrpIgrdPVO);
    }

    @Override
    public int insertDurEftgrpIgrd(DurEftgrpIgrdPVO durEftgrpIgrdPVO)
    {
        return durEftgrpIgrdMapper.insertDurEftgrpIgrd(durEftgrpIgrdPVO);
    }

    @Override
    public int updateDurEftgrpIgrd(DurEftgrpIgrdPVO durEftgrpIgrdPVO)
    {
        return durEftgrpIgrdMapper.updateDurEftgrpIgrd(durEftgrpIgrdPVO);
    }

    @Override
    public int saveDurEftgrpIgrd(DurEftgrpIgrdPVO durEftgrpIgrdPVO)
    {
        return durEftgrpIgrdMapper.saveDurEftgrpIgrd(durEftgrpIgrdPVO);
    }

    @Override
    public int deleteDurEftgrpIgrd(DurEftgrpIgrdDVO durEftgrpIgrdDVO)
    {
        return durEftgrpIgrdMapper.deleteDurEftgrpIgrd(durEftgrpIgrdDVO);
    }
}
