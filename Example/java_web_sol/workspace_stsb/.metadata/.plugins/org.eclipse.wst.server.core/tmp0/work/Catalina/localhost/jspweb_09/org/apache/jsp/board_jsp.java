/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-01-15 07:31:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utils.DBConfig;
import java.sql.*;
import java.util.*;
import vo.BoardVo;

public final class board_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1705297733369L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("utils.DBConfig");
    _jspx_imports_classes.add("vo.BoardVo");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-container {\r\n");
      out.write("            max-width: 800px;\r\n");
      out.write("            margin: 20px auto;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-item {\r\n");
      out.write("            border-bottom: 1px solid #ddd;\r\n");
      out.write("            padding: 10px 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-item:last-child {\r\n");
      out.write("            border-bottom: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-item a {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-item .bbshead {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            background-color: #333;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .board-item .bbshead a{\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .board-item .number {\r\n");
      out.write("            flex: 1;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-item .title {\r\n");
      out.write("            flex: 4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-item .author {\r\n");
      out.write("            flex: 2;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board-item .views {\r\n");
      out.write("            flex: 1;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .add-button {\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin: 20px auto;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            background-color: #4caf50;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .add-button:hover {\r\n");
      out.write("            background-color: #45a049;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- 헤더영역 공통부분 -->\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"main.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	 <div class=\"top-menu\">\r\n");
      out.write("    <div class=\"logo\">휴먼교육(주)</div>\r\n");
      out.write("    <div class=\"login-menu\">\r\n");
      out.write("      <li><a href=\"#\">Home</a></li>\r\n");
      out.write("      <li><a href=\"#\">About</a></li>\r\n");
      out.write("      <li><a href=\"board.jsp\">Board</a></li>\r\n");
      out.write("      <li><button onclick=\"showLoginModal()\">로그인</button></li>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  	function showLoginModal(){\r\n");
      out.write("  		location.href=\"loginform.jsp\";\r\n");
      out.write("  	}\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("   <!-- 헤더영역 공통부분 끝 -->\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"board-container\">\r\n");
      out.write("    <h2>게시판 목록</h2>\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("     \r\n");
      out.write("       ");

	       	Connection conn = null; //디비 접속 성공시 접속 정보 저장
			PreparedStatement pstmt = null; //쿼리를 실행하기 객체 정보
			ResultSet rs = null;
			try{
				conn=DBConfig.getConnection();
				System.out.println("접속 성공");
			}catch(SQLException e){
				System.out.println("에러 로그:"+e.getMessage());
			}
			//게시판 데이터 검색
			
			ArrayList<BoardVo> boardList = new ArrayList<>();
			
			try{
			String sql = "SELECT NUM, SUBJECT, NAME, HIT FROM BO_FREE ORDER BY NUM DESC";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				BoardVo board = new BoardVo();
				board.setNum(rs.getInt("NUM"));
				board.setSubject(rs.getString("SUBJECT"));
				board.setName(rs.getString("NAME"));
				board.setHit(rs.getInt("HIT"));
				boardList.add(board);
			}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
       
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"board-item\">\r\n");
      out.write("           <div class=\"bbshead number\">번호</div>\r\n");
      out.write("           <div class=\"bbshead title\"><a href=\"#\">제목</a></div>\r\n");
      out.write("           <div class=\"bbshead author\">작성자</div>\r\n");
      out.write("           <div class=\"bbshead views\">조회수</div>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("         <!-- 반복 구문 -->\r\n");
      out.write("         ");

         	int number = boardList.size();
         	for(int i=0;i<boardList.size();i++){
         		BoardVo temp = boardList.get(i);
         		
         
      out.write("\r\n");
      out.write("       <div class=\"board-item\">\r\n");
      out.write("           <div class=\"number\">");
      out.print( number-- );
      out.write("</div>\r\n");
      out.write("           <div class=\"title\"><a href=\"bbsread.jsp?num=");
      out.print(temp.getNum() );
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print( temp.getSubject() );
      out.write("</a></div>\r\n");
      out.write("           <div class=\"author\">");
      out.print( temp.getName() );
      out.write("</div>\r\n");
      out.write("           <div class=\"views\">");
      out.print( temp.getHit() );
      out.write("</div>\r\n");
      out.write("       </div>\r\n");
      out.write("       ");
} 
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       <!-- 추가적인 게시물 목록은 필요에 따라 반복해서 추가 -->\r\n");
      out.write("   \r\n");
      out.write("       <a href=\"writeform.jsp\" class=\"add-button\">새 게시물 작성</a>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
