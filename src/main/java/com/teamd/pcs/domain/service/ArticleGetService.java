package com.teamd.pcs.domain.service;


import com.teamd.pcs.domain.dto.Article;
import com.teamd.pcs.domain.dto.ArticleRes;
import com.teamd.pcs.domain.repository.ArticleGetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleGetService {

    private final ArticleGetRepository articleGetRepository;

    public List<ArticleRes> getArticlaAll(){
        List<Article> articlList = articleGetRepository.findAllByOrderOrderByCreatedAtDesc();
        List<ArticleRes> articleResList = new ArrayList<>();
        articlList.forEach(article -> articleResList.add(createArticle(article)));
        return articleResList;
    }

    public ArticleRes getArticleId(Long id){
        Article article = articleGetRepository.findById(id);
        ArticleRes articleRes = createArticle(article);
        return articleRes;
    }

    private ArticleRes createArticle(Article article){
        return ArticleRes.builder()
                .articleId(article.getId())
                .title(article.getTitle())
                .description(article.getDescription())
                .body(article.getBody())
                .createAt(article.getCreatedAt())
                .updatedAt(article.getUpdatedAt())
                .build();
    }
}
