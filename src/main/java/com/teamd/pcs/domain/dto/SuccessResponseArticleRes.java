package com.teamd.pcs.domain.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "message", "data"})
public class SuccessResponseArticleRes {


    @JsonProperty("isSuccess")
    private boolean isSuccess;

    private String message;

    private ArticleRes data;

}