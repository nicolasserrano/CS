var paper
function canvasR(){
    paper = Raphael(0,0, 400, 300);
}
function drawR(D){
    if (D.type=='line'){
        var liner = paper.path("M" +D.P1.x +" " +D.P1.y +"L" +D.P2.x +" " +D.P2.y);
    }
    else if(D.type=='image'){
        var image= paper.image(D.src, 3, 4, 60, 20);
    }
    else if(D.type=='polyline'){
        for(var i=0; i<D.points.length-1; i++){
            drawR(line(D.points[i],D.points[i+1]));
        }
    }
    else if(D.type=='polygon'){
        drawR(line(D.points[0],D.points[D.points.length-1]));
        for(var i=0; i<D.points.length-1; i++){
            drawR(line(D.points[i],D.points[i+1]));
        }
    }
    else if(D.type=='circle') {
        var circle = paper.circle(D.x, D.y, D.r);
    }
    else if (D.type=='text') {
        var t = paper.text(D.p.x,D.p.y,D.txt);
        t.attr({"font-size": "30px", "font":"arial"});
    }
    else if (D.type=='arc'){ //No funciona del todo bien (Falta retocar)
        a=D.p.x+D.r;
        b=D.p.x-D.r;
        c=D.p.y-D.r;
        var arc = paper.path("M" +a +" " +D.p.y +"C" +a +" " +D.p.y +" " +D.p.x +" " +c +" " +b +" " +D.p.y);
    }
}