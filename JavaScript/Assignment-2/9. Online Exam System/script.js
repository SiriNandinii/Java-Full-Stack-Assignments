function submitExam() {

    let answers = [
        "Delhi",
        "10",
        "HyperText Markup Language",
        "Styling",
        "Programming Language"
    ];

    let score = 0;

    for (let i = 1; i <= 5; i++) {

        let selected = document.querySelector('input[name="q' + i + '"]:checked');

        if (selected && selected.value === answers[i - 1]) {
            score++;
        }

    }

    let wrong = 5 - score;
    let percentage = (score / 5) * 100;
    let status = percentage >= 50 ? "Pass" : "Fail";

    document.getElementById("result").innerHTML =
        "Correct Answers: " + score + "<br>" +
        "Wrong Answers: " + wrong + "<br>" +
        "Percentage: " + percentage + "%<br>" +
        "Status: " + status;
}