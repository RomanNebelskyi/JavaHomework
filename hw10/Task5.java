package hw10;

public class Task5
{
    public static void main(String[] args)
    {
     int a = 3;
     int b = 59;
     StringBuffer stringBuffer = new StringBuffer();

     stringBuffer.append(a).append(" + ").append(b).append(" = ").append(a+b);
     System.out.println(stringBuffer);
     stringBuffer.delete(0, stringBuffer.length());

     stringBuffer.append(a).append(" - ").append(b).append(" = ").append( (a-b) );
     System.out.println(stringBuffer);
     stringBuffer.delete(0, stringBuffer.length());

     stringBuffer.append(a).append(" * ").append(b).append(" = ").append(a*b);
     System.out.println(stringBuffer);

     StringBuffer stringBuffer2 = new StringBuffer(stringBuffer);
     stringBuffer.insert(stringBuffer.indexOf("="), "equals");
     stringBuffer.deleteCharAt(stringBuffer.indexOf("="));
     System.out.println(stringBuffer);

     stringBuffer2.replace(stringBuffer2.indexOf("="),stringBuffer2.lastIndexOf(" "), "equals");
     System.out.println(stringBuffer2);
    }
}
