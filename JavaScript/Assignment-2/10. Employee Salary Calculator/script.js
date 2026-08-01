function calculateSalary() {

    let name = document.getElementById("name").value;
    let basic = Number(document.getElementById("salary").value);

    let hra = basic * 0.20;
    let da = basic * 0.15;
    let pf = basic * 0.12;
    let professionalTax = 200;

    let grossSalary = basic + hra + da;
    let totalDeductions = pf + professionalTax;
    let netSalary = grossSalary - totalDeductions;

    document.getElementById("slip").innerHTML =
        "<h3>Salary Slip</h3>" +
        "Employee Name: " + name + "<br>" +
        "Basic Salary: ₹" + basic + "<br>" +
        "HRA: ₹" + hra + "<br>" +
        "DA: ₹" + da + "<br>" +
        "PF: ₹" + pf + "<br>" +
        "Professional Tax: ₹" + professionalTax + "<br>" +
        "Gross Salary: ₹" + grossSalary + "<br>" +
        "Total Deductions: ₹" + totalDeductions + "<br>" +
        "<b>Net Salary: ₹" + netSalary + "</b>";
}