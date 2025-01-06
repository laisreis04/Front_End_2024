function calculadora(num1, num2, operacao){

    switch(operacao){
        case 'soma':
            return num1+num2;
        case 'subtração':
            return num1 - num2;
            case 'multiplicação':
                return num1 * num2
                case 'divisão':
                    if(num2 === 0){
                        return 'Divisão pro zero'
                    }else{
                        return num1 / num2
                    }
                    default:
                        return 'Operação Inválida'

    }
}

console.log(calculadora())