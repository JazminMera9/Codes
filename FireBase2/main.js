import { initializeApp } from "https://www.gstatic.com/firebasejs/10.6.0/firebase-app.js";
import { GoogleAuthProvider, getAuth, signInWithPopup } from "https://www.gstatic.com/firebasejs/10.6.0/firebase-auth.js";

const firebaseConfig = {
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
const auth = getAuth(app);
const provider = new GoogleAuthProvider();

const googleLogin = document.getElementById("googleLoginBtn");

googleLogin.addEventListener("click", () => {
    signInWithPopup(auth, provider)
        .then((result) => {
            // This gives you a Google Access Token. You can use it to access the Google API.
            const credential = GoogleAuthProvider.credentialFromResult(result);
            const token = credential.accessToken;
            // The signed-in user info.
            const user = result.user;
            window.location.href = "../logged.html"

        }).catch((error) => {
            // Handle Errors here.
            const errorCode = error.code;
            const errorMessage = error.message;
            // The email of the user's account used.
            const email = error.customData.email;
            // The AuthCredential type that was used.
            const credential = GoogleAuthProvider.credentialFromError(error);
            // ...
        });
});
