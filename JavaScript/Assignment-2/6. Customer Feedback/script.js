function displayFeedback() {

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let rating = document.getElementById("rating").value;
    let suggestions = document.getElementById("suggestions").value;
    let department = document.getElementById("department").value;
    let subscribe = document.getElementById("subscribe").checked ? "Yes" : "No";

    let table = document.getElementById("tableBody");

    table.innerHTML += `
        <tr>
            <td>${name}</td>
            <td>${email}</td>
            <td>${rating}</td>
            <td>${suggestions}</td>
            <td>${department}</td>
            <td>${subscribe}</td>
        </tr>
    `;

    document.querySelector("form").reset();
}