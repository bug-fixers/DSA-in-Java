package circular_Singly_Linked_list;
import java.util.Scanner;
class Main 
{
	static class Node
	{
		private int Data;
		private Node Next;
		Node() 
		{
			Data = 0;
			Next = null;
		}
		Node(int n)
		{
			Data = n;
			Next = null;
		}
	}
    Node Head;
    Main ()
    {
    	Head=null;
    }
	void addFirst(int num) 
	{
		Node n = new Node(num);
		if (Head == null) 
		{
			Head = n;
			n.Next=Head;
		} 
		else 
		{
			Node trav = Head;
			while(trav.Next!=Head)
			{
				trav=trav.Next;
			}
			n.Next = Head;
			trav.Next=n;
		}
		Head=n;

	}
	void addLast(int num)
	{
		Node n=new Node(num);
		if(Head==null)
		{
			Head=n;
			n.Next=Head;
		}
		else
		{
			Node trav=Head;
			while(trav.Next!=Head)
			{
				trav=trav.Next;
			}
			n.Next=Head;
			trav.Next=n;
		}
	}
	void display() 
	{
		if (Head == null) 
		{
			System.out.println("Linked List Is Empty");
		} 
		else
		{
			Node trav = Head;
			do 
			{
				System.out.println(trav.Data);
				trav = trav.Next;
			} while (trav != Head);
		}
	}
	void addAtPosition(int num,int pos)
	{
		if (Head!=null)
		{
			int count =0;
			if(pos==1)
			{
				addFirst(num);
			}
			Node trav=Head;
			do {
				trav=trav.Next;
				count++;
			}while(trav!=Head);
			System.out.println(count);
			if(pos >0 && pos<=count)
			{
				Node n=new Node(num);
				trav=Head;
				for(int i=1;i<pos-1;i++)
				{
					trav=trav.Next;
				}
				n.Next=trav.Next;
				trav.Next=n;
			}
			else if(pos==count+1)
			{
				addLast(num);
			}
			else 
			{
				System.out.println("Invalid Position");
			}
		}
		else
		{
			System.out.println("Linked List Is Empty");
		}
		
	}
	void deleteFirst()
	{

		if (Head == null) 
		{
			System.out.println("Linked List Is Empty");
		} 
		else
		{
			Node trav=Head;
			while (trav.Next!=Head)
			{
				trav=trav.Next;
			}
			Head=Head.Next;
			trav.Next=Head;
		}
	}
	void deleteLast()
	{
		if (Head == null) 
		{
			System.out.println("Linked List Is Empty");
		} 
		else
		{
			int count=1;
			Node trav = Head;
			while(trav.Next!=Head)
			{
				trav=trav.Next;
				count ++;
			}
			trav=Head;
			for (int i=1;i<count-1;i++)
			{
				trav=trav.Next;
			}
			trav.Next=Head;
		}
	}
	void deleteAtPosition(int pos)
	{
		if (pos==1)
		{
			deleteFirst();
		}
		else
		{
			int count=1;
			Node trav=Head;
			while (trav.Next!=Head)
			{
				trav=trav.Next;
				count++;
			}
			if (pos==count)
			{
				deleteLast();
			}
			else if(pos <count && pos>0)
			{
				trav=Head;
				for (int i=1;i<pos-1;i++)
				{
					trav=trav.Next;
				}
				trav.Next=trav.Next.Next;
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
			while(trav.Next!=Head)
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
public class Linked_List {
	public static void main(String[] args) {
		int choice, num;
		Scanner Sc = new Scanner(System.in);
		Main SLL = new Main();
		do {
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
			choice = Sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Number");
				num = Sc.nextInt();
				SLL.addFirst(num);
				break;
			case 2:
				System.out.println("Enter Number");
				num = Sc.nextInt();
				SLL.addLast(num);
				break;
			case 3:
				System.out.println("Enter Number");
				num = Sc.nextInt();
				System.out.println("Enter The Position");
				int pos = Sc.nextInt();
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
				pos = Sc.nextInt();
				SLL.deleteAtPosition(pos);
				break;
			case 7:
				SLL.searchnddelete();
				break;
			case 8:
				SLL.display();
				break;
			case 9:
				System.out.println("Exit successful");
				break;
			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 9);
		Sc.close();

	}
}
