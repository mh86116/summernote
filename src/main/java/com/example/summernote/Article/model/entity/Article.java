package com.example.summernote.Article.model.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@ToString
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length= 100000000)
    private String content;

    private LocalDateTime registerDt;

    @Column
    private LocalDateTime updateDt;
}
