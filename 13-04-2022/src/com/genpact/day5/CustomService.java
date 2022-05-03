package com.genpact.day5;

public class CustomService {
	
	public CustomService findByName(String name) throws NameNotFoundException {
		if("".equals(name)) {
			throw new NameNotFoundException("Name is empty!!!");
		}
		return new CustomService();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomService obj = new CustomService();
		try {
			CustomService cu = obj.findByName("");
		}
		catch (NameNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
