const form = document.getElementById("login-form");



form.addEventListener("submit", function(event){
    event.preventDefault();
    const username = document.getElementById("username").value
    const password = document.getElementById("password").value;
    console.log("Nome digitado:", username);
    console.log("Senha: ",password )

    const dados = {username: username, password: password}

    fetch("http://localhost:8080/login", {
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(dados)
    })
    .then(response => response.json())
    .then(data => {
        const tokenJWT = data.token;

        document.cookie = ``
    }))
    .catch(erro => console.error('Erro:', erro));

    
})