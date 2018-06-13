package packageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zhangxianming
*/
public class FiImageSearchResult implements Serializable {

    private static final long serialVersionUID = 1528859793072L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 图片ID
    * isNullAble:0,defaultVal:
    */
    private String imageId;

    /**
    * 比对结果
    * isNullAble:0,defaultVal:
    */
    private String result;

    /**
    * 0:finished,1:running,2:initiating,3:waiting4:error
    * isNullAble:0,defaultVal:0
    */
    private Integer status;

    /**
    * 
    * isNullAble:0
    */
    private Long vendorId;

    /**
    * 
    * isNullAble:0
    */
    private Long positionId;

    /**
    * 作者
    * isNullAble:0,defaultVal:
    */
    private String creator;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;

    /**
    * 更新者
    * isNullAble:0,defaultVal:
    */
    private String updator;

    /**
    * 修改时间
    * isNullAble:0
    */
    private java.time.LocalDateTime updateTime;


    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setImageId(String imageId){
        this.imageId = imageId;
    }

    public String getImageId(){
        return this.imageId;
    }

    public void setResult(String result){
        this.result = result;
    }

    public String getResult(){
        return this.result;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setVendorId(Long vendorId){
        this.vendorId = vendorId;
    }

    public Long getVendorId(){
        return this.vendorId;
    }

    public void setPositionId(Long positionId){
        this.positionId = positionId;
    }

    public Long getPositionId(){
        return this.positionId;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public String getCreator(){
        return this.creator;
    }

    public void setCreateTime(java.time.LocalDateTime createTime){
        this.createTime = createTime;
    }

    public java.time.LocalDateTime getCreateTime(){
        return this.createTime;
    }

    public void setUpdator(String updator){
        this.updator = updator;
    }

    public String getUpdator(){
        return this.updator;
    }

    public void setUpdateTime(java.time.LocalDateTime updateTime){
        this.updateTime = updateTime;
    }

    public java.time.LocalDateTime getUpdateTime(){
        return this.updateTime;
    }
    @Override
    public String toString() {
        return "FiImageSearchResult{" +
                "id='" + id + '\'' +
                "imageId='" + imageId + '\'' +
                "result='" + result + '\'' +
                "status='" + status + '\'' +
                "vendorId='" + vendorId + '\'' +
                "positionId='" + positionId + '\'' +
                "creator='" + creator + '\'' +
                "createTime='" + createTime + '\'' +
                "updator='" + updator + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends FiImageSearchResult{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Long> idList;

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){
            return this.idSt;
        }

        public Long getIdEd(){
            return this.idEd;
        }

        private List<String> imageIdList;


        private List<String> fuzzyImageId;

        public List<String> getFuzzyImageId(){
            return this.fuzzyImageId;
        }

        private List<String> rightFuzzyImageId;

        public List<String> getRightFuzzyImageId(){
            return this.rightFuzzyImageId;
        }
        private List<String> resultList;


        private List<String> fuzzyResult;

        public List<String> getFuzzyResult(){
            return this.fuzzyResult;
        }

        private List<String> rightFuzzyResult;

        public List<String> getRightFuzzyResult(){
            return this.rightFuzzyResult;
        }
        private List<Integer> statusList;

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){
            return this.statusSt;
        }

        public Integer getStatusEd(){
            return this.statusEd;
        }

        private List<Long> vendorIdList;

        private Long vendorIdSt;

        private Long vendorIdEd;

        public Long getVendorIdSt(){
            return this.vendorIdSt;
        }

        public Long getVendorIdEd(){
            return this.vendorIdEd;
        }

        private List<Long> positionIdList;

        private Long positionIdSt;

        private Long positionIdEd;

        public Long getPositionIdSt(){
            return this.positionIdSt;
        }

        public Long getPositionIdEd(){
            return this.positionIdEd;
        }

        private List<String> creatorList;


        private List<String> fuzzyCreator;

        public List<String> getFuzzyCreator(){
            return this.fuzzyCreator;
        }

        private List<String> rightFuzzyCreator;

        public List<String> getRightFuzzyCreator(){
            return this.rightFuzzyCreator;
        }
        private List<java.time.LocalDateTime> createTimeList;

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){
            return this.createTimeSt;
        }

        public java.time.LocalDateTime getCreateTimeEd(){
            return this.createTimeEd;
        }

        private List<String> updatorList;


        private List<String> fuzzyUpdator;

        public List<String> getFuzzyUpdator(){
            return this.fuzzyUpdator;
        }

        private List<String> rightFuzzyUpdator;

        public List<String> getRightFuzzyUpdator(){
            return this.rightFuzzyUpdator;
        }
        private List<java.time.LocalDateTime> updateTimeList;

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){
            return this.updateTimeSt;
        }

