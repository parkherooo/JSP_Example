<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="cmgr" class="guestbook.CommentMgr"/>
<jsp:useBean id="cbean" class="guestbook.CommentBean"/>
<jsp:setProperty property="*" name="cbean"/>
<%
	String flag = request.getParameter("flag");
	String method = request.getMethod();
	
	if(method.equals("POST")){
		if(flag.equals("insert")){
			cmgr.insertComment(cbean);
		} else if(flag.equals("delete")){
			cmgr.deleteComment(cbean.getCnum());
		}
	}
	response.sendRedirect("showGuestBook.jsp");
%>