<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
    <form action="updateUser" method="post">
        <input type="hidden" name="id" value="1">
        <table>
            <tr>
                <td>用户名:</td><td><input type="text" name="name" value="yanshu"/></td>
            </tr>
            
            <tr>
                <td>Account：</td><td><input type="text" name="account" value="建设银行"/></td>
            </tr>
            <tr>
                <td></td><td><input type="submit" value="提交"></td>
            </tr>
           </table>
    </form>
  </body>
</html>