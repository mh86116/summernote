package com.example.summernote.Article.repository;

import com.example.summernote.Article.model.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
