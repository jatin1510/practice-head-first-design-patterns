package chapter11.remote_proxy.rmi_example;

import java.rmi.*;

public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
