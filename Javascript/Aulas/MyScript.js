// const people = ['Scooby', "Velma", 'Daphne', 'Shaggy', 'Fred']

// for(let nome of people){
//     console.log(nome.toUpperCase())
// }


// planetas.unshift('Cesae')
// planetas.shift()
// planetas.shift()

// console.log(planetas)

//Exercicio 04
// const airplaneSeats = [
//     ['Ruth', 'Anthony', 'Stevie'],
//     ['Amelia', 'Pedro', 'Maya'],
//     ['Xavier', 'Ananya', 'Luis'],
//     ['Luke', null, 'Deniz'],
//     ['Rin', 'Sakura', 'Francisco']
//  ];

//  airplaneSeats[3][1] = 'Lais'

//  console.log(airplaneSeats)

// let product = {
//     nome:'Verniz Gel',
//     inStock: true,
//     price: 1.99,
//     colors:['vermelho','azul','verde']
// }



// // console.log(product.colors[2])

// //Novo valor
// product.price = 2.55
// console.log(product.price)

//Ciclos

// let numVezes = 1
// while(numVezes <= 26){
//     console.log("I know" + numVezes)
// numVezes++
// }

// for(let i = 25; i >= 5; i -= 5){
//     console.log(i)
// }

// let listaCompras = []

// let item
// let adicionar = true

// while(adicionar == true){
//     item = prompt("Qual item você quer adicionar?")

//     if(item.toLowerCase() === "fim"){
//         adicionar = false
//     }

//     listaCompras.push(item)
// }

// for(let produto of listaCompras){
//     console.log(produto)
// }

// 

// function printHeart(){
//     alert('<3')
// }

// function rant(word){

//     word = word.toUpperCase()

//     for(let i = 1; i<=3; i++){
//         console.log(i + ' '+ word)
        
//     }
// }


// greet('Lais', 'Reis')

// function greet(firstName, lastName){
//     console.log(`Hey, ${firstName} ${lastName}`)
// }

// function isSnakeEyes(num1, num2){

//     if(num1 === num2){
//         console.log('Yay são snake eyes')
//     }else{
//         console.log('Não são snake eyes')
//     }
// }

// isSnakeEyes(1,5)
// isSnakeEyes(1,1)



// let listaDeCompras = []
// let adicionar = true

// while(adicionar === true){
//      let item = prompt('Qual item deseja adiconar?')

//     if(item.toLowerCase() === 'fim'){
//         adicionar = false
//     }

//     listaDeCompras.push(item)

// }

// console.log(listaDeCompras)


// function rant(message){
// let word = message;


// for(let i = 1; i <= 3; i++){

//     console.log(word.toUpperCase())
// }

// }


// const fullNames = [{first: 'Albus', last: 'Dumbledore'}, {first: 'Harry', last: 'Potter'}, {first: 'Hermione', last: 'Granger'}, {first: 'Ron', last: 'Weasley'}, {first: 'Rubeus', last: 'Hagrid'}, {first: 'Minerva', last: 'McGonagall'}, {first: 'Severus', last: 'Snape'}]

// const firstNames = fullNames.map(function(n){
//     return console.log(n.first)
// })

// const lastNames = fullNames.forEach(function(arg){
//     return console.log(arg.last.toUpperCase())
// })


// const greet = (name) => `Olá ${name}`
// console.log(greet('Lais')) //Olá Laís 
// -----------------
// let soma = (a, b) => a + b
// console.log(soma(5,4)) //9

// const user10Char = validUserNames.filter(user10 => user10.length >= 10)
//     console.log(user10Char)

// function allEvens(array){
//     return array.every(pares => pares %2 === 0)
// }

// console.log(allEvens([3,7,5,3,1])) //false
// console.log(allEvens([2,4,6,8])) //true
// console.log(allEvens([1,12,7,4,8])) //false


// const greet = (nome) =>{
//     return `Olá ${nome} você conseguiu !!! Uhullll`
// }

// console.log(greet('Lais'))

// const sum = (num1, num2) => {
//     return num1 + num2
// }

// console.log(sum(5,4))


const validUserNames = [  
    "CodeNinja99",
    "SkyWalker",
    "NeoMatrix9",
    "JavaGuruX",
    "PixelCat",
    "EpicCoderX21",
    "PythonLover99",
    "DarkPhoenix77",
    "TurboGamer123",
    "UltraDev199",
    "PixelRogue12",
    "CyberFreak001",
    "MegaCoder78",
    "NerdyCoder13",
    "CodeKnightX44"
];

const users = validUserNames.filter(num => num.length < 10)

console.log(users)

