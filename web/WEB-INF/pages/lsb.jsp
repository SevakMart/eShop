<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: forjava
  Date: 11/7/2016
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-sm-3">
    <div class="left-sidebar">
        <h2>Category</h2>

        <div class="panel-group" id="accordion">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"><span
                                class="glyphicon glyphicon-folder-close">
                            </span>Content</a>
                    </h4>
                </div>
                <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
                        <table class="table">
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-pencil text-primary"></span><a
                                        href="http://www.jquery2dotnet.com">Articles</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-flash text-success"></span><a
                                        href="http://www.jquery2dotnet.com">News</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-file text-info"></span><a
                                        href="http://www.jquery2dotnet.com">Newsletters</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-comment text-success"></span><a
                                        href="http://www.jquery2dotnet.com">Comments</a>
                                    <span class="badge">42</span>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><span
                                class="glyphicon glyphicon-th">
                            </span>Modules</a>
                    </h4>
                </div>
                <div id="collapseTwo" class="panel-collapse collapse">
                    <div class="panel-body">
                        <table class="table">
                            <tr>
                                <td>
                                    <a href="http://www.jquery2dotnet.com">Orders</a> <span class="label label-success">$ 320</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="http://www.jquery2dotnet.com">Invoices</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="http://www.jquery2dotnet.com">Shipments</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="http://www.jquery2dotnet.com">Tex</a>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree"><span
                                class="glyphicon glyphicon-user">
                            </span>Account</a>
                    </h4>
                </div>
                <div id="collapseThree" class="panel-collapse collapse">
                    <div class="panel-body">
                        <table class="table">
                            <tr>
                                <td>
                                    <a href="http://www.jquery2dotnet.com">Change Password</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="http://www.jquery2dotnet.com">Notifications</a> <span
                                        class="label label-info">5</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="http://www.jquery2dotnet.com">Import/Export</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-trash text-danger"></span><a
                                        href="http://www.jquery2dotnet.com" class="text-danger">
                                    Delete Account</a>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseFour"><span
                                class="glyphicon glyphicon-file">
                            </span>Reports</a>
                    </h4>
                </div>
                <div id="collapseFour" class="panel-collapse collapse">
                    <div class="panel-body">
                        <table class="table">
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-usd"></span><a href="http://www.jquery2dotnet.com">Sales</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-user"></span><a
                                        href="http://www.jquery2dotnet.com">Customers</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-tasks"></span><a
                                        href="http://www.jquery2dotnet.com">Products</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="glyphicon glyphicon-shopping-cart"></span><a
                                        href="http://www.jquery2dotnet.com">Shopping Cart</a>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="brands_products"><!--brands_products-->
        <h2>Brands</h2>
        <div class="brands-name">
            <ul class="nav nav-pills nav-stacked">
                <s:iterator value="#application.brands">
                    <li><a href="productsByBrandId.action?brandId=<s:property value="id"/>"> <span
                            class="pull-right">(50)</span><s:property value="name"/> </a></li>
                </s:iterator>
            </ul>
        </div>
    </div><!--/brands_products-->

    <div class="price-range"><!--price-range-->
        <h2>Price Range</h2>
        <div class="well text-center">
            <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600"
                   data-slider-step="5" data-slider-value="[250,450]" id="sl2"><br/>
            <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
        </div>
    </div><!--/price-range-->

    <div class="shipping text-center"><!--shipping-->
        <img src="images/home/shipping.jpg" alt=""/>
    </div><!--/shipping-->

</div>


<style>
    body {
        margin-top: 50px;
    }

    .glyphicon {
        margin-right: 0px;
    }

    .panel-body {
        padding: 0px;
    }

    .panel-body table tr td {
        padding-left: 0px
    }

    .panel-body .table {
        margin-bottom: 0px;
    }
</style>
