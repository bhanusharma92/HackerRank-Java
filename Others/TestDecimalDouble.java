class TestDecimalDouble {
    public static void main(String args[]){
        double x = 1.5;
        double y = 2.0;

        String xStr;
        String yStr;
        if(x % 1 == 0){
            xStr = String.valueOf((new Double(x)).intValue());
        }else{
            xStr = String.valueOf(x);
        }

        if(y % 1 == 0){
            yStr = String.valueOf((new Double(y)).intValue());
        }else{
            yStr = String.valueOf(y);
        }

        System.out.println(xStr);
        System.out.println(yStr);
    }
}