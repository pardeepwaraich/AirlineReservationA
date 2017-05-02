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

                Add Route

                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <a href="javascript:formSubmit()" class="pull-right"> Logout</a>
                </c:if>
            </h1>

            <div class="container-fluid">
                <div class="rows">

                    <main class="col-sm-11 offset-sm-1 col-md-11 offset-md-1 pt-3 home">

                        <c:if test="${not empty successMessage}">
                            <div class="msg col-sm-4">${successMessage}</div>
                        </c:if>

                        <form name='addRouteForm' action="?success" method='POST'>
                            <div class="form-group row">
                                <div class="col-sm-3">
                                    <input type="text" name="source" class="form-control" placeholder="Source" required
                                           autofocus>
                                </div>
                            </div>

                            <div class="form-group row">
                                <div class="col-sm-3">
                                    <input type="text" name="destination" class="form-control" placeholder="Destination"
                                           required>
                                </div>
                            </div>

                            <div class="form-group row">
                                <div class="offset-sm-1 col-sm-2">
                                    <button type="submit" name="submit" class="btn btn-primary">Add</button>
                                </div>
                            </div>

                        </form>

                    </main>
                </div>
            </div>


        </main>
    </div>
</div>

<%@include file="../../footer.jsp" %>