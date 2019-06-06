function createCategoryTable() {
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
        createListCell(tr1, data[i].categoryId);
        createListCell(tr1, data[i].categoryName);
        createListCell(tr1, data[i].description);
    }
}
function createListCell(tr1, value) {
        var td1 = document.createElement("TD");
        var textNode = document.createTextNode(value);
        td1.appendChild(textNode);
        tr1.appendChild(td1);
}
createCategoryTable();