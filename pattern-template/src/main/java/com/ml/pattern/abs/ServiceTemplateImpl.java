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

        }catch (MLException e){

        }catch (Exception e){

        }finally {
            
        }

    }
}
