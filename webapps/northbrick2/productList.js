tableEl = document.getElementById('productTable');
function newProduct() {
    console.log("Function newProduct");
    

    var tr1 = document.createElement("TR");
    tableEl.appendChild(tr1);
    createCell(tr1, 'id');
    createCell(tr1, 'name');
    createCell(tr1, 'supplier');
    createCell(tr1, 'price');
    var td1 = document.createElement("TD");
    var in1 = document.createElement("INPUT");
    in1.setAttribute("type", 'button');
    in1.setAttribute("value", 'Save');
    td1.appendChild(in1);
    tr1.appendChild(td1);
}
function createCell(tr1, name) {
        var td1 = document.createElement("TD");
        var in1 = document.createElement("INPUT");
        in1.setAttribute("name", name);
        in1.setAttribute("placeholder", name);
        td1.appendChild(in1);
        tr1.appendChild(td1);
}
function addNew() {
    var in1 = document.createElement("INPUT");
    in1.setAttribute("type", 'button');
    in1.setAttribute("name", 'Save');
    in1.onclick = function() {newProduct();};
    in1.setAttribute("value", 'Add product');
    document.body.insertBefore(in1, tableEl);
}
addNew();