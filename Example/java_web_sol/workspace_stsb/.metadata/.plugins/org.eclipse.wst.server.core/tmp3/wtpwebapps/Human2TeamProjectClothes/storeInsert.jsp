<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="utils.DBConfig"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	String itemnum = request.getParameter("itemnum");
	String type = request.getParameter("type");
	String date = request.getParameter("date");
	String itemcount = request.getParameter("itemcount");
	
	Connection conn = null; 
	PreparedStatement pstmt = null; 
	Exception exception = null;
	
	try{
		conn=DBConfig.getConnection();
		
		if(type.equals("item")){
			String sql = "INSERT INTO item_management VALUES (trade_seq.nextval,?,'제품','입고',?,?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(itemnum));
			pstmt.setString(2, date);
			pstmt.setInt(3, Integer.parseInt(itemcount));
			pstmt.executeUpdate();
		} else if(type.equals("order")){
			String sql = "INSERT INTO item_management VALUES (trade_seq.nextval,?,'주문 의뢰서','입고',?,?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(itemnum));
			pstmt.setString(2, date);
			pstmt.setInt(3, Integer.parseInt(itemcount));
			pstmt.executeUpdate();
		}
		
	}catch(Exception e){
		exception=e;
		System.out.println("에러 로그:"+e.getMessage());
	} finally{
		if(pstmt !=null){try{pstmt.close();}catch(SQLException e){}}
		if(conn !=null){try{conn.close();}catch(SQLException e){}}
	}
%>

<%
	if(exception==null){
		%>
		<script>
		alert('재고 등록 완료.');
		location.href='<%=request.getContextPath()%>/store.jsp';
		</script>
		<%	
	} else{
		%>
		공지사항 등록이 실패하였습니다. 시스템 관리자에게 문의하세요.<BR>
		오류내용:<%=exception.getMessage() %>
		<%
	}
%>