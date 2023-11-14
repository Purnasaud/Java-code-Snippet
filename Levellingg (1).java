import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Levellingg{


	//For reading data from user.
	// esma hamile private access modifier use gareko cha jaha static le constant value janaucha..
	//tara esma data[] ko kaam k ho?
	// Data[] bhannale yo readFromUser ko teturn type eauta array hoo jasmaa array ko elements chai Data class ko objects hunxan
	// Data class chai muli define gareko xa
	//readfromuser vanni variable afai define gareko jasto bujey ya chai yo line vandinu hai alikati
	private static Data[] readFromUser(double knownRL){
		// ya scanner class use garera no. of setup kati input dine vanera define gareko cha
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Setup: ");
		int nofsetup = input.nextInt();
		//data ko object create gareko cha where noofsetup lai concaneate gareko cha , ma wrong huna sakchu correct gardinu hai
		// Data class ko object ko array store garne hoo data variable ley chai.... ani array ko length chai number of setup bhanda 1 badi
		Data[] data = new Data[nofsetup+1];
		// yo line bujina
		// array ko 1st element deko Data class ko constructor hera tah
		// backsight foresight raa reduced level linxa
		// 1st setup ko laagi 0 0 ani known url deko ist element
		data[0] = new Data(0,0,knownRL);
		// for loop use gareko cha jaha data length chai infinite huna sakcha depends on user input... tespachi backsight ra foresight print gareko cha
		for(int i = 1; i < data.length ; i++){
			System.out.print("Enter backsight for setup "+i+": ");
			// esle backsight ko value k garcha????
			// backsight ko value linxa user baata
			double backsight = input.nextDouble();
			System.out.print("Enter foresight for setup "+i+": ");	
			double foresight = input.nextDouble();
			//with the change in value of i, k huncha, yo line pani bujena
			// backsight foresight raa previous kmown url pathaako maanam i ko value 
			// 5 xa bhane 5th setup ko backsight foresight ani 4th setup baata aayeko RL jaane bho
			// aba i =6 ko laagi backsight foresight ani 5th setup baata aayeko ko RL
			data[i] = new Data(backsight, foresight, data[i-1].getReducedLevel());  
		}
		return data;
	}

	//For Writing result to a csv file
	//Writer ko method use gareko cha..... aru hajurle vandinu na yo line ma use vako variable ko barema
	// filename linxa, Data class ko object haru ko array linxa
	private static void writeToCSV(String filename,Data[] data) throws Exception{
		

		FileWriter fileWrite = new FileWriter(filename+".csv");
		BufferedWriter bufferedWrite = new BufferedWriter(fileWrite);
		for (int i=0; i < data.length ; i++) {
			// esma k gareko?
			// Data class maa hera tah toCSVString bhanne method xa.
			bufferedWrite.write(data[i].toCSVString());
		}
		// close the input stream 
		bufferedWrite.close();
	}

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter known RL: ");
		// used to input the values of integer variables
		int knownRL = input.nextInt();
		input.nextLine();
		// yo boolean ma true or false result le k k display garcha 
		boolean loopOrNot = true;
		// esma user le haleko starting RL ko barema vaneko jasto lagyo
		Data[] data = new Data[0];
        data = readFromUser(knownRL);
		
		//Displaying the information in table form.
		//yo vitra ko kura ali confusing lagyooo..
		// dai es vitrea vako exception le kk gariracha ani loopornot le k anusar true false vaneko .....
		//do while if else try catch vitra kk vairacha
		//do pachi if use garna kasari milyo
		
		// file maa write garda exception aauna sakxa jstai filename already exist huney ani removable disk (pendrive) maa file write garna laako ho bhaney pendrive disconnect huney tesaile exception handle garnu parxa
		
		// manam file maa write huna sakena bhane feri sodhxa do you want to write to file bhanera
		// fire maa write successful bhayo bhane feri sodhdaina.. loopornot ko kaam tei hoo
		
		System.out.println("Setup \t Backsight \t Foresight \t Rise/fall \t RL of Foresight Station");
		for(int i = 1; i < data.length ; i++)
			// array vitra ko i le k denote gariracha?
			System.out.println(i+"\t  "+data[i].getBackSight()+"\t\t  "+data[i].getForesight()+"\t\t "+data[i].getHeightDifference()+"\t\t  "+data[i].getReducedLevel());
		do{
			//Asking user if they wish to save result.
			System.out.print("Do you wish to save result? Enter Y to save or Any other key to exit ");
			String ask = input.nextLine();
			if (ask.equals("Y")||ask.equals("y")){
				System.out.print("Enter filename of output file: ");
				String filename = input.nextLine();
				try{
					writeToCSV(filename,data);
					System.out.println("Data sucessfully written to file "+filename+".csv");
					loopOrNot = false;
				}catch (Exception e){
					System.out.println("Could not write data to file "+filename+".csv");
					loopOrNot = true;
				}
			}else{
				loopOrNot=false;
			}
		}while (loopOrNot);

	}
}
// class data vitra instance variable create gareko
class Data {
	private double backsight;
	private double foresight;
	private double reducedLevel;
	private double heightDifference = 0;
	//this keyword le current class ko  object denote gareko cha
	Data(double backsight,double foresight,double reducedLevel){// local variable
		this.backsight = backsight;
		this.foresight = foresight;
		this.reducedLevel = reducedLevel;
		this.heightDifference = backsight - foresight;
		this.reducedLevel = reducedLevel + heightDifference;
	}
	// getter method use gareko so that it return variable value
	public double getBackSight(){
		return backsight;
	}
	public double getForesight(){
		return foresight;
	}
	public double getHeightDifference(){
		return heightDifference;
	}
	public double getReducedLevel(){
		return reducedLevel;
	}

	//This returns row to be written to a csv file.
	// buffer ko value string ma huncha ho? kei thapdinus hai esma vanne kura
	public String toCSVString() {
		String row = backsight+","+ foresight + ","+ heightDifference +","+reducedLevel+"\n";
		return row;
	} 
} 