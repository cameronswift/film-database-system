import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilmTitle 
{
	public String comma = ",";
	public String titleId;
	public String ordering;
	public String title;
	public String region;
	public String language;
	public String type;
	public String attributes;
	public String isOriginalTitle;
	
	public FilmTitle(String csvString)
	{
		String csvParts[] = csvString.split(",");
		titleId = csvParts[0];
		ordering = csvParts[1];
		title = csvParts[2];
		region = csvParts[3];
		language = csvParts[4];
		type = csvParts[5];
		attributes = csvParts[6];
		isOriginalTitle = csvParts[7];
	}
	
	/*public String[] lineSplit(String csvString, String s) //splits using comma
	{
		int index = 0;
		int qouteCount = 0;
		String[] parts = new String[8];
		Arrays.fill(parts, ""); //fills all 8 elements with blank string
		
		for(int i = 0; i < csvString.length(); i++) //running through the line
		{
			if(csvString.charAt(i) != ',') //if not a comma
			{
				parts[index] += csvString.charAt(i);
			}
			if(csvString.charAt(i) == '"') //if its a quotation
			{
				qouteCount++;
			}
			if(csvString.charAt(i) == ',' && qouteCount%2 == 0)
				index++;
			if(csvString.charAt(i) == ',' && qouteCount%2 == 1)
				parts[index] += csvString.charAt(i); //adds next character to parts
		}
		return parts;
	} */
	
	public void readFilmTitles()
	{}
	public void searchFilms()
	{}
	public void listRegions() /* list all regions for every film */
	{}
	public void getFilmTitlesUsingRegion(String r) /* uses region as input, outputs films in that region */
	{}
	public void searchFilms(String s) /* uses user String input, outputs film titles that contains the user's input */
	{}
	
	public static ArrayList<FilmTitle> readFile(String filename) throws FileNotFoundException 
	{	
		ArrayList<FilmTitle> tempList = new ArrayList<>();
		File csvFile = new File(filename);
		Scanner csvScan = new Scanner(csvFile);
		while (csvScan.hasNextLine())
		{
			String line = csvScan.nextLine();
			FilmTitle film = new FilmTitle(line); //creating new instance of object
			tempList.add(film); //adding current film to the temporary array list
		}
		csvScan.close();
		return tempList;
	}

	public String toString() {
		return "FilmTitle [titleId=" + titleId + ", ordering=" + ordering + ", title=" + title + ", region=" + region
				+ ", language=" + language + ", type=" + type + ", attributes=" + attributes + ", isOriginalTitle="
				+ isOriginalTitle + "]";
	}
}