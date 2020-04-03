import org.junit.*;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class TestBubbleSort{
    @Test
    public void Testcase1(){
      int[] expected = {1};
      int[] input = {1};
      assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }
    @Test
    public void Testcase2(){
      int[] expected = {1,2,3,4,5};
      int[] input = {1,4,5,2,3};
      assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    public boolean compare(int[] arr1 , int[] arr2){
      if(arr1.length != arr2.length){
        return false;
      }
      for(int i = 0 ; i < arr1.length; i++){
        if(arr1[i] != arr2[i]){
          return false;
        }
      }
      return true;
    }
}
