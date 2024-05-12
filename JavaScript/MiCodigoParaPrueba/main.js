contador.addEventListener("click", function() {
    var contador = document.getElementById("contador");
    var clicks = document.getElementById("clicks");
    var pesado = document.getElementById("pesado");
    var gif = document.getElementById("gif");

    clicks.value++;
    if (clicks.value >= 10){
        document.body.style.backgroundColor = "red" 
    }
    if (clicks.value >= 20){
    document.body.style.backgroundColor = "blue";
    }
    if (clicks.value >= 30){
        document.body.style.backgroundColor = "green";
        }
    if (clicks.value >= 40){
        document.body.style.backgroundColor = "purple";
        }
    if (clicks.value >= 50){
        document.body.style.backgroundColor = "#60EB85";
        pesado.textContent = "Eres un poco pesado... deja de clickar"
        document.getElementById('gif').innerHTML = '<embed src="https://media.tenor.com/sxLqFDLck4wAAAAj/fake-peppino-scream.gif" type="">';
        }
});