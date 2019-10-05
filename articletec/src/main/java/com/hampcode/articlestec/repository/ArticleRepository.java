package com.hampcode.articlestec.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hampcode.articlestec.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

	
}
