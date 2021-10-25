public static void main(String[] args) {
        
        int myValue=100;
        String sValue=String.valueOf(myValue); // “100”
        System.out.println(sValue);
        System.out.println(((Object)sValue).getClass().getSimpleName());

    }
