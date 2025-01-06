//Verificardor de número primo

// function ehPrimo(num){

//     //ciclo para verificar por quais numeros ele é divisivel
//     for(let i = 2; i < num; i++){

//         //condição para verificar o numero primo
//         if(num % i === 0){
//             return false;
//         }else{
//             return true
//         }
//     }
// }


function ehPrimo(num){

    for(let i = 2; i <= Math.sqrt(num); i++){
        if(num % i === 0){
                        return false;
                    }else{
                        return true
                    }
    }
}

console.log(ehPrimo(36))