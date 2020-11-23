package edu.upc.dsa;

import edu.upc.dsa.models.Persona;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class Covid19ManagerImplTest {
    private static Logger logger = Logger.getLogger(Covid19ManagerImplTest.class);
    //GameManager
    public Covid19Manager manager = null;

    Persona persona;

    //Metodo SetUp
    @Before
    public void setUp() {
        //Configuring Log4j
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        logger.debug("Debug Test Message!");
        logger.info("Info Test Message!");
        logger.warn("Warning Test Message!");
        logger.error("Error Test Message!");
        //Instancing Covid19Manager Implementation
        manager = Covid19ManagerImpl.getInstance();
        //Inicializar Perosna
        persona = new Persona("B1","Gerard","Belvis Rodríguez",20,"A");


    }

    //Tests
    @Test
    public void añadirPersonaTest() {
        //Initial Test, personas iniciales 0!
        Assert.assertEquals(0, this.manager.);
    }

    @After

}
