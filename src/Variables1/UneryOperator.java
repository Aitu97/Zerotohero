package Variables1;

public class UneryOperator {

    public static void main(String[] args) {
        int studentAge=25;
        studentAge++; //26
        // if there is no assignment result will be 26;
        studentAge--; //25
        ++studentAge; //26
        --studentAge; //25

        studentAge=studentAge++; //25

        studentAge=++studentAge; //26

        System.out.println(studentAge);

        studentAge=2*studentAge++;
        // 2*26=52

        System.out.println(studentAge);

        studentAge=2*++studentAge;
        //2*27=54;
        int x=3;
        int k=++x*5/x--+--x; // 4*5/4 = x = 3
        // k=4*5/4+2
        // k=20/4+2
        // k=5+2;
        // x = 2
        // k = 7

        System.out.println(x);
        System.out.println(k);

        int n=4;
        // if we use after variable n will increase after finishing the execution
        // execution will finish with semicolon
        int r=++n+n++-3;
        // r= 5+5-3=7
        // n= 6

        System.out.println(r);
        System.out.println(n);





    }
}
