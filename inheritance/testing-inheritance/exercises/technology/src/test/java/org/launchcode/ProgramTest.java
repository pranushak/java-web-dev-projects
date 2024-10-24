package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    Computer test_computer;
    Laptop test_laptop;
    SmartPhone test_smartPhone;

    @BeforeEach
    public void initObjects(){
        test_computer = new Computer("mac","i12",250);
        test_laptop = new Laptop("lenovo","i10",100,"2 inches",10);
        test_smartPhone = new SmartPhone("apple","i14",60,"ios");
    }
    @Test
    public void emptyTest(){
        assertEquals(true,true);
    }

    @Test
    public void computerValuesTest(){
        assertEquals("mac",test_computer.getName());
        assertEquals("i12",test_computer.getProcessor());
        assertEquals(250,test_computer.getRam());
    }

    @Test
    public void laptopValuesTest(){
        assertEquals("2 inches",test_laptop.getSize());
        assertEquals(10,test_laptop.getBatteryLife());
    }

    @Test
    public void smartphoneValuesTest(){
        assertEquals("ios",test_smartPhone.getOsName());
        assertEquals(60,test_smartPhone.getRam());
    }
}
