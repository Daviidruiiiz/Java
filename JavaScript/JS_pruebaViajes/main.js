calcular.addEventListener("click", function() {
    var num_noches = document.getElementById("num_noches").value;
    var ciudades = document.getElementById("ciudades").value;
    var res_hotel = document.getElementById("res_hotel");
    var res_alquilar = document.getElementById("res_alquilar");
    var res_total = document.getElementById("res_total");

    let resultado_hotel = num_noches;
    res_hotel.value = resultado_hotel * ciudades;
    console.log(res_hotel.textContent)



let v_ciudades = document.getElementById("ciudades").value;
console.log(v_ciudades)
let res_viaje = document.getElementById("res_viaje");

if (
    v_ciudades === "Oviedo" ||
    v_ciudades === "Tokyo" ||
    v_ciudades === "Madrid" ||
    v_ciudades === "Barcelona" ||
    v_ciudades === "Paris"
) {
    if (v_ciudades === "Oviedo") {
        res_viaje.value = 15;
        res_hotel.value = 140 * num_noches;
    } else if (v_ciudades === "Tokyo") {
        res_viaje.value = 700;
        res_hotel.value = 200 * num_noches;
    } else if (v_ciudades === "Madrid") {
        res_viaje.value = 90;
        res_hotel.value = 140 * num_noches;
    } else if (v_ciudades === "Barcelona") {
        res_viaje.value = 90;
        res_hotel.value = 140 * num_noches;
    } else if (ciudades === "Paris") {
        res_viaje.value = 150;
        res_hotel.value = 200 * num_noches;
    }
}
console.log(res_viaje.value);





let resultado_alquiler = 40;
res_alquilar.value = resultado_alquiler;

    if (num_noches >= 3 && num_noches < 7) {
        res_alquilar.value = (num_noches.value * 40) - 20;
    }else if ( num_noches >= 7 ){
    res_alquilar.value =  (num_noches.value * 50) - 50;
    }else {
        num_noches.value = num_noches.value * 40;
    }


    res_total.value = parseInt (res_hotel.value) + parseInt(res_viaje.value) + parseInt(res_alquilar.value);
console.log(res_total)
})