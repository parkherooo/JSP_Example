/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-09-03 08:39:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch09;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;

public final class teamInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.Vector");
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
      ch09.TeamMgr mgr = null;
      mgr = (ch09.TeamMgr) _jspx_page_context.getAttribute("mgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (mgr == null){
        mgr = new ch09.TeamMgr();
        _jspx_page_context.setAttribute("mgr", mgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
	
	Vector<String> vlist = mgr.teamList();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Team Mgr</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function check() {\r\n");
      out.write("		f = document.frm;\r\n");
      out.write("		if(f.name.value==\"\"){\r\n");
      out.write("			alert(\"이름 입력하세요\");\r\n");
      out.write("			f.name.focus();\r\n");
      out.write("			return;//함수 빠져나옴\r\n");
      out.write("		}\r\n");
      out.write("		if(f.city.value==\"\"){\r\n");
      out.write("			alert(\"사는곳 입력하세요\");\r\n");
      out.write("			f.city.focus();\r\n");
      out.write("			return;//함수 빠져나옴\r\n");
      out.write("		}\r\n");
      out.write("		if(f.age.value==\"\"){\r\n");
      out.write("			alert(\"나이 입력하세요\");\r\n");
      out.write("			f.age.focus();\r\n");
      out.write("			return;//함수 빠져나옴\r\n");
      out.write("		}\r\n");
      out.write("		if(f.team.value==\"\"){\r\n");
      out.write("			alert(\"팀 입력하세요\");\r\n");
      out.write("			f.team.focus();\r\n");
      out.write("			return;//함수 빠져나옴\r\n");
      out.write("		}\r\n");
      out.write("		f.submit();//제출\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function check2() {\r\n");
      out.write("		document.frm.action = \"teamInsertProc2.jsp\";\r\n");
      out.write("		document.frm.submit();\r\n");
      out.write("	}\r\n");
      out.write("	function selectTeam(){\r\n");
      out.write("		document.frm.team.value = team;\r\n");
      out.write("	}\r\n");
      out.write("	function selectTeam1() {\r\n");
      out.write("		teamselect = document.getElementById(\"teamselect\");\r\n");
      out.write("		team = teamselect.options[teamselect.selectedIndex].value;  \r\n");
      out.write("		document.frm.team.value = team;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h1>Team Insert</h1>\r\n");
      out.write("<form name=\"frm\" method=\"post\" action=\"teamInsertProc.jsp\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("	<td width=\"50\" align=\"center\">이름</td>\r\n");
      out.write("	<td width=\"150\"><input name=\"name\" value=\"홍길동\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">사는곳</td>\r\n");
      out.write("	<td><input name=\"city\" value=\"부산\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">나이</td>\r\n");
      out.write("	<td ><input name=\"age\" value=\"27\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">팀명</td>\r\n");
      out.write("	<td>\r\n");
      out.write("		<input name=\"team\" size=\"10\">\r\n");
      out.write("		<select id = \"teamselect\" onchange=\"selectTeam1()\">\r\n");
      out.write("		<option>팀을 선택하세요</option>\r\n");
      out.write("		");
for(int i = 0; i<vlist.size(); i++){
      out.write("\r\n");
      out.write("		<option value=\"");
      out.print(vlist.get(i));
      out.write("\">\r\n");
      out.write("		");
      out.print(vlist.get(i) );
      out.write("</option>\r\n");
      out.write("		");
}
      out.write("\r\n");
      out.write("		</select>\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\" colspan=\"2\">\r\n");
      out.write("		<input type=\"button\" value=\"SAVE\" onclick=\"check()\">\r\n");
      out.write("		<input type=\"button\" value=\"SAVE2\" onclick=\"check2()\">\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form><p>\r\n");
      out.write("<a href=\"teamList.jsp\">LIST</a>\r\n");
      out.write("</div>\r\n");
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
