// TODOS
// const doneTodos = document.getElementsByClassName('done')
// console.log(doneTodos)

// const checkbox = document.querySelectorAll('[type = "checkbox"]')
// console.log(checkbox)


// PICKLES
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


<<<<<<< HEAD



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
=======
// const doneTodos = document.getElementsByClassName('done')
// // const doneTodos = document.querySelectorAll('.done')
// console.log(doneTodos)

// const checkbox = document.querySelectorAll('[type = checkbox]')
// console.log(checkbox)

//GALINHA/OVO

// function mudarImagem(){
//     let myImage = document.getElementById('imagem_galinha')

//     myImage.getAttribute('src');

//     if(myImage.src === "https://media.istockphoto.com/id/1313823703/pt/foto/one-brown-chicken-egg-isolated-on-white-background.jpg?s=612x612&w=0&k=20&c=xwuuodcja84SvjrasjFDoor5Wo_3qT6OZ5VmtDs2RbQ="){
//         myImage.setAttribute('src', 'https://devsprouthosting.com/images/chicken.jpg')
//     }else{
//         myImage.setAttribute('src', "https://media.istockphoto.com/id/1313823703/pt/foto/one-brown-chicken-egg-isolated-on-white-background.jpg?s=612x612&w=0&k=20&c=xwuuodcja84SvjrasjFDoor5Wo_3qT6OZ5VmtDs2RbQ=") 
//     }
// }

//FLORESTA

// let texto = document.getElementById('container')
// texto.style.textAlign = 'center'

// let floresta = document.getElementById('floresta')
// floresta.style.width = '150px'
// floresta.style.borderRadius = '50%'

// RAINBOW
// const spanElements = document.querySelectorAll('span')

// const cores =  ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];

// spanElements.forEach((mudarSpan , index) => {
//     mudarSpan.style.backgroundColor = cores[index]
    
// });


//BUTTON
// const container = document.querySelector('.button-container');

// // Função para criar um botão
// function criarBotao(texto) {
//     const botao = document.createElement('button');
//     botao.textContent = texto;
//     botao.classList.add('btn', 'btn-danger'); // Adiciona classes do Bootstrap
//     return botao;
// }

// // Cria 100 botões e adiciona à div container
// for (let i = 1; i <= 100; i++) {
//     const novoBotao = criarBotao(`Botão ${i}`);
//     container.appendChild(novoBotao);
// }



//HELLO

// const btnHello = document.getElementById('helloBtn')
// const btnBye = document.getElementById('byeBtn')

// function hello(){
//     alert('Olá')
// }

// function bye(){
//     alert('Adeus')
// }

// btnHello.addEventListener('click',hello)
// btnBye.addEventListener('click', bye)



//MUDAR DE COR BODY
// const btnCor = document.getElementById('btnCor')

// function mudarCor(){

//     let r = Math.floor(Math.random() * 256) 
//     let g = Math.floor(Math.random() * 256)
//     let b = Math.floor(Math.random() * 256)

//     let corNova = `rgb(${r},${g},${b})`

//     document.body.style.backgroundColor = corNova

//     //Adicionar texto
//     const novoElemento = document.createElement('H1')
//     novoElemento.textContent = corNova
    
//     //Adicionar no HTML
//     document.body.appendChild(novoElemento)
// }


// btnCor.addEventListener('click', mudarCor)



>>>>>>> 435f4f7037ab4933f1407177ed6a7f1e9eb6f6d8















