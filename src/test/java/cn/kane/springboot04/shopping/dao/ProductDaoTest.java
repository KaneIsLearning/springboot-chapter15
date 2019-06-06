package cn.kane.springboot04.shopping.dao;

import cn.kane.springboot04.shopping.pojo.ProductPo;
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
 * Date:   2019/6/5 15:12
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTest {

    @Autowired
    private ProductMapper productMapper;
    @Test
    public void testInsertNewProduct(){
        ProductPo po = new ProductPo();
        po.setProductName("蜀国西红柿");
        po.setStock(100);
        po.setPrice(8.88);
        po.setNote("测试专用数据");
        int a = productMapper.insertNewProduct(po);
        System.err.println("a:"+a);
    }

    @Test
    public void testGetProduct(){
        ProductPo po = productMapper.getProduct(1L);
        System.err.println(po);
    }

}