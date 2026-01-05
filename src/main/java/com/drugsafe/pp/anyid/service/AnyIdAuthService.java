package com.drugsafe.pp.anyid.service;

import com.drugsafe.pp.anyid.vo.AnyIdLoginRequest;
import com.drugsafe.pp.anyid.vo.AnyIdLoginResponse;

public interface AnyIdAuthService {

    /**
     * Any-ID SDK 중계형: 프론트에서 전달된 ssob(인증정보) + tag(tx) 를 복호화/검증하고,
     * 필요한 사용자 정보를 추출합니다.
     */
    public AnyIdLoginResponse verifyAndExtract(AnyIdLoginRequest req);

}