tableRows = document.getElementsByTagName("table")[0].childNodes[1].children;
for (var i=1; i<tableRows.length; i++){
    var id = tableRows[i].firstElementChild.innerHTML;
    var name = tableRows[i].children[1].innerHTML;
    lastColumn = tableRows[i].lastElementChild;
    edit = document.createElement("button");
    edit.innerHTML = "Edit Name"
    lastColumn.appendChild(edit);
    edit.setAttribute("onclick", "createForm('"+id+"', '"+name+"')");
}

function createForm(productid, productname){

    
    f = document.createElement("form")
    f.setAttribute("action", "ProductNameEdit");
    f.setAttribute("method", "GET")
    document.body.appendChild(f);
    
    tab = document.createElement("table");
    tab.setAttribute("border", "1");
    tab.setAttribute("style", "margin-top:10px;");
    f.appendChild(tab);
    
    r1 = document.createElement("tr");
    tab.appendChild(r1);
    
    cidtext = document.createElement("td");
    cidtext.innerHTML = "Product ID"
    r1.appendChild(cidtext);
    
    productId = document.createElement("td");
    productId.innerHTML = productid;
    r1.appendChild(productId);
    
    hidd = document.createElement("input");
    hidd.setAttribute("type", "hidden");
    hidd.setAttribute("name", "id");
    hidd.setAttribute("value", id);
    r1.appendChild(hidd);
    
    r2 = document.createElement("tr");
    tab.appendChild(r2);
    
    pnameText = document.createElement("td");
    pnameText.innerHTML = "Product Name";
    r2.appendChild(pnameText);
    
    pname = document.createElement("td");
    r2.appendChild(pname);
    
    inputname = document.createElement("input");
    inputname.setAttribute("name", "productName");
    inputname.setAttribute("value", productname)
    pname.appendChild(inputname)
    
    send = document.createElement("input");
    send.setAttribute("type", "submit");
    send.setAttribute("value", "Send");
    f.appendChild(send);
}