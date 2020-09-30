package Week5;



class Immutable{
    public static void main(String[] args) {
        String s = "IS";
        s.concat(" 147");//concat() method appends the string at the end
        System.out.println(s);//will print IS because strings are immutable objects
        
        s=s.concat(" 147");
        System.out.println(s);
        
        //String Builder efficient way to construct string values add new content to end with append
        
        String myLocation="California";
        int flightNumber =100;

        StringBuilder sb=new StringBuilder(40);
        sb.append(" I flew  from MD to ");
        sb.append ( myLocation);
        sb.append ( " on Flight # ");
        sb.append (flightNumber);
        String message=sb.toString();
        System.out.println(message);
        System.out.println(message.length());

        
        
    }
}
