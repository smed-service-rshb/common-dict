package ru.softlab.efr.common.integration;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.softlab.efr.common.config.TestDockerApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.Channel;
import ru.softlab.efr.common.dict.model.ChannelEntity;
import ru.softlab.efr.common.dict.repositories.ChannelRepository;
import ru.softlab.efr.common.utilities.rest.RestPageImpl;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.services.auth.Right;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static ru.softlab.efr.common.utilities.test.matchers.PageResultMatchers.pageContent;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.status;

/**
 * @author Plaksiy
 * @since 19.09.2017
 */

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class ChannelIntegrationTest extends IntegrationTestBase {
    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    @Autowired
    private ChannelRepository channelRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private ChannelEntity savedChannel;

    @Before
    public void setup() {
        channelRepository.deleteAll();

        savedChannel = saveChannel("shortName");
    }

    public ChannelEntity saveChannel(String shortName) {
        savedChannel = new ChannelEntity();
        savedChannel.setShortName(shortName);
        return channelRepository.save(savedChannel);
    }

    public void prepareChannelList() {
        channelRepository.deleteAll();

        savedChannel = saveChannel("channel A");
        savedChannel = saveChannel("channel B");
        savedChannel = saveChannel("channel C");
    }

    private ParameterizedTypeReference<RestPageImpl<Channel>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<Channel>>() {
        };
    }

    @Test
    public void getChannel() throws Exception {
        mockRest.init()
                .path("/dictionaries/channels/{id}")
                .variable("id", savedChannel.getId())
                .get(Channel.class)
                .andExpectSafe(status(Channel.class).isOk())
                .andExpectBodySafe(channel -> {
                    assertThat(channel.getId(), is(savedChannel.getId()));
                    assertThat(channel.getShortName(), is(savedChannel.getShortName()));
                });
    }

    @Test
    public void getChannel_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/channels/{id}")
                .variable("id", savedChannel.getId())
                .get(Channel.class)
                .andExpectSafe(status(Channel.class).is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getChannelNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/channels/{id}")
                .variable("id", UNKNOWN_ID)
                .get(Channel.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/channels")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedChannel.getId())))));
    }

    @Test
    public void list_with_pageable() throws Exception {
        prepareChannelList();

        mockRest.init()
                .path("/dictionaries/channels")
                .param("page", 1)
                .param("size", 2)
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)));
    }

    @Test
    public void list_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/channels")
                .get(restPage())
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void listEmpty() throws Exception {
        channelRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/channels")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }
}
