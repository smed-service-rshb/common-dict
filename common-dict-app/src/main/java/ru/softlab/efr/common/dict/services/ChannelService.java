package ru.softlab.efr.common.dict.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.ChannelEntity;
import ru.softlab.efr.common.dict.repositories.ChannelRepository;

import javax.annotation.Resource;
import javax.persistence.EntityNotFoundException;

/**
 * Сервис для работы с записями каналов
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
@Service
public class ChannelService {
    @Resource
    private ChannelRepository channelRepository;

    /**
     * Найти канал по идентифкатору
     *
     * @param id идентифкатор канала
     * @return хранимая сущность канала
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public ChannelEntity findById(long id) {
        ChannelEntity channelEntity = channelRepository.findOne(id);
        if (channelEntity == null) {
            throw new EntityNotFoundException();
        }
        return channelEntity;
    }

    /**
     * Найти все каналы
     *
     * @param pageable количество страниц
     * @return список каналов
     */
    @Transactional
    public Page<ChannelEntity> findAll(Pageable pageable) {
        return channelRepository.findAll(pageable);
    }

}
