package chapter11.remote_proxy.rmi_example;

import java.io.Serial;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Serial
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        System.out.println("sayHello() called");
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            // create a registry in this JVM so it uses the same classpath
            LocateRegistry.createRegistry(1099);

            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
            System.out.println("Service bound as RemoteHello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
