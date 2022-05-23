/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhhiep.mathuti.core;

import com.thanhhiep.mathutil.core.MathUtil;
import static com.thanhhiep.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Acer
 */

// Ta sẽ dùng kĩ thuật Data Driven Testing/Parameterzed Testing
// Tham số hóa bộ dữ liệu test
// là kĩ thuật tách bộ dữ liệu test ra hẵn câu lệnh kiểm thử hàm

//Xét cho bài getF()
//Bộ data, đặt ở txt, Excel, table/db
//0 -> 1;
//1 -> 1;
//2 -> 2;
//3 -> 6;
//4 -> 24;
//5 -> 120;

//nhồi /fill bộ data này vào trong lời gọi hàm getF() + assertEqual
//tách bạch data và lời gọi hàm check kq
// rized là tham số hóa tức là biến cái data lát hồi sẽ nhồi vào trong hàm thông qua gọi tham số, tức là đầu vào
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    // chuẩn bị bộ data trước, ở txt, excel, database
    // nếu để file ngoài, thì viết thêm đoạn code đọc data vào//
    @Parameters          // int a[] = {2,4,6,8,10};
    public static Object[][] initData() {
        return new Integer[][] {
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,7720}, //bo sung de test CI
                                // co tinh mau do
                               };
    }
    
    @Parameter(value = 0)
    public int n; // Bạn muốn tính mấy giai thừa
    
    @Parameter(value = 1)
    public long expected; //bạn kì vòng giai thừa trả về mấy  
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        
      assertEquals(expected, getFactorial(n));
        
    }
}
