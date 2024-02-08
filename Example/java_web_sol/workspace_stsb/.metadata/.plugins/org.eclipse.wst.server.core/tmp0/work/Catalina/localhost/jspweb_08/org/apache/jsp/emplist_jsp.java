/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-01-15 00:15:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import vo.EmpVo;
import utils.DBConfig;
import java.sql.*;

public final class emplist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("vo.EmpVo");
    _jspx_imports_classes.add("utils.DBConfig");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	/* 직원 목록 */\r\n");
      out.write("   body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      background-color: #f2f2f2;\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      justify-content: center;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("      height: 100vh;\r\n");
      out.write("   }\r\n");
      out.write("   .employee-list {\r\n");
      out.write("      background-color: #fff;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   table {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      border-collapse: collapse;\r\n");
      out.write("      margin-top: 20px;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   th, td {\r\n");
      out.write("      border: 1px solid #ddd;\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      text-align: left;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   th {\r\n");
      out.write("      background-color: #3498db;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("   }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

      // 오라클 디비와 접속
      Connection connection = null;
      // 접속하기 
      try {
        //connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        connection = DBConfig.getConnection();
        System.out.println("jsp계정 접속성공");
      }catch(Exception e) {
        System.out.println("jsp계정 접속실패");        
      }   
      
      //직원정보 목록을 가져오는 쿼리 실행
      PreparedStatement pstmt = null;
      ResultSet resultSet = null;
      ArrayList<EmpVo> emplist = new ArrayList<>();
      try{
    	  String sql = "SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, PHONE_NUMBER FROM EMPLOYEES ORDER BY EMPLOYEE_ID";
    	  pstmt = connection.prepareStatement(sql);
    	  resultSet = pstmt.executeQuery();
    	  
    	  while(resultSet.next()){
    		  EmpVo empvo = new EmpVo();
    		  empvo.setEmployee_id(resultSet.getString("EMPLOYEE_ID"));
    		  empvo.setLast_name(resultSet.getString("LAST_NAME"));
    		  empvo.setJob_id(resultSet.getString("JOB_ID"));
    		  empvo.setPhone_number(resultSet.getString("PHONE_NUMBER"));
    		  emplist.add(empvo);
    	  }
    	  out.println(emplist.size());
      }catch(SQLException e){
    	  System.out.println("에러로그:직원목록==>"+e.getMessage());
      }
      
   
      out.write("\r\n");
      out.write("\r\n");
      out.write(" 	<div class=\"employee-list\">\r\n");
      out.write("        <h2>직원 목록</h2>\r\n");
      out.write("        <button onclick=\"handleAddButtonClick()\">직원 등록</button> <!-- 등록 버튼 추가 -->\r\n");
      out.write("        <table>\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <th>사원번호</th>\r\n");
      out.write("                <th>이름</th>\r\n");
      out.write("                <th>직급</th>\r\n");
      out.write("                <th>연락처</th>\r\n");
      out.write("                <th>동작</th> <!-- 새로운 열 추가 -->\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");
 
            	for(int i=0;i<emplist.size();i++){
            		EmpVo temp = emplist.get(i);
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("            	<td>");
      out.print(temp.getEmployee_id() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(temp.getLast_name() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(temp.getJob_id() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(temp.getPhone_number() );
      out.write("</td>\r\n");
      out.write("                <td><button onclick=\"handleButtonClick(0)\">수정 처리</button> <!-- 버튼 추가 -->\r\n");
      out.write("                <button onclick=\"handleButtonClick(0)\">삭제 처리</button><!-- 버튼 추가 -->\r\n");
      out.write("                \r\n");
      out.write("                </td> <!-- 상세보기 버튼 추가 -->\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

            	}
            
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            <!-- 다른 직원들의 정보도 추가할 수 있습니다. -->\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("      function handleAddButtonClick() {\r\n");
      out.write("           location.href=\"empform.jsp\";\r\n");
      out.write("       }\r\n");
      out.write("   </script>\r\n");
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
