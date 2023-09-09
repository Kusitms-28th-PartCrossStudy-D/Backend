package com.teamd.pcs.domain.repository;

import com.teamd.pcs.domain.dto.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleGetRepository extends JpaRepository<Article, String> {

    List<Article> findAllByOrderOrderByCreatedAtDesc();

    Article findById(Long id);
}
