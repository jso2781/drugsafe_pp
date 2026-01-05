package com.drugsafe.pp.mbr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.mbr.mapper.SttyAgtInfoMapper;
import com.drugsafe.pp.mbr.service.SttyAgtInfoService;
import com.drugsafe.pp.mbr.vo.SttyAgtInfoDVO;
import com.drugsafe.pp.mbr.vo.SttyAgtInfoPVO;
import com.drugsafe.pp.mbr.vo.SttyAgtInfoRVO;

@Service
public class SttyAgtInfoServiceImpl implements SttyAgtInfoService
{
    @Autowired
    private SttyAgtInfoMapper sttyAgtInfoMapper;

    @Override
    public SttyAgtInfoRVO getSttyAgtInfo(SttyAgtInfoPVO sttyAgtInfoPVO)
    {
        return sttyAgtInfoMapper.getSttyAgtInfo(sttyAgtInfoPVO);
    }

    @Override
    public int insertSttyAgtInfo(SttyAgtInfoPVO sttyAgtInfoPVO)
    {
        return sttyAgtInfoMapper.insertSttyAgtInfo(sttyAgtInfoPVO);
    }

    @Override
    public int updateSttyAgtInfo(SttyAgtInfoPVO sttyAgtInfoPVO)
    {
        return sttyAgtInfoMapper.updateSttyAgtInfo(sttyAgtInfoPVO);
    }

    @Override
    public int saveSttyAgtInfo(SttyAgtInfoPVO sttyAgtInfoPVO)
    {
        return sttyAgtInfoMapper.saveSttyAgtInfo(sttyAgtInfoPVO);
    }

    @Override
    public int deleteSttyAgtInfo(SttyAgtInfoDVO sttyAgtInfoDVO)
    {
        return sttyAgtInfoMapper.deleteSttyAgtInfo(sttyAgtInfoDVO);
    }
}
