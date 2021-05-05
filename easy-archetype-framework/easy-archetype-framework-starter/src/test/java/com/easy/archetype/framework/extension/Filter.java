package io.github.luyanan0718.easy.archetype.framework.extension;

import io.github.luyanan0718.easy.archetype.framework.extension.annotation.SPI;

/**
 * 过滤器
 *
 * @author luyanan
 * @since 2021/3/5
 **/
@SPI("xxs")
public interface Filter {


	String filter(String content);
}
