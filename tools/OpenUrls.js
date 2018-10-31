  v=document.getElementsByTagName("a");
  for (i=0;i<v.length;i++) {
    //console.log('p' + ivgebtn + " " + vgebtn[ivgebtn].href);
    window.open(v[i].href,'p' + i);
    console.log('p' + i + " " + v[i].href);
  }
