package com.drugsafe.pp.dur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dur.mapper.DurPrgntItemMapper;
import com.drugsafe.pp.dur.service.DurPrgntItemService;
import com.drugsafe.pp.dur.vo.DurPrgntItemDVO;
import com.drugsafe.pp.dur.vo.DurPrgntItemPVO;
import com.drugsafe.pp.dur.vo.DurPrgntItemRVO;

@Service
public class DurPrgntItemServiceImpl implements DurPrgntItemService
{
    @Autowired
    private DurPrgntItemMapper durPrgntItemMapper;

    @Override
    public DurPrgntItemRVO getDurPrgntItem(DurPrgntItemPVO durPrgntItemPVO)
    {
        return durPrgntItemMapper.getDurPrgntItem(durPrgntItemPVO);
    }

    @Override
    public int insertDurPrgntItem(DurPrgntItemPVO durPrgntItemPVO)
    {
        return durPrgntItemMapper.insertDurPrgntItem(durPrgntItemPVO);
    }

    @Override
    public int updateDurPrgntItem(DurPrgntItemPVO durPrgntItemPVO)
    {
        return durPrgntItemMapper.updateDurPrgntItem(durPrgntItemPVO);
    }

    @Override
    public int saveDurPrgntItem(DurPrgntItemPVO durPrgntItemPVO)
    {
        return durPrgntItemMapper.saveDurPrgntItem(durPrgntItemPVO);
    }

    @Override
    public int deleteDurPrgntItem(DurPrgntItemDVO durPrgntItemDVO)
    {
        return durPrgntItemMapper.deleteDurPrgntItem(durPrgntItemDVO);
    }
}
