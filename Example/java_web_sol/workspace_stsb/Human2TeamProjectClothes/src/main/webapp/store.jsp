<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="utils.DBConfig"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/store.css">
    <title>의류 생산 시스템:입고</title>
</head>
<body>
    <div class="container">
    <%@ include file="header.jsp" %>
        <div class="content">
            <div id="info">
                <div id="title">
                    <span>입고 등록</span>
                </div>
                <%
                String type = request.getParameter("selecttype");
                String num = request.getParameter("num");
                if(num==null){
                	num="0";
                }
                
                if(type==null){
                	type="item";
                }
                Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				int item_num=0;
				String item_name="";
				String item_size="";
				
				try{
					conn=DBConfig.getConnection();
					
					String sql = "SELECT item_num, item_name, item_size  FROM products WHERE ITEM_NUM=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, Integer.parseInt(num));
					
					rs = pstmt.executeQuery();
					
					if(rs.next()){
						item_num=rs.getInt(1);
						item_name=rs.getString(2);
						item_size=rs.getString(3);
					}
					
                %>
                <form action="storeInsert.jsp" id="formInsert" method="get">
                    <ul class="subject">
                        <li class="line"><div class="lab">입고일</div></label><input type="text" name="date" class="text" id="" placeholder="날짜 입력"><input type="date" name="" id="date"></li>
                        <li class="line"><div class="lab">제품 번호</div><input type="text" name="itemnum" class="text" id="item_num" placeholder="제품 번호 입력" value="<%=item_num %>"></li>
                        <li class="line"><div class="lab">제품명</div><input type="text" name="itemname" class="text" id="item_name" placeholder="제품명 입력" value="<%=item_name %>"></li>
                        <li class="line"><div class="lab">사이즈</div><input type="text" name="itemsize" class="text" id="item_size" placeholder="사이즈 입력" value="<%=item_size %>"></li>
                        <li class="line"><div class="lab">수량</div><input type="text" name="itemcount" class="text" id="quantity" placeholder="수량 입력"></li>
                    </ul>
                    <div id="ok">
                        <input type="submit" value="입력" id="sub">
                    </div>
                </form>
            </div>
            
            <div id="search">
                <div class="searchText">
                	<select name="" id="searchselect" onchange="selectType()">
                	<% 
                		if(type.equals("item")){
                			%>
                        	<option value="item" selected>제품</option>
                        	<option value="order">주문 의뢰서</option>
                			<%
                		}else if(type.equals("order")){
                			%>
                        	<option value="item">제품</option>
                        	<option value="order" selected>주문 의뢰서</option>
                			<%
                		}else{
                			%>
                        	<option value="item">제품</option>
                        	<option value="order">주문 의뢰서</option>
                			<%
                		}
                	%>
                	</select>
                    <input type="text" name="" id="" class="text" placeholder="검색어 입력">
                    <button id="searchbtn">검색</button>
                </div>

                <div class="result">
                    <div id="resultTable">
                        <table id="tableSelect">
                            <tr class="resultCulum">
                               <%
                               		if(type.equals("item")){
                               			%>
                               				<th class="resultRow resultTitle radio">선택</th>
		                                	<th class="resultRow resultTitle type">종류</th>
		                                	<th class="resultRow resultTitle name">제품명</th>
		                                	<th class="resultRow resultTitle size">사이즈</th>
                               			<%
                               		}else if(type.equals("order")){
                               			%>
                               				<th class="resultRow resultTitle radio">선택</th>
                                			<th class="resultRow resultTitle type">종류</th>
                                			<th class="resultRow resultTitle name">제품명</th>
                                			<th class="resultRow resultTitle size">사이즈</th>
                                			<th class="resultRow resultTitle">수량</th>
                               			<%
                               		}
                               %>
                            </tr>
                            <%
									if(type.equals("item")){
										String sql2 = "SELECT item_num, item_type, item_name, item_size  FROM products order by item_num FETCH NEXT 10 ROWS ONLY";
										pstmt = conn.prepareStatement(sql2);
										
										rs = pstmt.executeQuery();

										while(rs.next()){

											%>
												<tr class="resultCulumn">
					                                <td class="resultRow selectRow"><%=rs.getString(1) %></td>
					                                <td class="resultRow selectRow"><%=rs.getString(2) %></td>
					                                <td class="resultRow selectRow"><%=rs.getString(3) %></td>
					                                <td class="resultRow selectRow"><%=rs.getString(4) %></td>
					                            </tr>
											<%
										}
									} else if(type.equals("order")){
										String sql2 = "SELECT order_num, item_type, item_name, item_size,quantity FROM order_product order by ORDER_NUM FETCH NEXT 10 ROWS ONLY";
										pstmt = conn.prepareStatement(sql2);
										
										rs = pstmt.executeQuery();

										while(rs.next()){

											%>
												<tr class="resultCulumn">
					                                <td class="resultRow selectRow"><%=rs.getString(1) %></td>
					                                <td class="resultRow selectRow"><%=rs.getString(2) %></td>
					                                <td class="resultRow selectRow"><%=rs.getString(3) %></td>
					                                <td class="resultRow selectRow"><%=rs.getString(4) %></td>
					                                <td class="resultRow selectRow"><%=rs.getString(5) %></td>
					                            </tr>
											<%
										}
									}
									
								}catch(SQLException e){
									System.out.println("에러 로그:"+e.getMessage());
								}
        					%>
                            
                        </table>
                    </div>
                    <div id="page">
                        <ul>
                            <li class="pageNum pagebtn">이전</li>
                            <li class="pageNum" style="background-color: orange;">1</li>
                            <li class="pageNum">2</li>
                            <li class="pageNum pagebtn">다음</li>
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
    
    	function rowClicked() {
    		var table = document.getElementById('tableSelect');
    		var rowList = table.rows;
    		
    		for(i=1;i<rowList.length;i++){
    			var row = rowList[i];
    			
    			row.onclick = function () {
					return function () {
						var num = this.cells[0].innerHTML;
						var name =this.cells[2].innerHTML;
						var size = this.cells[3].innerHTML;
						
						document.getElementById('item_num').value=num;
						document.getElementById('item_name').value=name;
						document.getElementById('item_size').value=size;
						//document.getElementById('quantity').value=;
					};
				}(row);
    		}
		}
    	window.onload = rowClicked();
    </script>
</body>
</html>