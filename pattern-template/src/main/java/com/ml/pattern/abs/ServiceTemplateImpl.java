package com.ml.pattern.abs;

import com.ml.pattern.excepion.MLException;
import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName ServiceTemplate
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/23 21:16
 * @Version 1.0
 */
public class ServiceTemplateImpl implements ServiceTemplate {


    @Override
    public void execute( final  MLBaseResult<?> result,final ServiceCallBack serviceCallBack) {
        try {
            serviceCallBack.check();

            serviceCallBack.doService();
            if(result.isSuccess()){
                result.setCode("200");
                result.setMessage("处理成功!");
            }
        }catch (MLException e){
            //自己处理的异常
            handlerMyException(result,e);
        }catch (Exception e){
            //系统异常
            handlerException(result,e);
        }finally {

        }

    }

    private void handlerException(MLBaseResult<?> result, Exception e) {
        result.setMessage("系统异常，请联系管理员！");
        result.setCode("600");
    }

    private void handlerMyException(MLBaseResult<?> result, MLException e) {
        result.setMessage(e.getMessage());
        result.setCode(e.getCode());

    }
}
