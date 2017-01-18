import java.util.Scanner;
class TheTimeInWords{
    static String getSingleWord(int n){
        switch(n){
            case 0: return "o' clock";

            case 1: return "one";

            case 2: return "two";

            case 3: return "three";

            case 4: return "four";

            case 5: return "five";

            case 6: return "six";

            case 7: return "seven";

            case 8: return "eight";

            case 9: return "nine";

            default: return "wrong input";
        }
    }
    static String getWord(int n){
        int l, r;
        l = r = 0;
        String twenty = "twenty";
        String thirty = "thirty";
        String fourty = "fourty";
        String fifty = "fifty";
        if(n < 10){
            return getSingleWord(n);
        }else{
            r = n % 10;
            n = n / 10;
            l = n % 10;
            if(l == 1){
                switch(r){
                    case 0: return "ten";

                    case 1: return "eleven";

                    case 2: return "twelve";

                    case 3: return "thirteen";

                    case 4: return "fourteen";

                    case 5: return "fifteen";

                    case 6: return "sixteen";

                    case 7: return "seventeen";

                    case 8: return "eighteen";

                    case 9: return "nineteen";

                    default : return "wrong input";

                }

            }else{
                switch(l){
                    case 2:
                        if(r == 0){
                            return twenty;
                        }else{
                            return twenty + " " + getSingleWord(r);
                        }

                    case 3:
                        if(r == 0){
                            return thirty;
                        }else{
                            return thirty + " " + getSingleWord(r);
                        }

                    case 4:
                        if(r == 0){
                            return fourty;
                        }else{
                            return fourty + " " + getSingleWord(r);
                        }

                    case 5:
                        if(r == 0){
                            return fifty;
                        }else{
                            return fifty + " " + getSingleWord(r);
                        }

                    default: return "wrong case";
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        String output;
        if(m == 0){
            output = getWord(h) + " " + getWord(m);
        }else if(m > 0 && m < 15){
            output = getWord(m) + " minutes past " + getWord(h);
        }else if(m == 15){
            output = "quarter past " + getWord(h);
        }else if(m > 15 && m < 30){
            output = getWord(m) + " minutes past " + getWord(h);
        }
        else if(m == 30){
            output = "half past " + getWord(h);
        }else if(m > 30 && m < 45){
            output = getWord( 60 - m) + " minutes to " + getWord(h + 1);
        }else if(m == 45){
            output = "quarter to " + getWord(h + 1);
        }else if(m > 45 && m < 60){
            output = getWord( 60 - m) + " minutes to " + getWord(h + 1);
        }else{
            output = "something is wrong";
        }
        System.out.println(output);

    }
}