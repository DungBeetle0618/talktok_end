package com.tt.talktok.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {

    // stu_no를 기본키로 설정합니다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가(auto-increment)
    private int stuNo;
    private String stuName;
    private String stuEmail;
    private String stuPwd;
    private String stuPhone;
    private String stuNickname;

}
