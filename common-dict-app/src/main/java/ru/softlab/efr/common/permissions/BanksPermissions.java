package ru.softlab.efr.common.permissions;

/**
 * @author niculichev
 * @since 25.05.2017
 */
public class BanksPermissions {

    /**
     * Разрешение на показ списка банков
     */
    public static final String BANKS_LIST = "banks-list";

    /**
     * Разрешение на создание сущности банка
     */
    public static final String CREATE_BANK = "create-bank";

    /**
     * Разрешение на получения данных о банке
     */
    public static final String GET_BANK = "get-bank";

    /**
     * Разрешение на редактирование данных о банке
     */
    public static final String EDIT_BANK = "edit-bank";

    /**
     * Разрешение на удаление сущности банка
     */
    public static final String DELETE_BANK = "delete-bank";

    /**
     * Разрешение на репликацию банков
     */
    public static final String BANKS_REPLICATION = "banks-replication";
}
