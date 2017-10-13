package myPackage2;



	import myPackage.*; // here if we use this import packagename.* we can access all the classes in mypackage
	import myPackage.Class1;//or we can use mypackage.classname where we can accessible only the .classfile in this package 

	public class Class2 { //created another main class as Class2

		public static void main(String[] args) { //created main method
			
			System.out.println("The properties of  Lion are :");   
			
			Class1 demo =new Class1(); //here i have created the object for the Class1 here it shows the error that to import package of class1
			System.out.println("here the class1 methods has been called in the different package");
			demo.roars(); 
			demo.attacks();

		}

	}
