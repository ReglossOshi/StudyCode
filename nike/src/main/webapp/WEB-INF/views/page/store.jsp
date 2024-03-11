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
                <form action="storeInsert.jsp" id="formInsert" method="get" onsubmit="return false">
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
                    <input type="text" name="itemNameSearch" id="itemSearchId" class="text" placeholder="제품명 입력" value="">
                    <button id="searchbtn" onclick="itemSearch()">검색</button>
                </div>

                <div class="result">
                    <div id="resultTable">
                        <table id="tableSelect">
                            <tr class="resultCulum">
                                <th class="resultRow resultTitle radio">선택</th>
                                <th class="resultRow resultTitle type">종류</th>
                                <th class="resultRow resultTitle name">제품명</th>
                                <th class="resultRow resultTitle size">사이즈</th>
                            </tr>
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

    <script type="text/javascript">
    	function selectType(){
    		var opt = document.getElementById("searchselect");
            var optVal = opt.options[opt.selectedIndex].value;
            location.href='store.jsp?selecttype='+optVal;
    	}
    
    	function dateMethod() {
			var dateControl = document.querySelector('input[type="date"]').value;
			var itemDate = document.getElementById("item_date").value=dateControl;
		}
    	
    	function itemSearch() {
			var itemSearchId = document.getElementById("itemSearchId").value;
			var opt = document.getElementById("searchselect");
            var optVal = opt.options[opt.selectedIndex].value;
            
			location.href='store.jsp?itemSearch='+itemSearchId+'&selecttype='+optVal;
		}
    	
    	function rowClicked() {
    		var opt = document.getElementById("searchselect");
            var optVal = opt.options[opt.selectedIndex].value;
            
    		var table = document.getElementById('tableSelect');
    		var rowList = table.rows;
    		
    		for(i=1;i<rowList.length;i++){
    			var row = rowList[i];
    			
    			row.onclick = function () {
					return function () {
						if(optVal=="item"){
							var num = this.cells[0].innerHTML;
							var name =this.cells[2].innerHTML;
							var size = this.cells[3].innerHTML;
							
							document.getElementById('item_num').value=num;
							document.getElementById('item_num2').innerHTML=num;
							document.getElementById('item_name').value=name;
							document.getElementById('item_name2').innerHTML=name;
							document.getElementById('item_size').value=size;
							document.getElementById('item_size2').innerHTML=size;
						} else if(optVal=="order"){
							var num = this.cells[0].innerHTML;
							var name =this.cells[2].innerHTML;
							var size = this.cells[3].innerHTML;
							var quantity= this.cells[4].innerHTML;
							
							document.getElementById('item_num').value=num;
							document.getElementById('item_num2').innerHTML=num;
							document.getElementById('item_name').value=name;
							document.getElementById('item_name2').innerHTML=name;
							document.getElementById('item_size').value=size;
							document.getElementById('item_size2').innerHTML=size;
							
							document.getElementById('quantity').value=quantity;
						}
						
					};
				}(row);
    		}
		}
    	window.onload = rowClicked();
    	
    	function checkTest() {
    		if(!$('#item_date').val()){
    			alert('날짜를 입력하세요.');
    			$('#item_date').focus();
    			
    			return;
    		}
    		
    		if(!$('#quantity').val()){
    			alert('수량을 입력하세요.');
    			$('#quantity').focus();
    			
    			return;
    		}
    		if(!$('#item_num').val()){
    			alert('상품을 선택하세요.');
    			$('#item_num').focus();
    			
    			return;
    		}
    		document.getElementById('formInsert').submit();
		}
    </script>
<%@ include file="../includes/footer.jsp" %>