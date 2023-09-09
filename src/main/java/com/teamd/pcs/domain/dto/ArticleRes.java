package com.teamd.pcs.domain.dto;


import com.teamd.pcs.domain.TagList;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ArticleRes {

    private Long articleId;

    private String title;

    private String description;

    private String body;

//    private TagList tagList;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;


}