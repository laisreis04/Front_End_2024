// const spanElements = document.querySelectorAll('span')

// const cores =  ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];

// spanElements.forEach((mudarSpan , index) => {
//     mudarSpan.style.backgroundColor = cores[index]
    
// });

function mudarCoresHighlight(){

const elementosH1 = document.querySelectorAll('.highlight');
const novoHigh = document.querySelectorAll('.semHigh')

elementosH1.forEach(cor => {
    elementosH1.classList.remove('yellow')
})

novoHigh.forEach(novaCor => {
    novoHigh.classList.add('yellow')
})

}
