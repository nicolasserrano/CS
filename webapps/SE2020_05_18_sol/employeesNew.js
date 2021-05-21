titleH3 = document.getElementsByTagName("h3")[0];

// create button
var newButton = document.createElement("button");
newButton.innerHTML = "Add employee";
newButton.setAttribute("onclick", "createNewForm()");
titleH3.appendChild(newButton);

// create "form" area
//formDiv.action = "InsertEmployee";
//formDiv.method = "GET";
formDiv = document.createElement("DIV");
formDiv.setAttribute("id", "formNew");
titleH3.appendChild(formDiv);

function createNewForm() {
    console.log("Function createNewForm");
    formDiv.innerHTML  = "";
    
    createInput(formDiv, "First Name", "firstName");
    createInput(formDiv, "Last Name", "lastName");
    createInput(formDiv, "Extension", "extension");
    // create the submit
    send = document.createElement("input");
    send.setAttribute("type", "submit");
    send.setAttribute("value", "Send");
    send.setAttribute("onclick", "insertEmployee()");
    formDiv.appendChild(send);
}

function createInput(formDiv, labelText, name) {
    input = document.createElement("input");
    input.name= name;
    label = document.createElement("label");
    var text = document.createTextNode(labelText);
    label.appendChild(text);
    formDiv.appendChild(label);
    formDiv.appendChild(input);
}