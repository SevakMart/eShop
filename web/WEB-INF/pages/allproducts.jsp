<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: forjava
  Date: 11/8/2016
  Time: 12:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-sm-9 padding-right" id="products">
    <div class="features_items"><!--features_items-->
        <h2 class="title text-center">Features Items</h2>

        <s:iterator value="products">
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <img src="images/shop/product12.jpg" alt=""/>
                            <h2>$<s:property value="price"/></h2>
                            <p><s:property value="name"/></p>
                            <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to
                                cart</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>$<s:property value="price"/></h2>
                                <a href="productDetails.action?productId=<s:property value="id"/>"><p><s:property
                                        value="name"/></p></a>
                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add
                                    to
                                    cart</a>
                            </div>
                        </div>
                    </div>
                    <div class="choose">
                        <ul class="nav nav-pills nav-justified">
                            <li><a href="addToWhishList.action?productId=<s:property value="id"/>"><i
                                    class="fa fa-plus-square"></i>Add to wishlist</a></li>
                            <li><a href=""><i class="fa fa-plus-square"></i>Add to compare</a></li>
                        </ul>
                    </div>
                </div>
            </div>

        </s:iterator>


        <ul class="pagination">
            <li class="active"><a href="">1</a></li>
            <li><a href="">2</a></li>
            <li><a href="">3</a></li>
            <li><a href="">&raquo;</a></li>
        </ul>
    </div><!--features_items-->
</div>
