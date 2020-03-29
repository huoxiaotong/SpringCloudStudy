package com.mumu;

import com.mumu.spi.ISpiService;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @ClassName SipTest
 * @Description: TODO
 * @Author: pc
 * @Date: Created in 2020/2/21 0:29
 * @Version: 1.0
 * @Modified By:
 */
public class SipTest {

    public static void main(String[] args) {
        Iterator<ISpiService> providers = Service.providers(ISpiService.class);
        ServiceLoader<ISpiService> load = ServiceLoader.load(ISpiService.class);

        while(providers.hasNext()) {
            ISpiService ser = providers.next();
            ser.run();
        }
        System.out.println("--------------------------------");
        Iterator<ISpiService> iterator = load.iterator();
        while(iterator.hasNext()) {
            ISpiService ser = iterator.next();
            ser.run();
        }
    }
}
