    function drawFunction(dataArg) {
        var p = document.currentScript;
        var sp = document.createElement("span");
        nr = Math.round(Math.random()*10000000)
        sp.setAttribute("id", "spPlot" + nr);
        p.parentNode.insertBefore(sp, p);
        options = {};
        options.target = '#spPlot' + nr;
        options.grid = true;
        options.data = [];
        options.data[0] = {};
        data0 = options.data[0];
        if (Object.prototype.toString.call(dataArg) == "[object String]") {
            data0.fn = dataArg;
        } else if (Object.prototype.toString.call(dataArg) == "[object Array]") {
            data0.points = dataArg;
            data0.fnType = 'points';
            data0.graphType = 'polyline';
        }
        functionPlot(options);
    }
