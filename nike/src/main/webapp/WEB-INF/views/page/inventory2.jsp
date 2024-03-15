<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>

<%@ include file="../includes/header.jsp" %>
<link rel="stylesheet" href="css/inventory.css">
<div id="container">
    <div id="content">
        <div id="top">
            <form action="inventory2.jsp" id="searchForm" method="get">
                <div id="search">
                    <select class="selectClass" id="selectId" onchange="tagSelect()">
                        <option disabled>==선택==</option>
                        <option>현재고</option>
                        <option selected>기간별재고</option>
                    </select>
                    <input type="text" name="itemName" class="textInput" id="selectItemName" placeholder="제품명 입력" value="">
                    <input type="submit" value="검색" id="submitbtn">
                </div>
                <div id="category2">
                    <ul>
                        <li><label for="" class="labelText">카테고리</label><input type="text" name="itemCategory" class="textInput" id="itemCategory" placeholder="카테고리 입력" value=""></li>
                        <li>
                            <label for="" class="labelText" style="margin-left: 20px">구분</label>
                            <label for="">전체</label>
                            <input type="radio" name="itemdivision" value="all" checked>
                            <label for="">입고</label>
                            <input type="radio" name="itemdivision" value="store">
                            <label for="">출고</label>
                            <input type="radio" name="itemdivision" value="release">
                        </li>
                    </ul>
                    <ul style="margin-top: 20px">
                        <li>
                            <label for="" class="labelText">기준날짜(시작)</label>
                            <input type="text" name="start" class="textInput" id="start" placeholder="날짜 입력" value="">
                            <input type="date" class="date" id="startDate" onchange="startDateMethod()">
                        </li>
                        <li>
                            <label for="" class="labelText">기준날짜(종료)</label>
                            <input type="text" name="end" class="textInput" id="end" placeholder="날짜 입력" value="">
                            <input type="date" class="date" id="endDate" onchange="endDateMethod()">
                        </li>
                    </ul>
                </div>
            </form>
        </div>
        <div id="bottom">
            <div id="title">
                <p>기간별 재고 현황</p>
            </div>
            <div id="subject">
                <ul>
                    <li class="category" style="width: 10%">일자</li>
                    <li class="category" style="width: 5%">구분</li>
                    <li class="size" style="width: 10%">제품번호</li>
                    <li class="itemnum" style="width: 15%">카테고리</li>
                    <li class="itemname" style="width: 50%">제품명</li>
                    <li class="count" style="width: 10%">수량</li>
                </ul>
            </div>
            <div id="page"></div>
        </div>
    </div>
</div>


<%@ include file="../includes/footer.jsp" %>
<script type="text/javascript">
    function startDateMethod(){
        var dateControl = document.getElementById("startDate").value;
        var itemDate = document.getElementById("start").value=dateControl;
    }
    function endDateMethod(){
        var dateControl = document.getElementById("endDate").value;
        var itemDate = document.getElementById("end").value=dateControl;
    }

    function tagSelect() {
        var opt = document.getElementById("selectId");
        var optVal = opt.options[opt.selectedIndex].text;
        if(optVal=="현재고"){
            location.href='/inventory';
        } else if(optVal=="기간별재고"){
            location.href='/inventory2';
        }
    }
</script>