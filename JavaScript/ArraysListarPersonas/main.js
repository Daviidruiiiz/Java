const array = [];
const nombresInput = document.getElementById("nombres");
const addButton = document.getElementById("add");
const buscarInput = document.getElementById("buscar");
const listaElement = document.getElementById("lista");
const estaEnListaElement = document.getElementById("isInList");
console.log(addButton)

addButton.addEventListener("click", add);

function actualizarLista() {
  listaElement.innerHTML = '';
  array.forEach(function (nombre) {
    const li = document.createElement('li');
    li.textContent = nombre;
    listaElement.appendChild(li);
  });
}

function add() {
  const nombre = nombresInput.value.trim();
  if (nombre) {
    array.push(nombre);
    array.sort();
    nombresInput.value = '';
    console.log(array);
    actualizarLista()
  }
}

buscarInput.addEventListener("click", search);

function search() {
  var index = array.indexOf(buscarInput.value);
  if (index == -1) {
    estaEnListaElement.textContent = buscarInput.value() + " No esta en la lista";
  } else {
    estaEnListaElement.textContent = buscarInput.value() + " esta en la lista";
  }
}
