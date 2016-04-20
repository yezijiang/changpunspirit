<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%--
  Created by IntelliJ IDEA.
  User: maxing
  Date: 2016/4/1
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- 从被装饰页面获取title标签内容,并设置默认值-->
    <title><decorator:title default="菖蒲酒业管理系统"/></title>
    <!-- 从被装饰页面获取head标签内容,head标签排除《title》 -->
    <script src="assets/plugins/jquery-1.10.2.min.js"></script>
    <decorator:head/>
</head>
<body>
<decorator:body />
</body>
</html>
