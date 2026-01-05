package com.drugsafe.pp.dep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.dep.mapper.OrgchtMapper;
import com.drugsafe.pp.dep.service.OrgchtService;
import com.drugsafe.pp.dep.vo.OrgchtDVO;
import com.drugsafe.pp.dep.vo.OrgchtPVO;
import com.drugsafe.pp.dep.vo.OrgchtRVO;

@Service
public class OrgchtServiceImpl implements OrgchtService
{
    @Autowired
    private OrgchtMapper orgchtMapper;

    @Override
    public OrgchtRVO getOrgcht(OrgchtPVO orgchtPVO)
    {
        return orgchtMapper.getOrgcht(orgchtPVO);
    }

    @Override
    public int insertOrgcht(OrgchtPVO orgchtPVO)
    {
        return orgchtMapper.insertOrgcht(orgchtPVO);
    }

    @Override
    public int updateOrgcht(OrgchtPVO orgchtPVO)
    {
        return orgchtMapper.updateOrgcht(orgchtPVO);
    }

    @Override
    public int saveOrgcht(OrgchtPVO orgchtPVO)
    {
        return orgchtMapper.saveOrgcht(orgchtPVO);
    }

    @Override
    public int deleteOrgcht(OrgchtDVO orgchtDVO)
    {
        return orgchtMapper.deleteOrgcht(orgchtDVO);
    }
}
