
<%@ page language="Java" import="java.sql.*" %>      

<html>
<head>

<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="db" scope="request" class="logbean.LoginBean">
  <jsp:setProperty name="db" property="userName" value='<%=request.getParameter("userName")%>'/>
  <jsp:setProperty name="db" property="password" value='<%=request.getParameter("password")%>'/>
  <jsp:setProperty name="db" property="email" value='<%=request.getParameter("email")%>'/>
 </jsp:useBean>
<jsp:forward page="login">
  <jsp:param name="username" value="<%=db.getUserName()%>" />
  <jsp:param name="password" value="<%=db.getPassword()%>" />
  <jsp:param name="email" value="<%=db.getEmail()%>" />
</jsp:forward>
</body>
</html>