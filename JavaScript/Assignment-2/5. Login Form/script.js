let username = document.getElementById("username");
let password = document.getElementById("password");
let message = document.getElementById("message");

document.getElementById("showPassword").addEventListener("change", function () {

    if (this.checked) {
        password.type = "text";
    } else {
        password.type = "password";
    }

});

function login() {

    if (username.value === "admin" && password.value === "admin123") {
        message.innerHTML = "Welcome " + username.value + "!";
        message.style.color = "green";
    } else {
        message.innerHTML = "Invalid Username or Password";
        message.style.color = "red";
    }

}

document.addEventListener("keydown", function (event) {

    if (event.key === "Enter") {
        login();
    }

});