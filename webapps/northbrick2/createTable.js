function createTable2() {
    parentNode = document.getElementById('list');
    
    var tableEl = document.createElement("TABLE");
    tableEl.setAttribute("id", "table1");
    tableEl.setAttribute("border", "1");
    parentNode.appendChild(tableEl);

    for (i = 0; i <data.length; i++) {
        var tr1 = document.createElement("TR");
        tableEl.appendChild(tr1);
        var tr1 = document.createElement("TR");
        tableEl.appendChild(tr1);
        createListCell(tr1, data[i].productId);
        createListCell(tr1, data[i].productName);
        createListCell(tr1, data[i].companyName);
        createListCell(tr1, data[i].unitPrice);
    }
}
function createListCell(tr1, value) {
        var td1 = document.createElement("TD");
        var textNode = document.createTextNode(value);
        td1.appendChild(textNode);
        tr1.appendChild(td1);
}
createTable2();