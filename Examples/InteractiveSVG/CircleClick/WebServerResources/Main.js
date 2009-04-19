$(function() {
	$('#svgbasics').svg({onLoad: drawInitial});
});

function drawInitial(svg) {
	svg.describe('Example script01 - invoke an ECMAScript function from an onclick event'); 
	svg.script('function circle_click(evt) {\n' + '  var circle = evt.target;\n' + '  var currentRadius = circle.getAttribute("r");\n' + '  if (currentRadius == 100)\n' + '    circle.setAttribute("r", currentRadius*2);\n' + '  else\n' + '    circle.setAttribute("r", currentRadius*0.5);\n' + '}', 'text/ecmascript'); 
	svg.circle(300, 150, 100, {onclick: 'circle_click(evt)', fill: 'red'}); 
	svg.text(300, 280, 'Click on circle to change its size', {'font-family': 'Verdana', 'font-size': 35, 'text-anchor': 'middle'}); 
}
