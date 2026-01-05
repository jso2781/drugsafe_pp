package com.drugsafe.pp.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.auth.mapper.PicAuthrtMapper;
import com.drugsafe.pp.auth.service.PicAuthrtService;
import com.drugsafe.pp.auth.vo.PicAuthrtDVO;
import com.drugsafe.pp.auth.vo.PicAuthrtPVO;
import com.drugsafe.pp.auth.vo.PicAuthrtRVO;

@Service
public class PicAuthrtServiceImpl implements PicAuthrtService
{
    @Autowired
    private PicAuthrtMapper picAuthrtMapper;

    @Override
    public PicAuthrtRVO getPicAuthrt(PicAuthrtPVO picAuthrtPVO)
    {
        return picAuthrtMapper.getPicAuthrt(picAuthrtPVO);
    }

    @Override
    public int insertPicAuthrt(PicAuthrtPVO picAuthrtPVO)
    {
        return picAuthrtMapper.insertPicAuthrt(picAuthrtPVO);
    }

    @Override
    public int updatePicAuthrt(PicAuthrtPVO picAuthrtPVO)
    {
        return picAuthrtMapper.updatePicAuthrt(picAuthrtPVO);
    }

    @Override
    public int savePicAuthrt(PicAuthrtPVO picAuthrtPVO)
    {
        return picAuthrtMapper.savePicAuthrt(picAuthrtPVO);
    }

    @Override
    public int deletePicAuthrt(PicAuthrtDVO picAuthrtDVO)
    {
        return picAuthrtMapper.deletePicAuthrt(picAuthrtDVO);
    }
}
