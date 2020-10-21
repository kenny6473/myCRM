<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%
    /*
     *http://localhost:8080/ch07_ssm/
     * */
    String basePath = request.getScheme()+"://"+request.getServerName()+
            ":"+request.getServerPort()+request.getContextPath();
%>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <title>功能入口</title>
    <base href=<%=basePath%>/>
</head>
<body>
<div align="center">
    <p>smm整合例子</p>
    <img src="images/ssm.jpg">
    <table>
        <tr>
            <td>
                <a href="addStudent.jsp">注册学生</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="listStudent.jsp">查询学生</a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
