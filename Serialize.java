package EF138;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Person implements Serializable
{
	int id;
	String name;
	Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

class Student extends Person
{
	String course;
	int fee;
	public Student(int id, String name, String course, int fee)
	{
		super(id,name);
		this.course = course;
		this.fee = fee;
	}
}

public class Serialize
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Enter the Students Details As follows:");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Students Stduent ID :");
			int id = sc.nextInt();
			System.out.println("Enter the Students Name:");
			String name = sc.next();
			System.out.println("Enter the Course Name:");
			String course = sc.next();
			System.out.println("Enter the Salary:");
			int salary = sc.nextInt();
			Student s1 = new Student(id,name,course,salary);
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Serialization process success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Student s = (Student)in.readObject();
			System.out.println(s.id + " " + s.name + " " + s.course + " " + s.fee);
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}