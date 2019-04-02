
 /*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2019
 * FileName: LogServiceImpl.java
 * Version:  1.0
 * Modify record:
 * NO. |     Date       |    Name        |      Content
 * 1   | 2019年3月29日        | Aisino)Jack    | original version
 */
package com.jack.hhitseat.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jack.hhitseat.bean.Log;
import com.jack.hhitseat.mapper.LogMapper;
import com.jack.hhitseat.service.ILogService;

/**
 * class name: LogServiceImpl <BR>
 * class description: please write your description <BR>
 * @version 1.0  2019年3月29日 下午1:01:05
 * @author Aisino)weihaohao
 */
@Service("logServiceImpl")
public class LogServiceImpl implements ILogService {
	
	@Autowired
	LogMapper logMapper;
	
	private final Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);

	/**
	* @Override
	* @see com.jack.hhitseat.service.ILogService#addLog(com.jack.hhitseat.bean.Log) <BR>
	* Method name: addLog <BR>
	* Description: please write your description <BR>
	* Remark: <BR>
	* @param log  <BR>
	*/
	@Override
	public void addLog(Log log) {
		try {
			logMapper.insert(log);
		} catch (Exception e) {
			logger.error("添加日志出错", e);
		}
	}

}
