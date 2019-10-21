import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class TestRedisStructs {


    public static void main(String[] args) {

        List<String> exclusiveActivityIdList = Arrays.asList("ab","bc");


        String b[] = exclusiveActivityIdList.toArray(new String[0]);

        String couponCode = "XX001";
        List<String> couponCodes = Lists.asList(couponCode, new String[0]);


        System.out.println("");
    }



}
