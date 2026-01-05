package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurEftgrpItemMapper;
import com.drugsafe.pp.dur.service.DurEftgrpItemService;
import com.drugsafe.pp.dur.vo.DurEftgrpItemDVO;
import com.drugsafe.pp.dur.vo.DurEftgrpItemPVO;
import com.drugsafe.pp.dur.vo.DurEftgrpItemRVO;

@Service
public class DurEftgrpItemServiceImpl implements DurEftgrpItemService
{
    @Autowired
    private DurEftgrpItemMapper durEftgrpItemMapper;

    @Override
    public DurEftgrpItemRVO getDurEftgrpItem(DurEftgrpItemPVO durEftgrpItemPVO)
    {
        return durEftgrpItemMapper.getDurEftgrpItem(durEftgrpItemPVO);
    }

    @Override
    public int insertDurEftgrpItem(DurEftgrpItemPVO durEftgrpItemPVO)
    {
        return durEftgrpItemMapper.insertDurEftgrpItem(durEftgrpItemPVO);
    }

    @Override
    public int updateDurEftgrpItem(DurEftgrpItemPVO durEftgrpItemPVO)
    {
        return durEftgrpItemMapper.updateDurEftgrpItem(durEftgrpItemPVO);
    }

    @Override
    public int saveDurEftgrpItem(DurEftgrpItemPVO durEftgrpItemPVO)
    {
        return durEftgrpItemMapper.saveDurEftgrpItem(durEftgrpItemPVO);
    }

    @Override
    public int deleteDurEftgrpItem(DurEftgrpItemDVO durEftgrpItemDVO)
    {
        return durEftgrpItemMapper.deleteDurEftgrpItem(durEftgrpItemDVO);
    }
}
