package csvReaderThing;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	public static void main(String [] args)
	{
		List<Store> stores = readFromCSV("ManhattanThinggy");
	}
	private static List<Store> CSVReader(String fileName)
	{
		List<Store> stores = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		try ( BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while(line != null)
			{
				String[] attributes = line.split(",");
				Store store = createStore(attributes);
				stores.add(store);
				line = br.readLine();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return stores;
	}
	private static Store createStore(String[] metadata)
	{
		String thing1 = metadata[0];
		String thing2 = metadata[1];
		String thing3 = metadata[2];
		String thing4 = metadata[3];
		String thing5 = metadata[4];
		String thing6 = metadata[5];
		String thing7 = metadata[6];
		return( new Store(thing1, thing2, thing3, thing4, thing5, thing6, thing7));
	}

}
