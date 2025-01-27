//Grocery

// const form = document.getElementById('grocery-form');
// const lista = document.getElementById('grocery-list');

// form.addEventListener('submit', (event) => {
//   event.preventDefault(); // previne o comportamento padrão do submit

//   const item = document.getElementById('item').value;
//   const quantidade = document.getElementById('quantidade').value;

//   const novoItem = document.createElement('li'); // cria um novo elemento <li>
//   novoItem.classList.add('list-group-item'); // adiciona a classe do Bootstrap para estilização
//   novoItem.textContent = `${quantidade}x ${item}`; // define o texto do item
//   lista.appendChild(novoItem); // adiciona o novo item à lista

//   // Reset dos inputs
//   form.reset();
// });

//Jogador
// const jogador = document.getElementById('jogador');
// const jogo = document.getElementById('jogo');

// document.addEventListener('keydown', (event) => {
//   let top = jogador.offsetTop;
//   let left = jogador.offsetLeft;

//   switch (event.key) {
//     case 'ArrowUp':
//       top = Math.max(0, top - 10); 
//       break;
//     case 'ArrowDown':
//       top = Math.min(jogo.offsetHeight - jogador.offsetHeight, top + 10);
//       break;
//     case 'ArrowLeft':
//       left = Math.max(0, left - 10);
//       break;
//     case 'ArrowRight':
//       left = Math.min(jogo.offsetWidth - jogador.offsetWidth, left + 10);
//       break;
//   }

//   jogador.style.top = `${top}px`;
//   jogador.style.left = `${left}px`;
// });











