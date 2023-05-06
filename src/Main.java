
  
class Main {
  
   
    public static String
    removeFirstandLast(String str)
    {
  
    
        str = str.substring(1, str.length() - 1);
  
        
        return str;
    }
  

    public static void main(String args[])
    {
        
        String str = "cicero jorge";
  
        
        System.out.print(
            removeFirstandLast(str));
    }
}