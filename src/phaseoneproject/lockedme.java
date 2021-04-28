package phaseoneproject;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lockedme {

	public static void main(String[] args) {
		System.out.println("============================================================================");
        System.out.println(                   "*					*");
        System.out.println(                   "*   Welcome To LockMe.com		*");
        System.out.println(                   "*   Your Personal Digital Locker	*");
        System.out.println(                   "*   Developer - Sachin    *");
        System.out.println(                   "*   contact deatils: sachin1997.chauhan@gmail.com    *");
        System.out.println(                   "*  for any query feel free to write a mail *");
        System.out.println(                   "*					*");
        System.out.println("=============================================================================");
        System.out.println("Please read all the options carefully and provide input as required");
        System.out.println();
		
		homescreen();
		
	}


		private static void CDS_file() {
			 Scanner CDS = new Scanner(System.in);
			 System.out.println("");
			System.out.println("press 1 to create file");
			System.out.println("press 2 to delete file");
			System.out.println("press 3 to search the file and to find all the information about the file ");
			System.out.println("press 4 to list all the files in existing directory ");
			System.out.println("press 5 to go on the home page");
			
			
			System.out.print("please enter a valid option");
			  int input= CDS.nextInt();
			  switch(input){
			  case(1):
				  createfile();
			  break;
			  
			  case(2):
				  deletefile();
			  break;
			  
			  case(3):
			   searchfile();
			   break;
			   
			   case(4):
				   viewlist();
			   break;
			   
			  case(5):
				  homescreen();
			  break;
			   
			   default:
				   System.out.println("please enter a valid option");
				   break;
			  }
			 


		
	}


		private static void homescreen() {
			
			System.out.println("");
			Scanner input = new Scanner(System.in);
			System.out.println("welcome to the home page");
			System.out.println("press 1 to show current file name in root directory");
			System.out.println("press 2 to create/delete/search  a user file");
			System.out.println("press 3 to exit");
	        System.out.print("please enter a valid option"+ " ");	
			int option = input.nextInt();
			switch(option) {
			case (1):
				rootdirectory();
			break;
			
			case(2):
			   CDS_file();
			break;
			   
			case(3):
				System.exit(0);
			break;
			
			default:
				System.out.println("please choose a valid option");
			break;
			
			}
	

		 
	        
		
	}
	     private static void rootdirectory() {
			// TODO Auto-generated method stub
	    	 Scanner sc = new Scanner (System.in);
	    	 System.out.println("");
	    	 System.out.println("Please Enter the Root Directory path");
	    	 String File4 = sc.next();
	    	 
	    	 File myfile5 = new File(File4);
	    	 
	    	 for( String s : myfile5.list()) {
	    		 System.out.println(s);
	    	 }
	    	 System.out.println("");
	    	 homescreen();
		}


		private static void createfile() {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in) ;
		// TODO Auto-generated method stub
	    	 try{
	    		 System.out.println("");
	    		 System.out.println("please enter your file name");
	    		 String create = sc.next();
	    		 
	    		 File myfile = new File("C:\\Users\\sachin\\Desktop\\Projects\\phaseone\\" +create+".txt");
	    		if(myfile.createNewFile()) {
	    		System.out.println("file has been created" + " "+myfile.getName());
	    		 System.out.println("");
	    		CDS_file();
	    		}
	    		else {
	    			System.out.println("file already exists");
	    			 System.out.println("");
	    			createfile();
	    		}
	    	 }
	    	 catch (IOException e) {
	    		 System.out.println("file already exists");
	    		 e.printStackTrace();
				// TODO: handle exception
			}
		
	}
	     private static void deletefile() {
	 		// TODO Auto-generated method stub
	    	 
	    
	    		 Scanner sc = new Scanner(System.in);
		    	 System.out.println("Enter the file name that you want to delete ");
		    	 String delete = sc.next();
		    	 File myfileone = new File("C:\\Users\\sachin\\Desktop\\Projects\\phaseone\\" +delete+".txt");    	 
		    	 if(myfileone.delete()) {
		    		 System.out.println("file succesfully deleted \n" +""+ myfileone.getName());
		    		 System.out.println("");
		    		 CDS_file();
		         }
		    	 else {
		    		 System.out.println(" failed to delete this file");
		    		 
		    	 }
		   
	     }
	    	 
	    	 
	 		

	     private static void searchfile() {
	   
	 		// TODO Auto-generated method stub
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.println("");

			 System.out.print("please enter your file name"+" ");
    		 String input = sc.next();
    		 
    		 File myfile3 = new File("C:\\Users\\sachin\\Desktop\\Projects\\phaseone\\" +input+".txt");  
    		 if(myfile3.exists()) {
    			 System.out.println("File name"+"->"+myfile3.getName());
    			 System.out.println("Absolute path"+ "-> "+myfile3.getAbsolutePath());
    			 System.out.println("Writable"+ "-> "+myfile3.canWrite());
    			 System.out.println("Readable"+ "-> "+myfile3.canRead());
    			 System.out.println("File size in bytes"+ "-> "+myfile3.length());
    			 System.out.println("");
    			 CDS_file();
    				 
    			 
    		 }
    		 else {
    			 System.out.println("file doesn't exists");
    			 System.out.println("");
    			 homescreen();
    		 }
    			 
			
	}
	 	private static void viewlist() {
			// TODO Auto-generated method stub
	 		File myfiletwo = new File("C:\\Users\\sachin\\Desktop\\Projects\\phaseone");
	 		
	 		for(String s : myfiletwo.list()) {
	 			System.out.println(s);
	 		}
	 		 System.out.println("");
			CDS_file();
		}

	     

}

