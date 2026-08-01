function secondLowestGreatest(arr) {

    // Sort the array in ascending order
    arr.sort(function(a, b) {
        return a - b;
    });

    let secondLowest = arr[1];
    let secondGreatest = arr[arr.length - 2];

    document.write("Array: " + arr + "<br><br>");
    document.write("Second Lowest: " + secondLowest + "<br>");
    document.write("Second Greatest: " + secondGreatest);
}

// Sample array
let numbers = [1, 2, 3, 4, 5];

secondLowestGreatest(numbers);