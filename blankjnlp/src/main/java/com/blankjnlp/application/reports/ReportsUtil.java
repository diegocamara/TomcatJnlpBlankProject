package com.blankjnlp.application.reports;

import java.io.File;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class ReportsUtil {

	public static void generateReport(AbstractReport abstractReport) {

		try {

			String absoluteFilePath = new File("").getAbsolutePath() + "/src/main/resources/reports/"
					+ abstractReport.getFileName();

			JasperReport jasperReport = JasperCompileManager.compileReport(absoluteFilePath);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, abstractReport.getParameters(),
					new JRBeanCollectionDataSource(abstractReport.getDataSource()));

			// JasperExportManager.exportReportToPdfFile(jasperPrint, new
			// File("").getAbsolutePath() +
			// "/src/main/resources/reports/relatorios/test.pdf");
			JasperViewer.viewReport(jasperPrint, true);
		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

}
