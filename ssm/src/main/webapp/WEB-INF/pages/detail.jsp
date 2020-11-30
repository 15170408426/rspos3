<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3 style="text-indent:3.5em;">网点详细信息</h3>


   <div>
       网点名称：<textarea disabled="disabled"  style="height: 20px;resize:none" >${branch.name}</textarea>
   </div>
    <div>
        营业执照号：<textarea disabled="disabled"  style="height: 20px;resize:none" >${branch.businessNO}</textarea>
    </div>
    <div>
        所在城区：<textarea disabled="disabled"  style="height: 20px;resize:none" >${branch.cityArea}</textarea>
    </div>
    <div>
        网点地址：<textarea disabled="disabled"  style="height: 20px;resize:none" >${branch.address}</textarea>
    </div>
    <div>
        联系电话：<textarea disabled="disabled"  style="height: 20px;resize:none" >${branch.telephone}</textarea>
    </div>
    <div>
        网点简介：<textarea disabled="disabled"  style="height: 50px;resize:none" >${branch.summary}</textarea>
    </div>

    <input style="margin-left: 100px" type="button" id="btn1"  value="返回" onclick="location.href='${pageContext.request.contextPath}/branch/findAll'"/>

</body>
</html>
