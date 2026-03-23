const form = document.getElementById("username");
const formpsswd = document.getElementById("password");


form.addEventListener("submit", function(event){
    event.preventDefault();
    const username = document.getElementById("username").value
    const password = document.getElementById("password");
    console.log("Nome digitado:", nome);
    console.log("Senha: ",password )
})