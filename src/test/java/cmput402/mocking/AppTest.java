package cmput402.mocking;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import service.City;
import stub.CityStub;
import stub.SalaryStrub;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void testcapitalizeName(){
    	assert("Austin Pennyfeather".equals(Main.capitalizeName("austin Pennyfeather")));
    }
    
    public void testfilterEdmonton(){
    	Util util = new Util();
    	CityStub stub = new CityStub();
    	assert(4 == util.filterEdmonton(stub));
    }
    
//    public void testSalary(){
//    	Util util = new Util();
//    	SalaryStrub stub = new SalaryStrub();
//    	assert(1 == util.filterSalariesOver50k(stub));
//    }
//    
    public void testfilterEdmontonMockito(){
    	Util util = new Util();
    	
    	 City mockCity = mock(City.class);
    	 List<String> ListCities = new ArrayList<String>();
    	 ListCities.add("Edmonton");
    	 ListCities.add("Calgary");
    	 ListCities.add("Edmonton");
    	 ListCities.add("Calgary");
    	 when(mockCity.listCities()).thenReturn(ListCities);
    	 
    	 assert(2==util.filterEdmonton(mockCity));
    	 verify(mockCity).listCities();
    	
    }
    /**
     * Rigourous Test :-)
     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}
