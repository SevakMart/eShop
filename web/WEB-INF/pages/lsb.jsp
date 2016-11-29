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

        <div class="panel-group category-products" id="accordian"><!--category-productsr-->
            <s:iterator value="#application.categories">
                <div class="panel panel-default">

                    <div class="panel-heading">
                        <h4 class="panel-title">
                                <%--<a data-toggle="collapse" data-parent="#accordian"--%>
                            <a href="productsById.action?categoryId=<s:property value="key.id"/>">
                                    <%--<span class="badge pull-right"><i class="fa fa-plus"></i></span>--%>
                                <s:property value="key.name"/>
                            </a>
                        </h4>
                    </div>
                    <s:if test="%{value!=null }">
                        <div id="subCategories" class="panel-collapse collapse" style="display: none" onclick="">
                            <div class="panel-body">
                                <ul>
                                    <s:iterator value="value">
                                        <li>
                                            <a href="productsById.action?categoryId=<s:property value="id"/>"><s:property
                                                    value="name"/> </a>
                                        </li>
                                    </s:iterator>
                                </ul>
                            </div>
                        </div>
                    </s:if>
                </div>
            </s:iterator>
        </div><!--/category-products-->

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
</div>

<script>
   function subCategories() {
      $("#subCategories").show();
   }
</script>