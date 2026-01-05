package com.drugsafe.pp.popup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.popup.mapper.PopupMapper;
import com.drugsafe.pp.popup.service.PopupService;
import com.drugsafe.pp.popup.vo.PopupDVO;
import com.drugsafe.pp.popup.vo.PopupPVO;
import com.drugsafe.pp.popup.vo.PopupRVO;

@Service
public class PopupServiceImpl implements PopupService
{
    @Autowired
    private PopupMapper popupMapper;

    @Override
    public PopupRVO getPopup(PopupPVO popupPVO)
    {
        return popupMapper.getPopup(popupPVO);
    }

    @Override
    public int insertPopup(PopupPVO popupPVO)
    {
        return popupMapper.insertPopup(popupPVO);
    }

    @Override
    public int updatePopup(PopupPVO popupPVO)
    {
        return popupMapper.updatePopup(popupPVO);
    }

    @Override
    public int savePopup(PopupPVO popupPVO)
    {
        return popupMapper.savePopup(popupPVO);
    }

    @Override
    public int deletePopup(PopupDVO popupDVO)
    {
        return popupMapper.deletePopup(popupDVO);
    }
}
