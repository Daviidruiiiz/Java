    //Enlazamos los elementos DOM

        //Aqui pasamos el texto del input al parrafo
        const euros = document.getElementById("euros");
        const dolares = document.getElementById("dolares");
        const ejecutar = document.getElementById("ejecutar");

        ejecutar.addEventListener("click", function() {
        dolares.value = euros.value * 2
    });


    //Enlazamos los elementos DOM aqui
    ejecutar2.addEventListener("click", function() {
        //Aqui pasamos el texto del input al parrafo
        const texto = document.getElementById("texto");
        const resultado = document.getElementById("resultado");
        const ejecutar2 = document.getElementById("ejecutar2");
        
        ejecutar2.addEventListener("click", function(){
            console.log(1);
            let resultado_final = texto.value;
            resultado.textContent = resultado_final;
            resultado.style = "color: red";
        }
    )});



    const precio = document.getElementById("precio");
    const iva = document.getElementById("iva");
    const calcular = document.getElementById("calcular");
    const resultado = document.getElementById("resultadoIva");
    

    calcular.addEventListener("click", calculariva);
    function calculariva() {
        console.log(2);
        let precioIva = parseFloat(precio.value);
        let ivaTotal = parseFloat(iva.value);
        let result = precioIva + precioIva * ivaTotal / 100;
        resultado.textContent = result;
    };

    const name_clie = document.getElementById("name");
    const material = document.getElementById("material");
    const dimensiones = document.getElementById("dimensiones");
    const comentarios = document.getElementById("comentarios");

    enviar.addEventListener("click", pedido);


    function pedido() {
        console.log(3)
        var nameclie_value = name_clie.value;
        var material_value = material.value;
        if (document.getElementById("diminuta").checked = true)
        dimensiones_value = "diminuta";
        else if(document.getElementById("media").cheked = true)
        dimensiones_value = "media";
        else(document.getElementById("grande").cheked = true);
        dimensiones_value = "grande";
       
        var comentarios_value = comentarios.value;
        document.getElementById("res_pedido").value = nameclie_value + " quiere una caja de " + material_value + " que sea " + dimensiones_value + " y tambien quiere " + comentarios_value

    }

        var numero = document.getElementById('numero');
        var send = document.getElementById('send');
        var resultadoRandom = document.getElementById('randomResultado');
        var rand = Math.floor(Math.random() * 6);
        var intentos = 0;
        

        console.log(4);

        send.addEventListener("click", function() {
            if(numero.value == rand){
                randomResultado.textContent = "Los numeros son iguales";

            }else if(intentos < 3){
                randomResultado.textContent = "No son el mismo numero";
                intentos++;

            }else{ 
                randomResultado.textContent = "Has perdido";
            };

        });

        const boton = document.getElementById("resultado");
        boton.disabled = true;




        parabtn = document.getElementById('parbtn')
    
        change_red.addEventListener("click", changeRGB);
        change_green.addEventListener("click", changeRGB);
        change_blue.addEventListener("click", changeRGB);


        function changeRGB(e){
            console.log(e.target)
            if (e.target.id == "change_red")
                parabtn.style.color = "red";
            if (e.target.id == "change_green")
                parabtn.style.color = "green";
            if (e.target.id == "change_blue")
                parabtn.style.color = "blue";
        }


        document.addEventListener("keydown", function(e) {
            if(e.key == "r") document.body.style.backgroundColor = "#FF0000";
            if(e.key == "g") document.body.style.backgroundColor = "#00FF00";
            if(e.key == "b") document.body.style.backgroundColor = "#0000FF";

        });

        const pulsada = document.getElementById("tecla");

        document.addEventListener("keydown", function(e) {
        tecla.textContent = "Has pulsado la tecla " + e.key;
        });  

        const d = new Date();
        const d2 = new Date("25-12-2023");
        document.getElementById("fecha1").innerHTML = d;
        document.getElementById("fecha2").innerHTML = d2;
        var Difference_In_Time = d.getTime() - date1.getTime(); 

