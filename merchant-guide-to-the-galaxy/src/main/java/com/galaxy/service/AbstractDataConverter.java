package com.galaxy.service;

/**
 * 数据处理器
* <p>Title: AbstractDataConverter</p>  
* <p>Description: </p>  
* @author Cao
* @date 2019年8月23日
 */
public interface AbstractDataConverter<T, R> {

	 public R converter(T t);
}
