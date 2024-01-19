package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //이 파일이 컨트롤러임을 선언
public class ArticleController {

    @GetMapping("/articles/new") //URL요청 접수
    public String newArticleForm() //뷰페이지를 보여주기 위한!
    {
        return "articles/new"; //파일경로까지 포함하여 뷰페이지 반환
    }
    @PostMapping("/articles/create") // GetMapping()사용x, 뷰페이지에서 폼데이터를 post 방식으로 전송했기 때문에 받을때도 PostMapping()으로 받는다.
    public String createArticle(ArticleForm form) { //폼에서 전송한 데이터를 DTO에 담기 위한 매개변수 form 추가
        System.out.println(form.toString()); //Dto에 폼 데이터가 잘 담겼는지 확인
        //1. DTO를 엔티티로 변환, 변환하기에 앞서 먼저 엔티티 클래스부터 만들어야함.
        //2. 리파지터리로 엔티티를 DB에 저장
        Article article = form.toEntity();//DTO를 엔티티로 변환하기 위해 form객체의 toEntity()라는 메서드를 호출해서 그 반환값을 Article 타입의 article엔티티에 저장
        return "";
    }
}
