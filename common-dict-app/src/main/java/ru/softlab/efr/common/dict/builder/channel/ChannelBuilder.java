package ru.softlab.efr.common.dict.builder.channel;

import ru.softlab.efr.common.dict.exchange.model.Channel;
import ru.softlab.efr.common.dict.model.ChannelEntity;

/**
 * Класс для построения данных о канале
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
public class ChannelBuilder {

    /**
     * Построение данных о канале
     *
     * @param channelEntity хранимая сущность ChannelEntity
     * @return данные о канале
     */
    public static Channel buildChannel(ChannelEntity channelEntity) {
        Channel channel = new Channel();
        channel.setId(channelEntity.getId());
        channel.setShortName(channelEntity.getShortName());
        channel.setFullName(channelEntity.getFullName());
        return channel;
    }
}
