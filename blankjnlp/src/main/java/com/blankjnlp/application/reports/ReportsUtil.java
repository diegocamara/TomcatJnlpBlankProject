package com.blankjnlp.application.reports;

import java.io.File;

import org.apache.commons.lang3.StringUtils;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class ReportsUtil {

    private static final String SRC_MAIN_RESOURCES_REPORTS = "/src/main/resources/reports/";

    public static void generateReport(AbstractReport abstractReport) {

        try {

            String absoluteFilePath = new File(StringUtils.EMPTY).getAbsolutePath()
                    + SRC_MAIN_RESOURCES_REPORTS + abstractReport.getFileName();

            JasperReport jasperReport = JasperCompileManager.compileReport(absoluteFilePath);

            JasperPrint jasperPrint =
                    JasperFillManager.fillReport(jasperReport, abstractReport.getParameters(),
                            new JRBeanCollectionDataSource(abstractReport.getDataSource()));

            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

}
