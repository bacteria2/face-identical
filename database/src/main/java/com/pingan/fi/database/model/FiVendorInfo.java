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
public class FiVendorInfo implements Serializable {

    private static final long serialVersionUID = 1528859849447L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 厂商名称
    * isNullAble:0
    */
    private String vendorName;

    /**
    * 
    * isNullAble:1
    */
    private String vendorNameEn;

    /**
    * 
    * isNullAble:0
    */
    private String version;

    /**
    * 
    * isNullAble:0,defaultVal:
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

    public void setVendorName(String vendorName){
        this.vendorName = vendorName;
    }

    public String getVendorName(){
        return this.vendorName;
    }

    public void setVendorNameEn(String vendorNameEn){
        this.vendorNameEn = vendorNameEn;
    }

    public String getVendorNameEn(){
        return this.vendorNameEn;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getVersion(){
        return this.version;
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
        return "FiVendorInfo{" +
                "id='" + id + '\'' +
                "vendorName='" + vendorName + '\'' +
                "vendorNameEn='" + vendorNameEn + '\'' +
                "version='" + version + '\'' +
                "creator='" + creator + '\'' +
                "createTime='" + createTime + '\'' +
                "updator='" + updator + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends FiVendorInfo{
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

        private List<String> vendorNameList;


        private List<String> fuzzyVendorName;

        public List<String> getFuzzyVendorName(){
            return this.fuzzyVendorName;
        }

        private List<String> rightFuzzyVendorName;

        public List<String> getRightFuzzyVendorName(){
            return this.rightFuzzyVendorName;
        }
        private List<String> vendorNameEnList;


        private List<String> fuzzyVendorNameEn;

        public List<String> getFuzzyVendorNameEn(){
            return this.fuzzyVendorNameEn;
        }

        private List<String> rightFuzzyVendorNameEn;

        public List<String> getRightFuzzyVendorNameEn(){
            return this.rightFuzzyVendorNameEn;
        }
        private List<String> versionList;


        private List<String> fuzzyVersion;

        public List<String> getFuzzyVersion(){
            return this.fuzzyVersion;
        }

        private List<String> rightFuzzyVersion;

        public List<String> getRightFuzzyVersion(){
            return this.rightFuzzyVersion;
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



        public QueryBuilder fuzzyVendorName (List<String> fuzzyVendorName){
            this.fuzzyVendorName = fuzzyVendorName;
            return this;
        }

        public QueryBuilder fuzzyVendorName (String ... fuzzyVendorName){
            if (fuzzyVendorName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyVendorName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyVendorName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyVendorName (List<String> rightFuzzyVendorName){
            this.rightFuzzyVendorName = rightFuzzyVendorName;
            return this;
        }

        public QueryBuilder rightFuzzyVendorName (String ... rightFuzzyVendorName){
            if (rightFuzzyVendorName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyVendorName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyVendorName = list;
            }
            return this;
        }

        public QueryBuilder vendorName(String vendorName){
            setVendorName(vendorName);
            return this;
        }

        public QueryBuilder vendorNameList(String ... vendorName){
            if (vendorName != null){
                List<String> list = new ArrayList<>();
                for (String item : vendorName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.vendorNameList = list;
            }

            return this;
        }

        public QueryBuilder vendorNameList(List<String> vendorName){
            this.vendorNameList = vendorName;
            return this;
        }

        public QueryBuilder fetchVendorName(){
            setFetchFields("fetchFields","vendorName");
            return this;
        }

        public QueryBuilder excludeVendorName(){
            setFetchFields("excludeFields","vendorName");
            return this;
        }



        public QueryBuilder fuzzyVendorNameEn (List<String> fuzzyVendorNameEn){
            this.fuzzyVendorNameEn = fuzzyVendorNameEn;
            return this;
        }

        public QueryBuilder fuzzyVendorNameEn (String ... fuzzyVendorNameEn){
            if (fuzzyVendorNameEn != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyVendorNameEn){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyVendorNameEn = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyVendorNameEn (List<String> rightFuzzyVendorNameEn){
            this.rightFuzzyVendorNameEn = rightFuzzyVendorNameEn;
            return this;
        }

        public QueryBuilder rightFuzzyVendorNameEn (String ... rightFuzzyVendorNameEn){
            if (rightFuzzyVendorNameEn != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyVendorNameEn){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyVendorNameEn = list;
            }
            return this;
        }

        public QueryBuilder vendorNameEn(String vendorNameEn){
            setVendorNameEn(vendorNameEn);
            return this;
        }

        public QueryBuilder vendorNameEnList(String ... vendorNameEn){
            if (vendorNameEn != null){
                List<String> list = new ArrayList<>();
                for (String item : vendorNameEn){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.vendorNameEnList = list;
            }

            return this;
        }

        public QueryBuilder vendorNameEnList(List<String> vendorNameEn){
            this.vendorNameEnList = vendorNameEn;
            return this;
        }

        public QueryBuilder fetchVendorNameEn(){
            setFetchFields("fetchFields","vendorNameEn");
            return this;
        }

        public QueryBuilder excludeVendorNameEn(){
            setFetchFields("excludeFields","vendorNameEn");
            return this;
        }



        public QueryBuilder fuzzyVersion (List<String> fuzzyVersion){
            this.fuzzyVersion = fuzzyVersion;
            return this;
        }

        public QueryBuilder fuzzyVersion (String ... fuzzyVersion){
            if (fuzzyVersion != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyVersion){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyVersion = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyVersion (List<String> rightFuzzyVersion){
            this.rightFuzzyVersion = rightFuzzyVersion;
            return this;
        }

        public QueryBuilder rightFuzzyVersion (String ... rightFuzzyVersion){
            if (rightFuzzyVersion != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyVersion){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyVersion = list;
            }
            return this;
        }

        public QueryBuilder version(String version){
            setVersion(version);
            return this;
        }

        public QueryBuilder versionList(String ... version){
            if (version != null){
                List<String> list = new ArrayList<>();
                for (String item : version){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.versionList = list;
            }

            return this;
        }

        public QueryBuilder versionList(List<String> version){
            this.versionList = version;
            return this;
        }

        public QueryBuilder fetchVersion(){
            setFetchFields("fetchFields","version");
            return this;
        }

        public QueryBuilder excludeVersion(){
            setFetchFields("excludeFields","version");
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

        public FiVendorInfo build(){
            return this;
        }
    }

}
