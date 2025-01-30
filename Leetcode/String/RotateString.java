class RotateString{
    public static boolean RotateString(String s, String goalString){

        if(s.length()!=goalString.length()){
            return false;
        }
        String temp =s+s;
        return temp.contains(goalString);
    }
    public static void main(String args[]){
        String s = "abcd";
        String goalString="cdab";
       if(RotateString(s, goalString)){
        System.out.println("Yess");

       }
       
       else{
        System.out.println("NOoooooooooo");
       }

    }

}