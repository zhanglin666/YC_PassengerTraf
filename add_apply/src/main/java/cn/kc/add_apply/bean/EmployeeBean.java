package cn.kc.add_apply.bean;

import java.util.List;

/**
 * 作者： Abel .
 * 日期：2019/9/19
 * 说明：
 */
public class EmployeeBean {

    /**
     * state : 1
     * message : 获取检查人和责任人信息成功！
     * data : [{"EMPLOYEE_CODE_ID":"82B5540DC6C825BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"查文彦","EMPLOYEE_CODE_XPNO":"YK2805","EMPLOYEE_CODE_SBNO":"266966","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC85225BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"陈家威","EMPLOYEE_CODE_XPNO":"YK3411","EMPLOYEE_CODE_SBNO":"1711062","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC0C925BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"陈铁军","EMPLOYEE_CODE_XPNO":"YK2531","EMPLOYEE_CODE_SBNO":"217916","POSITION_NAME":"列车长"},{"EMPLOYEE_CODE_ID":"82B5540DC3CF25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"程孝贤","EMPLOYEE_CODE_XPNO":"YK1905","EMPLOYEE_CODE_SBNO":"218010","POSITION_NAME":"列车值班员"},{"EMPLOYEE_CODE_ID":"82B5540DC69025BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"段吉成","EMPLOYEE_CODE_XPNO":"YK2809","EMPLOYEE_CODE_SBNO":"1610010","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC85525BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"何雪","EMPLOYEE_CODE_XPNO":"YK3406","EMPLOYEE_CODE_SBNO":"1711034","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC62025BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"李欢1","EMPLOYEE_CODE_XPNO":"YK2187","EMPLOYEE_CODE_SBNO":"1706004","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"8B7D4193716E9649E050D70A09E04C5D","EMPLOYEE_CODE_NAME":"李心怡","EMPLOYEE_CODE_XPNO":"YK2388","EMPLOYEE_CODE_SBNO":"1905066","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC56225BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"李志刚","EMPLOYEE_CODE_XPNO":"YK2575","EMPLOYEE_CODE_SBNO":"149994","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC77F25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"李茜子","EMPLOYEE_CODE_XPNO":"YK3399","EMPLOYEE_CODE_SBNO":"272971","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DBEDA25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"马欢","EMPLOYEE_CODE_XPNO":"YK1920","EMPLOYEE_CODE_SBNO":"252504","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC69125BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"毛庆","EMPLOYEE_CODE_XPNO":"YK2808","EMPLOYEE_CODE_SBNO":"1610011","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"8B7D419371839649E050D70A09E04C5D","EMPLOYEE_CODE_NAME":"孟欣怡","EMPLOYEE_CODE_XPNO":"Y172","EMPLOYEE_CODE_SBNO":"1905049","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC73325BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"邱星","EMPLOYEE_CODE_XPNO":"YK2058","EMPLOYEE_CODE_SBNO":"1805013","POSITION_NAME":"炊事员"},{"EMPLOYEE_CODE_ID":"82B5540DC82025BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"权璐","EMPLOYEE_CODE_XPNO":"YK3402","EMPLOYEE_CODE_SBNO":"1709018","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC65125BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"史家豪","EMPLOYEE_CODE_XPNO":"YK2761","EMPLOYEE_CODE_SBNO":"1611022","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC77425BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"苏龙","EMPLOYEE_CODE_XPNO":"YK3409","EMPLOYEE_CODE_SBNO":"273045","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DBFAA25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"田亚俊","EMPLOYEE_CODE_XPNO":"YK2713","EMPLOYEE_CODE_SBNO":"252496","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC15525BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"王运琪","EMPLOYEE_CODE_XPNO":"YK2502","EMPLOYEE_CODE_SBNO":"1500084","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC7A125BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"王婷婷","EMPLOYEE_CODE_XPNO":"YK2127","EMPLOYEE_CODE_SBNO":"1811014","POSITION_NAME":"服务员"},{"EMPLOYEE_CODE_ID":"82B5540DC6B725BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"魏小峰","EMPLOYEE_CODE_XPNO":"YK3013","EMPLOYEE_CODE_SBNO":"266950","POSITION_NAME":"列车长"},{"EMPLOYEE_CODE_ID":"82B5540DBDE125BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"吴春兰","EMPLOYEE_CODE_XPNO":"YK2667","EMPLOYEE_CODE_SBNO":"1600064","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DBE9325BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"夏磊","EMPLOYEE_CODE_XPNO":"YK2536","EMPLOYEE_CODE_SBNO":"150032","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC4AB25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"辛萌萌","EMPLOYEE_CODE_XPNO":"YK2659","EMPLOYEE_CODE_SBNO":"261209","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DBDE225BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"徐卫东","EMPLOYEE_CODE_XPNO":"YK1211","EMPLOYEE_CODE_SBNO":"273382","POSITION_NAME":"厨师"},{"EMPLOYEE_CODE_ID":"82B5540DC35E25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"徐亚楠","EMPLOYEE_CODE_XPNO":"YK2665","EMPLOYEE_CODE_SBNO":"256176","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DBEB625BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"徐玉萍","EMPLOYEE_CODE_XPNO":"YK1458","EMPLOYEE_CODE_SBNO":"134934","POSITION_NAME":"列车值班员"},{"EMPLOYEE_CODE_ID":"82B5540DC18225BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"杨金丽","EMPLOYEE_CODE_XPNO":"YK2663","EMPLOYEE_CODE_SBNO":"134983","POSITION_NAME":"广播员"},{"EMPLOYEE_CODE_ID":"82B5540DC55125BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"杨美","EMPLOYEE_CODE_XPNO":"YK2670","EMPLOYEE_CODE_SBNO":"1506189","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC4E525BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"杨瑞","EMPLOYEE_CODE_XPNO":"YK1811","EMPLOYEE_CODE_SBNO":"1604190","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC1B925BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"殷玉滨","EMPLOYEE_CODE_XPNO":"YK0818","EMPLOYEE_CODE_SBNO":"249983","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC82B25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"张兵","EMPLOYEE_CODE_XPNO":"YK3401","EMPLOYEE_CODE_SBNO":"1709038","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC85325BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"张帆","EMPLOYEE_CODE_XPNO":"YK3381","EMPLOYEE_CODE_SBNO":"1711065","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC52025BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"张蒙","EMPLOYEE_CODE_XPNO":"YK2936","EMPLOYEE_CODE_SBNO":"1506123","POSITION_NAME":"餐车长"},{"EMPLOYEE_CODE_ID":"82B5540DC0D325BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"周忠全","EMPLOYEE_CODE_XPNO":"YK2535","EMPLOYEE_CODE_SBNO":"153662","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DC0DC25BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"朱娟娥","EMPLOYEE_CODE_XPNO":"YK2697","EMPLOYEE_CODE_SBNO":"252498","POSITION_NAME":"列车员"},{"EMPLOYEE_CODE_ID":"82B5540DBE2025BFE050D70A09E0028D","EMPLOYEE_CODE_NAME":"雒佳","EMPLOYEE_CODE_XPNO":"YK2646","EMPLOYEE_CODE_SBNO":"1600228","POSITION_NAME":"服务员"}]
     */

