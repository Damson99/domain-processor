package com.cloud.domainprocessor.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class WebDomain {

    @JsonProperty("domain")
    private String domain;
    @JsonProperty("create_date")
    private String createDate;
    @JsonProperty("update_date")
    private String updateDate;
    @JsonProperty("country")
    private String country;
    @JsonProperty("isDead")
    private boolean isDead;
    @JsonProperty("A")
    private String A;
    @JsonProperty("NS")
    private String NS;
    @JsonProperty("CNAME")
    private String CNAME;
    @JsonProperty("MX")
    private String MX;
    @JsonProperty("TXT")
    private String TXT;

}