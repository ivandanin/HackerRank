//alert('hello');

var newDiv;

var input = document.getElementById("searchBox");
var searchForm = document.querySelector(".search-form");
input.addEventListener("input", function() {
    var searchedTerm = $(this).val();
    if(searchedTerm.length <= 3) {
    return;
    }
    // clean all elements with newDiv class
    newDiv.innerHTML = '';
    var url = '/autocomplete';
       var data = { term: searchedTerm};
       $.get(url, data)
           .done(function (data) {
               console.log(data)
               data.forEach(function(element) {
                newDiv = document.createElement('div');
                newDiv.classList.add("element")
                newDiv.innerHTML = element;
                searchForm.after(newDiv);
               })
           })
           .fail(function (jqXHR) {
               console.error(jqXHR.responseText);
        });
    }
    )

