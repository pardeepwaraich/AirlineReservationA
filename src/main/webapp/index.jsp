<%@include file="WEB-INF/views/header.jsp"%>

<div class="container-fluid">
    <div class="rows">

        <main class="col-sm-11 offset-sm-1 col-md-11 offset-md-1 pt-3 home">
            <h1>Search Flights</h1>

            <form class="form-inline" method="get" action=${pageContext.request.contextPath}/searchResults>
                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" name="source" placeholder="Source" required="required">
                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" name="destination" placeholder="Destination" required="required">
                <input type="date" id = "datepicker" class="form-control mb-3 mr-sm-3 mb-sm-1" name="ddate" required="required">

                <select class="form-control mb-3 mr-sm-3 mb-sm-1" id="exampleSelect1" required="required" name="noOfPassengers">
                    <option value=""> No.</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>

                <input type="submit" class="btn btn-primary submit" />
            </form>
        </main>
    </div>
</div>

<%@include file="WEB-INF/views/footer.jsp"%>