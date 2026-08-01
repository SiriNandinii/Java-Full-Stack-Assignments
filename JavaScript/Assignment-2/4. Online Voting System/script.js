function vote() {

    let candidates = document.getElementsByName("candidate");
    let selected = "";

    for (let i = 0; i < candidates.length; i++) {
        if (candidates[i].checked) {
            selected = candidates[i].value;
            break;
        }
    }

    if (selected === "") {
        alert("Please select a candidate.");
        return;
    }

    document.getElementById("result").innerHTML =
        "You voted for <b>" + selected + "</b><br>Thank you for voting.";

    document.getElementById("voteBtn").disabled = true;
}