    private String state;
    private String message;
    private List<DataBean> data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * EMPLOYEE_CODE_ID : 82B5540DC6C825BFE050D70A09E0028D
         * EMPLOYEE_CODE_NAME : 查文彦
         * EMPLOYEE_CODE_XPNO : YK2805
         * EMPLOYEE_CODE_SBNO : 266966
         * POSITION_NAME : 列车员
         */

        private String EMPLOYEE_CODE_ID;
        private String EMPLOYEE_CODE_NAME;
        private String EMPLOYEE_CODE_XPNO;
        private String EMPLOYEE_CODE_SBNO;
        private String POSITION_NAME;

        public String getEMPLOYEE_CODE_ID() {
            return EMPLOYEE_CODE_ID;
        }

        public void setEMPLOYEE_CODE_ID(String EMPLOYEE_CODE_ID) {
            this.EMPLOYEE_CODE_ID = EMPLOYEE_CODE_ID;
        }

        public String getEMPLOYEE_CODE_NAME() {
            return EMPLOYEE_CODE_NAME;
        }

        public void setEMPLOYEE_CODE_NAME(String EMPLOYEE_CODE_NAME) {
            this.EMPLOYEE_CODE_NAME = EMPLOYEE_CODE_NAME;
        }

        public String getEMPLOYEE_CODE_XPNO() {
            return EMPLOYEE_CODE_XPNO;
        }

        public void setEMPLOYEE_CODE_XPNO(String EMPLOYEE_CODE_XPNO) {
            this.EMPLOYEE_CODE_XPNO = EMPLOYEE_CODE_XPNO;
        }

        public String getEMPLOYEE_CODE_SBNO() {
            return EMPLOYEE_CODE_SBNO;
        }

        public void setEMPLOYEE_CODE_SBNO(String EMPLOYEE_CODE_SBNO) {
            this.EMPLOYEE_CODE_SBNO = EMPLOYEE_CODE_SBNO;
        }

        public String getPOSITION_NAME() {
            return POSITION_NAME;
        }

        public void setPOSITION_NAME(String POSITION_NAME) {
            this.POSITION_NAME = POSITION_NAME;
        }
    }
}