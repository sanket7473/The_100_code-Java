package org.example;

public class FirstNonrepetative_character {
    public static void main(String args[])
    {
        String str="affsgfsggsaddafeffrscsgsfp";
        for(int i=0;i<str.length();i++)
        {
            boolean repeated = false;
            for(int j=0;j<str.length();j++)
            {
                if(i!=j && str.charAt(i)==str.charAt(j))
                {
                    repeated=true;
                    break;

                }
            }
            if(!repeated)
            {
                System.out.println("First character found is "+str.charAt(i));
                // important if you want all non repetative characters then just remove break .
                //The break will give first non repeatative character
                break;
            }
        }
    }

}
