package cn.kane.springboot04.shopping.service;

import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * @create 2019/6/6
 * @since 1.0.0
 */
@Service
public interface PurchaseService {
    /**
     * 处理购买业务
     * @param userId
     * @param productId
     * @param quantity
     * @return
     */
    boolean purchase(Long userId,Long productId,int quantity);
}
