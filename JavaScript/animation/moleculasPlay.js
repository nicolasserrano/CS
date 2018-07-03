var canvas = document.getElementById("myCanvas");
var ctx = canvas.getContext("2d");

ctx.clearRect(0, 0, canvas.width, canvas.height);

radio1 = 5
area1 = Math.PI*radio1*radio1
moleculas = 1;
count = 0;
cx = canvas.width / 2;
cy = canvas.height / 2;
t=0;


function drawMoleculas() {
  
  scaleT = document.getElementById('timeScale').value;
  intervalMs = document.getElementById('timems').value / 1000;
  dt = scaleT * intervalMs;
  t = t + Number(dt);
  moleculas = 200+3*t*t;
  document.getElementById('time').value = parseFloat(t).toFixed(2);
  document.getElementById('ft').value = parseFloat(moleculas).toFixed(0);
  //console.log("t: " + t + " mol: " + moleculas);
  while (count < moleculas) {
    count++;
    radioN = Math.sqrt(count)*radio1 * Math.random();
    angN = Math.random()*2*Math.PI;
    drawMolecula(cx + radioN * Math.cos(angN), cy + radioN * Math.sin(angN));
  }
}

function drawMolecula(x, y) {
  ctx.beginPath();
  ctx.fillStyle='rgb(' + Math.round(Math.random()*55 + 200) + ',' + Math.round(Math.random()*150) + ',' + Math.round(Math.random()*150) + ')';
  ctx.arc(x,y,radio1,0,2*Math.PI);
  ctx.fill();
}
function reset(button) {
    if (!paused) {
        playStop(button);
    }
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    t = 0;
    count = 0;
}