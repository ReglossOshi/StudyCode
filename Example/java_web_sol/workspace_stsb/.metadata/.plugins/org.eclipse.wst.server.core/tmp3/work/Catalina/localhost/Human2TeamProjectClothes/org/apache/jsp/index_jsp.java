/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-01 10:23:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1706782985147L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1706671901141L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- 차트.js 라이브러리 -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n");
      out.write("<script defer type=\"text/javascript\" src=\"js/chart.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("<link rel=\"icon\" href=\"image/icons.png\">\r\n");
      out.write("<link >\r\n");
      out.write("<title>의류 생산 관리 시스템</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/header.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"logo\">\r\n");
      out.write("			<a href=\"index.jsp\" class=\"logodiv\">\r\n");
      out.write("				<img src=\"image/icons.png\" alt=\"icon\">\r\n");
      out.write("				<div class=\"logoname\">의류 생산 관리</div>\r\n");
      out.write("			</a>	\r\n");
      out.write("			<div class=\"login\">\r\n");
      out.write("				<button>로그인</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/menu.css\">\r\n");
      out.write("<!-- 메뉴 아이콘 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("<title>의류 생산 관리 시스템</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"round\">\r\n");
      out.write("		<div id=\"menu\">\r\n");
      out.write("        <input type=\"checkbox\" id=\"menubtn\">\r\n");
      out.write("        <label for=\"menubtn\" id=\"menubtnlabel\"><span class=\"material-symbols-outlined\">menu</span></label>\r\n");
      out.write("        <ul id=\"menuUl\">\r\n");
      out.write("            <li><a href=\"#\" class=\"dir\"><span class=\"material-symbols-outlined dir2\">menu_book</span> 주문 의뢰서</a></li>\r\n");
      out.write("            <li><a href=\"store.jsp\" class=\"dir\"><span class=\"material-symbols-outlined dir2\">inventory_2</span> 입고 등록</a></li>\r\n");
      out.write("            <li><a href=\"inventory.jsp\" class=\"dir\"><span class=\"material-symbols-outlined dir2\">inventory_2</span> 재고 관리</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"dir\"><span class=\"material-symbols-outlined dir2\">inventory_2</span> 제품 관리</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"dir\"><span class=\"material-symbols-outlined dir2\">inventory_2</span> 월별 매출 관리</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		import Chart from 'chart.js/auto';\r\n");
      out.write("		import { getRelativePosition } from 'chart.js/helpers';\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"main\">\r\n");
      out.write("		<div class=\"banner\"><div>공사중</div></div>\r\n");
      out.write("		<div class=\"chart\">\r\n");
      out.write("	  		<canvas id=\"myChart\" width=\"400\" height=\"400\"></canvas>\r\n");
      out.write("	  		<canvas id=\"circleChart\" width=\"400\" height=\"400\"></canvas>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  const ctx = document.getElementById('myChart');\r\n");
      out.write("\r\n");
      out.write("  new Chart(ctx, {\r\n");
      out.write("    type: 'line',\r\n");
      out.write("    data: {\r\n");
      out.write("      labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],\r\n");
      out.write("      datasets: [{\r\n");
      out.write("        label: '# of Votes',\r\n");
      out.write("        data: [12, 19, 3, 5, 2, 3],\r\n");
      out.write("        borderWidth: 1\r\n");
      out.write("      }]\r\n");
      out.write("    },\r\n");
      out.write("    options: {\r\n");
      out.write("    	animations: {\r\n");
      out.write("    	      tension: {\r\n");
      out.write("    	        duration: 1000,\r\n");
      out.write("    	        easing: 'linear',\r\n");
      out.write("    	        from: 1,\r\n");
      out.write("    	        to: 0,\r\n");
      out.write("    	        loop: true\r\n");
      out.write("    	      }\r\n");
      out.write("    	    },\r\n");
      out.write("    	responsive:false,\r\n");
      out.write("      scales: {\r\n");
      out.write("        y: {\r\n");
      out.write("          beginAtZero: true\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  const ctx2 = document.getElementById('circleChart');\r\n");
      out.write("\r\n");
      out.write("  new Chart(ctx2, {\r\n");
      out.write("    type: 'doughnut',\r\n");
      out.write("    data: {\r\n");
      out.write("      labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],\r\n");
      out.write("      datasets: [{\r\n");
      out.write("        label: '# of Votes',\r\n");
      out.write("        data: [12, 19, 3, 5, 2, 3],\r\n");
      out.write("        borderWidth: 1\r\n");
      out.write("      }]\r\n");
      out.write("    },\r\n");
      out.write("    options: {\r\n");
      out.write("    	animations: {\r\n");
      out.write("    	      tension: {\r\n");
      out.write("    	        duration: 1000,\r\n");
      out.write("    	        easing: 'linear',\r\n");
      out.write("    	        from: 1,\r\n");
      out.write("    	        to: 0,\r\n");
      out.write("    	        loop: true\r\n");
      out.write("    	      }\r\n");
      out.write("    	    },\r\n");
      out.write("    	responsive:false,\r\n");
      out.write("      scales: {\r\n");
      out.write("        y: {\r\n");
      out.write("          beginAtZero: true\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
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
