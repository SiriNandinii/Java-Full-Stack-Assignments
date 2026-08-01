function showTime() {

    let date = new Date();

    let hours = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();

    // Add leading zero if needed
    hours = hours < 10 ? "0" + hours : hours;
    minutes = minutes < 10 ? "0" + minutes : minutes;
    seconds = seconds < 10 ? "0" + seconds : seconds;

    let currentTime = hours + ":" + minutes + ":" + seconds;

    document.getElementById("clock").innerHTML = currentTime;
}

// Update every second
setInterval(showTime, 1000);

// Display immediately when the page loads
showTime();