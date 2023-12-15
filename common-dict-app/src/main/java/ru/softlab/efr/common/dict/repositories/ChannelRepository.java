package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.ChannelEntity;

/**
 * Репозиторий для работы с каналами
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
public interface ChannelRepository extends JpaRepository<ChannelEntity, Long> {

}
