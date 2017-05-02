<%@page session="true" %>
<%@include file="../../header.jsp" %>

<div class="container-fluid">
    <div class="row">

        <%@include file="../adminSidebar.jsp" %>

        <main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3">
            <c:url value="/j_spring_security_logout" var="logoutUrl"/>
            <form action="${logoutUrl}" method="post" id="logoutForm">
                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}"/>
            </form>
            <script>
                function formSubmit() {
                    document.getElementById("logoutForm").submit();
                }
            </script>
            <h1>

                Delete Route

                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <a href="javascript:formSubmit()" class="pull-right"> Logout</a>
                </c:if>
            </h1>

            <div class="container-fluid">
                <div class="rows">

                    <main class="col-sm-11 offset-sm-1 col-md-11 offset-md-1 pt-3 home">

                    </main>
                </div>
            </div>


        </main>
    </div>
</div>

<%@include file="../../footer.jsp" %>