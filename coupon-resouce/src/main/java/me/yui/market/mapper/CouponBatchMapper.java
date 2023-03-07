package me.yui.market.mapper;

import me.yui.market.datamodel.CouponBatchEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CouponBatchMapper {
    @Select("select * from t_coupon_batch")
    public CouponBatchEntity queryCouponBatchByBatchId(@Param("batchId") Long batchId);
}
