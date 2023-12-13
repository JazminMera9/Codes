// importacion de funciones y clases
import { initializeApp } from "https://www.gstatic.com/firebasejs/10.7.0/firebase-app.js";
import { GoogleAuthProvider, getAuth, signInWithPopup } from "https://www.gstatic.com/firebasejs/10.7.0/firebase-auth.js"
  //configuracion de la firebase 
  const firebaseConfig = {
    // configuracion
    apiKey: "AIzaSyBVdeh_0eFsovI2gyjvBS0feFkNmrDGNc8",
    authDomain: "idkk-f8b61.firebaseapp.com",
    databaseURL: "https://idkk-f8b61-default-rtdb.asia-southeast1.firebasedatabase.app",
    projectId: "idkk-f8b61",
    storageBucket: "idkk-f8b61.appspot.com",
    messagingSenderId: "73894802427",
    appId: "1:73894802427:web:28d6cfebd25240e688915e"
  };

// Initialize Firebase
const app = initializeApp(firebaseConfig);
// autenticacion y proveedor de google
const auth = getAuth(app);
const provider = new GoogleAuthProvider();
// boton de referencia 
const googleLogin = document.getElementById("IniciarGoogleBtn");

googleLogin.addEventListener('click', () => {
    //inicio con google ventana
  signInWithPopup(auth, provider)
        .then((result) => {
            // This gives you a Google Access Token. You can use it to access the Google API.
            const credential = GoogleAuthProvider.credentialFromResult(result);
            const token = credential.accessToken;
            // Tinfo del usuario que inicia .
            const user = result.user;
            // lo manda a la pag despues de iniciar sesion
            window.location.href= "https://jazminpag.my.canva.site/rosaseternas" 
        }).catch((error) => {
            // manejo de errores al iniciar con google 
            const errorCode = error.code;
            const errorMessage = error.message;
            // correo utilizado 
            const email = error.customData.email;
            // The AuthCredential type that was used.
            const credential = GoogleAuthProvider.credentialFromError(error);
            // ...
        });
});