        public java.time.LocalDateTime getUpdateTimeEd(){
            return this.updateTimeEd;
        }

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            if (id != null){
                List<Long> list = new ArrayList<>();
                for (Long item : id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.idList = list;
            }

            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }



        public QueryBuilder fuzzyImageId (List<String> fuzzyImageId){
            this.fuzzyImageId = fuzzyImageId;
            return this;
        }

        public QueryBuilder fuzzyImageId (String ... fuzzyImageId){
            if (fuzzyImageId != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyImageId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyImageId = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyImageId (List<String> rightFuzzyImageId){
            this.rightFuzzyImageId = rightFuzzyImageId;
            return this;
        }

        public QueryBuilder rightFuzzyImageId (String ... rightFuzzyImageId){
            if (rightFuzzyImageId != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyImageId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyImageId = list;
            }
            return this;
        }

        public QueryBuilder imageId(String imageId){
            setImageId(imageId);
            return this;
        }

        public QueryBuilder imageIdList(String ... imageId){
            if (imageId != null){
                List<String> list = new ArrayList<>();
                for (String item : imageId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.imageIdList = list;
            }

            return this;
        }

        public QueryBuilder imageIdList(List<String> imageId){
            this.imageIdList = imageId;
            return this;
        }

        public QueryBuilder fetchImageId(){
            setFetchFields("fetchFields","imageId");
            return this;
        }

        public QueryBuilder excludeImageId(){
            setFetchFields("excludeFields","imageId");
            return this;
        }



        public QueryBuilder fuzzyResult (List<String> fuzzyResult){
            this.fuzzyResult = fuzzyResult;
            return this;
        }

        public QueryBuilder fuzzyResult (String ... fuzzyResult){
            if (fuzzyResult != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyResult){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyResult = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyResult (List<String> rightFuzzyResult){
            this.rightFuzzyResult = rightFuzzyResult;
            return this;
        }

        public QueryBuilder rightFuzzyResult (String ... rightFuzzyResult){
            if (rightFuzzyResult != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyResult){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyResult = list;
            }
            return this;
        }

        public QueryBuilder result(String result){
            setResult(result);
            return this;
        }

        public QueryBuilder resultList(String ... result){
            if (result != null){
                List<String> list = new ArrayList<>();
                for (String item : result){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.resultList = list;
            }

            return this;
        }

        public QueryBuilder resultList(List<String> result){
            this.resultList = result;
            return this;
        }

        public QueryBuilder fetchResult(){
            setFetchFields("fetchFields","result");
            return this;
        }

        public QueryBuilder excludeResult(){
            setFetchFields("excludeFields","result");
            return this;
        }



        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            if (status != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : status){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.statusList = list;
            }

            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }



        public QueryBuilder vendorIdBetWeen(Long vendorIdSt,Long vendorIdEd){
            this.vendorIdSt = vendorIdSt;
            this.vendorIdEd = vendorIdEd;
            return this;
        }

        public QueryBuilder vendorIdGreaterEqThan(Long vendorIdSt){
            this.vendorIdSt = vendorIdSt;
            return this;
        }
        public QueryBuilder vendorIdLessEqThan(Long vendorIdEd){
            this.vendorIdEd = vendorIdEd;
            return this;
        }


        public QueryBuilder vendorId(Long vendorId){
            setVendorId(vendorId);
            return this;
        }

        public QueryBuilder vendorIdList(Long ... vendorId){
            if (vendorId != null){
                List<Long> list = new ArrayList<>();
                for (Long item : vendorId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.vendorIdList = list;
            }

            return this;
        }

        public QueryBuilder vendorIdList(List<Long> vendorId){
            this.vendorIdList = vendorId;
            return this;
        }

        public QueryBuilder fetchVendorId(){
            setFetchFields("fetchFields","vendorId");
            return this;
        }

        public QueryBuilder excludeVendorId(){
            setFetchFields("excludeFields","vendorId");
            return this;
        }



        public QueryBuilder positionIdBetWeen(Long positionIdSt,Long positionIdEd){
            this.positionIdSt = positionIdSt;
            this.positionIdEd = positionIdEd;
            return this;
        }

        public QueryBuilder positionIdGreaterEqThan(Long positionIdSt){
            this.positionIdSt = positionIdSt;
            return this;
        }
        public QueryBuilder positionIdLessEqThan(Long positionIdEd){
            this.positionIdEd = positionIdEd;
            return this;
        }


        public QueryBuilder positionId(Long positionId){
            setPositionId(positionId);
            return this;
        }

        public QueryBuilder positionIdList(Long ... positionId){
            if (positionId != null){
                List<Long> list = new ArrayList<>();
                for (Long item : positionId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.positionIdList = list;
            }

            return this;
        }

        public QueryBuilder positionIdList(List<Long> positionId){
            this.positionIdList = positionId;
            return this;
        }

        public QueryBuilder fetchPositionId(){
            setFetchFields("fetchFields","positionId");
            return this;
        }

        public QueryBuilder excludePositionId(){
            setFetchFields("excludeFields","positionId");
            return this;
        }



        public QueryBuilder fuzzyCreator (List<String> fuzzyCreator){
            this.fuzzyCreator = fuzzyCreator;
            return this;
        }

        public QueryBuilder fuzzyCreator (String ... fuzzyCreator){
            if (fuzzyCreator != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCreator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCreator = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCreator (List<String> rightFuzzyCreator){
            this.rightFuzzyCreator = rightFuzzyCreator;
            return this;
        }

        public QueryBuilder rightFuzzyCreator (String ... rightFuzzyCreator){
            if (rightFuzzyCreator != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCreator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCreator = list;
            }
            return this;
        }

        public QueryBuilder creator(String creator){
            setCreator(creator);
            return this;
        }

        public QueryBuilder creatorList(String ... creator){
            if (creator != null){
                List<String> list = new ArrayList<>();
                for (String item : creator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.creatorList = list;
            }

            return this;
        }

        public QueryBuilder creatorList(List<String> creator){
            this.creatorList = creator;
            return this;
        }

        public QueryBuilder fetchCreator(){
            setFetchFields("fetchFields","creator");
            return this;
        }

        public QueryBuilder excludeCreator(){
            setFetchFields("excludeFields","creator");
            return this;
        }



        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            if (createTime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : createTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.createTimeList = list;
            }

            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }



        public QueryBuilder fuzzyUpdator (List<String> fuzzyUpdator){
            this.fuzzyUpdator = fuzzyUpdator;
            return this;
        }

        public QueryBuilder fuzzyUpdator (String ... fuzzyUpdator){
            if (fuzzyUpdator != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUpdator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUpdator = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUpdator (List<String> rightFuzzyUpdator){
            this.rightFuzzyUpdator = rightFuzzyUpdator;
            return this;
        }

        public QueryBuilder rightFuzzyUpdator (String ... rightFuzzyUpdator){
            if (rightFuzzyUpdator != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUpdator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUpdator = list;
            }
            return this;
        }

        public QueryBuilder updator(String updator){
            setUpdator(updator);
            return this;
        }

        public QueryBuilder updatorList(String ... updator){
            if (updator != null){
                List<String> list = new ArrayList<>();
                for (String item : updator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.updatorList = list;
            }

            return this;
        }

        public QueryBuilder updatorList(List<String> updator){
            this.updatorList = updator;
            return this;
        }

        public QueryBuilder fetchUpdator(){
            setFetchFields("fetchFields","updator");
            return this;
        }

        public QueryBuilder excludeUpdator(){
            setFetchFields("excludeFields","updator");
            return this;
        }



        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            if (updateTime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : updateTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.updateTimeList = list;
            }

            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public FiImageSearchResult build(){
            return this;
        }
    }

}
