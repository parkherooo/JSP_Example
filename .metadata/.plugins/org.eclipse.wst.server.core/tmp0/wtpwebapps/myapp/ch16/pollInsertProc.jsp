<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="ch16.PollMgr"/>
<jsp:useBean id="plBean" class="ch16.PollListBean"/>
<jsp:setProperty property="*" name="plBean"/>
<jsp:useBean id="piBean" class="ch16.PollItemBean"/>
<jsp:setProperty property="*" name="piBean"/>
<%
	boolean result = mgr.insertPoll(plBean, piBean);
	String msg = "설문 추가 실패"; 
	String url = "pollInsert.jsp";
	int num = plBean.getNum();
	if(result){
		msg = "설문 추가 성공";
		url = "pollList.jsp?num="+num;
	}
%>
<script>
	alert("<%=msg%>");
	location.href = "<%=url%>";
</script>