package com.andy.seckill.mapper;

import com.andy.seckill.vo.GoodsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *
 * @author Leone
 * @since 2018-10-26
 **/
@Mapper
interface GoodsMapper {
	
	@Select("select * from t_goods")
	List<GoodsVO> list();

	GoodsVO findById(@Param("goodsId") Long goodsId);

	@Update("update t_goods set stock_count = stock_count - 1 where goods_id = #{goodsId} and stock_count > 0")
	int reduceStock(Long goodsId);

}