import java.util.Scanner;

public class Stack {
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    Node top;
    int height;
    Stack(){

    }

    void display(){
        Node temp= top;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void getHeight(){
        System.out.println(height);
    }
    void getTop(){
        System.out.println(top.value);
    }

    void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top= newNode;
        }
        else{
            newNode.next= top;
            top =newNode;
        }
        height++;
    }

    Node pop(){
        if(height ==0){
            return null;
        }
        Node temp = top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack mystack = new Stack();

        System.out.println("********************");
        System.out.println("Stack Implementation");
        System.out.println("********************");
        System.out.println("Enter the elements: ");

        int data =0;
        while(true){
            data = sc.nextInt();
            if(data == -1){
                break;
            }
            mystack.push(data);
        }


        System.out.println("Stack after pushing");
        mystack.display();

        char choice ='y';
        while(choice == 'y'){
            System.out.println();
            System.out.println("1.Push element\n2.Pop element \n3.Top of the stack \n4.Display");
            System.out.println();
            System.out.println("Enter the value to perform the required operation: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the value: ");
                    mystack.push(sc.nextInt());
                    System.out.println("Stack after pushing");
                    mystack.display();
                    break;

                case 2:
                    System.out.println("Stack Elements before pop ");
                    mystack.display();
                    System.out.println("Stack Elements after pop");
                    mystack.pop();
                    mystack.display();
                    break;

                case 3:
                    System.out.println("Stack Elements  ");
                    mystack.display();
                    System.out.println("Top of the stack");
                    mystack.getTop();
                    break;

                case 4:
                    System.out.println("Stack Elements");
                    mystack.display();
                    break;


            }
            System.out.println("Do you want to continue(y/n): ");
            ch=sc.next().charAt(0);

        }

    }
}
