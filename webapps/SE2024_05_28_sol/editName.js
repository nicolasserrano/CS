console.log("editName.js");

function editName(spanElement) {
    console.log("element: " + spanElement.innerText);
    var currentValue = spanElement.innerText;
    var form = document.createElement('form');
    form.setAttribute("action", "UpdateSupplier");
    form.setAttribute("method", "GET");
    var input = document.createElement('input');
    input.type = 'text';
    input.name = "companyName";
    input.value = currentValue;
    var iDinput = document.createElement('input');
    iDinput.type = 'hidden';
    iDinput.name = "id";
    var idSupplier = spanElement.parentElement.previousElementSibling.innerText; 
    iDinput.value = idSupplier;
    var submitButton = document.createElement('input');
    
    /* for Ajax */
    submitButton.type = 'button';
    submitButton.value = 'Save';
    submitButton.setAttribute("onclick", "ajaxFunction(this)");
    form.setAttribute("id", "id" + idSupplier);
    /* for Ajax */
    
    var textNode = document.createTextNode('Save');
    submitButton.appendChild(textNode);
    form.appendChild(input);
    form.appendChild(iDinput);
    form.appendChild(submitButton);
    
    // Replace the span element with the form
    spanElement.innerText = "";
    spanElement.appendChild(form);
    spanElement.removeAttribute("onmouseover");
}
    
    
function ajaxFunction(submitButton) {
    var request = new XMLHttpRequest();
    var id = submitButton.parentElement.id.value;
    var companyName = submitButton.parentElement.companyName.value;
    request.open('GET', 'UpdateSupplier?id=' + id + '&companyName=' + companyName, true);
    request.onload = function(submitButton) {
        if (request.status >= 200 && request.status < 400) {
            console.log(request.responseText);
            returnObject = JSON.parse(request.responseText);
            var spanElement = document.getElementById("id" + returnObject.id).parentNode;
            spanElement.innerHTML = returnObject.companyName;
        }
    }
    request.send();
}