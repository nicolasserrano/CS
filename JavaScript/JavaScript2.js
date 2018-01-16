function createButton(id) {
    parentNode = document.getElementById(id);
    buttonEl = document.createElement('button');
    var textNode = document.createTextNode("New button");
    buttonEl.appendChild(textNode);
    parentNode.appendChild(buttonEl);
}

function createTable1(id) {
    parentNode = document.getElementById(id);
    
    var tableEl = document.createElement("TABLE");
    tableEl.setAttribute("id", "table1");
    tableEl.setAttribute("border", "1");
    parentNode.appendChild(tableEl);

    var tr1 = document.createElement("TR");
    tableEl.appendChild(tr1);

    var td1 = document.createElement("TD");
    var textNode = document.createTextNode("cell 1");
    td1.appendChild(textNode);
    tr1.appendChild(td1);
}

function createTable2(id, rows, cols) {
    parentNode = document.getElementById(id);
    
    var tableEl = document.createElement("TABLE");
    tableEl.setAttribute("id", "table1");
    tableEl.setAttribute("border", "1");
    parentNode.appendChild(tableEl);

    for (i = 0; i <rows; i++) {
        var tr1 = document.createElement("TR");
        tableEl.appendChild(tr1);
        for (j = 0; j <cols; j++) {
            var td1 = document.createElement("TD");
            var textNode = document.createTextNode("cell " + i + "_" + j);
            td1.appendChild(textNode);
            tr1.appendChild(td1);
        }
    }
}

