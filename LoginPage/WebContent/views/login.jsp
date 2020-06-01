<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!-- タグライブラリの使用を宣言する（必要に応じて） -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
    <head>
        <!-- 文字エンコーディングの指定 -->
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>ログイン画面</title>
    </head>
    <body>

<!-- 入力フォーム -->
<form action="/LoginPage/req"method="post">

  <!-- 入力項目 -->
    <p>
        <span>${requestScope.loginBean.emsg}</span>
  </p>
  <p>
        <span>ユーザーID:</span><input type="text"name="username"size="20">
  </p>
  <p>
			<span>パスワード:</span> <input type="text"name="password"size="20">
  </p>
  <p>

  <!-- ログインボタン -->
		<input type="submit" value="ログイン">
</form>

    </body>
</html>