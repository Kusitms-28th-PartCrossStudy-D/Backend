package com.teamd.pcs.domain.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "message", "data"})
public class SuccessResponseListArticleRes {

    @JsonProperty("isSuccess")
    private boolean isSuccess;

    private String message;

    private ArrayList<ArticleRes> data;

}