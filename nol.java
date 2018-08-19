import java.io.*;
public class program {
	public static void main(String[] args){
		File inFile = null;
		if (args.length > 0){
		// text file will be passed during run time
			inFile = new File(args[0]);
		} 
		else
		{
			System.out.println("Cant Find The File Specified : " + inFile);
		}

		    BufferedReader br = null;

		    String sCurrentLine = null;
			
		    int a = 0, b = 0, c = 0, cy=0;

		    try {

		        // passing the text file location for FileReader.

		        br = new BufferedReader(new FileReader(inFile));

		        // Looping through the text file

		        while ((sCurrentLine = br.readLine()) != null) {

		            // avoid multi-line comments and one line comments and new
		            // lines.

		            if ((sCurrentLine.startsWith("/*") && sCurrentLine
		                    .endsWith("*/"))
		                    || sCurrentLine.startsWith("//")
		                    || sCurrentLine.isEmpty()
		                    || (sCurrentLine.trim().matches("[{]+")))
		                  
		            {
		                // count the number of comment lines and new lines to
		                // exclude it from count.

		                b++;

		                // Getting any function in the text file that start and end
		                // with ().
		        }
		        
		             
		            
		      else if(sCurrentLine.matches("\\s*(if|switch|for|while|catch)\\s*\\(.+\\)"))
		                   {

		                	cy =cy +1;
		                	
		                	} 
		            
		                else {

		                // printing the text file just for checking

		                System.out.println(sCurrentLine);

		                // count the total number of lines

		                a++;

		            }

		    }   
		    
		        

		        // excluding the number of lines that has comments and new lines

		        c = a - b;

		        // printing the number of lines excluding comments and new lines

		        System.out.println("Number of Lines are : " + c);

		        System.out.println("Cyclometric Complexity is  : " + cy );

		       
		        }        
		        
		    

		    catch (IOException e) {

		        System.out.println(e.getMessage());

		    }

		    finally {

		        try {

		            // close bufferReader

		            if (br != null) {

		                br.close();

		            }

		        } catch (IOException ex) {

		            System.out.println(ex.getMessage());

		        }
		    }
    }
}