package cn.kane.springboot04.shopping.dao;


import cn.kane.springboot04.shopping.pojo.ProductPo;
import org.apache.ibatis.annotations.Param;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *----cn.kane.springboot04.shopping.dao.ProductMapper
 * @author Kane
 * @create 2019/6/5
 * @since 1.0.0
 */
public interface ProductMapper {
    //
    int insertNewProduct(ProductPo productPo);
    //获取
    ProductPo getProduct(Long id);
    //-
    int decreaseProduct(@Param("id") Long id, @Param("quantity") int quantity);

}
