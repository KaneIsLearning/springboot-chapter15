package cn.kane.springboot04.shopping.service.serviceImpl;

import cn.kane.springboot04.shopping.dao.ProductMapper;
import cn.kane.springboot04.shopping.dao.PurchaseRecordMapper;
import cn.kane.springboot04.shopping.pojo.ProductPo;
import cn.kane.springboot04.shopping.pojo.PurchaseRecordPo;
import cn.kane.springboot04.shopping.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/6/6 9:37
 * @since 1.0.0
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private PurchaseRecordMapper purchaseRecordMapper;


    @Override
    @Transactional
    public boolean purchase(Long userId, Long productId, int quantity) {
        //获取产品
        ProductPo po = productMapper.getProduct(productId);
        if(po.getStock() < quantity){
            return false;
        }
        productMapper.decreaseProduct(productId,quantity);
        //插入购买记录
        PurchaseRecordPo recordPo = initPurchaseRecord(userId,po,quantity);
        purchaseRecordMapper.insertPurchaseRecord(recordPo);
        return true;
    }

    //初始化购买信息
    private PurchaseRecordPo initPurchaseRecord(Long userId,ProductPo productPo,int quanity){
        PurchaseRecordPo pr = new PurchaseRecordPo();
        pr.setNote("购买日志,时间："+System.currentTimeMillis());
        pr.setPrice(productPo.getPrice());
        pr.setProductId(productPo.getId());
        pr.setQuantity(quanity);
        double sum = productPo.getPrice()*quanity;
        pr.setSum(sum);
        pr.setUserId(userId);
        return pr;
    }
}