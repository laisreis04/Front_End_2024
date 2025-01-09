function calcularMediaArray(numeros){

    let soma = 0;
    for(let num of numeros){
        soma += num;
    }

    return soma /numeros.length;
}

console.log(calcularMediaArray([10,20,30]))