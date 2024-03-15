// public class OOPS {
//     public static void main(String args[]){
//         Pen p1=new Pen();
//         p1.setColor("Blue");
//         System.out.println(p1.color);
//         p1.setTip(5);
//         System.out.println(p1.tip);
//        // p1.setColor("yellow");
//         p1.color="Yellow";
//         System.out.println(p1.color);

//         BankAccount myAcc = new BankAccount();

    
//     }

// }

// class Pen {
//     String color;
//     int tip;

//     void setTip(int newTip){
//         tip = newTip;
//     }
//     void setColor(String newColor){
//         color = newColor;
//     }
// }

// class student {
//     String name;
//     int age;
//     float percentage; //cgpa

//     void calcPercentage(int phy,int chem, int math){
//         percentage = (phy + chem + math) / 3;
        
//     }
// }


// public class OOPS {

//     public static void main(String args[]){
//         OOPS oops = new OOPS();
//         OOPS.student s1 = oops.new student("Shradha");
//         System.out.println(s1.name);
//     }
//     class student{
//         String name;
//         int roll;
//         student(){
//             System.out.print("constructor is called",101);
//             // this.name = name;
//             // this.roll = roll;
//         }
//     }
// }


//  another method

// public class OOPS {

//     public static void main(String args[]){
//         OOPS oops = new OOPS(); // Creating an instance of the outer class
//         OOPS.student s1 = oops.new student("Shradha", 101); // Creating an instance of the inner class
//         System.out.println(s1.name);
//     }

//     class student{
//         String name;
//         int roll;
        
//         student(String name, int roll){
//             this.name = name;
//             this.roll = roll;
//         }
//     }
// }
