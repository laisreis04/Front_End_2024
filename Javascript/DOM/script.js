// Todos
// const doneTodos = document.getElementsByClassName('done')
// console.log(doneTodos)

// const checkbox = document.querySelectorAll('[type = "checkbox"]')
// console.log(checkbox)


// Pickles
// let name = document.querySelector('h1')
// name.innerText = 'Que horror'

// function allEvens(array){
//     return array.every(pares => pares %2 === 0)
// }

// console.log(allEvens([3,7,5,3,1])) //false
// console.log(allEvens([2,4,6,8])) //true
// console.log(allEvens([1,12,7,4,8])) //false

// const image = document.getElementById('imagem_doc')
// console.log(image)





const btnCor = document.getElementById('btnCor')  //Botão


function mudarCor(){

let r = Math.floor(Math.random() * 256)  //red
let g = Math.floor(Math.random() * 256)  //green
let b = Math.floor(Math.random() * 256)  //blue


//Criar uma cor

let novaCor = `rgb(${r},${g},${b})`   //rgb(15,254,0)


document.body.style.backgroundColor = novaCor;

const novoElemento = document.createElement('h1')  //Criar um novo elemento no html


document.body.appendChild(novoElemento)


novoElemento.textContent = novaCor

}



btnCor.addEventListener('click', mudarCor)






 









