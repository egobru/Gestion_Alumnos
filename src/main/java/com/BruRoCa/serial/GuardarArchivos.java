package com.BruRoCa.serial;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class GuardarArchivos  {
	
	
	public <T extends Object>void GuardarArchivo(String ruta, List<T> lista) throws IOException {
	try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(ruta));

            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
        ) {lista.forEach(e-> {
			try {
				csvPrinter.printRecord(e);
				 csvPrinter.flush(); 
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		});
                
        }

}

}
