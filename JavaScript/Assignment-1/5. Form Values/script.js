function getFormvalue() {

    let firstName = document.getElementById("fname").value;
    let lastName = document.getElementById("lname").value;

    document.write("<h2>Form Values</h2>");
    document.write("First Name: " + firstName + "<br>");
    document.write("Last Name: " + lastName);
}