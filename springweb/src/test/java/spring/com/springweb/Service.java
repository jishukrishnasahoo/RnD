package spring.com.springweb;

import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.List;

interface Service
{
    String getServiceName();
    String getServiceShop();

}

class HandsetService implements Service
{

    @Override
    public String getServiceName() {
        return "HandsetService";
    }

    @Override
    public String getServiceShop() {
        return "HandsetShop";
    }
}

class DeviceService implements Service
{

    @Override
    public String getServiceName() {
        return "DeviceService";
    }

    @Override
    public String getServiceShop() {
        return "DeviceShop";
    }
}

class InitializeService
{
    public Object lookup(String serviceName)
    {
        if (serviceName.equalsIgnoreCase("HandsetService")) {
            return new HandsetService();
        } else if (serviceName.equalsIgnoreCase("DeviceService")) {
            return new DeviceService();
        }
        return null;

    }
}

class Cache {
    private List<Service> services = new ArrayList<>();

    public Service getService(String serviceName) {
        // retrieve from the list
        Service service= null;
        if (services.contains(serviceName))
        {
            int i = services.indexOf(serviceName);
            service = services.get(i);
        }
        return service;
    }

    public void addService(Service newService) {
        // add to the list
        services.add(newService);
    }
}

class ServiceLocator {

    private static Cache cache = new Cache();

    public static Service getService(String serviceName) {

        Service service = cache.getService(serviceName);

        if (service != null) {
            return service;
        }

        InitializeService context = new InitializeService();
        Service service1 = (Service) context
                .lookup(serviceName);
        cache.addService(service1);
        return service1;
    }
}

class Test1
{
    public static void main(String[] args) {
        Service service
                = ServiceLocator.getService("HandsetService");
        String email = service.getServiceShop();
        System.out.println(email);

    }

}