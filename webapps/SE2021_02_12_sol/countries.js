// JavaSript file
// alert("countries.js file, remove or comment this line - Copy solution")
table=document.getElementById("countryTable");
trArray=table.getElementsByTagName("tr");
for (i=1; i< trArray.length; i++) {
    td = document.createElement("td");
    trArray[i].appendChild(td);
    createForm(td, i);
}

function createForm(tdNode, id) {
    formEl = document.createElement("form");
    formEl.action = "InsertPopulation";
    formEl.method = "GET";
    tdNode.appendChild(formEl);
    // create the input id (hidden)
    idEl = document.createElement("input");
    idEl.name= "id";
    idEl.value= Number(id);
    idEl.type = "hidden";
    formEl.appendChild(idEl);
    // create the input population
    inputEl = document.createElement("input");
    inputEl.name= "population";
    inputEl.placeholder = "Insert Population";
    formEl.appendChild(inputEl);
    // create the submit
    send = document.createElement("input");
    send.setAttribute("type", "submit");
    send.setAttribute("value", "Add Population");
    formEl.appendChild(send);
}
