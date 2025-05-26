console.log("countryCustomers.js");

function countryCustomers(country) {
    console.log("country: " + country);
    var request = new XMLHttpRequest();
    request.open('GET', 'CustormersCount?country=' + country, true);
    request.onload = function() {
        if (request.status >= 200 && request.status < 400) {
            console.log(request.responseText);
            alert("Number of customers in " + country + ": " + request.responseText);
        }
    }
    request.send();
}