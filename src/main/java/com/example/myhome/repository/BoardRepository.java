package com.example.myhome.repository;

import com.example.myhome.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    //제목을 이용하여 찾는 인터페이스
    List<Board> findByTitle(String title);

    //제목 or 내용을 이용하여 찾는 인터페이스
    List<Board> findByTitleOrContent(String title, String content);

    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);


}
