package Entidades;

import Interfaces.Interface;

public class ValidateName implements Interface{

	@Override
	public boolean valid(String var) {
		if(Character.isLowerCase(var.charAt(0))) {
			return false;
		}
		if(!var.matches("[a-zA-Z]+")) {
			return false;
		}
		return true;
	}
}