<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
    <form action="testPOJO" method="post">
    <table>
        <tr>
            <td>用户名:</td><td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密码:</td><td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td>
                <input type="radio" checked="checked" name="gender" value="male"/>男   
                   <input type="radio" name="gender" value="female"/>女
               </td>
        </tr>
        <tr>
            <td>爱好：</td>
            <td>
                <input type="checkbox" name="hobby" value="tv">看电视
                <input type="checkbox" name="hobby" value="ball">打球
                <input type="checkbox" name="hobby" value="swimming">游泳
            </td>
        </tr>
        <tr>
            <td>省：</td><td><input type="text" name="address.province"/></td>
        </tr>
        <tr>
            <td>市:</td><td><input type="text" name="address.city"/></td>
        </tr>
        <tr>
            <td></td><td><input type="submit" value="提交"></td>
        </tr>

       </table>
    
    </form>
  </body>
</html>