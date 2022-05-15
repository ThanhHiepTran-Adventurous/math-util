/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhhiep.mathutil.core;

/**
 *
 * @author Acer
 */
public class MathUtil {

    //viết hàm toán học tính giai thừa n! = 1.2.3...n
    //quy ước: 0! = 1! = 1
    // không có giai thừa của số âm
    // 21! tràn kiểu long, long:18 số 0
    // túm lại: hàm tính giai thừa của n = 0 ... 20
    // ta xài luôn kĩ thuật lập trình TDD - TEST DRIVEN DEVELOPMENT
    //                                       TEST FIRST DEVELOPMENT
    // TDD(TEST DRIVEN DEVELOPMENT) có nghĩa là trong quá trình viết code, a luôn luôn phải có ý thức viết test
    // DDT có nghĩa là trong quá trình bạn viết test thì bạn viết khéo làm sao để a tách data ra hẵn một chỗ
    // câu lệnh gọi hàm một chỗ thi nó gọi là DATA DRIVEN TESTING
    // TA NGHĨ VỀ TEST, KỊCH BẢN TEST, BỘ DỮ LIỆU TEST TRƯỚC KHI VIẾT CODE
    
    public static long getFactorial(int n){
         
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if(n == 0 || n == 1)
            return 1;
        long product =  1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
       
        return product; 
    }
    
    // y = f(x) = x^2
    // f(5) = 25
    
    
    
    // sure, getF(5) -> 120
    //       get(6)) -> 720
}
