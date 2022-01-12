package singly_Linked_List;
import java.util.Scanner;

class Node
{
	int Data;
	Node Next; 
	Node Head; 
	Node()
	{
		Data=0;
		Next=null;
	}
}
class SinglyLinkedList extends Node 
{
	void addFirst(int num)          
	{
		Node nn=new Node();
		nn.Data=num;                 
		if (Head==null)
		{
			Head=nn;
		}
		else
		{
			nn.Next=Head;
			Head=nn;
		}
	}
	void addLast(int num)
	{
		Node nn=new Node();
		nn.Data=num;
		if (Head==null)
		{
			Head=nn;
		}
		else
		{
			Node temp=new Node();
			temp=Head;
			while(temp.Next!=null)
				{
					temp=temp.Next;
				}
			temp.Next=nn;
		}
	}
	void addAtPosition(int num,int pos)
	{
     Node trav=new Node();
     trav=Head;
     int count=1;
     if (Head==null)
     {
    	 System.out.println("Linked List Is Empty");
     }
     else
     {
    	 while(trav.Next!=null)
    	 {
    	 trav=trav.Next;
    	 count++;
    	 }
     if(pos==1)
     {
    	 addFirst(num);
     }
     else if(pos==(count+1))
     {
    	 addLast(num);
     }
     else if(pos<=count )
     {
    	 	trav=Head;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.Next;
			}
			Node nn=new Node();
			nn.Data=num;
			nn.Next=trav.Next;
			trav.Next=nn;
     }
     else
     {
    	 System.out.println("Invalid Position");
    	 
     }
     }
     
	}
	void display()
	{
		if (Head==null)
		{
			System.out.println("Linked List Is Empty");
		}
		else
		{
			Node temp=new Node();
			temp=Head;
			System.out.print("Linked List : ");
			while(temp.Next!=null)
			{
				System.out.print(temp.Data);
				System.out.print("  ");
				temp=temp.Next;
			}
			System.out.print(temp.Data+"\n");
		}
	}
	void deleteFirst()
	{
		if (Head==null)
		{
			System.out.println("Linked List Is Empty");
		}
		else
		{
			Head=Head.Next;
		}
	}
	void deleteLast()
	{
		if (Head==null)
		{
			System.out.println("Linked List Is Empty");
		}
		else
		{
			Node temp=new Node();
			temp=Head;
			int count=1;
			while(temp.Next!=null)
			{
				temp=temp.Next;
				count++;
			}
			if (count==1)
			{
				deleteFirst();
			}
			else
			{
				temp=Head;
				for (int i=1;i<count-1;i++)
				{
					temp=temp.Next;
				}					
				temp.Next=null;
			}
			
		}
	}
	void deleteAtPosition(int pos)
	{
		if(Head==null)
		{
			System.out.println("Linked List Is Empty");
		}
		else
		{
			Node temp=new Node();
			temp=Head;
			int count=1;
			temp=temp.Next;
			while(temp!=null)
			{
				temp=temp.Next;
				count++;
			}
			if (pos<count && pos>1)
			{
				Node trav=new Node();
				trav=Head;
				for(int i=1;i<pos-1;i++)
				{
					trav=trav.Next;
				}
				trav.Next=trav.Next.Next;
			}
			else if(pos==1)
			{
				Head=Head.Next;
			}
			else if(count==pos && pos>0)
			{
				deleteLast();
			}
			else
			{
				System.out.println("Invalid Position");
			}
		}
	}
	void searchnddelete()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter The Number For Searching & Deleting");
		int num=Sc.nextInt();
		if (Head==null)
		{
			System.out.println("Linked List Is Empty");
		}
		else
		{
			int count=1,flag=0;
			Node trav=new Node();
			trav=Head;
			while(trav.Next!=null)
			{
				if(trav.Data==num)
				{
					deleteAtPosition(count);	
					flag=1;
					break;
				}
				trav=trav.Next;
				count++;
			}
			if(trav.Data==num && flag==0)
			{
				deleteAtPosition(count);
				flag=1;
			}
			else if(flag==0)
			{
				System.out.println("Number Not Found In Linked List");
			}
		}
	}
	
}
public class Linked_List 
{
	
	public static void main(String[] args)
	{
		int choice,num;
		Scanner Sc=new Scanner(System.in);
		SinglyLinkedList SLL=new SinglyLinkedList();
		do 
		{
			System.out.println("Enter Choice");
			System.out.println("1) Add At First Position");
			System.out.println("2) Add At Last Position");
			System.out.println("3) Add At Particular  Position");
			System.out.println("4) Delete From First Position");
			System.out.println("5) Delete From Last Position");
			System.out.println("6) Delete From Particular Position");
			System.out.println("7) Search And Delete");
			System.out.println("8) Display Linked List");
			System.out.println("9) Exit");
			choice=Sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Number");
				 num=Sc.nextInt();
				SLL.addFirst(num);
				break;
			case 2:
				System.out.println("Enter Number");
				 num=Sc.nextInt();
				SLL.addLast(num);
				break;
			case 3:
				System.out.println("Enter Number");
				num=Sc.nextInt();
				System.out.println("Enter The Position");
				int pos=Sc.nextInt();
				SLL.addAtPosition(num, pos);
				break;
			case 4:
				SLL.deleteFirst();
				break;
			case 5:
				SLL.deleteLast();
				break;
			case 6:
				System.out.println("Enter The Position");
				pos=Sc.nextInt();
				SLL.deleteAtPosition(pos);
				break;
			case 7:
				SLL.searchnddelete();
				break;
			case 8:
				SLL.display();
				break;
			case 9:System.out.println("Exited");
				break;
			default:
				System.out.println("Invalid Choice");
			}
			
			
		}while(choice!=9);
		Sc.close();
		
	}
}
