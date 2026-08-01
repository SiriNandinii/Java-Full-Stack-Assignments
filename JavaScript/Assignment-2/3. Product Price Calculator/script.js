function calculateBill() {

    let quantity = Number(document.getElementById("quantity").value);
    let price = Number(document.getElementById("price").value);

    let subtotal = quantity * price;
    let gst = subtotal * 0.18;

    let discount = 0;

    if (subtotal > 5000) {
        discount = subtotal * 0.10;
    }

    let finalAmount = subtotal + gst - discount;

    document.getElementById("subtotal").innerHTML = "Subtotal: ₹" + subtotal;
    document.getElementById("gst").innerHTML = "GST (18%): ₹" + gst;
    document.getElementById("discount").innerHTML = "Discount: ₹" + discount;
    document.getElementById("finalAmount").innerHTML = "Final Amount: ₹" + finalAmount;
}