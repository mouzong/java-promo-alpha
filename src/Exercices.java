public class Exercices {

    public static void main(String[] args) {

        System.out.println("[Table de multiplication de 1]\n\t" +
                        "1*1="+ 1 +"\n\t" +
                        "1*2="+ 2 +"\n\t" +
                        "1*3="+ 3 +"\n\t" +
                        "1*4="+ 4 +"\n\t" +
                        "1*5="+ 5 +"\n\t" +
                        "1*6="+ 6 +"\n\t" +
                        "1*7="+ 7 +"\n\t" +
                        "1*8="+ 8 +"\n\t" +
                        "1*9="+ 9 +"\n\t" +
                        "1*10="+ 10 +"\n\t" +
                        "1*11="+ 11 +"\n\t" +
                        "1*12="+ 12);

        multiplicationNbre1(1);
    }
    static void multiplicationNbre1(int nbre){
        System.out.println("[===================================Table de multiplication de 1 à 9==================================]\n"
                +nbre+"*1="+(nbre)+"\t\t"+(nbre+1)+"*1="+((nbre + 1))+"\t\t"+(nbre+2)+"*1="+((nbre + 2))+"\t\t"+(nbre+3)+"*1="+((nbre + 3))+"\t\t"+(nbre+4)+"*1="+((nbre + 4))+"\t\t"+(nbre+5)+"*1="+((nbre + 5))+"\t\t"+(nbre+6)+"*1="+((nbre + 6))+"\t\t"+(nbre+7)+"*1="+((nbre + 7))+"\t\t"+(nbre+8)+"*1="+((nbre + 8))+"\n"
                +nbre+"*2="+(nbre*2)+"\t\t"+(nbre+1)+"*2="+((nbre+1)*2)+"\t\t"+(nbre+2)+"*2="+((nbre + 2)*2)+"\t\t"+(nbre+3)+"*2="+((nbre + 3)*2)+"\t\t"+(nbre+4)+"*2="+((nbre + 4)*2)+"\t\t"+(nbre+5)+"*2="+((nbre + 5)*2)+"\t\t"+(nbre+6)+"*2="+((nbre + 6)*2)+"\t\t"+(nbre+7)+"*2="+((nbre + 7)*2)+"\t\t"+(nbre+8)+"*2="+((nbre + 8)*2)+"\n"
                +nbre+"*3="+(nbre*3)+"\t\t"+(nbre+1)+"*3="+((nbre+1)*3)+"\t\t"+(nbre+2)+"*3="+((nbre + 2)*3)+"\t\t"+(nbre+3)+"*3="+((nbre + 3)*3)+"\t\t"+(nbre+4)+"*3="+((nbre + 4)*3)+"\t\t"+(nbre+5)+"*3="+((nbre + 5)*3)+"\t\t"+(nbre+6)+"*3="+((nbre + 6)*3)+"\t\t"+(nbre+7)+"*3="+((nbre + 7)*3)+"\t\t"+(nbre+8)+"*3="+((nbre + 8)*3)+"\n"
                +nbre+"*4="+(nbre*4)+"\t\t"+(nbre+1)+"*4="+((nbre+1)*4)+"\t\t"+(nbre+2)+"*4="+((nbre + 2)*4)+"\t\t"+(nbre+3)+"*4="+((nbre + 3)*4)+"\t\t"+(nbre+4)+"*4="+((nbre + 4)*4)+"\t\t"+(nbre+5)+"*4="+((nbre + 5)*4)+"\t\t"+(nbre+6)+"*4="+((nbre + 6)*4)+"\t\t"+(nbre+7)+"*4="+((nbre + 7)*4)+"\t\t"+(nbre+8)+"*4="+((nbre + 8)*4)+"\n"
                +nbre+"*5="+(nbre*5)+"\t\t"+(nbre+1)+"*5="+((nbre+1)*5)+"\t\t"+(nbre+2)+"*5="+((nbre + 2)*5)+"\t\t"+(nbre+3)+"*5="+((nbre + 3)*5)+"\t\t"+(nbre+4)+"*5="+((nbre + 4)*5)+"\t\t"+(nbre+5)+"*5="+((nbre + 5)*5)+"\t\t"+(nbre+6)+"*5="+((nbre + 6)*5)+"\t\t"+(nbre+7)+"*5="+((nbre + 7)*5)+"\t\t"+(nbre+8)+"*5="+((nbre + 8)*5)+"\n"
                +nbre+"*6="+(nbre*6)+"\t\t"+(nbre+1)+"*6="+((nbre+1)*6)+"\t\t"+(nbre+2)+"*6="+((nbre + 2)*6)+"\t\t"+(nbre+3)+"*6="+((nbre + 3)*6)+"\t\t"+(nbre+4)+"*6="+((nbre + 4)*6)+"\t\t"+(nbre+5)+"*6="+((nbre + 5)*6)+"\t\t"+(nbre+6)+"*6="+((nbre + 6)*6)+"\t\t"+(nbre+7)+"*6="+((nbre + 7)*6)+"\t\t"+(nbre+8)+"*6="+((nbre + 8)*6)+"\n"
                +nbre+"*7="+(nbre*7)+"\t\t"+(nbre+1)+"*7="+((nbre+1)*7)+"\t\t"+(nbre+2)+"*7="+((nbre + 2)*7)+"\t\t"+(nbre+3)+"*7="+((nbre + 3)*7)+"\t\t"+(nbre+4)+"*7="+((nbre + 4)*7)+"\t\t"+(nbre+5)+"*7="+((nbre + 5)*7)+"\t\t"+(nbre+6)+"*7="+((nbre + 6)*7)+"\t\t"+(nbre+7)+"*7="+((nbre + 7)*7)+"\t\t"+(nbre+8)+"*7="+((nbre + 8)*7)+"\n"
                +nbre+"*8="+(nbre*8)+"\t\t"+(nbre+1)+"*8="+((nbre+1)*8)+"\t\t"+(nbre+2)+"*8="+((nbre + 2)*8)+"\t\t"+(nbre+3)+"*8="+((nbre + 3)*8)+"\t\t"+(nbre+4)+"*8="+((nbre + 4)*8)+"\t\t"+(nbre+5)+"*8="+((nbre + 5)*8)+"\t\t"+(nbre+6)+"*8="+((nbre + 6)*8)+"\t\t"+(nbre+7)+"*8="+((nbre + 7)*8)+"\t\t"+(nbre+8)+"*8="+((nbre + 8)*8)+"\n"
                +nbre+"*9="+(nbre*9)+"\t\t"+(nbre+1)+"*9="+((nbre+1)*9)+"\t\t"+(nbre+2)+"*9="+((nbre + 2)*9)+"\t\t"+(nbre+3)+"*9="+((nbre + 3)*9)+"\t\t"+(nbre+4)+"*9="+((nbre + 4)*9)+"\t\t"+(nbre+5)+"*9="+((nbre + 5)*9)+"\t\t"+(nbre+6)+"*9="+((nbre + 6)*9)+"\t\t"+(nbre+7)+"*9="+((nbre + 7)*9)+"\t\t"+(nbre+8)+"*9="+((nbre + 8)*9)+"\n"
                +nbre+"*10="+(nbre*10)+"\t\t"+(nbre+1)+"*10="+((nbre+1)*10)+"\t\t"+(nbre+2)+"*10="+((nbre + 2)*10)+"\t\t"+(nbre+3)+"*10="+((nbre + 3)*10)+"\t\t"+(nbre+4)+"*10="+((nbre + 4)*10)+"\t\t"+(nbre+5)+"*10="+((nbre + 5)*10)+"\t\t"+(nbre+6)+"*10="+((nbre + 6)*10)+"\t\t"+(nbre+7)+"*10="+((nbre + 7)*10)+"\t\t"+(nbre+8)+"*10="+((nbre + 8)*10)+"\n"
                +nbre+"*11="+(nbre*11)+"\t\t"+(nbre+1)+"*11="+((nbre+1)*11)+"\t\t"+(nbre+2)+"*11="+((nbre + 2)*11)+"\t\t"+(nbre+3)+"*11="+((nbre + 3)*11)+"\t\t"+(nbre+4)+"*11="+((nbre + 4)*11)+"\t\t"+(nbre+5)+"*11="+((nbre + 5)*11)+"\t\t"+(nbre+6)+"*11="+((nbre + 6)*11)+"\t\t"+(nbre+7)+"*11="+((nbre + 7)*11)+"\t\t"+(nbre+8)+"*11="+((nbre + 8)*11)+"\n"
                +nbre+"*12="+(nbre*12)+"\t\t"+(nbre+1)+"*12="+((nbre+1)*12)+"\t\t"+(nbre+2)+"*12="+((nbre + 2)*12)+"\t\t"+(nbre+3)+"*12="+((nbre + 3)*12)+"\t\t"+(nbre+4)+"*12="+((nbre + 4)*12)+"\t\t"+(nbre+5)+"*12="+((nbre + 5)*3)+"\t\t"+(nbre+6)+"*12="+((nbre + 6)*12)+"\t\t"+(nbre+7)+"*12="+((nbre + 7)*12)+"\t\t"+(nbre+8)+"*12="+((nbre + 8)*12));

    }
}
