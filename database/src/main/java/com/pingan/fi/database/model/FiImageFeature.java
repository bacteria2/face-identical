package com.pingan.fi.database.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class FiImageFeature implements Serializable {

    private static final long serialVersionUID = 1528943748579L;


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
    * isNullAble:0
    */
    private String feature;

    /**
    * 
    * isNullAble:0
    */
    private String charact;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String picPath;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String libId;

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

    public void setFeature(String feature){
        this.feature = feature;
    }

    public String getFeature(){
        return this.feature;
    }

    public void setCharact(String charact){
        this.charact = charact;
    }

    public String getCharact(){
        return this.charact;
    }

    public void setPicPath(String picPath){
        this.picPath = picPath;
    }

    public String getPicPath(){
        return this.picPath;
    }

    public void setLibId(String libId){
        this.libId = libId;
    }

    public String getLibId(){
        return this.libId;
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
        return "FiImageFeature{" +
                "id='" + id + '\'' +
                "imageId='" + imageId + '\'' +
                "feature='" + feature + '\'' +
                "charact='" + charact + '\'' +
                "picPath='" + picPath + '\'' +
                "libId='" + libId + '\'' +
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

    public static class QueryBuilder extends FiImageFeature{
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
        private List<String> featureList;


        private List<String> fuzzyFeature;

        public List<String> getFuzzyFeature(){
            return this.fuzzyFeature;
        }

        private List<String> rightFuzzyFeature;

        public List<String> getRightFuzzyFeature(){
            return this.rightFuzzyFeature;
        }
        private List<String> charactList;


        private List<String> fuzzyCharact;

        public List<String> getFuzzyCharact(){
            return this.fuzzyCharact;
        }

        private List<String> rightFuzzyCharact;

        public List<String> getRightFuzzyCharact(){
            return this.rightFuzzyCharact;
        }
        private List<String> picPathList;


        private List<String> fuzzyPicPath;

        public List<String> getFuzzyPicPath(){
            return this.fuzzyPicPath;
        }

        private List<String> rightFuzzyPicPath;

        public List<String> getRightFuzzyPicPath(){
            return this.rightFuzzyPicPath;
        }
        private List<String> libIdList;


        private List<String> fuzzyLibId;

        public List<String> getFuzzyLibId(){
            return this.fuzzyLibId;
        }

        private List<String> rightFuzzyLibId;

        public List<String> getRightFuzzyLibId(){
            return this.rightFuzzyLibId;
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



        public QueryBuilder fuzzyFeature (List<String> fuzzyFeature){
            this.fuzzyFeature = fuzzyFeature;
            return this;
        }

        public QueryBuilder fuzzyFeature (String ... fuzzyFeature){
            if (fuzzyFeature != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyFeature){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyFeature = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyFeature (List<String> rightFuzzyFeature){
            this.rightFuzzyFeature = rightFuzzyFeature;
            return this;
        }

        public QueryBuilder rightFuzzyFeature (String ... rightFuzzyFeature){
            if (rightFuzzyFeature != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyFeature){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyFeature = list;
            }
            return this;
        }

        public QueryBuilder feature(String feature){
            setFeature(feature);
            return this;
        }

        public QueryBuilder featureList(String ... feature){
            if (feature != null){
                List<String> list = new ArrayList<>();
                for (String item : feature){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.featureList = list;
            }

            return this;
        }

        public QueryBuilder featureList(List<String> feature){
            this.featureList = feature;
            return this;
        }

        public QueryBuilder fetchFeature(){
            setFetchFields("fetchFields","feature");
            return this;
        }

        public QueryBuilder excludeFeature(){
            setFetchFields("excludeFields","feature");
            return this;
        }



        public QueryBuilder fuzzyCharact (List<String> fuzzyCharact){
            this.fuzzyCharact = fuzzyCharact;
            return this;
        }

        public QueryBuilder fuzzyCharact (String ... fuzzyCharact){
            if (fuzzyCharact != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCharact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCharact = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCharact (List<String> rightFuzzyCharact){
            this.rightFuzzyCharact = rightFuzzyCharact;
            return this;
        }

        public QueryBuilder rightFuzzyCharact (String ... rightFuzzyCharact){
            if (rightFuzzyCharact != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCharact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCharact = list;
            }
            return this;
        }

        public QueryBuilder charact(String charact){
            setCharact(charact);
            return this;
        }

        public QueryBuilder charactList(String ... charact){
            if (charact != null){
                List<String> list = new ArrayList<>();
                for (String item : charact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.charactList = list;
            }

            return this;
        }

        public QueryBuilder charactList(List<String> charact){
            this.charactList = charact;
            return this;
        }

        public QueryBuilder fetchCharact(){
            setFetchFields("fetchFields","charact");
            return this;
        }

        public QueryBuilder excludeCharact(){
            setFetchFields("excludeFields","charact");
            return this;
        }



        public QueryBuilder fuzzyPicPath (List<String> fuzzyPicPath){
            this.fuzzyPicPath = fuzzyPicPath;
            return this;
        }

        public QueryBuilder fuzzyPicPath (String ... fuzzyPicPath){
            if (fuzzyPicPath != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPicPath){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPicPath = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPicPath (List<String> rightFuzzyPicPath){
            this.rightFuzzyPicPath = rightFuzzyPicPath;
            return this;
        }

        public QueryBuilder rightFuzzyPicPath (String ... rightFuzzyPicPath){
            if (rightFuzzyPicPath != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPicPath){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPicPath = list;
            }
            return this;
        }

        public QueryBuilder picPath(String picPath){
            setPicPath(picPath);
            return this;
        }

        public QueryBuilder picPathList(String ... picPath){
            if (picPath != null){
                List<String> list = new ArrayList<>();
                for (String item : picPath){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.picPathList = list;
            }

            return this;
        }

        public QueryBuilder picPathList(List<String> picPath){
            this.picPathList = picPath;
            return this;
        }

        public QueryBuilder fetchPicPath(){
            setFetchFields("fetchFields","picPath");
            return this;
        }

        public QueryBuilder excludePicPath(){
            setFetchFields("excludeFields","picPath");
            return this;
        }



        public QueryBuilder fuzzyLibId (List<String> fuzzyLibId){
            this.fuzzyLibId = fuzzyLibId;
            return this;
        }

        public QueryBuilder fuzzyLibId (String ... fuzzyLibId){
            if (fuzzyLibId != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLibId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLibId = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLibId (List<String> rightFuzzyLibId){
            this.rightFuzzyLibId = rightFuzzyLibId;
            return this;
        }

        public QueryBuilder rightFuzzyLibId (String ... rightFuzzyLibId){
            if (rightFuzzyLibId != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLibId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLibId = list;
            }
            return this;
        }

        public QueryBuilder libId(String libId){
            setLibId(libId);
            return this;
        }

        public QueryBuilder libIdList(String ... libId){
            if (libId != null){
                List<String> list = new ArrayList<>();
                for (String item : libId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.libIdList = list;
            }

            return this;
        }

        public QueryBuilder libIdList(List<String> libId){
            this.libIdList = libId;
            return this;
        }

        public QueryBuilder fetchLibId(){
            setFetchFields("fetchFields","libId");
            return this;
        }

        public QueryBuilder excludeLibId(){
            setFetchFields("excludeFields","libId");
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

        public FiImageFeature build(){
            return this;
        }
    }

}
