<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: forjava
  Date: 12/4/2016
  Time: 5:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin page</title>
</head>
<body>
<div id="mainDiv">
    <div id="categoryDiv">
        <s:if test="%{category==null }">
            <div id="addCategory">
                <h4>Add category</h4>
                <s:form action="addCategory" method="POST">
                    <s:textfield name="name" label="Category name"/>
                    <s:select list="%{#application.categories}" label="parent category"
                              headerKey="0" headerValue="------"
                              listKey="key.id" listValue="key.name"/>
                    <s:submit value="add category"/>
                </s:form>
            </div>
        </s:if>
        <s:else>
            <div id="updateCategory">
                <h4>Update category</h4>
                <s:form action="updateCategory" method="POST">
                    <s:hidden name="id" value="%{id}"/>
                    <s:textfield name="name" label="Category name" value="%{category.name}"/>
                    <s:select list="%{#application.categories}" label="parent category"
                              headerKey="0" headerValue="------"
                              listKey="key.id" listValue="key.name"/>
                    <s:submit value="update"/>
                </s:form>
            </div>
        </s:else>
        <div id="categoriesList">
            <h4>category list</h4>
            <table border="1">
                <tr>
                    <th width="120">Category name</th>
                    <th width="60">Delete category</th>
                    <th width="60">Update category</th>
                </tr>
                <s:iterator value="allCategories">
                    <tr>
                        <th width="120"><s:property value="name"/></th>
                        <th width="60"><a href="deleteCategory.action?id=<s:property value="id"/>">delete</a></th>
                        <th width="60"><a href="viewCategory.action?id=<s:property value="id"/>">edit</a></th>
                    </tr>
                </s:iterator>
            </table>
        </div>
    </div>
</div>
</body>
</html>
