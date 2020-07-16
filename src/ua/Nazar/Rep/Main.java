package ua.Nazar.Rep;

import ua.Nazar.Rep.abstractFactory.AbstractFactoryDemo;
import ua.Nazar.Rep.builder.BuilderDemo;
import ua.Nazar.Rep.factory.FactoryDemo;
import ua.Nazar.Rep.filter.FilterDemo;
import ua.Nazar.Rep.prototype.PrototypeDemo;

public class Main {
    public static void main(String[] args) {
        FactoryDemo.factoryDemo();
        System.out.println();
        AbstractFactoryDemo.abstractFactoryDemo();
        System.out.println();
        PrototypeDemo.prototypeDemo();
        System.out.println();
        BuilderDemo.builderDemo();
        System.out.println();
        FilterDemo.filterDemo();
    }
}
