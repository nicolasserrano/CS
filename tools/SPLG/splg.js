function point (x,y){
  var P = {}
  P.type = 'point';
  P.x = x;
  P.y = -y;
  return P;
}
function dline(P1, P2){
  var obj_line = line(P1, P2);
  drawline(obj_line);
}
function line(P1, P2){
  var obj_line = {}
  obj_line.type = 'line';
  obj_line.p1 = P1;
  obj_line.p2 = P2;
  return obj_line;
}
function drawline(line){
  ctx.moveTo(line.p1.x,line.p1.y);
  ctx.lineTo(line.p2.x,line.p2.y);
  ctx.stroke();
}
function darc(P1, r, angle){
  var obj_arc = arc(P1, r, angle);
  drawarc(obj_arc);
}
function arc(P1, r, angle){
  var obj_arc = {}
  obj_arc.type = 'arc';
  obj_arc.p = P1;
  obj_arc.r = r;
  obj_arc.angle = angle;
  return obj_arc;
}
function drawarc(arc){
  ctx.beginPath();
  ctx.arc(arc.p.x,arc.p.y,arc.r,-arc.angle,0);
  ctx.stroke();
}
function translate(line,  tx, ty) {
  ctx.translate(tx,-ty);
  drawline(line);
  ctx.translate(-tx,ty);
}
function dtext(P1, text){
  var obj_text = gtext(P1, text);
  drawtext(obj_text);
}
function gtext(P1, text){
  var obj_text = {}
  obj_text.type = 'text';
  obj_text.p = P1;
  obj_text.text = text;
  return obj_text;
}
function drawtext(otext) {
  ctx.font = "30px Arial";
  ctx.fillText(otext.text,otext.p.x,otext.p.y);
}
function assemble() {
  var assembly = [];
  for (i = 0; i < arguments.length; i++) {
        assembly[i] = arguments[i];
  }
  return assembly;
}
function drawassembly(assembly) {
  for (i = 0; i < assembly.length; i++) {
    if (assembly[i] == 'line') {
      drawline(assembly[i]);
    } else if (assembly[i] == 'arc') {
      drawarc(assembly[i]);
    } else if (assembly[i] == 'text') {
      drawtext(assembly[i]);
    } else if (assembly[i] == 'line') {
      drawline(assembly[i]);
    } else {
      
    }
  }
}
