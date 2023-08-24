package com.model;

import java.util.ArrayList;

public class MemberDTO {

   private String id;
   private String pw;
   private String nickname;
   private String email;
   private String phone;
   private String gender;
   private int age;
   
   public MemberDTO(String id, String pw, String nickname, String email, String phone, String gender, int age) {
      super();
      this.id = id;
      this.pw = pw;
      this.nickname = nickname;
      this.email = email;
      this.phone = phone;
      this.gender = gender;
      this.age = age;
   }
   public MemberDTO(String id, String pw) {
	   //생성자 중복정의
	   this.id=id;
	   this.pw=pw;
   }

   public String getId() {
      return id;
   }

   public String getPw() {
      return pw;
   }

   public String getNickname() {
      return nickname;
   }

   public String getEmail() {
      return email;
   }

   public String getPhone() {
      return phone;
   }

   public String getGender() {
      return gender;
   }

   public int getAge() {
      return age;
   }

  
   
   
   
   
   
}