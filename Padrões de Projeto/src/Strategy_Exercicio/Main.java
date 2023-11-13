package Strategy_Exercicio;

import Entidades.Form;
import Entidades.ValidateCnpj;
import Entidades.ValidateCpf;
import Entidades.ValidateDate;
import Entidades.ValidateName;

public class Main {

	public static void main(String[] args) {
		
		Form form = new Form("Evelin", "12345678900", "20-03-2000");
		Form form2 = new Form("Evelin", "11254200654", "20-03-2000");
		
		form.setValidator(new ValidateName());
		form.valid(form.getName());
		form.setValidator(new ValidateDate());
		form.valid(form.getDate());
		form.setValidator(new ValidateCpf());
		form.valid(form.getSubscription());
		form2.setValidator(new ValidateCnpj());
		form2.valid(form.getSubscription());
	}

}
