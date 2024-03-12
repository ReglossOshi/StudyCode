<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@ include file="../includes/header.jsp" %>
<link rel="stylesheet" href="/resources/css/inventory.css">
<div id="container">
    <div id="content">
        <div id="top">
            <form action="inventory.jsp" id="searchForm" method="post">
                <div id="search">
                    <select name="selecttype" class="selectClass" id="selectId" onchange="tagSelect()">
                        <option disabled>==선택==</option>
                        <option selected>현재고</option>
                        <option>기간별재고</option>
                    </select>
                    <input type="text" name="itemName" class="textInput" id="selectItemName" placeholder="제품명 입력" value="">
                    <input type="submit" value="검색" id="submitbtn">
                </div>
        <div id="category">
                <ul>
                    <li><label for="" class="labelText">카테고리</label><input type="text" name="itemCategory" class="textInput" id="itemCategory" placeholder="카테고리 입력" value=""></li>
                    <li>
                        <label for="" class="labelText">사이즈</label>
                        <select class="selectClass" name="itemSize" id="itemSize">
                            <option value="" selected="selected"></option>
                            <option selected></option>
                            <option></option>
                        </select>
                    </li>
                </ul>
            </div>
            </form>
        </div>
        <div id="bottom">
                <div id="title">
                    <p>현 재고 현황</p>
                </div>
            <div id="subject">
                <ul>
                    <li class="category" style="width: 10%">카테고리</li>
                    <li class="itemnum" style="width: 10%">제품번호</li>
                    <li class="itemname" style="width: 60%">제품명</li>
                    <li class="size" style="width: 5%">사이즈</li>
                    <li class="count" style="width: 15%">재고량</li>
                </ul>

                <ul>
                    <li class="category" style="width: 10%"></li>
                    <li class="itemnum" style="width: 10%"></li>
                    <li class="itemname" style="width: 60%"></li>
                    <li class="size" style="width: 5%"></li>
                    <li class="count" style="width: 15%"></li>
                </ul>
            </div>
            <div id="page">
                <ul>
                    <li>이전</li>
                    <li>1</li>
                    <li>다음</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<%@ include file="../includes/footer.jsp" %>