package com.hampcode.articlestec.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hampcode.articlestec.model.Article;
import com.hampcode.articlestec.repository.ArticleRepository;
import com.hampcode.articlestec.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public List<Article> getAllArticles() {
		
		return null;
	}

	@Override
	public Article createArticle(Article article) {
		return null;
	}

	@Override
	public Article updateArticle(Long id, Article articleDetails) {
		return null;
	}

	@Override
	public void deleteArticle(Long articleId) {
		
	}

	@Override
	public Article findById(Long id) {
		return null;
	}

	@Override
	public boolean titleAndAuthorValid(Article article) {
		
		return false;
	}

	

	

}
