package cn.kane.springboot04.shopping.dao;


import cn.kane.springboot04.shopping.pojo.PurchaseRecordPo;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *---cn.kane.springboot04.shopping.dao.PurchaseRecordMapper
 * @author Kane
 * @create 2019/6/5
 * @since 1.0.0
 */
public interface PurchaseRecordMapper {
    int insertPurchaseRecord(PurchaseRecordPo pr);
}
