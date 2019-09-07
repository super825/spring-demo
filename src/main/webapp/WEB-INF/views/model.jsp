<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
请求域的值：${requestScope.emp}<br/>
会话域的值：${sessionScope.emp}<br/>
<!-- EL语言定义了11个隐式对象,它们都是java.util.Map类型,网页制作者可通过它们来便捷地访问web应用中的特定数据.图12-1对这11个隐式对象作了说明.

隐式对象的固定变量名                       类型                                                    说明    
application                   java.util.Map                 把web应用范围内的属性名和属性值进行映射
cookie                        java.util.Map                 把客户请求中的Cookie名和Cookie对象进行映射
header                        java.util.Map                 把HTTP请求头部的项目名和项目值进行映射,例如:${header.host}等价于<%-- <%=request.getHeader("host")%> --%>
headerValues                  java.util.Map                 把HTTP请求头部的项目名和所有匹配的项目值的数组进行映射,例如:${headerValues["accept-language"]}等价于<%-- <%=request.getHeaders("accept-language")%> --%>
initParam                     java.util.Map                 把web应用的初始化参数名和参数值进行映射    

pageContext                   java.util.Map                 表示javax.servlet.jsp.PageContext对象 
pageScope                     java.util.Map                 把页面范围内的属性名和属性值进行映射    
param                         java.util.Map                 把客户请求中的请求参数名和参数值进行映射
paramValues                   java.util.Map                 把客户请求中的请求参数名和所有匹配的参数值数组进行映射,例如:${paramValues.username}等价于<%-- <%=request.getParameters("username")%> --%>
requestScope                  java.util.Map                 把请求范围内的属性名和属性值进行映射
sessionScope                  java.util.Map                 把会话范围内的属性名和属性值进行映射
-->
</body>
</html>