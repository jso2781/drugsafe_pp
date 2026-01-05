package com.drugsafe.pp.notice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import com.drugsafe.pp.notice.service.PstService;
import com.drugsafe.pp.notice.vo.PstPVO;
import com.drugsafe.pp.notice.vo.PstRVO;
import com.drugsafe.pp.notice.vo.PstDVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "PstController", description = "대국민포털_게시물기본 관리")
@RestController
@RequestMapping(value="/api/notice")
public class PstController
{
    @Autowired
    private PstService pstService;

    @Operation(summary = "대국민포털_게시물기본 조회", description = "대국민포털_게시물기본 조회한다.")
    @PostMapping(value="/getPst")
    @ResponseBody
    public ResponseEntity<PstRVO> getPst(@RequestBody PstPVO pstPVO)
    {
        PstRVO pst = pstService.getPst(pstPVO);

        return ResponseEntity.ok(pst);
    }

    @Operation(summary = "대국민포털_게시물기본 입력", description = "대국민포털_게시물기본 입력한다.")
    @PostMapping(value="/insertPst")
    @ResponseBody
    public Map<String,Object> insertPst(@RequestBody List<PstPVO> pstList)
    {
        int pstListCount = pstList.size();

        int insertCnt = 0;
        PstPVO pst = null;

        for(int i=0;i<pstListCount;i++)
        {
            pst = pstList.get(i);

            pstService.insertPst(pst);
            insertCnt++;

            pst = null;
        }

//        List<PstRVO> selectedPstList = pstService.selectPstList(pst);

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("insertCnt", insertCnt);
//        resultMap.put("pstList", selectedPstList);

        return resultMap;
    }

    @Operation(summary = "대국민포털_게시물기본 수정", description = "대국민포털_게시물기본 수정한다.")
    @PostMapping(value="/updatePst")
    @ResponseBody
    public Map<String,Object> updatePst(@RequestBody List<PstPVO> pstList)
    {
        int pstListCount = pstList.size();

        int updateCnt = 0;
        PstPVO pst = null;

        for(int i=0;i<pstListCount;i++)
        {
            pst = pstList.get(i);

            pstService.updatePst(pst);
            updateCnt++;

            pst = null;
        }

//        List<PstRVO> selectedPstList = pstService.selectPstList(pst);

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("updateCnt", updateCnt);
//        resultMap.put("pstList", selectedPstList);

        return resultMap;
    }

    @Operation(summary = "대국민포털_게시물기본 저장", description = "대국민포털_게시물기본 저장한다.")
    @PostMapping(value="/savePst")
    @ResponseBody
    public Map<String,Object> savePst(@RequestBody List<PstPVO> pstList)
    {
        int pstListCount = pstList.size();

        int saveCnt = 0;
        PstPVO pst = null;

        for(int i=0;i<pstListCount;i++)
        {
            pst = pstList.get(i);

            pstService.savePst(pst);
            saveCnt++;

            pst = null;
        }

//        List<PstRVO> selectedPstList = pstService.selectPstList(pst);

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("saveCnt", saveCnt);
//        resultMap.put("pstList", selectedPstList);

        return resultMap;
    }

    @Operation(summary = "대국민포털_게시물기본 삭제", description = "대국민포털_게시물기본 삭제한다.")
    @PostMapping(value="/deletePst")
    @ResponseBody
    public Map<String,Object> deletePst(@RequestBody PstDVO pstDVO)
    {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        int deleteCnt = pstService.deletePst(pstDVO);

        resultMap.put("deleteCnt", deleteCnt);

        return resultMap;
    }
}
