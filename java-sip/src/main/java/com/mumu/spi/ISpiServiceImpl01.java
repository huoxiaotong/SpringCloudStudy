package com.mumu.spi;

import com.mumu.spi.ISpiService;

/**
 * @ClassName ISpiServiceImpl01
 * @Description: TODO
 * @Author: pc
 * @Date: Created in 2020/2/21 0:21
 * @Version: 1.0
 * @Modified By:
 */
public class ISpiServiceImpl01 implements ISpiService {
    @Override
    public void run() {
        System.out.println("ISpiServiceImpl01.run()");
    }
}
