function createButtons() {
    table0 = document.getElementsByTagName("table")[0];
    tableRows = table0.getElementsByTagName("tr");
    for (var i=0; i<tableRows.length; i++){
        // create new td
        var tdEdit = document.createElement("td");
        tableRows[i].appendChild(tdEdit);
        // create button
        edit = document.createElement("button");
        edit.innerHTML = "Edit Extension"
        var spanElement = tableRows[i].getElementsByTagName("span")[0];
        var extension = spanElement.innerHTML;
        edit.setAttribute("onclick", "createForm('"+(i)+"', '"+extension+"')");
        tdEdit.appendChild(edit);
    }
}
//createButtons();
function createForm(id, extensionValue) {
    console.log("id: " + id + " ext: " + extensionValue);
    // get the second cell
    currentRow = table0.getElementsByTagName("tr")[id];
    var tdElement = currentRow.getElementsByTagName("td")[1];
    var spanElement = tdElement.getElementsByTagName("span")[0];
    spanElement.innerHTML = "";
    // create the form
    formEl = document.createElement("form");
    formEl.action = "UpdateExtension";
    formEl.method = "GET";
    spanElement.appendChild(formEl);
    // create the input id (hidden)
    idEl = document.createElement("input");
    idEl.name= "id";
    idEl.value= Number(id) + 1;
    idEl.type = "hidden";
    formEl.appendChild(idEl);
    // create the input extension
    inputEl = document.createElement("input");
    inputEl.name= "extension";
    inputEl.value= extensionValue;
    formEl.appendChild(inputEl);
    // create the submit
    send = document.createElement("input");
    send.setAttribute("type", "submit");
    send.setAttribute("value", "Update");
    formEl.appendChild(send);
}