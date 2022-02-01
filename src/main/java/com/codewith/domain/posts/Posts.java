package com.codewith.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Entity 클래스에서는 절대 Setter 메소드를 만들지 않는다.
@Getter // lombok 어노테이션
@NoArgsConstructor // lombok 어노테이션. public Posts() {}와 같은 효과
@Entity // JPA의 어노테이션, 테이블과 링크될 클래스임을 나타냄, 카멜케이스의 이름을 언더스코어 네이밍으로 테이블 이름을 매칭
public class Posts { // 실제 DB의 테이블과 매칭될 클래스, Entity 클래스라고도 함

    @Id // 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 칼럼을 나타냄. 굳이 선언하지 않아도됨. 추가로 변경이 필요한 옵션이 있으면 사용.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
