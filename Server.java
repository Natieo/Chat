import java.net.*;
import java.io.*;

public class Server
{
  public static ServerSocket myServer;
  public static Socket myClient;
  public static DataInputStream IN;
  public static DataOutputStream OUT;
  public static main(String args[])
  {
    try//Create a Server on a port defined at the start
    {
      myServer = new ServerSocket(Integer.parseInt(args[0]));
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    try//Get the Client Socket
    {
      myClient = myServer.accept();
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    try//Make the Data Stream
    {
      IN = new DataInputStream(myServer.getInputStream());
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    try//Make Output stream
    {
      OUT = new DataOutputStream(myServer.getOutputStream());
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
}
