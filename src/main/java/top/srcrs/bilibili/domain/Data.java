package top.srcrs.bilibili.domain;

/**
 * 用户的一些个人信息
 * @author srcrs
 * @Time 2020-10-13
 */
public class Data {
    private static final Data DATA = new Data();

    private String DedeUserID;
    private String bili_jct;
    private String SESSDATA;
    private String uname; //登录账户的用户名
    private String mid; //登录账户的uid
    private String vipType; //代表账户的类型
    private String money; //硬币数
    private String currentExp; //经验数
    private String vipStatus; //大会员状态
    private String coupon_balance; //B币卷余额

    public void setCookie(String bili_jct,String SESSDATA,String DedeUserID){
        this.DedeUserID = DedeUserID;
        this.bili_jct = bili_jct;
        this.SESSDATA = SESSDATA;
    }

    public String getVipStatus() {
        return vipStatus;
    }

    public String getCoupon_balance() {
        return coupon_balance;
    }

    public void setCoupon_balance(String coupon_balance) {
        this.coupon_balance = coupon_balance;
    }

    public void setVipStatus(String vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(String currentExp) {
        this.currentExp = currentExp;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDedeUserID() {
        return DedeUserID;
    }

    public void setDedeUserID(String dedeUserID) {
        DedeUserID = dedeUserID;
    }

    public String getBili_jct() {
        return bili_jct;
    }

    public void setBili_jct(String bili_jct) {
        this.bili_jct = bili_jct;
    }

    public String getSESSDATA() {
        return SESSDATA;
    }

    public void setSESSDATA(String SESSDATA) {
        this.SESSDATA = SESSDATA;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    /**
     * 返回用户的Cookie
     * @return String
     */
    public String getCookie(){
        return "bili_jct="+bili_jct+";SESSDATA="+SESSDATA+";DedeUserID="+DedeUserID;
    }
    private Data(){}
    public static Data getInstance(){
        return DATA;
    }
}
