package cn.kane.springboot04.shopping.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/6/6 10:10
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseServiceTest {

    @Autowired
    PurchaseService purchaseService = null;

    @Test
    public void testInsertPurchaseRecord(){
        boolean flag = purchaseService.purchase(1L,1L,5);
        System.out.println("FLAG:"+flag);
    }

}