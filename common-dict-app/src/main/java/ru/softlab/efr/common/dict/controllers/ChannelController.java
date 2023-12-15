package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.builder.channel.ChannelBuilder;
import ru.softlab.efr.common.dict.exchange.model.Channel;
import ru.softlab.efr.common.dict.model.ChannelEntity;
import ru.softlab.efr.common.dict.services.ChannelService;
import ru.softlab.efr.common.permissions.ChannelsPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityNotFoundException;

/**
 * Контроллер каналов
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
@RestController
@RequestMapping("/dictionaries/channels")
public class ChannelController implements ChannelsApi {

    private final ChannelService channelService;

    @Autowired
    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    /**
     * Возвращает список каналов
     *
     * @param pageable количество страниц
     * @return данные о канале
     */
    @RequestMapping(method = RequestMethod.GET)
    @HasPermission(ChannelsPermissions.CHANNELS_LIST)
    public ResponseEntity<Page<Channel>> listChannels(
            @PageableDefault(value = 50) Pageable pageable) {
        Page<ChannelEntity> channelEntities = channelService.findAll(pageable);
        return ResponseEntity.ok(channelEntities.map(ChannelBuilder::buildChannel));
    }

    /**
     * Возвращает канал по идентификатору
     *
     * @param id идентификатор канала
     * @return данные о канале
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @HasPermission(ChannelsPermissions.GET_CHANNEL)
    public ResponseEntity<Channel> getChannel(@PathVariable("id") Long id) {
        ChannelEntity channelEntity;
        try {
            channelEntity = channelService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ChannelBuilder.buildChannel(channelEntity));
    }

}
