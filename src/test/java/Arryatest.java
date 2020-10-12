import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Arryatest {
    private int[] in;
    private int[] out;



@Test
    public void arryasCompositionTest(){
    in = new int[]{4, 4, 4, 4, 4, 4};
    Assert.assertFalse(Arryametod.arrayСomposition(in));
    }

    @Test
    public void arryasCompositionTest2(){
        in = new int[]{1, 1, 1, 4};
        Assert.assertTrue(Arryametod.arrayСomposition(in));
    }

    @Test
    public void arryasCompositionTest3(){
        in = new int[]{1, 4, 3};
        Assert.assertFalse(Arryametod.arrayСomposition(in));
    }

    @Test
    public void arryasCompositionTest4(){
        in = new int[]{1, 4, 3};
        Assert.assertFalse(Arryametod.arrayСomposition(in));
    }


    @Test
    public void afterLasFourTest(){
    in = new int[]{1,2,3,4,5,6,7};
    out = new int[]{5,6,7};
    Assert.assertArrayEquals(out, Arryametod.afterLasFour(in));
    }

    @Test (expected = RuntimeException.class)
    public void afterLasFourTest1(){
        in = new int[]{5,6,7};
        Arryametod.afterLasFour(in);
    }



}
