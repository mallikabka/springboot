package com.pdfgeneration.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDfGeneration {
	public static void main(String[] args) throws DocumentException, MalformedURLException, URISyntaxException, IOException {
		generatePdfFile();

	}

	public static void generatePdfFile() throws DocumentException, MalformedURLException, URISyntaxException, IOException {
		Document doc = new Document();
		String filepath = "C:\\Users\\mb22183\\Downloads\\myAppgeneredPdfs\\sample.pdf";
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doc.open();
		Paragraph para = new Paragraph(
				"Multithreading in Java is a pivotal feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such a program is called a thread, and each thread defines a separate path of execution. This is one of the powerful capabilities of Java, which can improve the performance of complex, resource-intensive applications.\t");
		doc.add(para);
		PdfPTable table = new PdfPTable(4);
		createTableHeader(table);
		addRow(table);
		//addCustomRow(table);
		doc.add(table);

		doc.close();

	}

	public static void createTableHeader(PdfPTable table) {
		Stream.of("Id", "First Name", "Last Name", "Address").forEach(title -> {
			PdfPCell header = new PdfPCell();
			header.setBackgroundColor(BaseColor.MAGENTA);
			header.setBorderWidth(1);
			header.setPhrase(new Phrase(title));
			table.addCell(header);

		});
	}

	public static void addRow(PdfPTable table) {
		table.addCell("1");
		table.addCell("Mallika");
		table.addCell("Bokka");
		table.addCell("Karnataka");

	}

	public static void addCustomRow(PdfPTable table)
			throws URISyntaxException, BadElementException, MalformedURLException, IOException {
		
		 try {
		        // Specify the absolute path to the image file on your system
		        String imagePath = "C:\\Users\\mb22183\\STS_workspace\\PDFGenerationApplication\\src\\main\\resources\\images\\logo.png"; // Update this to the actual path
		        Image img = Image.getInstance(imagePath);
		        PdfPCell imageCell = new PdfPCell(img, true); // The 'true' parameter scales the image to fit the cell
		        imageCell.setBorder(PdfPCell.NO_BORDER); // Optionally remove the cell border
		        table.addCell(imageCell);
		    } catch (Exception e) {
		    	System.out.println(e);
		        e.printStackTrace();
		    }
		
		
//		Path path = Paths.get(ClassLoader.getSystemResource("src/main/resources/images/logo.png").toURI());
//		Image img = Image.getInstance(path.toAbsolutePath().toString());
//		PdfPCell imagecell = new PdfPCell(img);
//		table.addCell(imagecell);
//		PdfPCell desc=new PdfPCell(new Phrase("Description"));
//		desc.setHorizontalAlignment(Element.ALIGN_CENTER);
//		table.addCell(desc);
//		
//		PdfPCell remarks=new PdfPCell(new Phrase("Remarks"));
//		remarks.setVerticalAlignment(Element.ALIGN_CENTER);
//		table.addCell(remarks);
	}
}