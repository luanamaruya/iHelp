function cpf_mask() {
	var cpf = document.getElementById("cpf");
	if (cpf.value.length == 3 || cpf.value.length == 7) {
		cpf.value += '.';
	} else if (cpf.value.length == 11) {
		cpf.value += '-';
	}
}

function phone_mask() {
	var phone = document.getElementById("phone");
	if (phone.value.length == 0) {
		phone.value += '(';
	} else if (phone.value.length == 3) {
		phone.value += ') ';
	} else if (phone.value.length == 10) {
		phone.value += '-';
	}
}