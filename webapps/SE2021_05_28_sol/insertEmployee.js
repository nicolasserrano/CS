function insertEmployee() {    
    var request = new XMLHttpRequest();
    firstName = document.getElementsByName("firstName")[0].value;
    lastName = document.getElementsByName("lastName")[0].value;
    extension = document.getElementsByName("extension")[0].value;
    request.open('GET', 'InsertEmployee?json&firstName=' + firstName + '&lastName=' + lastName + '&extension=' + extension, true);
    request.onload = function() {
      if (request.status >= 200 && request.status < 400) {
        var employee = JSON.parse(request.responseText);
        console.log(request.responseText);
        formNew = document.getElementById("formNew");
        formNew.innerHTML = "<B>Inserted employee with Id = " + request.responseText;
//        document.getElementById("productName").innerHTML = product.productName;
//        document.getElementById("unitPrice").value = product.unitPrice;
      }
    };
    request.send();
}