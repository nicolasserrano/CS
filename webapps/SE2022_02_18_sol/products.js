//products.js
//alert("File products.js")

tables = document.getElementsByTagName("table");
console.log("Version 1.1")
console.log("tables.length: " + tables.length)
for (i=0; i< tables.length; i++) {
    console.log("table " + i)
    edit = document.createElement("input");

    edit.setAttribute("type", "button");
    edit.setAttribute("value", "Edit");
    edit.setAttribute("onclick", "editFunction(this)");
    cell=tables[i].getElementsByTagName("tr")[4].getElementsByTagName("td")[1]
    cell.appendChild(edit)
}
function editFunction(buttonEl) {
    console.log(buttonEl.value);
    td = buttonEl.parentElement;
    priceSpan = td.getElementsByTagName("span")[0];
    priceValue = priceSpan.innerHTML;
    priceSpan.innerHTML = "";
    // create the input
    inputEl = document.createElement("input");
    inputEl.name= "price";
    inputEl.value= priceValue;
    priceSpan.appendChild(inputEl);
    buttonEl.value = "Modify price";
    buttonEl.setAttribute("onclick", "displayPrice(this)");
}
function displayPrice(buttonPrice) {
    price = buttonPrice.parentElement.getElementsByTagName("span")[0].getElementsByTagName("input")[0].value;
    name = buttonPrice.parentElement.parentElement.parentElement.getElementsByTagName("tr")[0].getElementsByTagName("td")[0].innerHTML;
    alert("Product: " + name + " price: " + price);
}