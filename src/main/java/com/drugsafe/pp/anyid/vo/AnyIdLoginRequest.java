package com.drugsafe.pp.anyid.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AnyIdLoginRequest(
        @JsonProperty("ssob") String ssob,
        @JsonProperty("tag") String tag
) {}
