package Classwork;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        //If1. Дано целое число. Если оно является положительным,
        //то прибавить к нему 1; в противном случае не изменять его.
        //Вывести полученное число.
        System.out.println("Введите целое число: ");
        int  num=in.nextInt();
        if (num>0){
            num++;
        }
        System.out.println(num);
        */
        /*
-----------------------------------------------------------------------------------
         */
        //If2. Дано целое число. Если оно является положительным,
        //то прибавить к нему 1; в противном случае вычесть из него 2.
        //Вывести полученное число.
        /*
        System.out.println("Введите целое число: ");
        int  num=in.nextInt();
        if (num>0){
            num=num+1;
        }
        else {
            num=num-2;
        }
        System.out.println(num);
         */
        /*
------------------------------------------------------------------------------------
         */
        //If3. Дано целое число. Если оно является положительным,
        //то прибавить к нему 1; если отрицательным, то вычесть из него 2;
        //если нулевым, то заменить его на 10. Вывести полученное число.
        /*
        System.out.println("Введите целое число: ");
        int  num=in.nextInt();
        if (num>0){
            num=num+1;
        }
        else if(num==0) {
            num=10;
        }
        else {
            num-=2;
        }
        System.out.println(num);
        */
        /*
--------------------------------------------------------------------------------------
         */
        //If4. Даны три целых числа.
        //Найти количество положительных чисел в исходном наборе.
        /*
        System.out.println("Введите целое число: ");
        int  num1=in.nextInt();
        System.out.println("Введите целое число: ");
        int  num2=in.nextInt();
        System.out.println("Введите целое число: ");
        int  num3=in.nextInt();
        int result=0;
        if(num1>0){
            result++;
        }
        if(num2>0){
            result++;
        }
        if(num3>0){
            result++;
        }
        System.out.println(result);
        */
        /*
---------------------------------------------------------------------------
         */
        //If5. Даны три целых числа.
        //Найти количество положительных и количество
        //отрицательных чисел в исходном наборе.
        /*
        System.out.println("Введите целое число: ");
        int  num1=in.nextInt();
        System.out.println("Введите целое число: ");
        int  num2=in.nextInt();
        System.out.println("Введите целое число: ");
        int  num3=in.nextInt();
        int pol=0;
        if(num1>0){
            pol++;
        }
        if(num2>0){
            pol++;
        }
        if(num3>0) {
            pol++;
        }
        int otr=0;
        if(num1>0){
            otr++;
        }
        if(num2>0){
            otr++;
        }
        if(num3>0) {
            otr++;
        }
        System.out.println(pol);
        System.out.println(otr);
        */
        /*
---------------------------------------------------------------------------------------------
         */
        //If6. Даны два числа. Вывести большее из них. Если равны вывести знак "="ю
        /*
        System.out.println("Введите целое число: ");
        int  num1=in.nextInt();
        System.out.println("Введите целое число: ");
        int  num2=in.nextInt();
        if (num1>num2){
            System.out.println(num1);
        }
        else {
             if(num2>num1){
            System.out.println(num2);
                }
             else{
                 System.out.println("=");
             }
            }
        */
        /*
---------------------------------------------------------------------------------------------
         */
        //If7. Даны два числа. Вывести порядковый номер меньшего из них.
        /*
        System.out.println("Введите целое число: ");
        int num1=in.nextInt();
        System.out.println("Введите целое число: ");
        int num2=in.nextInt();
        if (num1<num2){
            System.out.println("1");
        }
        else {
            System.out.println("2");
        }
        */
        /*
---------------------------------------------------------------------------------------------
         */
        //If8. Даны два числа. Вывести вначале большее, а затем меньшее из них.
        /*
        System.out.println("Введите целое число: ");
        int num1=in.nextInt();
        System.out.println("Введите целое число: ");
        int num2=in.nextInt();
        if (num1>num2){
            System.out.println(num1);
            System.out.println(num2);
        }
        else {
            System.out.println(num2);
            System.out.println(num1);
        }
        */
        /*
---------------------------------------------------------------------------------------------
         */
        //If9. Даны две переменные вещественного типа: A, B.
        //Перераспределить значения данных переменных так,
        //чтобы в A оказалось меньшее из значений,
        //а в B — большее. Вывести новые значения переменных A и B.
        /*
        System.out.print("Введите A: ");
        int a=in.nextInt();
        System.out.print("Введите B: ");
        int b=in.nextInt();
        int c;
        if (a>b){
            c=a;
            a=b;
            b=c;
        }
        System.out.println("A="+a);
        System.out.println("B="+b);
         */
        /*
--------------------------------------------------------------------------------------------
         */
        //If10. Даны две переменные целого типа: A и B.
        //Если их значения не равны, то присвоить каждой переменной сумму этих значений,
        //а если равны, то присвоить переменным нулевые значения.
        //Вывести новые значения переменных A и B.
        /*
        System.out.print("Введите A: ");
        int a=in.nextInt();
        System.out.print("Введите B: ");
        int b=in.nextInt();
        if(a!=b){
            a=a+b;
            b=a+b;
        }
        else{
            a=0;
            b=0;
        }
        System.out.println("A="+a);
        System.out.println("B="+b);
         */
        /*
-----------------------------------------------------------------------------------------------
         */
        //If11. Даны две переменные целого типа: A и B.
        //Если их значения не равны, то присвоить каждой переменной большее из этих значений,
        //а если равны, то присвоить переменным нулевые значения.
        //Вывести новые значения переменных A и B.
        /*
        System.out.print("Введите A: ");
        int a=in.nextInt();
        System.out.print("Введите B: ");
        int b=in.nextInt();
        if(a!=b){
            if(a>b){
                b=a;
            }
            else{
                a=b;
            }
        }
        else{
            a=0;
            b=0;
        }
        */
        /*
-----------------------------------------------------------------------------------------------
         */
        //If12. Даны три числа. Найти наименьшее из них.
        /*
        System.out.print("Введите num1: ");
        int num1=in.nextInt();
        System.out.print("Введите num2: ");
        int num2=in.nextInt();
        System.out.print("Введите num3: ");
        int num3= in.nextInt();
        int res=0;
//       if(num1<num2&&num1<num3){
//            res=num1;
//        }
//        else{
//            if(num2<num1&&num2<num3){
//                res=num2;
//            }
//            else{
//                if(num3<num2&&num3<num1){
//                    res=num3;
//                }
//            }
//        }
        if (num1<num2&&num1<num3)res=num1;      //так можно делать
        else if (num2<num1&&num2<num3)res=num2; //когда один оператор
        else if (num3<num2&&num3<num1)res=num3; //и одно условие в строке
        System.out.println(res);
        */
        /*
------------------------------------------------------------------------------------------------
         */
        //If15. Даны три числа. Найти сумму двух наибольших из них.
        /*
        System.out.print("Введите num1: ");
        int num1=in.nextInt();
        System.out.print("Введите num2: ");
        int num2=in.nextInt();
        System.out.print("Введите num3: ");
        int num3= in.nextInt();
        int res=0;
        if (num1<num2&&num1<num3)res=num2+num3;
        else if (num2<num1&&num2<num3)res=num1+num3;
        else if (num3<num2&&num3<num1)res=num2+num1;
        System.out.println(res);
        */
        /*
--------------------------------------------------------------------------------------------------
         */
        //If16. Даны три переменные вещественного типа: A, B, C.
        //Если их значения упорядочены по возрастанию, то удвоить их;
        //в противном случае заменить значение каждой переменной на противоположное.
        //Вывести новые значения переменных A, B, C.
        /*
        System.out.print("Введите num1: ");
        int num1=in.nextInt();
        System.out.print("Введите num2: ");
        int num2=in.nextInt();
        System.out.print("Введите num3: ");
        int num3=in.nextInt();
        int res=0;
        if (num1==num2){
            res=num3;
        }
        else{
            if (num1==num3){
                res=num2;
            }
            else{
                if(num2==num3){
                    res=num1;
                }
            }
        }
        System.out.println(res);
        */
        
    }
}
