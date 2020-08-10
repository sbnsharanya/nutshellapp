package com.nutshellapp.utilityfiles;


public class FilereaderNutshell {
	public static ConfigreaderNutshell cr;
	public static FilereaderNutshell frm = new FilereaderNutshell();
	
	public ConfigreaderNutshell getConfigReader() throws Exception
	{
		if(cr==null)
		{
			cr=new ConfigreaderNutshell();
		}
		return cr;
	}
	
	private FilereaderNutshell() {
		
	}

}



