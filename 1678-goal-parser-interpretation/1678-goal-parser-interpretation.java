class Solution {
    public String interpret(String command) {
        String s="";
        for(int i=0; i<command.length(); i++)
        {
            if(command.charAt(i)=='G')
            {
                s=s+'G';
            }
            else if(command.substring(i,i+2).equals("()"))
            {
                s=s+'o';
                i++;
            }
            else if(command.substring(i,i+4).equals("(al)"))
            {
                s=s+"al";
                i+=3;
            }
        }
        return s;
    }
}