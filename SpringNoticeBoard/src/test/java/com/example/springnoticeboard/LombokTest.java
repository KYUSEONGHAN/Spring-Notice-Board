package com.example.springnoticeboard;

import com.example.springnoticeboard.domain.ResultVO;
import org.junit.jupiter.api.Test;

/**
 * created by kyuseonghan 22.7.27
 */
public class LombokTest {
    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO(0, "hong");

        System.out.println(result);
    }
}
