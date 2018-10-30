package com.wch.study.moudle.menu.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
	Integer selectMenuCount();

	void installMenu(@Param("name") String name, @Param("url") String url, @Param("recordId") String recordId, @Param("recordDate") Date recordDate);
}
