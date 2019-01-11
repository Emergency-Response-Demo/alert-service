package com.redhat.cajun.navy.alert;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AlertType {

    @JsonProperty("success")
    SUCCESS,

    @JsonProperty("info")
    INFO,

    @JsonProperty("danger")
    DANGER

}
