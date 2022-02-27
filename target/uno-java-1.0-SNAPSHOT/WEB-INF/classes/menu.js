window.addEventListener('load', carga);

function carga() {

    document.getElementById("crearPartida").addEventListener("click", ()=>{
        var myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/x-www-form-urlencoded");

        var urlencoded = new URLSearchParams();

        let idPartida = document.getElementById("idPartida").value;

        urlencoded.append("idPartida", idPartida);

        var requestOptions = {
            method: 'POST',
            headers: myHeaders,
            body: urlencoded,
            redirect: 'follow'
        };

        fetch("iniciarJoc/codiPartida", requestOptions)
            .then(response => response.text())
            .then(result => {
                let resultado = JSON.stringify(result, null, "\t"); // Indented with tab
                console.log(resultado);
            })
            .catch(error => console.log('error', error));

    });

    document.getElementById("unirsePartida").addEventListener("click", ()=>{
        var myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/x-www-form-urlencoded");

        var urlencoded = new URLSearchParams();
        let idPartida = document.getElementById("idPartida").value;
        let Jugador = document.getElementById("Jugador").value;
        urlencoded.append("idPartida", idPartida);
        urlencoded.append("nombre", Jugador);

        var requestOptions = {
            method: 'POST',
            headers: myHeaders,
            body: urlencoded,
            redirect: 'follow'
        };

        fetch("unirse", requestOptions)
            .then(response => response.text())
            .then(result => {
                let resultado = JSON.stringify(result, null, "\t"); // Indented with tab
                console.log(resultado);
            })
            .catch(error => console.log('error', error));

    });

    document.getElementById("ObtenirCarta").addEventListener("click", ()=>{

        var requestOptions = {
            method: 'GET',
            redirect: 'follow'
        };
        let Jugador = document.getElementById("Jugador").value;

        let base = 'http://localhost:8080/uno_java_war_exploded/api/uno-java/obtenirCarta';
        url = base+"/" + Jugador;

        console.log(url);

        fetch(url, requestOptions)
            .then(response => response.text())
            .then(result => console.log(result))
            .catch(error => console.log('error', error));
    });

    document.getElementById("comprobarCartes").addEventListener("click", ()=>{

        var requestOptions = {
            method: 'GET',
            redirect: 'follow'
        };
        let Jugador = document.getElementById("Jugador").value;

        let base = 'http://localhost:8080/uno_java_war_exploded/api/uno-java/comprobarCartas';
        url = base+"/" + Jugador;

        console.log(url);

        fetch(url, requestOptions)
            .then(response => response.text())
            .then(result => {
                let resultado = (result)
                console.log(resultado);
                document.getElementById("cartes-jugador").innerHTML = resultado;
            })
            .catch(error => console.log('error', error));
    });

    document.getElementById("tirarCarta").addEventListener("click", ()=>{
        var myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/x-www-form-urlencoded");

        var urlencoded = new URLSearchParams();

        let Jugador = document.getElementById("Jugador").value;
        let num = document.getElementById("num").value;
        let color = document.getElementById("color").value;
        urlencoded.append("jugador", Jugador);
        urlencoded.append("numcarta", num);
        urlencoded.append("colorcarta", color);

        var requestOptions = {
            method: 'PUT',
            headers: myHeaders,
            body: urlencoded,
            redirect: 'follow'
        };

        fetch("tirarCarta", requestOptions)
            .then(response => response.text())
            .then(result => {
                let resultado = (result) // Indented with tab
                console.log(resultado);
            })
            .catch(error => console.log('error', error));

    });

    document.getElementById("verPila").addEventListener("click", ()=>{
        var requestOptions = {
            method: 'GET',
            redirect: 'follow'
        };
        let idPartida = document.getElementById("idPartida").value;

        let base = 'http://localhost:8080/uno_java_war_exploded/api/uno-java/comprobarPila';
        url = base+"/" + idPartida;

        console.log(url);

        fetch(url, requestOptions)
            .then(response => response.text())
            .then(result => {
                let resultado = (result)
                console.log(resultado);
                document.getElementById("cartes-pila").innerHTML = resultado;
            })
            .catch(error => console.log('error', error));
    });

    document.getElementById("acabarPartida").addEventListener("click", ()=>{
        var requestOptions = {
            method: 'DELETE',
            redirect: 'follow'
        };
        let idPartida = document.getElementById("idPartida").value;

        let base = 'http://localhost:8080/uno_java_war_exploded/api/uno-java/acabarJoc';
        url = base+"/" + idPartida;

        console.log(url);

        fetch(url, requestOptions)
            .then(response => response.text())
            .then(result => console.log(result))
            .catch(error => console.log('error', error));
    });
}