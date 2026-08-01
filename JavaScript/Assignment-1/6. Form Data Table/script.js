function displayData() {

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let age = document.getElementById("age").value;

    let tableBody = document.getElementById("tableBody");

    tableBody.innerHTML += `
        <tr>
            <td>${name}</td>
            <td>${email}</td>
            <td>${age}</td>
        </tr>
    `;

    // Clear the form
    document.getElementById("name").value = "";
    document.getElementById("email").value = "";
    document.getElementById("age").value = "";
}