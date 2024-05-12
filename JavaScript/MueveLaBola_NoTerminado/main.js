function moveBall(){
    var ball = document.getElementById("ball");
    ball.style.top =  50;
    document.addEventListener("keydown", function(e) {
        if(e.key == "UP") ball.style.top = ball.style.top - 10;
        if(e.key == "DOWN") ball.style.top = ball.style.top + 10;
        if(e.key == "LEFT") ball.style.left = ball.style.left + 10;
        if(e.key == "RIGHT") ball.style.left = ball.style.left - 10;
    });    


}