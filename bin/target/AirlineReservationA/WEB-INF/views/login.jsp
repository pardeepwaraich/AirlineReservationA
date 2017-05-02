<%@page session="true" %>
<%@include file="header.jsp" %>

<div class="container-fluid">
    <div class="rows">

        <main class="col-sm-11 offset-sm-1 col-md-11 offset-md-1 pt-3 home">

            <c:if test="${not empty error}">
                <div class="error">${error}</div>
            </c:if>
            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>

            <form name='loginForm'
                  action="<c:url value='/j_spring_security_check' />" method='POST' class="form-signin">

                <h2 class="form-signin-heading">Please sign in</h2>

                <input type="text" name="username" class="form-control" placeholder="Username" required autofocus>

                <input type="password" name="password" class="form-control" placeholder="Password" required>

                <button class="btn btn-lg btn-primary btn-block" type="submit" name="submit" value="submit">Sign in
                </button>

                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}"/>
            </form>
        </main>
    </div>
</div>

<%@include file="footer.jsp" %>