package com.blankjnlp.application.reports;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReportsUtil {

	public static void generateReport(AbstractReport abstractReport) {

		try {

			JasperReport jasperReport = JasperCompileManager.compileReport(abstractReport.getPath());

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, abstractReport.getParameters(),
					new JRBeanCollectionDataSource(abstractReport.getDataSource()));

			JasperExportManager.exportReportToPdfFile(jasperPrint, "relatorios/test.pdf");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
			
		}

	}

}
