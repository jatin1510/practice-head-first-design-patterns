package chapter11.remote_proxy;

import chapter11.remote_proxy.rmi_gumballmachine.GumballMachineRemote;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    private static final int REGISTRY_PORT = 1099;
    private static final String BIND_PATH_PREFIX = "//localhost/gumballmachine/";

    public static void main(String[] args) {
        if (args.length < 2) {
            printUsage();
            return;
        }

        try {
            int count = Integer.parseInt(args[1]);
            GumballMachine concreteGumballMachine = new GumballMachine(args[0], count);

            ensureRegistry();
            bindMachine((GumballMachineRemote) concreteGumballMachine, args[0]);

            runInteractiveLoop(concreteGumballMachine);
        } catch (Exception ignored) {
        }
    }

    private static void printUsage() {
        System.out.println("Usage: java GumballMachineTestDrive <host> <count> <port>");
    }

    private static void ensureRegistry() {
        try {
            LocateRegistry.createRegistry(REGISTRY_PORT);
            System.out.println("RMI registry created on port " + REGISTRY_PORT);
        } catch (RemoteException e) {
            System.out.println("RMI registry already running on port " + REGISTRY_PORT);
        }
    }

    private static void bindMachine(GumballMachineRemote gumballMachine, String hostArg) throws Exception {
        String url = BIND_PATH_PREFIX + hostArg;
        System.out.println("binding: " + url);
        Naming.rebind(url, gumballMachine);
        System.out.println("Gumball Machine bound in registry");
    }

    private static void runInteractiveLoop(GumballMachine concreteGumballMachine) throws IOException {
        while (true) {
            printMenu();
            int choice = readChoice();
            System.out.println("You entered: " + (char) choice);
            switch (choice) {
                case '1' -> concreteGumballMachine.insertQuarter();
                case '2' -> concreteGumballMachine.turnCrank();
                case '3' -> concreteGumballMachine.ejectQuarter();
                case '4' -> {
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
            clearInputBuffer();
        }
    }

    private static void printMenu() {
        System.out.println("------------------------------------");
        System.out.println("Enter your choice:");
        System.out.println("Insert 1 to insert a quarter");
        System.out.println("Insert 2 to turn the crank");
        System.out.println("Insert 3 to eject the quarter");
        System.out.println("Insert 4 to exit");
    }

    private static int readChoice() throws IOException {
        return System.in.read();
    }

    private static void clearInputBuffer() throws IOException {
        while (System.in.available() > 0) {
            System.in.read();
        }
    }
}
