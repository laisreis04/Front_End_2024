// Validação do formulário de contato
document.getElementById("formulario-contato").addEventListener('submit', function(event) {
    event.preventDefault(); 

    let nome = document.getElementById('nome').value;
    let email = document.getElementById('email').value;
    
    if (nome == '' || email == '') {
        alert('Por favor, preencha todos os campos obrigatórios.');
    } else {
        
        alert("Formulário enviado com sucesso!");
    }
}


// Animação dos cards dos cursos 
const cards = document.querySelectorAll('#cursos .card');

cards.forEach(card => {
    card.addEventListener('mouseover', () => {
        card.style.transform = 'scale(1.1)';
    })
    card.addEventListener('mouseout', () => {
        card.style.transform = 'scale(1.0)';
    })
});