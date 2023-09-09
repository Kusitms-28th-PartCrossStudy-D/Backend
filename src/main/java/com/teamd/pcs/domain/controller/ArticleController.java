package com.teamd.pcs.domain.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.pcs.domain.dto.ArticleReq;
import com.teamd.pcs.domain.service.ArticleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ArticleController {

	private final ArticleService articleService;

	@PostMapping("/articles")
	public ResponseEntity<String> create(@RequestBody ArticleReq articleReq){
		articleService.create(articleReq);
		return ResponseEntity.ok("글 작성 완료");
	}
}
