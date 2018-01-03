function point(x,y){
    var N={};
    N.x=x;
    N.y=y;
    return N;
}
function circle(x,y,r) {
    var N={};
    N.type='circle';
    N.x=x;
    N.y=y;
    N.r=r;
    return N;
}
function line(P1,P2){
    var N={};
    N.type='line';
    N.P1=P1;
    N.P2=P2;
    return N;
}
function arc(P1,r,angle){
    var N={};
    N.type='arc';
    N.p=P1;
    N.r=r;
    N.angle=angle;
    return N;
}
function gtext(P1,txt){
    var N={};
    N.type='text';
    N.p=P1;
    N.txt=txt;
    return N;
}
function image(src){
    var N={};
    N.type='image';
    N.src=src;
    return N;
}
function polyline(/**/){
    var N={};
    N.type='polyline';
    N.points= arguments;
    return N;
}
function polygon(/**/){
    var N={};
    N.type='polygon';
    N.points= arguments;
    return N;
}