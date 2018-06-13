package packageMapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.FiImagePosition;
import packageMapper.base.FiImagePositionBaseMapper;
/**
*  @author zhangxianming
*/
public interface FiImagePositionMapper{

    int insertFiImagePosition(FiImagePosition object);

    int updateFiImagePosition(FiImagePosition object);

    List<FiImagePosition> queryFiImagePosition(FiImagePosition object);

    FiImagePosition queryFiImagePositionLimit1(FiImagePosition object);
}