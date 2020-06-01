package jp.co.aforce.beans;

import java.io.Serializable;

//JavaBeans の雛形
@SuppressWarnings("serial")
public class LoginBean implements Serializable {

 private String username;
 private String password;
 private String emsg;

 // セッター
 public String getUsername() {
     return username;
 }
 public String getPassword() {
     return password;
 }
 public String getEmsg() {
     return emsg;
 }

 // ゲッター
 public void setUsername(String username) {
     this.username = username;
 }
 public void setPassword(String password) {
     this.password = password;
 }
 public void setEmsg(String emsg) {
     this.emsg = emsg;
 }
}