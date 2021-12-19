package spring.com.springweb;

import org.apache.kafka.common.protocol.types.Field;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch
{

    static Integer binarySearch(List<Integer> l, int i)
    {
        int left =0;
        int right = l.size()-1;

        System.out.println(right);
        while (left <= right)
        {
            int mid = left+(right-left)/2;

            if(l.get(mid) == i)
            {
                return mid;
            }
            if (l.get(mid) < i)
            {
                left = mid+1;
            }
            else right = mid-1;

        }
        return -1;

    }
    public static void main(String ar [])
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);

        int x = 25;

        System.out.println(arr);
        Integer res = binarySearch(arr,x);
        System.out.println(res);

    }

}