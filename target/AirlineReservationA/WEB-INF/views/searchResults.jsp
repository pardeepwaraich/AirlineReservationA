<%@include file="header.jsp" %>
<div class="container-fluid">
    <div class="row">
        <nav class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Overview <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Reports</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Analytics</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Export</a>
                </li>
            </ul>

            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link" href="#">Nav item</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Nav item again</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">One more nav</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Another nav item</a>
                </li>
            </ul>

            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link" href="#">Nav item again</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">One more nav</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Another nav item</a>
                </li>
            </ul>
        </nav>

        <main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3">
            <h1>Search Results</h1>

            <div class="container">

                <c:forEach var="flight" items="${listOfFlights}">
                    <form action=${pageContext.request.contextPath}/reviewSelection?flightid=${flight.id}&noOfPassengers=${noOfPassengers} method="post">
                        <div class="result-row row">
                            <div class="price col-md-2">
                                <h3>$${flight.price} </h3>
                            </div>
                            <div class="details col-md-7">
                                <ul>
                                    <li class="row">
                                        <span class="time takeoff col-md-2"> ${flight.dept_time}pm </span>
                                        <span class="arrow col-md-2"> --> </span>
                                        <span class="time land col-md-2"> ${flight.arrival_time}pm </span>
                                        <span class="duration col-md-2"> ${flight.journey_duration} </span>
                                    </li>
                                    <li class="row">
                                        <span class="airport col-md-2"> ${flight.source} </span>
                                        <span class="arrow col-md-2"> --> </span>
                                        <span class="airport col-md-2"> ${flight.destination} </span>
                                    </li>
                                </ul>

                            </div>
                            <div class="book-now col-md-2">
                                <input type="submit" class="btn btn-primary" value="Book Now" />
                            </div>
                        </div>
                    </form>
                </c:forEach>
            </div>
        </main>
    </div>
</div>
<%@include file="footer.jsp" %>