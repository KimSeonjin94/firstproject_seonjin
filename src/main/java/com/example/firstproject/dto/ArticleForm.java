package com.example.firstproject.dto;
//해당 파일이 폼데이터를 받아올 그릇이 됨
public class ArticleForm {
    //입력폼에서 제목과 내용을 전송할 예정이라 title, content 필드 2개 선언
    private String title; //제목을 받을 필드
    private String content; //내용을 받을 필드

    //폼 데이터를 잘 받았는지 확인하기 위한 toString() 메서드 추가
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    //전송받을 제목과 내용을 필드에 저장하는 생성자 추가
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
