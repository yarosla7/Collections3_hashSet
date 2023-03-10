import driver.*;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;
import transport.stuff.Mechanic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {


    public static void main(String[] args) throws CheckLicenseException {

        Bus paz = new Bus("ПАЗ", "4234", 4.3, new LicenseD("Dilan", true, 6), Bus.Capacity.SMALL);
        Bus manBus = new Bus("MAN", "Lion's City", 5.6, new LicenseD("Fagot"), Bus.Capacity.LARGE);
        Bus liaz = new Bus("ЛиАЗ", "4292", 4.4, Bus.Capacity.EXTRA_LARGE);
        Bus maz = new Bus("МАЗ", "232", 5.3, Bus.Capacity.MEDIUM);


        Car aston = new Car("Aston Martin", "DB9 Carbon", 3.6, new LicenseB("Mike", true, 3), Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "S1 Quattro", 4.4, new LicenseB("Johny", true, 3), Car.BodyType.CROSSOVER);
        Car tesla = new Car("Tesla", "Model S", 3.2, new LicenseB("Alex", true, 2), Car.BodyType.SEDAN);
        Car mercedes = new Car("Mercedes", "Benz S-Class", 4.2, Car.BodyType.HATCHBACK);


        Truck kamaz = new Truck("КамАЗ", "54901", 7.6, new LicenseC("John", true, 4), Truck.Weight.N2);
        Truck sollers = new Truck("Sollers", "Argo", 4.6, new LicenseC("John", true, 4), Truck.Weight.N3);
        Truck dongfeng = new Truck("Dongfeng", "Captain-T", 5.5, new LicenseC("Dick", true, 4), Truck.Weight.N1);
        Truck manTruck = new Truck("MAN", "TGS 6X6", 7.9, new LicenseC("Dick", true, 4), Truck.Weight.N3);

        LicenseD morgan = new LicenseD("Morgan", true, 5);
        LicenseD dilan = new LicenseD("Dilan", true, 6);
        LicenseB logan = new LicenseB("Logan", true, 1);
        LicenseB nik = new LicenseB("Nikita", true, 1);
        //testing:

        Mechanic<Transport<?>> david = new Mechanic<>("David", "Shell");
        Mechanic<Transport<?>> mechanic1 = new Mechanic<>("Trap");
        Mechanic<Transport<?>> mechanic2 = new Mechanic<>("Destroyer", "Nasa");
        /*
//        david.fixTheCar(aston, sollers, mercedes); //чинит сразу несколько машин
//        david.performMaintenance(sollers); // проводит тех обслуживание одной
//
//        aston.printImportantInfo(); // вывод в консоль название, бренд автомобиля, имя водителя и команды механиков

        //queue :
        ServiceStation<Transport<?>> serviceStation = new ServiceStation<>();
//        serviceStation.addTransport(kamaz); //к авто не добавлен механик, но он будет по дефолту из метода
//        serviceStation.addTransport(manTruck);
//        serviceStation.addTransport(tesla);
//        serviceStation.addTransport(aston);
        //  serviceStation.addTransport(paz); // проверка на автобусы (выдает UnsupportedOperationException: Busses can't pass diagnostics.)
        //  serviceStation.doServiceInspection();

        //hashMap:
        Mechanic<Transport<?>> david2 = new Mechanic<>("David", "Shell");
        Map<Transport<?>, Mechanic<?>> t = new HashMap<>();
        t.put(aston, david);
        t.put(sollers, new Mechanic<>("Slava"));
        t.put(aston, mechanic1);
        t.put(kamaz, mechanic2);
        t.put(dongfeng, mechanic1);
        System.out.println(t); //в консоли объекты не повторяются. (идея подчеркивает даже*/


        //hashSet:

        List<Transport<?>> forRace = List.of(kamaz, manTruck, paz, manBus, aston, tesla); //список машин для гонок (с водителями)
        Set<Driver> driverList = new HashSet<>();
        driverList.add(morgan);
        driverList.add(dilan);
        driverList.add(logan);
        driverList.add(nik);
        driverList.add(nik);
        driverList.add(morgan);

        for (Transport<?> transport : forRace) {
            if (transport.getDriver() != null) {
                driverList.add(transport.getDriver());
            } else {
                System.out.println("Drivers not found anymore.");
            }
        } // добавление всех водителей, которые были созданы через конструктор транспорта (там есть одинаковые) - условие задачи 1 выполнено

        System.out.println(driverList.size());
        for (Driver driver : driverList) {
            if (driver != null) {
                System.out.println(driver.getFullName());
            }
        } // вывод списка по именам через итератор (условие задачи 2)
    }
} //затупил с гитом, сонный уже, ПР так сделаюйцуйцу2у21321312321321235екуепфуцк куц ке куеп куе авака