package com.drugsafe.pp.notice.service.impl;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.drugsafe.pp.notice.mapper.PstMapper;
import com.drugsafe.pp.notice.service.PstService;
import com.drugsafe.pp.notice.vo.PstPVO;
import com.drugsafe.pp.notice.vo.PstRVO;

@Service
public class PstServiceImpl implements PstService
{
    @Autowired
    private PstMapper pstMapper;

    @Override
    public List<PstRVO> selectPstList(PstPVO pstPVO)
    {
        return pstMapper.selectPstList(pstPVO);
    }    
    
    @Override
    @Transactional
    public PstRVO getPst(PstPVO pstPVO)
    {
    	PstRVO response = pstMapper.getPst(pstPVO);
    	
    	if (ObjectUtils.isNotEmpty(response)) {
    		pstMapper.updtInqCnt(pstPVO);
    		
    		response.increaseInqCnt();
    	}
    	
        return response;
    }   
}
