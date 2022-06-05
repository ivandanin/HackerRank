<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>


      <!DOCTYPE html>
      <html lang="en">

      <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product Details</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous" />
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" />

      </head>

      <body style="background-color: #eee;">

        <tags:navbar />

        <section>
          <div class="container py-5">
            <div class="row justify-content-center">
              <div class="col-md-8 col-lg-6 col-xl-4">
                <div class="card text-black">
                  <i class="pt-3 pb-1 px-3"></i>
                  <img class="card-image" alt="" src="${productModel.img}"
                    style="height: 240px; width: 240px; align-self: center;">
                  <div class="card-body">
                    <div class="text-center">
                      <h5 class="card-title">${productModel.name}</h5>
                      <p class="text-muted mb-4">${productModel.owner}</p>
                      <p class="text-muted mb-4">${productModel.description}</p>
                      <a type="button" class="btn btn-login btn-success" href="${productModel.downloadLink}">
                        Install
                      </a>
                      <p></p>
                    </div>
                    <div>
                      <div class="d-flex justify-content-between">
                      </div>
                      <div class="ux-item-shortdesc"></div>
                      <div class="d-flex justify-content-between">
                        <span>Version</span><span>${productModel.version}</span>
                      </div>

                      <div class="d-flex justify-content-between">
                        <span>Repo link</span>
                        <span>
                          <a href="https://github.com/${productModel.repoName}">${productModel.repoName}</a>
                        </span>
                      </div>
                      <div class="d-flex justify-content-between">
                        <span>Number of issues</span>
                        <span>${gitHub.numberOfIssues}</span>
                      </div>
                      <div class="d-flex justify-content-between">
                        <span> Number of pull requests</span><span>${gitHub.numberOfPullRequests}</span>
                      </div>
                      <div class="d-flex justify-content-between">
                        <span>Last commit date</span><span>${gitHub.lastCommitDate}</span>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
        <div class="container">
          <tags:footer />
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
          crossorigin="anonymous"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <link rel="stylesheet" type="text/css" href="/css/app.css" />

      </body>

      </html>