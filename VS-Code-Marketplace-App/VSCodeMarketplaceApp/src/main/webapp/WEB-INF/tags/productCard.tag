<%@ attribute name="product" required="true" type="com.example.demo.app.models.entityModels.ProductModel" %>

  <div class="d-flex col-md-2 px-1 mb-3">
    <a class="card mx-1" style="text-decoration:none; color: black" href="/pdp/${product.id}">
      <img class="card-img-top" src="${product.img}" alt="Card image cap">
      <div class="card-block">
        <h4 class="card-title fs-5">${product.name}</h4>
        <p class="card-text fs-6 fw-light">${product.owner} </br> ${product.description} </p>
        <div>
        </div>
      </div>
    </a>
  </div>