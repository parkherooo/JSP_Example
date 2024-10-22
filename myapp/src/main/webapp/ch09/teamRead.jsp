<%@page import="ch09.MUtil"%>
<%@page import="ch09.TeamBean"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="ch09.TeamMgr"/>
<%
	int num = 0;
	TeamBean bean= null;
	if(request.getParameter("num")==null){
		//num 값이 넘어오지않음
		response.sendRedirect("teamList.jsp");
		return;
	} else if(!MUtil.isNumeric(request.getParameter("num"))){
		//num 값이 숫자형태로 넘어오지 않은경우
		response.sendRedirect("teamList.jsp");
		return;
	} else{
		num = MUtil.parseInt(request,"num");
		bean = mgr.getTeam(num);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Mgr</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div align="center">
<h1>Team Read</h1>
<table border="1">
	<tr>
		<td>번호</td>
		<td><%=bean.getNum()%></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=bean.getName()%></td>
	</tr>
	<tr>
		<td>사는곳</td>
		<td><%=bean.getCity()%></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><%=bean.getAge()%></td>
	</tr>
	<tr>
		<td>팀명</td>
		<td><%=bean.getTeam()%></td>
	</tr>
</table><p/>
<a href="teamList.jsp">LIST</a>&nbsp;&nbsp;
<a href="teamInsert.jsp">INSERT</a>&nbsp;&nbsp;
<a href="teamUpdate.jsp?num=<%=num%>">UPDATE</a>&nbsp;&nbsp;
<a href="teamDelete.jsp?num=<%=num%>">DELETE</a>&nbsp;&nbsp;
<a href="teamDelete?num=<%=num%>">DELETE2</a>&nbsp;&nbsp;
</div>
</body>
</html>