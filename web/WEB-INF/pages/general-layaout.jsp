<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: forjava
  Date: 11/7/2016
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <tiles:insertAttribute name="import"/>
</head>
<body>

<header id="header">
    <tiles:insertAttribute name="header"/>
</header>

<tiles:insertAttribute name="slider"/>
<section>
    <div class="container">
        <div class="row">
            <tiles:insertAttribute name="lsb"/>

            <tiles:insertAttribute name="content"/>
        </div>
    </div>
</section>


<footer id="footer">
    <tiles:insertAttribute name="footer"/>
</footer>


</body>
</html>
