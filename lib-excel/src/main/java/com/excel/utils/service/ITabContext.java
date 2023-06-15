package com.excel.utils.service;

import java.util.Map;

public interface ITabContext {

        String getSheetName();

        int getSheetIndex();

        Map<Integer,String> getExcelProperty();

}
