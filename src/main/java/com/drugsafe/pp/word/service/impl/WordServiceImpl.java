package com.drugsafe.pp.word.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drugsafe.pp.word.mapper.WordMapper;
import com.drugsafe.pp.word.service.WordService;
import com.drugsafe.pp.word.vo.WordDVO;
import com.drugsafe.pp.word.vo.WordPVO;
import com.drugsafe.pp.word.vo.WordRVO;

@Service
public class WordServiceImpl implements WordService
{
    @Autowired
    private WordMapper wordMapper;

    @Override
    public WordRVO getWord(WordPVO wordPVO)
    {
        return wordMapper.getWord(wordPVO);
    }

    @Override
    public int insertWord(WordPVO wordPVO)
    {
        return wordMapper.insertWord(wordPVO);
    }

    @Override
    public int updateWord(WordPVO wordPVO)
    {
        return wordMapper.updateWord(wordPVO);
    }

    @Override
    public int saveWord(WordPVO wordPVO)
    {
        return wordMapper.saveWord(wordPVO);
    }

    @Override
    public int deleteWord(WordDVO wordDVO)
    {
        return wordMapper.deleteWord(wordDVO);
    }
}
