package packageMapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.FiImageSearchResult;
import packageMapper.base.FiImageSearchResultBaseMapper;
/**
*  @author zhangxianming
*/
public interface FiImageSearchResultMapper{
    int insertFiImageSearchResult(FiImageSearchResult object);

    int updateFiImageSearchResult(FiImageSearchResult object);

    List<FiImageSearchResult> queryFiImageSearchResult(FiImageSearchResult object);

    FiImageSearchResult queryFiImageSearchResultLimit1(FiImageSearchResult object);
}