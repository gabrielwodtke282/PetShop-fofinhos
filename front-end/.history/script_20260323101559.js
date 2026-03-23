const form = document.getElementById("username")

form.addEventListener("submit", function(event){
    event.preventDefault();
    const username = document.getElementById("username").value

    console.log("Nome digitado:", nome);
})