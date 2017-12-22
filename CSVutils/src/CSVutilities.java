
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class CSVutilities
{
	private ArrayList<String> CSVData;
	private int numcols;
	public CSVutilities(File csv)
	{
		Path pathToFile = Paths.get(csv.getAbsolutePath());
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
			String line = br.readLine();
			while(line != null)
			{
				line = br.readLine();
				String [] data = line.split(",");
				this.numcols = data.length;
				for(int i = 0; i < data.length; i ++ )
				this.CSVData.add(line);
			}
		}		
				catch (IOException ioe) {
				ioe.printStackTrace();
			}
		
	}
	public List<String> getColoumHeaders()
	{
		ArrayList<String> ColData = new ArrayList<>();
		for(int i = 0; i < numcols; i++)
		{
			ColData.add(CSVData.get(i));
		}
		return ColData;
		
	}
	public List<String> getDataString(int col)
	{
		ArrayList<String> data = new ArrayList<>();
		for(int i = col; i < this.CSVData.size(); i = i + numcols)
		{
			String data1 = CSVdata.get(i);
			if(!(data1.equals("")))
			{
				data.add(CSVData.get(i));
			}
			else
			{
				data.add("");
			}
		}
		return data; 
	}
	public List<Integer> getDataInt(int col)
	{
		
	}
	public List<Double> getDataDouble(int col)
	{
		ArrayList<Double> list = new ArrayList<Double>();
		for(int i = col; i < this.CSVData.size(); i = i + numcols)
		{
			String data =(CSVData.get(i));
			if(!(data.equals("")))
			{
				list.add(Double.parseDouble(data));
			}
			else
			{
				list.add(null);
			}
		}
		return list;
	}
}
