<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: brobear
  Date: 2018/5/4
  Time: 上午9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="hello" method="post">
    <table>
        <tr>
           <td><input type="text" name="user.name"></td>
        </tr>
        <tr>
            <td><input type="password" name="user.pswd"> </td>
        </tr>
        <tr>
            <td><input type="submit" name="hello"/> </td>
        </tr>
    </table>
</form>
</body>
</html>
