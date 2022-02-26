window.addEventListener('load', carga);

function carga() {

    document.getElementById("botoIniciarJoc").onclick = function () {
        var data = "idPartida=" + (document.getElementById("idPartida").value);
        var xhr = new XMLHttpRequest();
        xhr.withCredentials = true;
        xhr.addEventListener("readystatechange", function () {
            if (this.readyState === 4) {
                console.log(this.responseText);
            }
        });
        xhr.open("POST", "localhost:8080/uno_java_war_exploded/api/uno-java/iniciarJoc/codiPartida");
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

        xhr.send(data);
    }
}