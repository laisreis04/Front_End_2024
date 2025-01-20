
// let valorA = parseInt(document.getElementById('inputValorA').value)
// let valorB = parseInt(document.getElementById('inputValorB').value)

// const botao = document.getElementById('btn')


// function soma() {
//     return valorA + valorB
// }

// function subtracao() {
//     return valorA - valorB
// }

// function divisao() {
//     return valorA / valorB
// }

// function multiplicacao() {
//     return valorA * valorB
// }


// // Função 

// function compararOperador() {
//     // Selecionar o elemento 
// const operador = document.getElementById('tipoOperation').value

// let resultado;

//     switch (operador) {

//         case '+':
//            resultado = soma();
//             break;

//         case '-':
//             resultado = subtracao();
//             break;

//         case '/':
//             resultado = divisao();
//             break;

//         case '*':
//             resultado = multiplicacao();
//             break;

//     }

// const textoResultado = document.getElementById('textoResultado')
// textoResultado.innerText = resultado
// console.log(resultado)
// }


// btn.addEventListener('click', compararOperador)


function calculadoraSoma(){

    // Guardar o valor A numa variavel
    var valorA = parseInt(document.getElementById("valorA").value);

    // Guardar o valor B numa variavel
let valorB = parseInt(document.getElementById("valorB").value);

let resultadoSoma = valorA + valorB

// Mostrar resultado
// alert(resultadoSoma)

// Mostrar o resultado em texto
document.getElementById("resultadoH1").innerText = "Resultado = " + resultadoSoma;

}

// Função Divisão

// Função Multiplicar

// Função Subtração




// Função - Avaliar o tipo de opreção atraves da comparação

function compararOpe(){

    // Guardar o input do user numa variavel
    let sinalOp = document.getElementById("tipoOp").value;

    if(sinalOp === "+"){
        calculadoraSoma();
    }

    // IF's de comparação

}