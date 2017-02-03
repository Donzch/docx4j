/*
 *  Copyright 2017, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */

package org.xlsx4j.samples;


import java.util.ArrayList;
import java.util.List;

import org.docx4j.openpackaging.packages.SpreadsheetMLPackage;
import org.docx4j.openpackaging.parts.SpreadsheetML.SharedStrings;
import org.docx4j.openpackaging.parts.SpreadsheetML.WorkbookPart;
import org.docx4j.openpackaging.parts.SpreadsheetML.WorksheetPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xlsx4j.org.apache.poi.ss.usermodel.DataFormatter;
import org.xlsx4j.sml.Cell;
import org.xlsx4j.sml.Row;
import org.xlsx4j.sml.SheetData;
import org.xlsx4j.sml.Worksheet;


public class CellContentExtractor {
	
	private static Logger log = LoggerFactory.getLogger(CellContentExtractor.class);						

	private static List<WorksheetPart> worksheets = new ArrayList<WorksheetPart>();
	
	private static SharedStrings sharedStrings = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		

		String inputfilepath = System.getProperty("user.dir") + "/content.xlsx";
			
		// Open a document from the file system
		SpreadsheetMLPackage xlsxPkg = SpreadsheetMLPackage.load(new java.io.File(inputfilepath));		
				
		WorkbookPart workbookPart = xlsxPkg.getWorkbookPart();
		WorksheetPart sheet = workbookPart.getWorksheet(0);
		
		sharedStrings = workbookPart.getSharedStrings();
		
		DataFormatter formatter = new DataFormatter();
		formatter.setStylesPart(workbookPart.getStylesPart());
		formatter.setWorkbookPart(workbookPart);


		// Now lets print the cell content
		displayContent(sheet, formatter);
		
	}
	
	
	private static void displayContent(WorksheetPart sheet, DataFormatter formatter) {

		System.out.println(sheet.getPartName().getName() );
		
		
		
		Worksheet ws = sheet.getJaxbElement();
		SheetData data = ws.getSheetData();
		for (Row r : data.getRow() ) {
			System.out.println("row " + r.getR() );				
			for (Cell c : r.getC() ) {
				
//	            CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
//	            System.out.print(cellRef.formatAsString());
//	            System.out.print(" - ");

	            // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
	            String text = formatter.formatCellValue(c);
	            System.out.println(c.getR() + " contains " + text);

	            }
		}
		
	}
	
	
	
}