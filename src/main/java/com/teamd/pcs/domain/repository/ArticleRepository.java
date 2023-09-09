package com.teamd.pcs.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamd.pcs.domain.dto.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
