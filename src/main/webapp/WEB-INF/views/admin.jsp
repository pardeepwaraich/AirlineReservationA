<%@page session="true" %>
<%@include file="header.jsp" %>

<div class="container-fluid">
    <div class="row">

        <%@include file="admin/adminSidebar.jsp" %>

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
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    Welcome : ${pageContext.request.userPrincipal.name}
                    <a href="javascript:formSubmit()" class="pull-right"> Logout</a>
                </c:if>
            </h1>

            <div class="container-fluid">
                <div class="rows">

                    <main class="col-sm-11 offset-sm-1 col-md-11 offset-md-1 pt-3 home">

                        <h2>Welcome content: </h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras libero odio, suscipit eget dolor ut,
                            sodales consequat tellus. Suspendisse rhoncus congue magna et dictum. Nunc tempor nulla eu massa sagittis viverra.
                            Duis aliquam nec felis et egestas. Nullam ac dui eleifend, vehicula dolor et, imperdiet nisi.
                            Vestibulum congue pulvinar libero et tincidunt. Phasellus tincidunt est eget commodo dignissim.
                            Praesent eget tellus tristique erat euismod aliquet nec vel nulla. Mauris molestie felis non blandit interdum.
                            Proin rhoncus euismod tempus. Donec imperdiet ante ligula, et lacinia mi vulputate eget. Vivamus sed volutpat enim.
                            Cras velit mauris, porta sit amet cursus id, viverra sed massa. Praesent sapien ex, ullamcorper sed neque id, ornare
                            pretium elit.
                        </p>
                    </main>
                </div>
            </div>


        </main>
    </div>
</div>

<%@include file="footer.jsp" %>