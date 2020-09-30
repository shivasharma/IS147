package Week5;



class Immutable{
    public static void main(String[] args) {
        String s = "IS";
        s.concat(" 147");//concat() method appends the string at the end
        System.out.println(s);//will print IS because strings are immutable objects
        
        s=s.concat(" 147");
        System.out.println(s);
    }
}
