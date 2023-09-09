package com.teamd.pcs.domain.dto;


import com.teamd.pcs.domain.TagList;
import lombok.Data;

@Data
public class ArticleReq {

    private String title;

    private String description;

    private String body;

    private TagList tagList;


}