<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Search Result page</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/resources/css/dashboard.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/signin.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
    <button class="navbar-toggler navbar-toggler-right hidden-lg-up" type="button" data-toggle="collapse"
            data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false"
            aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="${pageContext.request.contextPath}/">IMCS Airline</a>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/"> Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">About Us</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact Us</a>
            </li>
        </ul>
    </div>

    <sec:authentication var="principal" property="Authorities" />
    <%--<h1>${principal}</h1>--%>
    <c:if test="${principal == '[ROLE_ANONYMOUS]'}" >
        <a href="${pageContext.request.contextPath}/login" class="navbar-brand pull-right"> Login </a>
    </c:if>

    <c:if test="${principal == '[ROLE_ADMIN]'}" >
        <a href="${pageContext.request.contextPath}/admin" class="navbar-brand pull-right"> My Account </a>
    </c:if>

    <c:if test="${principal == '[ROLE_USER]'}" >
        <a href="${pageContext.request.contextPath}/user" class="navbar-brand pull-right"> My Account </a>
    </c:if>

</nav>