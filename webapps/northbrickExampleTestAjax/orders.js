tableOrder = document.getElementById('order');
tableDetail = document.getElementById('orderDetail');
function newOrderLine() {
    console.log("Function newOrderLine");
    

    var tr1 = document.createElement("TR");
    tableDetail.appendChild(tr1);
    inProductId = createCell(tr1, 'productId');
    inProductId.setAttribute("onChange", 'getData(this.value)');
//    createCell(tr1, 'productName');
    var tdName = document.createElement("TD");
    tdName.setAttribute("id", 'productName');
    tr1.appendChild(tdName);
//    <input id="ISBN" onChange="getData(this.value)" autofocus></input>
    createCell(tr1, 'unitPrice');
    createCell(tr1, 'quantity');
    createCell(tr1, 'discount');
    var td1 = document.createElement("TD");
    var in1 = document.createElement("INPUT");
    in1.setAttribute("type", 'submit');
    in1.setAttribute("value", 'Save');
    td1.appendChild(in1);
    tr1.appendChild(td1);
}
function createCell(tr1, name) {
        var td1 = document.createElement("TD");
        var in1 = document.createElement("INPUT");
        in1.setAttribute("name", name);
        in1.setAttribute("id", name);
        in1.setAttribute("placeholder", name);
        td1.appendChild(in1);
        tr1.appendChild(td1);
        return in1;
}
function addNew() {
    var in1 = document.createElement("INPUT");
    in1.setAttribute("type", 'button');
    in1.setAttribute("name", 'Save');
    in1.onclick = function() {newOrderLine();};
    in1.setAttribute("value", 'Add Line');
    document.body.insertBefore(in1, tableOrder);
}
addNew();
// function getData(code) {    
    // var request = new XMLHttpRequest();
    // request.open('GET', 'GetProductName?code=' + code, true);
    // request.onload = function() {
      // if (request.status >= 200 && request.status < 400) {
        // document.getElementById("productName").innerHTML = request.responseText;
      // }
    // };
    // request.send();
// }
function getData(code) {    
    var request = new XMLHttpRequest();
    request.open('GET', 'GetProductName?json&code=' + code, true);
    request.onload = function() {
      if (request.status >= 200 && request.status < 400) {
        var product = JSON.parse(request.responseText);
        document.getElementById("productName").innerHTML = product.productName;
        document.getElementById("unitPrice").value = product.unitPrice;
      }
    };
    request.send();
}
