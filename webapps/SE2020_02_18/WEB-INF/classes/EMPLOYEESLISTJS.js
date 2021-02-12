

FilaTabla=document.getElementsByTagName("table")[0].getElementsByTagName("tr")

for (var i=1; i<FilaTabla.length; i++){



    var id = FilaTabla[i].firstElementChild.innerHTML;  
    var exte = FilaTabla[i].children[1].innerHTML;
    lastColumn = FilaTabla[i].lastElementChild;  
    boton = document.createElement("button");  
    boton.innerHTML = "Edit Extension"  
    lastColumn.appendChild(boton); 
    boton.setAttribute("onclick", "createForm('"+id+"', '"+exte+"')");
}

function createForm(Employeeid, extension){  


    f = document.createElement("form")   
    f.setAttribute("action", "UpdateExtension"); 
    f.setAttribute("method", "GET") 
    document.body.appendChild(f); 

    tablaForm = document.createElement("table"); 
    tablaForm.setAttribute("border", "1");
    tablaForm.setAttribute("style", "margin-top:10px;");
    f.appendChild(tablaForm); 




    r1 = document.createElement("tr"); 
    tablaForm.appendChild(r1); 

    cidtext = document.createElement("td"); 
    cidtext.innerHTML = "ID empleado" 
    r1.appendChild(cidtext); 

    Employeeid = document.createElement("td"); 
    Employeeid.innerHTML = Employeeid; 
    r1.appendChild(Employeeid);



    r2 = document.createElement("tr"); 
    tablaForm.appendChild(r2); 

    textName = document.createElement("td"); 
    textName.innerHTML = "extension"; 
    r2.appendChild(textName); 

    pname = document.createElement("td"); 
    r2.appendChild(pname); 


    inputname = document.createElement("input");
    inputname.setAttribute("id", "extension");
    inputname.setAttribute("value", exte)
    pname.appendChild(inputname)


    send = document.createElement("input");
    send.setAttribute("type", "submit");
    send.setAttribute("value", "Update");
    f.appendChild(send);
}
