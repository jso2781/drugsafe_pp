package com.drugsafe.pp.anyid.service;

public interface AnyIdResourcePaths {

    /**
     * WEB-INF/config/kdist/kdist-api.json (SDK 가이드 기준) 
     */
    public String kdistApiJsonFilePath();

    /** WEB-INF/config/esign/provider-key.json */
    public String esignProviderKeyJsonFilePath();

    /** resources/config/pid/pid_api.json */
    public String pidApiJsonFilePath();

}