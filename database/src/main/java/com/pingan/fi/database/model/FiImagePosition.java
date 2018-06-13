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
public class FiImagePosition implements Serializable {

    private static final long serialVersionUID = 1528859427876L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:0
    */
    private String imageId;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer topLeftX;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer topLeftY;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer bottomRightX;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer bottomRightY;

    /**
    * 
    * isNullAble:0
    */
    private String creator;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;

    /**
    * 更新者
    * isNullAble:0,defaultVal:
    */
    private String updator;

    /**
    * 
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

    public void setTopLeftX(Integer topLeftX){
        this.topLeftX = topLeftX;
    }

    public Integer getTopLeftX(){
        return this.topLeftX;
    }

    public void setTopLeftY(Integer topLeftY){
        this.topLeftY = topLeftY;
    }

    public Integer getTopLeftY(){
        return this.topLeftY;
    }

    public void setBottomRightX(Integer bottomRightX){
        this.bottomRightX = bottomRightX;
    }

    public Integer getBottomRightX(){
        return this.bottomRightX;
    }

    public void setBottomRightY(Integer bottomRightY){
        this.bottomRightY = bottomRightY;
    }

    public Integer getBottomRightY(){
        return this.bottomRightY;
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
        return "FiImagePosition{" +
                "id='" + id + '\'' +
                "imageId='" + imageId + '\'' +
                "topLeftX='" + topLeftX + '\'' +
                "topLeftY='" + topLeftY + '\'' +
                "bottomRightX='" + bottomRightX + '\'' +
                "bottomRightY='" + bottomRightY + '\'' +
                "creator='" + creator + '\'' +
                "createTime='" + createTime + '\'' +
                "updator='" + updator + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends FiImagePosition{
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
        private List<Integer> topLeftXList;

        private Integer topLeftXSt;

        private Integer topLeftXEd;

        public Integer getTopLeftXSt(){
            return this.topLeftXSt;
        }

        public Integer getTopLeftXEd(){
            return this.topLeftXEd;
        }

        private List<Integer> topLeftYList;

        private Integer topLeftYSt;

        private Integer topLeftYEd;

        public Integer getTopLeftYSt(){
            return this.topLeftYSt;
        }

        public Integer getTopLeftYEd(){
            return this.topLeftYEd;
        }

        private List<Integer> bottomRightXList;

        private Integer bottomRightXSt;

        private Integer bottomRightXEd;

        public Integer getBottomRightXSt(){
            return this.bottomRightXSt;
        }

        public Integer getBottomRightXEd(){
            return this.bottomRightXEd;
        }

        private List<Integer> bottomRightYList;

        private Integer bottomRightYSt;

        private Integer bottomRightYEd;

        public Integer getBottomRightYSt(){
            return this.bottomRightYSt;
        }

        public Integer getBottomRightYEd(){
            return this.bottomRightYEd;
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



        public QueryBuilder topLeftXBetWeen(Integer topLeftXSt,Integer topLeftXEd){
            this.topLeftXSt = topLeftXSt;
            this.topLeftXEd = topLeftXEd;
            return this;
        }

        public QueryBuilder topLeftXGreaterEqThan(Integer topLeftXSt){
            this.topLeftXSt = topLeftXSt;
            return this;
        }
        public QueryBuilder topLeftXLessEqThan(Integer topLeftXEd){
            this.topLeftXEd = topLeftXEd;
            return this;
        }


        public QueryBuilder topLeftX(Integer topLeftX){
            setTopLeftX(topLeftX);
            return this;
        }

        public QueryBuilder topLeftXList(Integer ... topLeftX){
            if (topLeftX != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : topLeftX){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.topLeftXList = list;
            }

            return this;
        }

        public QueryBuilder topLeftXList(List<Integer> topLeftX){
            this.topLeftXList = topLeftX;
            return this;
        }

        public QueryBuilder fetchTopLeftX(){
            setFetchFields("fetchFields","topLeftX");
            return this;
        }

        public QueryBuilder excludeTopLeftX(){
            setFetchFields("excludeFields","topLeftX");
            return this;
        }



        public QueryBuilder topLeftYBetWeen(Integer topLeftYSt,Integer topLeftYEd){
            this.topLeftYSt = topLeftYSt;
            this.topLeftYEd = topLeftYEd;
            return this;
        }

        public QueryBuilder topLeftYGreaterEqThan(Integer topLeftYSt){
            this.topLeftYSt = topLeftYSt;
            return this;
        }
        public QueryBuilder topLeftYLessEqThan(Integer topLeftYEd){
            this.topLeftYEd = topLeftYEd;
            return this;
        }


        public QueryBuilder topLeftY(Integer topLeftY){
            setTopLeftY(topLeftY);
            return this;
        }

        public QueryBuilder topLeftYList(Integer ... topLeftY){
            if (topLeftY != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : topLeftY){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.topLeftYList = list;
            }

            return this;
        }

        public QueryBuilder topLeftYList(List<Integer> topLeftY){
            this.topLeftYList = topLeftY;
            return this;
        }

        public QueryBuilder fetchTopLeftY(){
            setFetchFields("fetchFields","topLeftY");
            return this;
        }

        public QueryBuilder excludeTopLeftY(){
            setFetchFields("excludeFields","topLeftY");
            return this;
        }



        public QueryBuilder bottomRightXBetWeen(Integer bottomRightXSt,Integer bottomRightXEd){
            this.bottomRightXSt = bottomRightXSt;
            this.bottomRightXEd = bottomRightXEd;
            return this;
        }

        public QueryBuilder bottomRightXGreaterEqThan(Integer bottomRightXSt){
            this.bottomRightXSt = bottomRightXSt;
            return this;
        }
        public QueryBuilder bottomRightXLessEqThan(Integer bottomRightXEd){
            this.bottomRightXEd = bottomRightXEd;
            return this;
        }


        public QueryBuilder bottomRightX(Integer bottomRightX){
            setBottomRightX(bottomRightX);
            return this;
        }

        public QueryBuilder bottomRightXList(Integer ... bottomRightX){
            if (bottomRightX != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : bottomRightX){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.bottomRightXList = list;
            }

            return this;
        }

        public QueryBuilder bottomRightXList(List<Integer> bottomRightX){
            this.bottomRightXList = bottomRightX;
            return this;
        }

        public QueryBuilder fetchBottomRightX(){
            setFetchFields("fetchFields","bottomRightX");
            return this;
        }

        public QueryBuilder excludeBottomRightX(){
            setFetchFields("excludeFields","bottomRightX");
            return this;
        }



        public QueryBuilder bottomRightYBetWeen(Integer bottomRightYSt,Integer bottomRightYEd){
            this.bottomRightYSt = bottomRightYSt;
            this.bottomRightYEd = bottomRightYEd;
            return this;
        }

        public QueryBuilder bottomRightYGreaterEqThan(Integer bottomRightYSt){
            this.bottomRightYSt = bottomRightYSt;
            return this;
        }
        public QueryBuilder bottomRightYLessEqThan(Integer bottomRightYEd){
            this.bottomRightYEd = bottomRightYEd;
            return this;
        }


        public QueryBuilder bottomRightY(Integer bottomRightY){
            setBottomRightY(bottomRightY);
            return this;
        }

        public QueryBuilder bottomRightYList(Integer ... bottomRightY){
            if (bottomRightY != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : bottomRightY){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.bottomRightYList = list;
            }

            return this;
        }

        public QueryBuilder bottomRightYList(List<Integer> bottomRightY){
            this.bottomRightYList = bottomRightY;
            return this;
        }

        public QueryBuilder fetchBottomRightY(){
            setFetchFields("fetchFields","bottomRightY");
            return this;
        }

        public QueryBuilder excludeBottomRightY(){
            setFetchFields("excludeFields","bottomRightY");
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

        public FiImagePosition build(){
            return this;
        }
    }

}
