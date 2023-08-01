package com.ll.jigumiyak.notice_category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeCategoryRepository extends JpaRepository<NoticeCategory, Long> {
    NoticeCategory findByName(String category);
}
