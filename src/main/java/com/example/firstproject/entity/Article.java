package com.example.firstproject.entity;

import jakarta.persistence.Entity;

//controller가 아닌 entity패키지를 추가한 이유는 컨트롤러와 엔티티를 나누어 관리하기 위해서. 새로만들 Article 클래스는 entity 패키지에 저장
@Entity
public class Article {
}
