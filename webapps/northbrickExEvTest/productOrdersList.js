    var h3 = document.createElement("H3");
    var textNode = document.createTextNode("Orders with the product");
    h3.appendChild(textNode);
    tableEl = document.getElementById('ordersTable');
    document.body.insertBefore(h3, tableEl);