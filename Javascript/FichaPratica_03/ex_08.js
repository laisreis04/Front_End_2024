function ehPalindromo(palavra){

let palavraInvertida = palavra.split('').reverse().join('');

if(palavra === palavraInvertida){
    return true
}else{
    return false
}

}

console.log(ehPalindromo('arara'))