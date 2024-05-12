    //Enlazamos los elementos DOM

        //Aqui pasamos el texto del input al parrafo
        const p = document.getElementById("changed");
        const color_change = document.getElementById("color_change");
        const cambiar = document.getElementById("cambiar");

        cambiar.addEventListener("click", function() {
            document.getElementById("changed").style.color = color_change.value
    });
