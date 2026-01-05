package com.drugsafe.pp.notice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.notice.mapper.PstMapper;
import com.drugsafe.pp.notice.service.PstService;
import com.drugsafe.pp.notice.vo.PstDVO;
import com.drugsafe.pp.notice.vo.PstPVO;
import com.drugsafe.pp.notice.vo.PstRVO;

@Service
public class PstServiceImpl implements PstService
{
    @Autowired
    private PstMapper pstMapper;

    @Override
    public PstRVO getPst(PstPVO pstPVO)
    {
        return pstMapper.getPst(pstPVO);
    }

    @Override
    public int insertPst(PstPVO pstPVO)
    {
        return pstMapper.insertPst(pstPVO);
    }

    @Override
    public int updatePst(PstPVO pstPVO)
    {
        return pstMapper.updatePst(pstPVO);
    }

    @Override
    public int savePst(PstPVO pstPVO)
    {
        return pstMapper.savePst(pstPVO);
    }

    @Override
    public int deletePst(PstDVO pstDVO)
    {
        return pstMapper.deletePst(pstDVO);
    }
}
