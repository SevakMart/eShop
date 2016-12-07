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
<body style="margin: 0 auto">
<div id="mainDiv" style="width: 1200px;margin: 0 auto; padding: 1%">
    <div id="categoryDiv" style="width: 30%;float: left;border: 1px">
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
                <s:iterator value="#application.categories">
                    <tr>
                        <th width="120"><s:property value="key.name"/></th>
                        <th width="60"><a href="deleteCategory.action?id=<s:property value="key.id"/>">delete</a></th>
                        <th width="60"><a href="viewCategory.action?id=<s:property value="key.id"/>">edit</a></th>
                    </tr>
                </s:iterator>
            </table>
        </div>
    </div>
    <div id="productDiv" style="float: left; width: 30%">
        <div id="addProduct" style="float: left">
            <h4>Add product</h4>
            <s:form action="addProduct" method="POST" enctype="multipart/form-data">
                <s:textfield name="name" label="Product`s name"/>
                <s:textfield name="price" label="Price"/>
                <s:textarea name="description" label="Product`s name" rows="5"/>
                <s:select list="%{#application.brands}" name="brandId"
                          headerValue="-----" headerKey="0" label="Brand"
                          listKey="id" listValue="name"/>
                <s:select list="allCategories" label="Categories" name="categoryId"
                          headerKey="0" headerValue="-----"
                          listKey="id" listValue="name"/>
                <s:file label="main picture" name="main"/>
                <%--<s:file label="pictures" name="pictures" multiple="multiple"/>--%>
                <s:submit value="Add Product"/>
            </s:form>
        </div>
    </div>
    <div id="brandDiv" style="width: 30%;float: left">
        <div id="addBrand">
            <h4>add brand</h4>
            <s:form action="addBrand" method="POST">
                <s:textfield label="Brand name" name="name"/>
                <s:submit value="Add Brand"/>
            </s:form>
        </div>
        <div id="brandsList">
            <table border="solid">
                <tr>
                    <th width="100">name</th>
                    <th width="50">edit</th>
                    <th width="50">delete</th>
                </tr>
                <s:iterator value="#application.brands">

                    <tr>
                        <td width="100"><s:property value="name"/></td>
                        <td width="50">edit</td>
                        <td width="50">delete</td>
                    </tr>
                </s:iterator>
            </table>
        </div>
    </div>
</div>
</body>
</html>
