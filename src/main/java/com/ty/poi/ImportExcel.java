package com.ty.poi;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2021/1/6 14:47
 * @description：
 */
public class ImportExcel {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Administrator.DESKTOP-2E51AGH\\Desktop\\contact (3)(1).xls");
        ExcelReader reader = ExcelUtil.getReader(file);
        Map<String,String> map=new HashMap<>();
        map.put("电话号码","mobile");
        reader.setHeaderAlias(map);
        List<WxContact> read = reader.read(0, 1,WxContact.class);
        read.forEach(System.out::println);
    }

    public static void getDataFromExcel(String filePath) {
        if (!filePath.endsWith(".xsl")&&!filePath.endsWith(".xlsx")) {
        }
    }
}

