function canvasJS(){
    canvas='<canvas id="myCanvas" width="400" height="300" style="border:1px solid #000000;">Your browser does not support the HTML5 canvas tag.</canvas>';
    document.getElementById('out').innerHTML = canvas;
    var c = document.getElementById("myCanvas");
    var ctx = c.getContext("2d");
    ctx.translate(100,120);
    return ctx;
}
function drawJS(D){
    if (D.type=='line'){
        ctx.moveTo(D.P1.x,D.P1.y);
        ctx.lineTo(D.P2.x,D.P2.y);
        ctx.stroke();
    }
    else if (D.type=='circle'){
        pi=3.14159265;
        ctx.beginPath();
        ctx.arc(D.x,D.y,D.r,2*pi,0);
        ctx.stroke();
    }
    else if (D.type=='arc'){
        ctx.beginPath();
        ctx.arc(D.p.x,D.p.y,D.r,-D.angle,0);
        ctx.stroke();
    }
    else if (D.type=='text'){
        ctx.font = "30px Arial";
        ctx.fillText(D.txt,D.p.x,D.p.y);
    }
    else if (D.type=='polyline'){
        for(var i=0; i<D.points.length-1; i++){
        drawJS(line(D.points[i],D.points[i+1]));
        }
    }
    else if (D.type=='polygon'){
        drawJS(line(D.points[0],D.points[D.points.length-1]));
        for(var i=0; i<D.points.length-1; i++){
        drawJS(line(D.points[i],D.points[i+1]));
        }
    }
}