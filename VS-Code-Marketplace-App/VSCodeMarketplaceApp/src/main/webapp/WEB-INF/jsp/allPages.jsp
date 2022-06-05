<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

      <!DOCTYPE html>
      <html lang="en">

      <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>All Products</title>

        <c:url value="/css/app.css" var="jstlCss" />
        <link href="${jstlCss}" rel="stylesheet" />

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous" />
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" />
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      </head>

      <body>
        <tags:navbar />

        <div class="container">
          </br>
          <tags:search />
          </br>

          <div class="container">
            <h2>${count} Results</h2>
            <div class="btn-group shadow-0">
              <h4>Sort by:</h4>
              <select name="sortBy" class="sortBy" id="sortBy">
                <option value="name">Name</option>
                <option value="publisher">Publisher</option>
                <option value="date">Release Date</option>
                <option value="downloads">Downloads</option>
              </select>
            </div>

            <div class="container text-center my-4">
              <div class="row mx-auto my-auto">
                <div class="carousel-inner w-100" role="listbox">
                  <div class="carousel-item active">
                    <div class="row">
                      <c:forEach items="${products}" var="product">
                        <tags:productCard product="${product}" />
                      </c:forEach>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <tags:footer />
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
          crossorigin="anonymous"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


        <script>
          $("#sortBy").change(
            function () {
              var sortBy = $(this).find("option:selected").val();

              sortBy = sortBy
                ? sortBy
                : "";

              var query = sortBy == ""
                ? ""
                : "?sortBy=" + sortBy;

              var url = "/allPages";

              window.location.href = url + query;
            }
          );

          $("#sortBy").change(
            function () {
              var sortBy = $("#sortBy option:selected").text();
            }
          );
        </script>
      </body>

      </html>