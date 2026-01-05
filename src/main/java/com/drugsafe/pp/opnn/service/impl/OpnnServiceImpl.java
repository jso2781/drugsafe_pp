package com.drugsafe.pp.opnn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.opnn.mapper.OpnnMapper;
import com.drugsafe.pp.opnn.service.OpnnService;
import com.drugsafe.pp.opnn.vo.OpnnDVO;
import com.drugsafe.pp.opnn.vo.OpnnPVO;
import com.drugsafe.pp.opnn.vo.OpnnRVO;

@Service
public class OpnnServiceImpl implements OpnnService
{
    @Autowired
    private OpnnMapper opnnMapper;

    @Override
    public OpnnRVO getOpnn(OpnnPVO opnnPVO)
    {
        return opnnMapper.getOpnn(opnnPVO);
    }

    @Override
    public int insertOpnn(OpnnPVO opnnPVO)
    {
        return opnnMapper.insertOpnn(opnnPVO);
    }

    @Override
    public int updateOpnn(OpnnPVO opnnPVO)
    {
        return opnnMapper.updateOpnn(opnnPVO);
    }

    @Override
    public int saveOpnn(OpnnPVO opnnPVO)
    {
        return opnnMapper.saveOpnn(opnnPVO);
    }

    @Override
    public int deleteOpnn(OpnnDVO opnnDVO)
    {
        return opnnMapper.deleteOpnn(opnnDVO);
    }
}
