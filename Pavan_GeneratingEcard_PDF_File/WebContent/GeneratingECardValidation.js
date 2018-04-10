function validate() {
	var HealthInsuranceID = document.myForm.HealthInsuranceID.value;

	if (HealthInsuranceID == null || HealthInsuranceID == "") {

		document.getElementById("HealthInsuranceID").innerHTML = "Please Enter Health Insurance ID";
		return false;

	} else if (isNaN(HealthInsuranceID)) {

		document.getElementById("HealthInsuranceID").innerHTML = "Enter Numeric value only";
		return false;

	}
}
