package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //1.컨트롤러 선언
public class FirstController {
@GetMapping("/hi") //2. greetings.mustache 페이지를 반환해달라는 URL요청을 접수하는 부분 -> 웹브라우저에서 localhost:8080/hi로 접속하면 greetings.mustache파일을 찾아 반환하라는 뜻
    public String niceToMeetYou(Model model) { //3. 메서드 수행. 4. 모델 객체 가져오기
    model.addAttribute("username", "hongpark"); //5. 모델에서 변수를 등록("변수명",변숫값)
    return "greetings";// 6. 뷰 템플릿 페이지 greetings.mustache를 반환(이름만 따서)
    }
@GetMapping("/bye")
    public String seeYouNext(Model model){
    model.addAttribute("nickname", "홍팍");
    return "goodbye";
    }

@GetMapping("/random-quote")
    public String SencodController(Model model){
        String[] quotes = {
                "행복은 습관이다. 그것을 몸에 지니라. " + "-허버드",
                "고개 숙이지 마십시오. 세상을 똑바로 정면으로 " + "바라보십시오. -헬렌 켈러-",
                "고난의 시기에 동요하지 않는 것, 이것은 진정 " + "칭찬받을 만한 뛰어난 인물의 증거다. -베토벤-",
                "당신이 할 수 있다고 믿든 할 수 없다고 믿듣 " + "믿는 대로 될 것이다. -헨리 포드-",
                "작은 기회로부터 종종 위대한 업적이 시작된다. " + "-데모스테네스-"

        };
    int randInt = (int)(Math.random() * quotes.length);
    model.addAttribute("randomQuote",quotes[randInt]);
    return "quote";
    }

}
