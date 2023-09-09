package com.teamd.pcs.domain.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.teamd.pcs.domain.dto.Article;
import com.teamd.pcs.domain.dto.ArticleReq;
import com.teamd.pcs.domain.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {

	private final ArticleRepository articleRepository;

	public void create(ArticleReq articleReq) {
		Article article = Article.builder()
			.title(articleReq.getTitle())
			.body(articleReq.getBody())
			.description(articleReq.getDescription())
			.build();

		articleRepository.save(article);
	}
}
