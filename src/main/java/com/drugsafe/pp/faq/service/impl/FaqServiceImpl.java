package com.drugsafe.pp.faq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.faq.mapper.FaqMapper;
import com.drugsafe.pp.faq.service.FaqService;
import com.drugsafe.pp.faq.vo.FaqDVO;
import com.drugsafe.pp.faq.vo.FaqPVO;
import com.drugsafe.pp.faq.vo.FaqRVO;

@Service
public class FaqServiceImpl implements FaqService
{
    @Autowired
    private FaqMapper faqMapper;

    @Override
    public FaqRVO getFaq(FaqPVO faqPVO)
    {
        return faqMapper.getFaq(faqPVO);
    }

    @Override
    public int insertFaq(FaqPVO faqPVO)
    {
        return faqMapper.insertFaq(faqPVO);
    }

    @Override
    public int updateFaq(FaqPVO faqPVO)
    {
        return faqMapper.updateFaq(faqPVO);
    }

    @Override
    public int saveFaq(FaqPVO faqPVO)
    {
        return faqMapper.saveFaq(faqPVO);
    }

    @Override
    public int deleteFaq(FaqDVO faqDVO)
    {
        return faqMapper.deleteFaq(faqDVO);
    }
}
