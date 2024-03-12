<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>

<%@ include file="../includes/header.jsp" %>
<link rel="stylesheet" href="/resources/css/store.css">
<script type="text/javascript" src="/resources/js/jquery-3.7.1.min.js"></script>
<div class="container">
    <div class="content">
        <div id="info">
            <div id="title">
                <span>입출고 등록</span>
            </div>
            <form action="" id="formInsert" method="get" onsubmit="return false">
                <input type="hidden" name="type" value="타입">
                <ul class="subject">
                            <li class="line">
                                <div class="lab">구분</div>
                                <label for="import" class="choice">입고</label>
                                <input type="radio" id="import" name="info" value="import" checked>
                                <label for="import" class="choice">출고</label>
                                <input type="radio" id="export" name="info" value="export">
                            </li>
                    <li class="line">
                        <div class="lab">입고일</div>
                        <input type="text" name="date" class="text" id="item_date" placeholder="날짜 입력">
                        <input type="date" id="date" onchange="dateMethod()">
                    </li>
                    <li class="line">
                        <div class="lab">수량</div>
                        <input type="text" name="itemcount" class="text" id="quantity" placeholder="수량 입력">
                    </li>
                    <li class="line">
                        <div class="lab">제품 번호</div>
                        <input type="hidden" name="itemnum" class="text" id="item_num" placeholder="제품 번호 입력">
                        <div id="item_num2" class="subjectbox"></div>
                    </li>
                    <li class="line">
                        <div class="lab">제품명</div>
                        <input type="hidden" name="itemname" class="text" id="item_name" placeholder="제품명 입력">
                        <div id="item_name2" class="subjectbox"></div>
                    </li>
                    <li class="line">
                        <div class="lab">사이즈</div>
                        <input type="hidden" name="itemsize" class="text" id="item_size" placeholder="사이즈 입력">
                        <div id="item_size2" class="subjectbox"></div>
                    </li>
                </ul>
                <div id="ok">
                    <input type="submit" value="입력" id="sub" onclick="checkTest()">
                </div>
            </form>
        </div>
        <div id="search">
            <div class="searchText">
                <select name="" id="searchselect" onchange="selectType()">
                    <option value="item" selected>제품</option>
                    <option value="order">주문 의뢰서</option>
                </select>
                <input type="text" name="itemNameSearch" id="itemSearchId" class="text" placeholder="제품명 입력">
                <button id="searchbtn" onclick="itemSearch()">검색</button>
            </div>

            <div class="result">
                <div id="resultTable">
                    <table id="tableSelect">


                    </table>
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
</div>
<script>
    function itemSearch(){
        var item = document.getElementById('itemSearchId').value;
        var searchUL =$("#tableSelect");
        StoreService.getList(
                { search:item || "010" },
                function(list) {
                    if(list==null || list.length==0){
                        searchUL.html("");
                        return;
                    }
                    var str="";
                    str+="<tr class='resultCulum'>";
                    str+="<th class='resultRow resultTitle radio'>선택</th>";
                    str+="<th class='resultRow resultTitle type'>종류</th>";
                    str+="<th class='resultRow resultTitle name'>제품명</th>"
                    str+="<th class='resultRow resultTitle size'>사이즈</th>";
                    str+="</tr>";

                    for(var i=0, len= list.length || 0; i < len; i++) {
                        str+="<tr class='resultCulumn'>";
                        str+="<td class='resultRow selectRow'>"+list[i].item_num+"</td>";
                        str+="<td class='resultRow selectRow'>"+list[i].item_type+"</td>";
                        str+="<td class='resultRow selectRow'>"+list[i].item_name+"</td>";
                        str+="<td class='resultRow selectRow'>"+list[i].item_size+"</td>";
                        str+="</tr>";

                    }
                    searchUL.html(str);
                }
            );
    }

    var StoreService=(function(){

        function getList(param, callback, error){
            var search = param.search;
            $.getJSON("/board/"+search,
                function(data){
                    if(callback){
                        callback(data);
                    }
            }).fail(function(xhr,status,err){
                if(error){
                    error();
                }
            });
        }

        return{
            getList:getList
        };
    })();
</script>
<%@ include file="../includes/footer.jsp" %>