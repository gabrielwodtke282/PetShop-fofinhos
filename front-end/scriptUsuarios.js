const token = pegarToken();


function usuarios(){
    const container = document.getElementById("container")
    fetch("http://localhost:8080/petshop/usuarios", {
        method: "GET",
        headers: {
            'Authorization': `Bearer ${token}`
        },
    })  
    .then(response => response.json())
    .then(data => {
        if(data === null){
            container.innerHTML = `<p>Erro, os usuarios não foram encontrados ou você não possui o acesso necessario</p>`
        }
        else{
            const htmlFinal = data.map(usuario => `<li>${usuario.username}</li>`).join("");

        container.innerHTML = `<ul>${htmlFinal}</ul>`
         
        console.log("deu certo")
        }
    })
    .catch(erro => console.error('Erro:', erro));
}

document.addEventListener("DOMContentLoaded", usuarios)





