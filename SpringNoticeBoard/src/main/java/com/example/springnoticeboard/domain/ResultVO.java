package com.example.springnoticeboard.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// VO(value object): 값 그 자체를 나타내는 객체
@Data                   // getter, setter를 자동으로 만들어 준다.
//@NoArgsConstructor      // 디폴트 생성자를 만들어준다.
@AllArgsConstructor     // 모든 파라메터를 가진 생성자를 만들어준다
public class ResultVO {
    private int code;
    private String message;
}
