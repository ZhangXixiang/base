//import com.jd.o2o.commons.domain.response.BaseResponseCode;
//import com.jd.o2o.commons.domain.response.ServiceResponse;
//import com.jd.o2o.xapp.domain.constant.ErrorEnum;
//import com.jd.o2o.xapp.domain.constant.WebConstant;
//import com.jd.o2o.xapp.domain.entity.index.IndexRequest;
//import com.jd.o2o.xapp.domain.util.*;
//import com.jd.o2o.xapp.service.resourcepage.ResourcePageService;
//import com.jd.ump.profiler.CallerInfo;
//import com.jd.ump.profiler.proxy.Profiler;
//import org.apache.commons.lang.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//@Component
public class TestThread {

//    private static final Logger logger = LoggerFactory.getLogger(CouponGrabService.class);

    ExecutorService executorService = Executors.newFixedThreadPool(2);


//    @Resource
//    private ResourcePageService resourcePageService;


    public void grab() {

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaaaaa");

            }
        });
    }


    public static void main(String[] args) {

        String cityId = "";
        int cityIds = Integer.parseInt(cityId);
        System.out.println("sss");


//        TestThread testThread = new TestThread();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
//        testThread.grab();
    }
}
