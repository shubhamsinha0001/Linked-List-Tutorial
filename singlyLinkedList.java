import java.util.*;
class Node
{
	Node next;
	int data;
	Node(int x)
	{
		data=x;
		next=null;
	}
}
class singlyLinkedList
{
	Node start=null;
	public void insertFirst(int x)
	{
		if(start==null)
		{
			Node newNode=new Node(x);
			start=newNode;
		}
		else
		{
			Node newNode=new Node(x);
			newNode.next=start;
			start=newNode;
		}
	}
	public void insertLast(int x)
	{
		if(start==null)
		{
			Node newNode=new Node(x);
			start=newNode;
		}
		else
		{
			Node newNode=new Node(x);
			Node current=start;
		while(current.next!=null)
			current=current.next;
			current.next=newNode;
			newNode.next=null;
		
		}
	}
	public void insertAtPosition(int key, int x)
	{
		if(start==null)
		{
			Node newNode=new Node(x);
			start=newNode;
		}
		else
		{
			
			Node current=start;
			while(current.next!=null && current.data!=key)
			{
				current=current.next;
			}
			if(current.data==key)
			{
				Node newNode=new Node(x);
				newNode.next=current.next;
				current.next=newNode;
			}
			else
			{
				System.out.println("data not found");
			}
		}
	}
	public void display()
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current=start;
			while(current.next!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.print(current.data+" ");
		}
	}
	public void deleteBegning()
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current=start;
			start=start.next;
			current=null;
		}
	}
	public void deleteLast()
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current=start;
			Node lastCurrent=start;
			while(current.next!=null)
			{
				lastCurrent=current;
				current=current.next;
			}
			lastCurrent.next=null;
			current=null;
		}
	}
	public void deleteAtPosition(int key)
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current=start;
			Node lastCurrent=start;
			while(current.next!=null && current.data!=key)
			{
				lastCurrent=current;
				current=current.next;
			}
			if(current.data==key)
			{
				lastCurrent.next=current.next;
				current=null;
			}
			else
			{
				System.out.print("Entered data is not present");
			}
		}
	}
		
			
		
		
}
class main
{
	public static int choice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for insertion at begning");
		System.out.println("enter 2 for insertion at last");
		System.out.println("enter 3 for insertion at user defined position");
		System.out.println("enter 4 for deletion at begning");
		System.out.println("enter 5 for deletion at last");
		System.out.println("enter 6 for deletion at user defined position");
		System.out.println("enter 7 to display");
		System.out.println("enter 8 to exit");
		System.out.println("enter your choice");
		int choice =sc.nextInt();
		return choice;
	}
		
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		singlyLinkedList l1=new singlyLinkedList();
		int f=1;
		while(f==1)
		{
			int ch=choice();
			switch(ch)
			{
				case 1:
				{
					System.out.println("enter no to insert");
					int x=sc.nextInt();
					l1.insertFirst(x);
					break;
				}
				case 2:
				{
					System.out.println("enter no to insert");
					int x=sc.nextInt();
					l1.insertLast(x);
					break;
				}
				case 3:
				{
					System.out.println("enter the number after which you want to enter");
					int key=sc.nextInt();
					System.out.println("enter the number you want to enter");
					int x=sc.nextInt();
					l1.insertAtPosition(key,x);
					break;
				}
				case 4:
				{
					
					l1.deleteBegning();
					break;
				}
				case 5:
				{
					
					l1.deleteLast();
					break;
				}
				case 6:
				{
					System.out.println("enter the number  which you want to delete");
					int key=sc.nextInt();
					l1.deleteAtPosition(key);
					break;
				}
				case 7:
				{
					
					l1.display();
					break;
				}
				default:
				{
					f=0;
					System.out.println("THANKS");
					break;
				}
			}
			
		}
					
	}
}
		
				
			
			
			
			
	