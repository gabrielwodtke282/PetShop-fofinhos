const form = document.getElementById("login-form");



form.addEventListener("submit", function(event){
    event.preventDefault();
    const username = document.getElementById("username").value
    const password = document.getElementById("password").value;

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
        console.log()

        document.cookie = `token=${tokenJWT}; path=/; max-age=900`
        console.log("deu certo")
    })
    .catch(erro => console.error('Erro:', erro));

    
})