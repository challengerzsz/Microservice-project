package com.bsb.product.utils;

import com.bsb.product.vo.ResultVO;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 15:51
 */
public class ResultVOUtil {

    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(data);
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }
}
