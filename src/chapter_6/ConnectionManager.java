package chapter_6;

class Connection { 
	 private static int counter = 0; 
	 private int id = counter++; 
	 Connection() {} 
	 public String toString() { 
		 return "Connection " + id; 
	 }
}

public class ConnectionManager { 
	 private static Connection[] connections = new Connection[5]; 
	 private static int counter = 0; 
	 static { 
		 for(int i = 0; i < 5; i++) 
			 connections[i] = new Connection(); 
	 }
	 public static Connection getConnection() { 
		 if(counter < connections.length){
			 return connections[counter++];
		 }else{
			 return null;
		 }
	 } 
	 public static void main(String args[]) { 
		 for(int i = 0; i < 5; i++){
			 Connection connection = ConnectionManager.getConnection();
			 System.out.println(connection);
		 }
	 } 
}