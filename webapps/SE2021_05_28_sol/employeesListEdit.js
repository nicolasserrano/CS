    console.log("File: employeesListEdit.js");
    
function createButtons() {
    table0 = document.getElementsByTagName("table")[0];
    tableRows = table0.getElementsByTagName("tr");
    for (var i=0; i<tableRows.length; i++){
        tds = tableRows[i].getElementsByTagName("td");
        // create button
        edit = document.createElement("button");
        edit.innerHTML = "Edit"
        edit.setAttribute("onclick", "createForm("+  i + ")");
        tds[1].appendChild(edit);
    }
}
createButtons();
//        var spanElement = tableRows[i].getElementsByTagName("span")[0];

function createForm(id) {
    console.log("id: " + id);
    // get the second cell
    currentRow = table0.getElementsByTagName("tr")[id];
    var tdElement = currentRow.getElementsByTagName("td")[1];
    var spanElementId = tdElement.getElementsByTagName("span")[0].innerText;
    var spanElementFirstName = tdElement.getElementsByTagName("span")[1].innerText;
    var spanElementLastName = tdElement.getElementsByTagName("span")[2].innerText;
    var spanElementExtension = tdElement.getElementsByTagName("span")[3].innerText;
    tdElement.innerHTML = "";
    // create the form
    formEl = document.createElement("div");
    formEl.action = "ModifyName";
    formEl.method = "GET";
    tdElement.appendChild(formEl);
    // create the input id (hidden)
    idEl = document.createElement("input");
    idEl.name= "employeeId";
    idEl.value= spanElementId;
    idEl.type = "text";
    formEl.appendChild(idEl);
    // create the input firstName
    firstNameEl = document.createElement("input");
    firstNameEl.name= "firstName";
    firstNameEl.value= spanElementFirstName;
    firstNameEl.type = "text";
    formEl.appendChild(firstNameEl);
    // create the input lastName
    lastNameEl = document.createElement("input");
    lastNameEl.name= "lastName";
    lastNameEl.value= spanElementLastName;
    lastNameEl.type = "text";
    formEl.appendChild(lastNameEl);
    // create thebr
    brEl = document.createElement("br");
    formEl.appendChild(brEl);
    // create the input extension
    extensionEl = document.createElement("input");
    extensionEl.name= "extension";
    extensionEl.value= spanElementExtension;
    formEl.appendChild(extensionEl);
    // create the submit
    send = document.createElement("input");
    send.setAttribute("type", "submit");
    send.setAttribute("value", "Save");
    send.setAttribute("onclick", "updateName(this)");
    formEl.appendChild(send);
}

function updateName(buttonElement) {    
    var request = new XMLHttpRequest();
    id = document.getElementsByName("employeeId")[0].value;
    firstName = document.getElementsByName("firstName")[0].value;
    lastName = document.getElementsByName("lastName")[0].value;
    extension = document.getElementsByName("extension")[0].value;
    request.open('GET', 'ModifyName?employeeId=' + id + '&firstName=' + firstName + '&lastName=' + lastName + '&extension=' + extension, true);
    request.onload = function() {
      if (request.status >= 200 && request.status < 400) {
        console.log(request.responseText);
        divMessage = document.createElement("div");
        var text = document.createTextNode(request.responseText);
        divMessage.appendChild(text);
        buttonElement.parentElement.appendChild(divMessage);
      }
    };
    request.send();
    return false;
}
