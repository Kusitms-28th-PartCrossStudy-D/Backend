package com.teamd.pcs.domain.dto;


import java.util.List;

import com.teamd.pcs.domain.TagList;
import lombok.Data;

@Data
public class ArticleReq {

    private String title;

    private String description;

    private String body;

    private List<TagList> tagList;
}