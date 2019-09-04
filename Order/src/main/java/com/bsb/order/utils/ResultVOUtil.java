package com.bsb.order.utils;

import com.bsb.order.vo.ResultVO;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 22:01
 */
public class ResultVOUtil {

    public static ResultVO success(Object obj) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(obj);
        return resultVO;
    }
}
