<%@include file="header.jsp" %>

<div class="container-fluid">

    <div class="container-fluid">
        <div class="rows">
            <main class="col-sm-11 offset-sm-1 col-md-11 offset-md-1 pt-3">
                <h1>Flight Details</h1>

                <div class="result-row row">
                    <div class="price col-md-2">
                        <h3>$${flighDetails.price} </h3>
                    </div>
                    <div class="details col-md-7">
                        <ul>
                            <li class="row">
                                <span class="time takeoff col-md-2"> ${flighDetails.dept_time}pm </span>
                                <span class="arrow col-md-2"> --> </span>
                                <span class="time land col-md-2"> ${flighDetails.arrival_time}pm </span>
                                <span class="duration col-md-2"> ${flighDetails.journey_duration} </span>
                            </li>
                            <li class="row">
                                <span class="airport col-md-2"> ${flighDetails.source} </span>
                                <span class="arrow col-md-2"> --> </span>
                                <span class="airport col-md-2"> ${flighDetails.destination} </span>
                            </li>
                        </ul>

                    </div>
                </div>

                <div class="grand-total row">
                    <div class="col-md-4 offset-md-8 text-right">
                        <h4> Grand Total </h4>
                        <h2> $${noOfPassengers * flighDetails.price}</h2>
                    </div>
                </div>
            </main>


            <main class="col-sm-11 offset-sm-1 col-md-11 offset-md-1 pt-3">
                <h1>Traveller(s) Details</h1>

                <c:forEach var="passenger" begin="1" end="${noOfPassengers}">
                    <div class="result-row row">

                        <div class="details col-md-7">

                            <form>
                                <div class="form-group row">
                                    <label class="col-sm-2 col-form-label">First Name*</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" required="required">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-2 col-form-label">Last Name</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-2 col-form-label">Date of Birth</label>
                                    <div class="col-sm-10">
                                        <input type="date" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-2 col-form-label">Email</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-2 col-form-label">Phone</label>
                                    <div class="col-sm-10">
                                        <input type="phone" class="form-control">
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </c:forEach>
                <div class="form-group row">
                    <div class="offset-sm-10 col-sm-2">
                        <button type="submit" class="btn btn-primary">Make Payment</button>
                    </div>
                </div>
            </main>
        </div>
    </div>
</div>

<%@include file="footer.jsp" %>