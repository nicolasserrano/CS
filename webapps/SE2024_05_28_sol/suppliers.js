console.log("File suppliers.js");

table0 = document.getElementsByTagName("table")[0];
tableSpans = table0.getElementsByTagName("span");
createButtons();
function createButtons() {
    for (var i=0; i<tableSpans.length; i++){
        postalCodeValue = tableSpans[i].innerHTML;
        // create button
        edit = document.createElement("button");
        edit.innerHTML = "Edit"
        edit.setAttribute("onclick", "changeToEdit("+  i + ", " + postalCodeValue + ")");
        tableSpans[i].appendChild(edit);
    }
}

function changeToEdit(i, postalCode) {
    console.log("button: " + i + " postalCode: " + postalCode);
    tableSpans[i].innerHTML = "<input value=" + postalCode + "><button onclick='showValue(" + postalCode + "," +  i + ")'>Modifiy</button>";
}
function showValue(postalCode, i) {
    alert("Postal code changed from " + postalCode + " to " + tableSpans[i].getElementsByTagName("input")[0].value);
}