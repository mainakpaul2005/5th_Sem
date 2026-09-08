import java.util.Scanner;

public class Student
{
    static class StuInfo
    {
        String name;
        int m1,m2,m3,m4,m5;
        float avgMarks;
        
        void calcAvg(int m1, int m2, int m3, int m4, int m5)
        {
            avgMarks = (m1 + m2 + m3 + m4 + m5) / 5.0f;
        }

        public StuInfo(String name, int m1, int m2, int m3, int m4, int m5)
        {
            this.name = name;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.m4 = m4;
            this.m5 = m5;

            calcAvg(m1,m2,m3,m4,m5);
        }

    }    

    public static void main(String[] args)
    {
        int studentNums = 0;
        int i;
        int m1,m2,m3,m4,m5;
        float batchAvg = 0;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of students: ");
        studentNums = sc.nextInt();

        StuInfo stuInfo[] = new StuInfo[studentNums];

        for(i = 0; i < studentNums; i++)
        {
            System.out.println("Enter Marks and Details of Student "+(i+1));
            sc.nextLine();
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            
            System.out.print("Subject 1: ");
            m1 = sc.nextInt();
            System.out.print("Subject 2: ");
            m2 = sc.nextInt();
            System.out.print("Subject 3: ");
            m3 = sc.nextInt();
            System.out.print("Subject 4: ");
            m4 = sc.nextInt();
            System.out.print("Subject 5: ");
            m5 = sc.nextInt();
            stuInfo[i] = new StuInfo(name, m1, m2, m3, m4, m5); 
        }

        for(i = 0; i < studentNums; i++)
        {
            System.out.println("The Average Marks of Student"+(i+1)+" is: "+stuInfo[i].avgMarks);
            batchAvg += stuInfo[i].avgMarks;
        }

        batchAvg = batchAvg / studentNums;
        System.out.println("The Average Marks of Batch is: "+batchAvg);

        sc.close();
    }
}
