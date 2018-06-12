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

    private static final long serialVersionUID = 1528783994234L;


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
    private String image_id;

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
    private String pic_path;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String lib_id;

    /**
    * 
    * isNullAble:0
    */
    private Long vendor_id;

    /**
    * 
    * isNullAble:0
    */
    private Long position_id;

    /**
    * 
    * isNullAble:0
    */
    private String creator;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime create_time;

    /**
    * 更新者
    * isNullAble:0,defaultVal:
    */
    private String updator;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime update_time;


    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setImage_id(String image_id){
        this.image_id = image_id;
    }

    public String getImage_id(){
        return this.image_id;
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

    public void setPic_path(String pic_path){
        this.pic_path = pic_path;
    }

    public String getPic_path(){
        return this.pic_path;
    }

    public void setLib_id(String lib_id){
        this.lib_id = lib_id;
    }

    public String getLib_id(){
        return this.lib_id;
    }

    public void setVendor_id(Long vendor_id){
        this.vendor_id = vendor_id;
    }

    public Long getVendor_id(){
        return this.vendor_id;
    }

    public void setPosition_id(Long position_id){
        this.position_id = position_id;
    }

    public Long getPosition_id(){
        return this.position_id;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public String getCreator(){
        return this.creator;
    }

    public void setCreate_time(java.time.LocalDateTime create_time){
        this.create_time = create_time;
    }

    public java.time.LocalDateTime getCreate_time(){
        return this.create_time;
    }

    public void setUpdator(String updator){
        this.updator = updator;
    }

    public String getUpdator(){
        return this.updator;
    }

    public void setUpdate_time(java.time.LocalDateTime update_time){
        this.update_time = update_time;
    }

    public java.time.LocalDateTime getUpdate_time(){
        return this.update_time;
    }
    @Override
    public String toString() {
        return "FiImageFeature{" +
                "id='" + id + '\'' +
                "image_id='" + image_id + '\'' +
                "feature='" + feature + '\'' +
                "charact='" + charact + '\'' +
                "pic_path='" + pic_path + '\'' +
                "lib_id='" + lib_id + '\'' +
                "vendor_id='" + vendor_id + '\'' +
                "position_id='" + position_id + '\'' +
                "creator='" + creator + '\'' +
                "create_time='" + create_time + '\'' +
                "updator='" + updator + '\'' +
                "update_time='" + update_time + '\'' +
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

        private List<String> image_idList;


        private List<String> fuzzyImage_id;

        public List<String> getFuzzyImage_id(){
            return this.fuzzyImage_id;
        }

        private List<String> rightFuzzyImage_id;

        public List<String> getRightFuzzyImage_id(){
            return this.rightFuzzyImage_id;
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
        private List<String> pic_pathList;


        private List<String> fuzzyPic_path;

        public List<String> getFuzzyPic_path(){
            return this.fuzzyPic_path;
        }

        private List<String> rightFuzzyPic_path;

        public List<String> getRightFuzzyPic_path(){
            return this.rightFuzzyPic_path;
        }
        private List<String> lib_idList;


        private List<String> fuzzyLib_id;

        public List<String> getFuzzyLib_id(){
            return this.fuzzyLib_id;
        }

        private List<String> rightFuzzyLib_id;

        public List<String> getRightFuzzyLib_id(){
            return this.rightFuzzyLib_id;
        }
        private List<Long> vendor_idList;

        private Long vendor_idSt;

        private Long vendor_idEd;

        public Long getVendor_idSt(){
            return this.vendor_idSt;
        }

        public Long getVendor_idEd(){
            return this.vendor_idEd;
        }

        private List<Long> position_idList;

        private Long position_idSt;

        private Long position_idEd;

        public Long getPosition_idSt(){
            return this.position_idSt;
        }

        public Long getPosition_idEd(){
            return this.position_idEd;
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
        private List<java.time.LocalDateTime> create_timeList;

        private java.time.LocalDateTime create_timeSt;

        private java.time.LocalDateTime create_timeEd;

        public java.time.LocalDateTime getCreate_timeSt(){
            return this.create_timeSt;
        }

        public java.time.LocalDateTime getCreate_timeEd(){
            return this.create_timeEd;
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
        private List<java.time.LocalDateTime> update_timeList;

        private java.time.LocalDateTime update_timeSt;

        private java.time.LocalDateTime update_timeEd;

        public java.time.LocalDateTime getUpdate_timeSt(){
            return this.update_timeSt;
        }

        public java.time.LocalDateTime getUpdate_timeEd(){
            return this.update_timeEd;
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



        public QueryBuilder fuzzyImage_id (List<String> fuzzyImage_id){
            this.fuzzyImage_id = fuzzyImage_id;
            return this;
        }

        public QueryBuilder fuzzyImage_id (String ... fuzzyImage_id){
            if (fuzzyImage_id != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyImage_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyImage_id = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyImage_id (List<String> rightFuzzyImage_id){
            this.rightFuzzyImage_id = rightFuzzyImage_id;
            return this;
        }

        public QueryBuilder rightFuzzyImage_id (String ... rightFuzzyImage_id){
            if (rightFuzzyImage_id != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyImage_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyImage_id = list;
            }
            return this;
        }

        public QueryBuilder image_id(String image_id){
            setImage_id(image_id);
            return this;
        }

        public QueryBuilder image_idList(String ... image_id){
            if (image_id != null){
                List<String> list = new ArrayList<>();
                for (String item : image_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.image_idList = list;
            }

            return this;
        }

        public QueryBuilder image_idList(List<String> image_id){
            this.image_idList = image_id;
            return this;
        }

        public QueryBuilder fetchImage_id(){
            setFetchFields("fetchFields","image_id");
            return this;
        }

        public QueryBuilder excludeImage_id(){
            setFetchFields("excludeFields","image_id");
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



        public QueryBuilder fuzzyPic_path (List<String> fuzzyPic_path){
            this.fuzzyPic_path = fuzzyPic_path;
            return this;
        }

        public QueryBuilder fuzzyPic_path (String ... fuzzyPic_path){
            if (fuzzyPic_path != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPic_path){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPic_path = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPic_path (List<String> rightFuzzyPic_path){
            this.rightFuzzyPic_path = rightFuzzyPic_path;
            return this;
        }

        public QueryBuilder rightFuzzyPic_path (String ... rightFuzzyPic_path){
            if (rightFuzzyPic_path != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPic_path){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPic_path = list;
            }
            return this;
        }

        public QueryBuilder pic_path(String pic_path){
            setPic_path(pic_path);
            return this;
        }

        public QueryBuilder pic_pathList(String ... pic_path){
            if (pic_path != null){
                List<String> list = new ArrayList<>();
                for (String item : pic_path){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.pic_pathList = list;
            }

            return this;
        }

        public QueryBuilder pic_pathList(List<String> pic_path){
            this.pic_pathList = pic_path;
            return this;
        }

        public QueryBuilder fetchPic_path(){
            setFetchFields("fetchFields","pic_path");
            return this;
        }

        public QueryBuilder excludePic_path(){
            setFetchFields("excludeFields","pic_path");
            return this;
        }



        public QueryBuilder fuzzyLib_id (List<String> fuzzyLib_id){
            this.fuzzyLib_id = fuzzyLib_id;
            return this;
        }

        public QueryBuilder fuzzyLib_id (String ... fuzzyLib_id){
            if (fuzzyLib_id != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLib_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLib_id = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLib_id (List<String> rightFuzzyLib_id){
            this.rightFuzzyLib_id = rightFuzzyLib_id;
            return this;
        }

        public QueryBuilder rightFuzzyLib_id (String ... rightFuzzyLib_id){
            if (rightFuzzyLib_id != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLib_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLib_id = list;
            }
            return this;
        }

        public QueryBuilder lib_id(String lib_id){
            setLib_id(lib_id);
            return this;
        }

        public QueryBuilder lib_idList(String ... lib_id){
            if (lib_id != null){
                List<String> list = new ArrayList<>();
                for (String item : lib_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.lib_idList = list;
            }

            return this;
        }

        public QueryBuilder lib_idList(List<String> lib_id){
            this.lib_idList = lib_id;
            return this;
        }

        public QueryBuilder fetchLib_id(){
            setFetchFields("fetchFields","lib_id");
            return this;
        }

        public QueryBuilder excludeLib_id(){
            setFetchFields("excludeFields","lib_id");
            return this;
        }



        public QueryBuilder vendor_idBetWeen(Long vendor_idSt,Long vendor_idEd){
            this.vendor_idSt = vendor_idSt;
            this.vendor_idEd = vendor_idEd;
            return this;
        }

        public QueryBuilder vendor_idGreaterEqThan(Long vendor_idSt){
            this.vendor_idSt = vendor_idSt;
            return this;
        }
        public QueryBuilder vendor_idLessEqThan(Long vendor_idEd){
            this.vendor_idEd = vendor_idEd;
            return this;
        }


        public QueryBuilder vendor_id(Long vendor_id){
            setVendor_id(vendor_id);
            return this;
        }

        public QueryBuilder vendor_idList(Long ... vendor_id){
            if (vendor_id != null){
                List<Long> list = new ArrayList<>();
                for (Long item : vendor_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.vendor_idList = list;
            }

            return this;
        }

        public QueryBuilder vendor_idList(List<Long> vendor_id){
            this.vendor_idList = vendor_id;
            return this;
        }

        public QueryBuilder fetchVendor_id(){
            setFetchFields("fetchFields","vendor_id");
            return this;
        }

        public QueryBuilder excludeVendor_id(){
            setFetchFields("excludeFields","vendor_id");
            return this;
        }



        public QueryBuilder position_idBetWeen(Long position_idSt,Long position_idEd){
            this.position_idSt = position_idSt;
            this.position_idEd = position_idEd;
            return this;
        }

        public QueryBuilder position_idGreaterEqThan(Long position_idSt){
            this.position_idSt = position_idSt;
            return this;
        }
        public QueryBuilder position_idLessEqThan(Long position_idEd){
            this.position_idEd = position_idEd;
            return this;
        }


        public QueryBuilder position_id(Long position_id){
            setPosition_id(position_id);
            return this;
        }

        public QueryBuilder position_idList(Long ... position_id){
            if (position_id != null){
                List<Long> list = new ArrayList<>();
                for (Long item : position_id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.position_idList = list;
            }

            return this;
        }

        public QueryBuilder position_idList(List<Long> position_id){
            this.position_idList = position_id;
            return this;
        }

        public QueryBuilder fetchPosition_id(){
            setFetchFields("fetchFields","position_id");
            return this;
        }

        public QueryBuilder excludePosition_id(){
            setFetchFields("excludeFields","position_id");
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



        public QueryBuilder create_timeBetWeen(java.time.LocalDateTime create_timeSt,java.time.LocalDateTime create_timeEd){
            this.create_timeSt = create_timeSt;
            this.create_timeEd = create_timeEd;
            return this;
        }

        public QueryBuilder create_timeGreaterEqThan(java.time.LocalDateTime create_timeSt){
            this.create_timeSt = create_timeSt;
            return this;
        }
        public QueryBuilder create_timeLessEqThan(java.time.LocalDateTime create_timeEd){
            this.create_timeEd = create_timeEd;
            return this;
        }


        public QueryBuilder create_time(java.time.LocalDateTime create_time){
            setCreate_time(create_time);
            return this;
        }

        public QueryBuilder create_timeList(java.time.LocalDateTime ... create_time){
            if (create_time != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : create_time){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.create_timeList = list;
            }

            return this;
        }

        public QueryBuilder create_timeList(List<java.time.LocalDateTime> create_time){
            this.create_timeList = create_time;
            return this;
        }

        public QueryBuilder fetchCreate_time(){
            setFetchFields("fetchFields","create_time");
            return this;
        }

        public QueryBuilder excludeCreate_time(){
            setFetchFields("excludeFields","create_time");
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



        public QueryBuilder update_timeBetWeen(java.time.LocalDateTime update_timeSt,java.time.LocalDateTime update_timeEd){
            this.update_timeSt = update_timeSt;
            this.update_timeEd = update_timeEd;
            return this;
        }

        public QueryBuilder update_timeGreaterEqThan(java.time.LocalDateTime update_timeSt){
            this.update_timeSt = update_timeSt;
            return this;
        }
        public QueryBuilder update_timeLessEqThan(java.time.LocalDateTime update_timeEd){
            this.update_timeEd = update_timeEd;
            return this;
        }


        public QueryBuilder update_time(java.time.LocalDateTime update_time){
            setUpdate_time(update_time);
            return this;
        }

        public QueryBuilder update_timeList(java.time.LocalDateTime ... update_time){
            if (update_time != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : update_time){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.update_timeList = list;
            }

            return this;
        }

        public QueryBuilder update_timeList(List<java.time.LocalDateTime> update_time){
            this.update_timeList = update_time;
            return this;
        }

        public QueryBuilder fetchUpdate_time(){
            setFetchFields("fetchFields","update_time");
            return this;
        }

        public QueryBuilder excludeUpdate_time(){
            setFetchFields("excludeFields","update_time");
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
