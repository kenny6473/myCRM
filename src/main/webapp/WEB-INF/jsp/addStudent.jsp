<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    /*
    *http://localhost:8080/ch07_ssm/
    * */
        String basePath = request.getScheme()+"://"+request.getServerName()+
        ":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>注册学生</title>
    <base href=<%=basePath%>/>
</head>
<body>
    <div align="center">
        <form action="student/addStudent.do" method="post">
            <table>
                <tr>
                    <td>姓名</td>
                    <td><input type="text" name="name"></td>
                </tr>

                <br>
                    <td>年龄</td>
                    <td><input type="text" name="age"></td>
                <tr/>
                <br>
                <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="submit" value="注册"></td>
                <tr/>
            </table>
        </form>
    </div>
</body>
</html>
