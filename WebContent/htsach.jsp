<%@page import="bean.sachbean"%>
<%@page import="bo.sachbo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
		<td>
		<%
		sachbo s = new sachbo();
		for(sachbean sach: s.getsach()){
			%>
			<a href="htsach.jsp?masach=<%=sach.getMasach()%> &tensach=<%=sach.getTensach()%>&tacgia=<%=sach.getTaciga()%>&gia=<%=sach.getGia()%>&anh=<%=sach.getAnh()%>"> <%=sach.getMasach() %>  </a> <hr>
		<%}%>
		</td>
		<td>
			Thong tin sach, hien thi ten sach gia;
			<% String masach = request.getParameter("masach");
			String tensach = request.getParameter("tensach");
			String tacgia = request.getParameter("tacgia");
			String gia = request.getParameter("gia");
			String anh = request.getParameter("anh");
			if(masach == null)
				out.print("chay lan dau...................");
			
								
			
			
			else{
				%>
				Thong tin sach co ma : <%=masach%><br>
				<img alt="" src="<%=anh%>"> <br>
				<%=tacgia %><hr>
			<%} %>
			
			
		</td>
		</tr>
	</table>

	
	
</body>
</html>