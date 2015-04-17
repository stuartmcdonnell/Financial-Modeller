//BRANCH - READ MODIFIED

package enrolement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Enrolement {
    
    //public static Student sarray[] = new Student[20];
    static ArrayList<Student> sarray = new ArrayList<Student>(20);
    
    static String writeLine;
    static ArrayList arrayListRead = new ArrayList( );
    static int writeIndex = 0;
    static int storeIndex = 0;
    

    public static void main(String[] args) {

       //createStudent();
       //createStudent();
       //saveFile();
       readFile();

    }

    public static void saveFile() {

        try {
          
            PrintWriter spr = new PrintWriter("StudentDetails.txt");
            
            int arrayIndex = 0;
            
            for(int tempindex = 0; tempindex < 20; tempindex++){
                
                writeLine = (sarray.get(tempindex).name+","+sarray.get(tempindex).dob+","+sarray.get(tempindex).gender+","+sarray.get(tempindex).addr+","+sarray.get(tempindex).courseID+",");
                //writeLine = (sarray[tempindex].name + "," + sarray[tempindex].dob + "," + sarray[tempindex].gender + "," + sarray[tempindex].addr + "," + sarray[tempindex].courseID);
                //System.out.println("Writing: "+writeLine);
                spr.println(writeLine);
                arrayIndex++;
                System.out.println("Size: "+sarray.size());
                System.out.println("Temp Index: "+sarray.size());
                
                if(arrayIndex == sarray.size()){
                spr.close();
                System.out.println("Closed");
                
                }
                
            }
            

            
        } catch (Exception e) {
        }
    }

    public static void createStudent() {
        Student s = new Student();
        
        sarray.add(s.createStudent());
        StringBuilder sb = new StringBuilder();
        
        sb.append(sarray.get(writeIndex).name);
        sb.append(sarray.get(writeIndex).dob);
        sb.append(sarray.get(writeIndex).gender);
        sb.append(sarray.get(writeIndex).addr);
        sb.append(sarray.get(writeIndex).courseID);
        
       // System.out.println("INPUT: "+sb.toString());
        storeIndex++;
        //System.out.println("Store Index: "+storeIndex);
    }

    public static void readFile() {
        try {

            BufferedReader fileReader = new BufferedReader(new FileReader("StudentDetails.txt"));
            StringBuilder sb = new StringBuilder();
            String line = fileReader.readLine();
            //for open
            
            int sectionIndex = 0;
            
            for(int index = 0; index < 10; index++){
                
                sb.append(line);
                
                //Splits the String into compontents in the array section.
                String section[] = sb.toString().split(",");
                
                arrayListRead.add(section[index]);
                line = fileReader.readLine();

            }//for close
            
            String everything = arrayListRead.toString();
            //String everything = sb.toString();
            System.out.println(everything);
           
            fileReader.close();
            
        } 
        catch (Exception e) {
        } 
    
        } 
}
