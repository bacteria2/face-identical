package packageMapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.FiVendorInfo;
import packageMapper.base.FiVendorInfoBaseMapper;
/**
*  @author zhangxianming
*/
public interface FiVendorInfoMapper{
    int insertFiVendorInfo(FiVendorInfo object);

    int updateFiVendorInfo(FiVendorInfo object);

    List<FiVendorInfo> queryFiVendorInfo(FiVendorInfo object);

    FiVendorInfo queryFiVendorInfoLimit1(FiVendorInfo object);

}