import java.net.*;
import java.io.*;

public class Client
{
  public static Socket myClient;
  public static DataInputStream IN;
  public static DataOutputStream OUT;
  public static void main(String args[])
  {
    try
    {
      myClient = new Socket("DESKTOP-RKOK8P5",Integer.parseInt(args[0]));
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    try
    {
      IN = new DataInputStream(myClient.getInputStream());
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    try
    {
      OUT = new DataOutputStream(myClient.getOutputStream());
    }catch(IOException e)
    {
      e.printStackTrace();
    }try
    {
      System.out.println(IN.readInt());
    }catch(Exception e)
    {
      e.printStackTrace();
    }
    try
    {
      OUT.writeInt(6);
    }catch(Exception e)
    {
      e.printStackTrace();
    }
    try
    {
      OUT.close();
      IN.close();
      myClient.close();
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
