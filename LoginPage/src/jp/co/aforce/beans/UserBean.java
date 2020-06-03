package jp.co.aforce.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

		 private String username;
		 private String address;
		 private String age;
		 private String hight;

		 // セッター
		 public String getUsername() {
		     return username;
		 }
		 public String getAddress() {
		     return address;
		 }
		 public String getAge() {
		     return age;
		 }
		 public String getHight() {
			 return hight;
		 }

		 // ゲッター
		 public void setUsername(String username) {
		     this.username = username;
		 }
		 public void setAddress(String address) {
		     this.address = address;
		 }
		 public void setAge(String age) {
		     this.age = age;
		 }
		 public void setHight(String hight) {
			 this.hight = hight;
		 }
}
