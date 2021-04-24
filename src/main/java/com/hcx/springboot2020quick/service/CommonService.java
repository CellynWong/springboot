package com.hcx.springboot2020quick.service;

import com.hcx.springboot2020quick.proccesor.AbstractProccesor;
import com.hcx.springboot2020quick.proccesor.CostTypeProcessor;
import com.hcx.springboot2020quick.service.impl.QueryCostTypeList;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2020/10/18 13:13
 *
 * @see
 */
@Service
public class CommonService {
    public List<String> getProcessor(String type) {
        if(StringUtils.isEmpty(type)){
            return null;
        }
        List<String> typeList = new ArrayList<>();
        typeList.add("CostType");
        typeList.add("ChargePlace");
        if(CollectionUtils.isEmpty(typeList)){
            return null;
        }
        List<String> resultList = new ArrayList<>();
        String packageName = AbstractProccesor.class.getPackage().getName();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        typeList.forEach( (s) -> {
            try {
                QueryCostTypeList queryCostTypeList = new QueryCostTypeList((CostTypeProcessor) Class.forName(packageName+"."+(s+"Processor")).newInstance());
                Future future = executorService.submit(queryCostTypeList);
                try {
                    String res = (String) future.get();
                    resultList.add(res);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        });
        return resultList;
    }

    public static void main(String[] args) {

        String str = "ChargePlaceProcessor";

    }

}
