let totalItems = 0;
let grandTotal = 0;

function addProduct() {

    let quantity = Number(document.getElementById("quantity").value);
    let price = Number(document.getElementById("price").value);

    totalItems += quantity;
    grandTotal += quantity * price;

    updateCart();
}

function increaseQty() {
    document.getElementById("quantity").value++;
}

function decreaseQty() {

    let qty = document.getElementById("quantity");

    if (qty.value > 1) {
        qty.value--;
    }

}

function removeProduct() {

    totalItems = 0;
    grandTotal = 0;

    updateCart();
}

function updateCart() {

    document.getElementById("items").innerHTML = "Total Items: " + totalItems;
    document.getElementById("total").innerHTML = "Grand Total: ₹" + grandTotal;

}