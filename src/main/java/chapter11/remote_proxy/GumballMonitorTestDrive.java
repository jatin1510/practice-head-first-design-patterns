package chapter11.remote_proxy;

import chapter11.remote_proxy.rmi_gumballmachine.GumballMachineRemote;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    private static final String[] LOCATIONS = {
            "rmi://localhost/gumballmachine/surat",
            "rmi://localhost/gumballmachine/pune"
    };
    private static final String SEPARATOR = "-----------------------------------";

    public static void main(String[] args) {
        GumballMonitor[] monitors = createMonitors();
        reportMonitors(monitors);
    }

    private static GumballMonitor[] createMonitors() {
        GumballMonitor[] monitors = new GumballMonitor[GumballMonitorTestDrive.LOCATIONS.length];

        for (int i = 0; i < GumballMonitorTestDrive.LOCATIONS.length; i++) {
            try {
                GumballMachineRemote machine = lookupMachine(GumballMonitorTestDrive.LOCATIONS[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (Exception ignored) {
            }
            System.out.println(SEPARATOR);
        }

        return monitors;
    }

    private static GumballMachineRemote lookupMachine(String location) throws Exception {
        return (GumballMachineRemote) Naming.lookup(location);
    }

    private static void reportMonitors(GumballMonitor[] monitors) {
        for (GumballMonitor monitor : monitors) {
            if (monitor != null) {
                monitor.report();
            } else {
                System.out.println("Monitor not available");
            }
            System.out.println(SEPARATOR);
        }
    }
}
