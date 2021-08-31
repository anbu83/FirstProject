package org.report;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvnReport(String report) {
			
		//Mention the folder name
			File f = new File(System.getProperty("user.dir")+"\\target\\jvmreport");
			
			//Add details to the target
			Configuration con =  new Configuration(f, "Facebook application");
			con.addClassifications("Platform name", "Windows 10");
			
			//convert string into list<string>
			List<String> li = new ArrayList<String>();
			li.add(report);
			
			
			
			
			//call generateReport() method from reportBuilder class
			ReportBuilder r = new ReportBuilder(li, con);
			r.generateReports();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	
}
