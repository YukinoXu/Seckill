package xyz.yukinoxu.seckill.dao;

import org.apache.ibatis.annotations.Param;
import xyz.yukinoxu.seckill.entity.Seckill;

public interface SeckillDAO {
    /**
     * Reduce inventory
     * @param seckillId
     * @param oldVersion
     * @param newVersion
     * @return The count of effected lines
     */
    int reduceInventory(@Param("seckillId") long seckillId, @Param("oldVersion") long oldVersion, @Param("newVersion") long newVersion);

    /**
     * Query by seckill id
     * @param seckillId
     * @return Seckill object
     */
    Seckill queryById(long seckillId);
}
