package com.drugsafe.pp.notice.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.drugsafe.pp.notice.vo.PstDVO;
import com.drugsafe.pp.notice.vo.PstPVO;
import com.drugsafe.pp.notice.vo.PstRVO;

@Mapper
public interface PstMapper
{
    /**
     * 대국민포털_게시물기본 정보 조회 
     *
     * @param pstPVO 조회용 파라메터 정보 
     * @return 조회된 대국민포털_게시물기본 
     */
    public PstRVO getPst(PstPVO pstPVO);

    /**
     * 대국민포털_게시물기본 정보 입력 
     *
     * @param pstPVO 입력할 대국민포털_게시물기본 정보 
     * @return 입력된 건수 
     */
    public int insertPst(PstPVO pstPVO);

    /**
     * 대국민포털_게시물기본 정보 수정 
     *
     * @param pstPVO 수정할 대국민포털_게시물기본 정보 
     * @return 수정된 건수 
     */
    public int updatePst(PstPVO pstPVO);

    /**
     * 대국민포털_게시물기본 정보 저장 
     * <p>
     * 기존 데이터가 존재하지 않으면 입력하고, 존재하면 수정한다.
     * </p>
     *
     * @param pstPVO 저장할 대국민포털_게시물기본 정보 
     * @return 저장된 건수 
     */
    public int savePst(PstPVO pstPVO);

    /**
     * 대국민포털_게시물기본 정보 삭제 
     *
     * @param pstDVO 삭제용 파라메터 정보 
     * @return 삭제된 건수 
     */
    public int deletePst(PstDVO pstDVO);
}
