import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class Arryatest {

    public Integer[] a;
    public Integer[] b;

    public Arryatest(Integer[] a, Integer[] b) {
        this.a = a;
        this.b = b;
    }


    Arryametod arryametod;

   int[] myArr = new int[]{};

    @Parameterized.Parameters
    public Collection<Object[]> data () {
        return Arrays.asList(new Object[][]{
                {new Integer[]{5, 6, 7}, new Integer[]{1, 4, 3, 4, 5, 6, 7}}
        });

    }

    @Before
        public void init() {
            arryametod = new Arryametod();
        }



@Test
    public void afterLasFourTest(){
     Assert.assertArrayEquals(a, arryametod.afterLasFour(b));
    }


}
