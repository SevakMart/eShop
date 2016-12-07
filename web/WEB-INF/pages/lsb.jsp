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

        <s:iterator value="#application.categories">
            <div class="accordion"><a href="productsById.action?categoryId=<s:property value="key.id"/> "><s:property
                    value="key.name"/></a></div>
            <div class="panel">

                <ul>
                    <s:iterator value="value">
                        <li>
                            <a href="productsById.action?categoryId=<s:property value="id"/>"><s:property
                                    value="name"/> </a>
                        </li>
                    </s:iterator>
                </ul>

            </div>
        </s:iterator>
        <style>

            div.accordion {
                background-color: #eee;
                color: #444;
                cursor: pointer;
                padding: 8px;
                width: 100%;
                text-align: left;
                border: none;
                outline: none;
                transition: 0.4s;
                height: 30px;
            }

            div.accordion.active, div.accordion:hover {
                background-color: #ddd;
            }

            div.panel {
                padding: 0 18px;
                background-color: white;
                max-height: 0;
                overflow: hidden;
                transition: 0.6s ease-in-out;
                opacity: 0;
            }

            div.panel.show {
                opacity: 1;
                max-height: 500px; /* Whatever you like, as long as its more than the height of the content (on all screen sizes) */
            }

            /*icons*/

            div.accordion:after {
                content: '\02795'; /* Unicode character for "plus" sign (+) */
                font-size: 13px;
                color: #777;
                float: right;
                margin-left: 5px;
            }

            div.accordion.active:after {
                content: "\2796"; /* Unicode character for "minus" sign (-) */
            }
        </style>

        <script>
            var acc = document.getElementsByClassName("accordion");
            var i;

            for (i = 0; i < acc.length; i++) {
                acc[i].onclick = function () {
                    this.classList.toggle("active");
                    this.nextElementSibling.classList.toggle("show");
                }
            }
        </script>


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
