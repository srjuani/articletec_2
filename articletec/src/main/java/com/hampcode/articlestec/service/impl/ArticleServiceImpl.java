package com.hampcode.articlestec.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		List<Article> articles = new ArrayList<Article>();
		
		articleRepository.findAll().iterator()
		                           .forEachRemaining(articles::add);
		
		return articles;
	}

	@Override
	public Article createArticle(Article article) {
		Article newArticle;
		newArticle = articleRepository.save(article);
		return newArticle;
	}

	@Override
	public Article updateArticle(Long id, Article articleDetails) {
		Article article = findById(id);
		
		article.setTitle(articleDetails.getTitle());
		article.setAuthor(articleDetails.getAuthor());
		article.setCategory(articleDetails.getCategory());
		article.setDescription(articleDetails.getDescription());
		article.setContent(articleDetails.getContent());
		
		articleRepository.save(article);
		
		return article;
	}

	@Override
	public void deleteArticle(Long articleId) {
		articleRepository.delete(findById(articleId));
	}

	@Override
	public Article findById(Long id) {
		Optional<Article> article = articleRepository.findById(id);
		
		//EXCEPTION TODO
		
		return article.get();
	}

	@Override
	public boolean titleAndAuthorValid(Article article) {
		
		List<Article> articles = new ArrayList<>();
		articleRepository
			.findByTitleAndAuthor(article.getTitle(), article.getAuthor())
			.iterator()
			.forEachRemaining(articles::add);
	
		return articles.isEmpty();
	}

	

	

}
