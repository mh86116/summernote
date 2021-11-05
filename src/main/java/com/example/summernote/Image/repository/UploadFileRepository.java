package com.example.summernote.Image.repository;

import com.example.summernote.Image.model.entity.UploadFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadFileRepository extends JpaRepository<UploadFile, Long> {
}
