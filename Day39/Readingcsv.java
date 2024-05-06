package Day39;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Readingcsv {

	private static final String sample_path="C:/Users/ics-guest/eclipse-workspace1/mavendemoproject/testdata/Csv11.csv";
	
	public static void main(String[] args) throws IOException 
	{
		
		try(
		Reader reader = Files.newBufferedReader(Paths.get("user.dir"));
		CSVParser csvparser = new CSVParser(reader,CSVFormat.DEFAULT);
		){
		for(CSVRecord record: csvparser)
		{
			String name = record.get(0);
			String pet = record.get(1);
		
		
		System.out.println("Record no: "+record.getRecordNumber());
		System.out.println("-----------");
		System.out.println("Name"+name);
		System.out.println("Pet"+pet);

	}
	}


}
}



