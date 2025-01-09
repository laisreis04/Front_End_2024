function gerarSenha(tamanho){

    let senha = "";
    const caracters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&@'

for(let i = 0; i < tamanho; i++){

    senha += caracters[Math.floor(Math.random()*caracters.length)]
}
return senha;

}

console.log(gerarSenha(8))