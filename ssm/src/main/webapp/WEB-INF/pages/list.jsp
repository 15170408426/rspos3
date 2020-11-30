<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript" src="../js/jquery-1.12.4.js"></script>

<script type="text/javascript">
    $(document).ready(function() {
        //$("tr:even").css("background-color", "#CC0000"); //为双数行表格设置背颜色素
        $("tr:even").css("background-color", "rgba(0,0,0,0.16)"); //为单数行表格设置背颜色素

    });
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3 style="text-indent:10em;">营业网点查询</h3>


    <table border="1">
        <tr>
            <th>网点名称</th>
            <th>所在城区</th>
            <th>网点地址</th>
            <th>联系电话</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${list}" var="branch" varStatus="s">

            <tr>
                <td>${branch.name}</td>
                <td>${branch.cityArea}</td>
                <td>${branch.address}</td>
                <td>${branch.telephone}</td>
                <td><a href="${pageContext.request.contextPath}/branch/detail?id=${branch.id}">查询</a></td>
            </tr>

        </c:forEach>


    </table>


</body>
</html>
