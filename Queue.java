import java.util.*;
class queueexception extends Exception{
    public void error()
    {
        System.out.println("Queue is full");
    }
}


class queue{
    int front=-1;
    int rear=-1;
    int q[];
    queue(int n)
    {
        q=new int[n];
    }
    void insert(int ele) throws queueexception
    {
        if(rear==q.length-1)
        {
            throw new queueexception();
        }
        if(front==-1)
        front=0;
        q[++rear]=ele;
    }
   int delete() 
    {
        int ele;
        if(front==-1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(front==rear)
        {
            ele=q[front];
            rear=front=-1;
        }
        else
        
        ele=q[front++];
             return ele;
    }
    void display()
    {
        if(front==-1)
        {
        System.out.println("queue is empty");
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.println(q[i]+"\t");
        }
    }
}

public class Queue
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of queue array");
        int n=sc.nextInt();
        queue que = new queue(n);
        boolean opt=true;
       
        while(opt)
        {
            System.out.println("Queue menu");
            System.out.println("1. Insert \n 2.Delete \n 3.Display \n 4.Exit\n");
            System.out.println("Enter your choice \n");
            int ch=sc.nextInt();
            try{
            switch(ch)
            {
                case 1 : System.out.println("enter an items to insert");
            ;
                que.insert(sc.nextInt());
                break;
                case 2: System.out.println("deleted items is "+que.delete());
                break;
                case 3: que.display();
                break;
                case 4:System.exit(0);
            }
        }
    
        catch(queueexception exe)
        {
        
           exe.error();
        }
        catch(ArrayIndexOutOfBoundsException exe1)
        {
            System.out.println("queue is empty");
        }
    
    }
    sc.close();
}
}
