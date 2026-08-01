let status = document.getElementById("status");
let dateTime = document.getElementById("dateTime");

function getCurrentDateTime() {
    return new Date().toLocaleString();
}

document.getElementById("checkIn").addEventListener("click", function () {

    status.innerHTML = "Checked In";
    status.style.color = "green";

    dateTime.innerHTML = "Date & Time: " + getCurrentDateTime();
});

document.getElementById("checkOut").addEventListener("click", function () {

    status.innerHTML = "Checked Out";
    status.style.color = "red";

    dateTime.innerHTML = "Date & Time: " + getCurrentDateTime();
});