package com.newer.mapper;

import com.newer.domain.TeaOrder;
import org.apache.ibatis.annotations.Insert;

public interface TeaOrderMapper {

    @Insert("Insert into tea values(null,#{detail},#{num},#{price},null)")
    int addOrder(TeaOrder teaOrder);
}
