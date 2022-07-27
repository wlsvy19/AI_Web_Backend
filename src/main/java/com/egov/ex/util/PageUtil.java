package com.egov.ex.util;

import com.egov.ex.dto.Page;
import com.egov.ex.entity.LearnHistory;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageUtil {
    public static void startPage(Page page) {
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
    }

    public static Object of(List list) {
        Map map = new HashMap();
        Map page = new HashMap();
        PageInfo pageInfo = PageInfo.of(list, 10);
        page.put("pageNo", pageInfo.getPageNum());
        page.put("pageSize", pageInfo.getPageSize());
        page.put("totalCount", pageInfo.getTotal());
        page.put("totalPages", pageInfo.getPages());
        map.put("list", pageInfo.getList());
        map.put("page", page);
        return map;
    }
}
