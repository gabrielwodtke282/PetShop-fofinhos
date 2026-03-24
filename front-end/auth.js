function pegarToken(){
    const cookies = document.cookie.split(";");
    for(let c of cookies){
            let[nome, valor] = c.trim().split("=");
            if (nome == "token"){
                return valor;
            }
    }
    return null;
}