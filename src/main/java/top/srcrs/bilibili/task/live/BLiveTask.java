package top.srcrs.bilibili.task.live;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.srcrs.bilibili.Task;
import top.srcrs.bilibili.util.Request;


/**
 * 进行直播签到
 * @author srcrs
 * @Time 2020-10-13
 */
public class BLiveTask implements Task {
    /** 获取日志记录器对象 */
    private static final Logger LOGGER = LoggerFactory.getLogger(BLiveTask.class);

    @Override
    public void run(){
        try{
            JSONObject json = xliveSign();
            String msg = "";
            if("0".equals(json.getString("code"))){
                msg = "获得"+json.getJSONObject("data").getString("text");
            } else{
                msg = json.getString("message");
            }
            LOGGER.info("直播签到 -- {}",msg);
            /** 直播签到后等待5秒 */
            Thread.sleep(5000);
        } catch (Exception e){
            LOGGER.error("直播签到等待中错误 -- "+e);
        }
    }

    /**
     * B站直播进行签到
     * @return JSONObject
     * @author srcrs
     * @Time 2020-10-13
     */
    public JSONObject xliveSign(){
        return Request.get("https://api.live.bilibili.com/xlive/web-ucenter/v1/sign/DoSign");
    }

}
