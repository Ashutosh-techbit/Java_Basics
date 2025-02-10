class students{
      
    int marks;
    int rollno;
    String name;
   static char section; //static keyword makes section common in every object. The last declaration of section will be taken as section for all objects
}

class arraywithobjects{

    public static void main(String[] args){

        students s1 = new students();   //s1 object dcelaration
        s1.name="ashu";
        s1.rollno=1;
        s1.marks=99;
        s1.section='A';

        students s2 = new students();   //s2 object dcelaration
        s2.name="kia";
        s2.rollno=2;
        s2.marks=23;
        s2.section ='B';
        
        students s3 = new students();   //s3 object dcelaration
        s3.name="au";
        s3.rollno=4;
        s3.marks=19;
        s3.section='C';
        
        students test[] = new students[3];  //array declaration
        test[0]=s1;
        test[1]=s2;
        test[2]=s3;

        s1.section='A'; 
        // for(int i=0;i<test.length;i++){
        //     System.out.println(test[i].name + " " + test[i].rollno + " "  + test[i].marks);
        // }

        for(students stud: test){
         System.out.println(stud.name + " "  + stud.rollno +" "+ stud.section);
        }

    }
     
}