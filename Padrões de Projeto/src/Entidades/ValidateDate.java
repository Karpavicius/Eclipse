package Entidades;

import java.text.SimpleDateFormat;

import Interfaces.Interface;

public class ValidateDate implements Interface{

	@Override
	public boolean valid(String var) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			format.parse(var);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
}
